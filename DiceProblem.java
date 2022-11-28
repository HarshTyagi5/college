package collections;
import java.util.ArrayList;
public class DiceProblem {
	
	static ArrayList<String> getDicePos(int start, int target){
		if(start == target) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}
		if(start>target) {
			ArrayList<String> list = new ArrayList<>();
			return list;
		}
		
		ArrayList<String> finallist = new ArrayList<>();
		for(int dice =1;dice<=6;dice++) {
			int currentVal = dice+start;
			ArrayList<String> list = getDicePos(currentVal,target);
			for(String r : list) {
				finallist.add(r+dice);
			}
		}
		
		return finallist;
	}
	
	public static void main(String[] args) {
		
		System.out.print(getDicePos(0,10));
		
	}

}
