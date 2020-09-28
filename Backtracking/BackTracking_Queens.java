package Backtracking;

import java.util.Arrays;

public class BackTracking_Queens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean[] b = new Boolean[4];
		Arrays.fill(b,false);
		queenPermutations(b, 0, 2, "");

	}
	static int count = 0;
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

}
