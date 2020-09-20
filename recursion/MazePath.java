package recursion;

import java.util.ArrayList;

public class MazePath {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		ArrayList<String> path = getMazePath(0,0,2,2);
		for (String p : path) {
			System.out.print(p+" ");
		}
		System.out.println("\nDaigonal added ----------------");
		ArrayList<String> path1 = getMazePathDiagonal(0, 0, 2, 2);
		for (String p : path1) {
			System.out.print(p+" ");
		}
		System.out.println("\ncount added ----------------");
		int countMaze = getCountMazePathDiagonal(0, 0, 2, 2);
		System.out.println(countMaze);
		
		printMazePath(0, 0, 2, 2, "");
		int i = countMazePath(0, 0, 2, 2);
		System.out.println(i);*/
		printMazePathDiagonal(0, 0, 2, 2, "");
	}
	
	public static void printMazePathDiagonal(int cr, int cc, int er, int ec, String result) {
		// TODO Auto-generated method stub
		if(cr == er && cc == ec) {
			System.out.println(result);
			return;
		} 
		if(cr > er || cc > ec) {
			return;
		}
		
		printMazePathDiagonal(cr, cc + 1, er, ec, result+ "H");
		printMazePathDiagonal(cr + 1, cc, er, ec, result+ "V");
		printMazePathDiagonal(cr + 1, cc + 1, er, ec, result + "D");
		
	}

	public static int countMazePath(int cr, int cc, int er, int ec) {
		// TODO Auto-generated method stub
		if(cr == er && cc == ec) {
			 
			return 1;
		} 
		if(cr > er || cc > ec) {
			return 0;
		}
		int count = 0;
		count += countMazePath(cr, cc+1, er, ec );
		count += countMazePath(cr+1, cc, er, ec );
		return count;
	}

	public static void printMazePath(int cr, int cc, int er, int ec, String result) {
		// TODO Auto-generated method stub
		if(cr == er && cc == ec) {
			System.out.println(result);
			return;
		} 
		if(cr > er || cc > ec) {
			return;
		}
		
		printMazePath(cr, cc+1, er, ec, result +"H");
		printMazePath(cr+1, cc, er, ec, result +"V");
		
	}

	public static int getCountMazePathDiagonal(int cr, int cc, int er, int ec) {
		// TODO Auto-generated method stub
		if(cr == er && cc == ec) {
			//br = baseResult +ve cases
			return 1;
		}
		
		if(cr > er || cc > ec) {
			//br = baseResult -ve cases
			 
			return 0;
		}
		int count = 0;
		 
		///for horizontal movement rrh = recurciveResultHorizontal
		count += getCountMazePathDiagonal(cr, cc+1, er, ec);
		 
		// for vertical movement rrv = recurciveResultVertical
		count += getCountMazePathDiagonal(cr+1, cc, er, ec);
		 
		// for diagonal movement rrd = recurciveResultDiagonal
		count += getCountMazePathDiagonal(cr+1, cc+1, er, ec);
		 
		return count;
	}

	/*
	 * In how many ways we can reach from one pt of matrix to another 
	 * in the condition where 1 Horizontal and 1 Vertical and 1Diagonal movement is allowed at time */
	private static ArrayList<String> getMazePathDiagonal(int cr, int cc, int er, int ec) {
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
		ArrayList<String> rrh = getMazePathDiagonal(cr, cc+1, er, ec);
		for (String rrhs : rrh) {
			finalResult.add("H"+rrhs);
		}
		// for vertical movement rrv = recurciveResultVertical
		ArrayList<String> rrv = getMazePathDiagonal(cr+1, cc, er, ec);
		for (String rrvs : rrv) {
			finalResult.add("V"+rrvs);
		}
		// for diagonal movement rrd = recurciveResultDiagonal
		ArrayList<String> rrd = getMazePathDiagonal(cr+1, cc+1, er, ec);
		for (String rrds : rrd) {
			finalResult.add("D"+rrds);
		}
		return finalResult;
	}

	/*
	 * In how many ways we can reach from one pt of matrix to another 
	 * in the condition where 1 Horizontal and 1 Vertical movement is allowed at time */
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
