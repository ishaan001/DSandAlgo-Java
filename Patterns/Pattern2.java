package Patterns;

import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int nst = 1;
		
		//rows
		int row = 1;
		while(row <= n) {
		
			//work done 
			
			int space = n - row;
			while(space > 0 ) {
				System.out.print(" ");
				space = space - 1;
			}
			
			int cst = 1;
			while(cst <= nst) {
				System.out.print("+");
				cst+=1;
				
			}
			
			//prep
			System.out.println();
			row = row +1;
			nst += 1;
			
			
			
		}
		
		
	}

}
