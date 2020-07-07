package Basics;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int rows = 1;
		int nsp = n/2;
		int nst =1;
		
		while(rows <= n) {
			
			int csp = 1;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			
			int cst = 1;
			while(cst <= nst) {
				System.out.print("+");
				cst++;
				
			}
			
			 
			
			
			System.out.println();
			if(rows <= n/2){
				nsp = nsp -1;
				nst += 2;
			}
			else {
				nsp +=1;
				nst -=2;
			}
			
			rows += 1;
		}

	}

}
