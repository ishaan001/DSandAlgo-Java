package Backtracking;

public class NKnightProblemUsingBacktracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[3][3];
		NKnight(board, 0, 0, 0, board.length, "");

	}
static int count =0;
	public static void NKnight(boolean[][] board, int rows, int col, int kpsf, int tk, String ans) {
		if (kpsf == tk) {
			System.out.println(++count+" "+ ans);
			return;
		}

		if (col == board[0].length) {
			rows++;
			col = 0;
		}
		if (rows == board.length) {
			return;
		}

		if (isItSafeToPlaceKnight(board, rows, col)) {
			board[rows][col] = true;
			NKnight(board, rows, col + 1, kpsf + 1, tk, ans + "{" + rows + "-" + col + "}");
			board[rows][col] = false;
		}
		NKnight(board, rows, col + 1, kpsf, tk, ans);
	}

	private static boolean isItSafeToPlaceKnight(boolean[][] board, int rows, int col) {
		// TODO Auto-generated method stub

		int rowArray[] = { -1, -2, -2, -1 };
		int colArray[] = { 2, 1, -1, -2 };

		for (int i = 0; i < 4; i++) {
			int r = rows + rowArray[i];
			int c = col + colArray[i];
			if (r >= 0 && r < board.length && c >= 0 && c < board[0].length) {
				if (board[r][c]) {
					return false;
				}
			}

		}
		return true;
	}

}
