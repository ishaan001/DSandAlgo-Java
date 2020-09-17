package recursion;

public class PrintNQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[4][4];
		printNQueen(board, 0, "");
		printNQueenAlternative(board, 0, "");
		

	}

	public static void printNQueenAlternative(boolean[][] board, int rows, String str) {
		// TODO Auto-generated method stub
		if(rows == board.length) {
			System.out.println(str);
			return; 
		}
		
		for(int col=0; col<board[rows].length; col++) {
			if(isItSafe(board,rows,col)) {
				board[rows][col] = true;
				printNQueenAlternative(board, rows+1, str+"{"+(rows+1)+"-"+(col+1)+"}");
				board[rows][col] = false;
				
			}
		}

	}

	public static void printNQueen(boolean[][] board, int rows, String str) {
		// TODO Auto-generated method stub
		if(rows == board.length) {
			System.out.print("{");
			for(int i=0;i < board.length; i++) {
				for(int j=0; j < board[i].length; j++) {
					
					if(board[i][j]) {
						System.out.print((i+1)+"-"+(j+1)+", ");
					}
				}
			}
			System.out.print("}\n");
			
			return;
		}
		
		for(int col =0; col <board[rows].length; col++) {
			if(isItSafe(board,rows,col)) {
				board[rows][col] = true;
				printNQueen(board, rows+1, str);
				board[rows][col] = false;
			}
		}
		
		return;
		
	}

	public static boolean isItSafe(boolean[][] board, int rows, int col) {
		// TODO Auto-generated method stub
		//rows
		for(int i=rows ; i>=0; i--) {
			if(board[i][col]) {
				return false;
			}
		}
		
		//left diagonal
		for(int i= rows, j=col ; i>=0&&j>=0; i--,j--){
			if(board[i][j]) {
				return false;
			}
		}
		
		//right diagonal
		for(int i= rows, j=col ; i>=0&&j<board.length; i--,j++){
			if(board[i][j]) {
				return false;
			}
		}
		
		return true;
	}

}
