package recursion;

import java.util.ArrayList;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> str = getBoardPath(0,10);
		ArrayList<String> path = getBoardPathRecursive(0,10);
		//printBoradPath(0, 10, "");
		for(String r:path) 
			System.out.println(r);
		int i = countBoardPath(0, 10);
		System.out.println(i);
	}

	/*
	 * THIS LOGIC IS USED WHILE BUILDING A STACK*/
	public static int countBoardPath(int cur, int end ) {
		// TODO Auto-generated method stub
		if(cur == end) {
			//System.out.println(result);
			return 1;
		}
		if(cur > end)
			return 0;
		int count = 0;
		for(int dice=1; dice<=6; dice++) {
			count += countBoardPath(cur+dice, end);
		}
		
		return count;
	}
	/*
	 * THIS LOGIC IS USED WHILE BUILDING A STACK*/
	public static void printBoradPath(int cur, int end, String result) {
		// TODO Auto-generated method stub
		if(cur == end) {
			System.out.println(result);
			return;
		}
		if(cur > end)
			return;
		
		for(int dice=1; dice<=6; dice++) {
			printBoradPath(cur+dice, end, result+dice);
		}
		
	}
	/*
	 * THIS LOGIC IS USED WHILE FALLING A STACK*/
	private static ArrayList<String> getBoardPathRecursive(int curr, int end) {
		// TODO Auto-generated method stub		
		
		// if we find the result we want
		if(curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		//for negative cases
		if(curr > end) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		
		//rolling a dice 
		ArrayList<String> FinalResult = new ArrayList<>();
		for(int dice=1; dice<=6; dice++ ) {
			ArrayList<String> 	recursiveResult = getBoardPathRecursive(curr+dice, end);
			//adding the result
			for (String rr : recursiveResult) {
				FinalResult.add(dice+rr);
			}
		}
		
		return FinalResult;
	}
	/*
	 * THIS LOGIC IS USED WHILE FALLING A STACK*/
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
