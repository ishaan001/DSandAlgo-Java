package recursion;

import java.util.ArrayList;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> str = getBoardPath(0,10);
		for(String r:str) 
			System.out.println(r);

	}

	private static ArrayList<String> getBoardPath(int start, int end) {
		// TODO Auto-generated method stub
		if(start == end) {
			ArrayList<String> br = new ArrayList<>(); 
			br.add("");
			return br;
		}
		if(start > end)
		{
			ArrayList<String> br = new ArrayList<>(); 
			return br;
		
		}
		ArrayList<String> mrr = new ArrayList<>(); 
		for(int dice =1; dice <=6; dice++ ) {
			ArrayList<String> rr = getBoardPath(start+dice, end);
			
			for(String rrs:rr) {
				mrr.add(dice+rrs);
			}
		}
		return mrr;
	}

}
