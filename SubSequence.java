package collections;
import java.util.ArrayList;
public class SubSequence {
	
	static ArrayList<String> subseq(String str){
		if(str.length()==0) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}
		
		char singleChar = str.charAt(0);
		String subString = str.substring(1);
		ArrayList<String> newList = new ArrayList<>();
		ArrayList<String> list = subseq(subString);
		for(int i=0;i<list.size();i++) {
			newList.add(list.get(i));
			newList.add(singleChar+list.get(i));
		}
		
		return newList;
		
		
	}
	
	
	static ArrayList<String> allper(String str){
		if(str.length()==0) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}
		
		char singleChar = str.charAt(0);
		String subString = str.substring(1);
		ArrayList<String> newList = new ArrayList<>();
		ArrayList<String> list = allper(subString);
		
		
		for(int i=0;i<list.size();i++) {
			
			StringBuffer sb = new StringBuffer(list.get(i));
			int length = sb.length();
			for(int j=0;j<=length;j++) {
				sb = new StringBuffer(list.get(i));
				sb.insert(j,singleChar);
				newList.add(sb.toString());
		}
			
}
		
		return newList;
		
		
	}

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		String str = "abcd";
		list = allper(str);
		System.out.println(list);
	}

}
