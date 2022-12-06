package collections;
import java.util.*;
public class OpenCloseBrackets {
	
	public static ArrayList<String> openCloseBrackets(int open,int close,int n){
		if(open==n&&close==n) {
			ArrayList<String> list1 = new ArrayList<>();
			list1.add("");
			return list1;
		}
//		if(close == n) {
//			ArrayList<String> list2 = new ArrayList<>();
//			list2.add("");
//			return list2;
//		}
		
		ArrayList<String> openRes = new ArrayList<>();
		ArrayList<String> closeRes = new ArrayList<>();

		if(open<n) {
			openRes = openCloseBrackets(open+1,close,n);
		}
		if(close<open) {
			closeRes = openCloseBrackets(open,close+1,n);
		}
		
		ArrayList<String> res = new ArrayList<>();
		for(String openres: openRes) {
			res.add("("+openres);
		}
		for(String closeres: closeRes) {
			res.add(")"+closeres);
		}
		
		return res;
	
	}

	public static void main(String[] args) {
		
		System.out.println(openCloseBrackets(0,0,3));

	}

}
