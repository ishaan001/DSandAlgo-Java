package recursion;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int rows = 1,col=1;
		pattern(n,rows,col);

	}
	/* pattern printing
	 * 
	 * *
	 * * *
	 * * * *
	 * * * * */
	private static void pattern(int n, int rows, int col) {
		// TODO Auto-generated method stub
		if(rows > n)
			return;
		
		if(col > rows) {
			System.out.println();
			// condition to print all the stars in one row 
			pattern(n, rows+1, 1);
			return;
		}
		
		// line to print the stars 
		System.out.print("* ");
		// recursion condition called to get into next line 
		pattern(n, rows, col+1);
		
	}

}
