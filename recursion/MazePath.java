package recursion;

import java.util.ArrayList;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> path = getMazePath(0,0,2,2);
		for (String p : path) {
			System.out.println(p);
		}

	}

	private static ArrayList<String> getMazePath(int cr, int cc, int er, int ec) {
		// TODO Auto-generated method stub
		if(cr == er && cc == ec) {
			//br = baseResult +ve cases
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		
		if(cr > er || cc > ec) {
			//br = baseResult -ve cases
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> finalResult = new ArrayList<>();
		///for horizontal movement rrh = recurciveResultHorizontal
		ArrayList<String> rrh = getMazePath(cr, cc+1, er, ec);
		for (String rrhs : rrh) {
			finalResult.add("H"+rrhs);
		}
		// for vertical movement rrv = recurciveResultVertical
		ArrayList<String> rrv = getMazePath(cr+1, cc, er, ec);
		for (String rrvs : rrv) {
			finalResult.add("V"+rrvs);
		}
		return finalResult;
	}

}
