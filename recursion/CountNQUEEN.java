package recursion;

public class CountNQUEEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[5][5];
		System.out.println(countNoOfQueen(board,0));

	}

	private static int countNoOfQueen(boolean[][] board, int rows) {
		// TODO Auto-generated method stub
		if(rows == board.length)
			return 1; 
		
		int count = 0;
		for(int col=0; col<board[rows].length; col++) {
			if(isItSafe(board,rows,col)) {
				board[rows][col] = true;
				count += countNoOfQueen(board, rows+1);
				board[rows][col] = false;
				
			}
		}

		return count; 
	}

	
	/* we are just check the the value above the point where
	 * the Queen is to be placed*/
	private static boolean isItSafe(boolean[][] board, int rows, int col) {
		// TODO Auto-generated method stub
		
		//check the column above 
		for(int i=rows; i>=0;i--) {
			 if(board[i][col])
				 return false;
		}
		// checking the left diagonal
		for(int i=rows,j=col;i>=0&&j>=0;i--,j--) {
			if(board[i][j])
				return false;
		}
		// checking the right diagonal
		for(int i=rows,j=col;i>=0&&j<board.length;i--,j++) {
			if(board[i][j])
				return false;
		}
			
		
		return true;
	}

}
