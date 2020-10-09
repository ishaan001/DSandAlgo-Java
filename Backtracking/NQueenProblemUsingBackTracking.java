package Backtracking;

public class NQueenProblemUsingBackTracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board =  new boolean[4][4];
		NQueen(board, 0, 0, 0, board.length, "");

	}

	public static void NQueen(boolean[][] board, int rows, int col, int qpsf, int tq, String ans) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		if (col == board[0].length) {
			rows++;
			col = 0;
		}
		if (rows == board.length) {
			return;
		}

		if (isItSafe(board, rows, col)) {
			board[rows][col] = true;
			NQueen(board, rows, col + 1, qpsf + 1, tq, ans + "{" + rows + "-" + col + "}");
			board[rows][col] = false;
		}
		NQueen(board, rows, col + 1, qpsf, tq, ans);
	}

	private static boolean isItSafe(boolean[][] board, int rows, int col) {
		// TODO Auto-generated method stub
		// vertical line
		int r = rows - 1;
		int c = col;
		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}
		// horizontal line
		r = rows;
		c = col - 1;
		while (c >= 0) {
			if (board[r][c]) {
				return false;
			}
			c--;
		}

		// left diagonal
		r = rows - 1;
		c = col - 1;
		while (c >= 0 && r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}

		// right diagonal
		r = rows - 1;
		c = col + 1;
		while (c < board.length && r >= 0) {
			if (board[r][c]) {
				return false;
			}
			c++;
			r--;
		}

		return true;
	}

}
