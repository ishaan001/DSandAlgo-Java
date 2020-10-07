package Backtracking;

import java.util.Arrays;

import javax.sound.sampled.BooleanControl;

public class BackTracking_Queens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean[] b = new Boolean[4];
		Arrays.fill(b, false);
		// queenPermutations(b, 0, 2, "");
		// queenCombinations(b, 0, 2, "", -1);
		// queenCominationBoxRespect(b, 0, 0, 2, "");
		queenCombination2D(new Boolean[2][2], 0, 0, 0, 2, "");
	}

	static int count = 0;

	// qpsf - > quuens placed so far
	// tq -> total queens
	public static void queenPermutations(Boolean[] boxes, int qpsf, int tq, String ans) {

		if (qpsf == tq) {
			count++;
			System.out.println(count + " " + ans);
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

	static int counter = 0;

	public static void queenCombinations(Boolean[] boxes, int qpsf, int tq, String ans, int lastBoxUsed) {
		if (qpsf == tq) {
			counter++;
			System.out.println(counter + "  " + ans);
			return;

		}
		for (int i = lastBoxUsed + 1; i < boxes.length; i++) {

			boxes[i] = true;
			queenCombinations(boxes, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ", i);
			boxes[i] = false;

		}
	}

	public static void queenCominationBoxRespect(Boolean[] boxes, int vcol, int qpsf, int tq, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		if (vcol == boxes.length) {
			return;
		}

		boxes[vcol] = true;
		queenCominationBoxRespect(boxes, vcol + 1, qpsf + 1, tq, ans + "b" + vcol);
		boxes[vcol] = false;
		queenCominationBoxRespect(boxes, vcol + 1, qpsf, tq, ans);

	}

	public static void queenCombination2D(Boolean[][] boxes, int rows, int col, int qpsf, int tq, String ans) {

		// +ve base case
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		// -ve base case when the col length is exceded
		if (col == boxes[0].length) {
			rows++;
			col = 0;
		}

		if (rows == boxes.length) {
			return;
		}

		boxes[rows][col] = true;
		queenCombination2D(boxes, rows, col + 1, qpsf + 1, tq, ans + "{" + rows + "-" + col + "}");
		boxes[rows][col] = false;
		queenCombination2D(boxes, rows, col + 1, qpsf, tq, ans);

	}

}
