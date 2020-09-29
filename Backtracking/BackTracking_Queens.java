package Backtracking;

import java.util.Arrays;

public class BackTracking_Queens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean[] b = new Boolean[4];
		Arrays.fill(b,false);
		//queenPermutations(b, 0, 2, "");
			queenCombinations(b, 0, 2, "", -1);
	}
	static int count = 0;
	// qpsf - > quuens placed so far
	//tq -> total queens
	public static void queenPermutations(Boolean[] boxes, int qpsf, int tq, String ans) {

		if(qpsf == tq ) {
			count++;
			System.out.println(count+" "+ans);
			return;
		}
		for (int i = 0; i < boxes.length; i++) {
			if (boxes[i] == false) {
				boxes[i] = true;
				queenPermutations(boxes, qpsf + 1, tq, (ans + "q" + qpsf + "b" + i + " "));
				boxes[i] = false;
			}
		}
	}

	static int counter =0;
	public static void queenCombinations(Boolean[] boxes, int qpsf, int tq, String ans, int lastBoxUsed) {
		if(qpsf == tq) {
			counter++;
			System.out.println(counter+"  "+ans);
			return;
			
		}
		for(int i =lastBoxUsed + 1; i <boxes.length; i++) {
			if(boxes[i] == false) {
				boxes[i] = true;
				queenCombinations(boxes, qpsf + 1, tq, ans + "q" + qpsf + "b" + i +" ", i);
				boxes[i] = false;
			}
		}
	}
}
