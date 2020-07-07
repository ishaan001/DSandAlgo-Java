package Basics;


import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int rows = 1;
		int nst = n/2;
		int nsp =1;
		
		while(rows <= n) {
			
			int cst = 1;
			while(cst <= nst) {
				System.out.print("+");
				cst++;
			}
			
			int csp = 1;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
				
			}
			
			cst = 1;
			while(cst <= nst) {
				System.out.print("+");
				cst++;
			}
			
			
			System.out.println();
			if(rows <= n/2){
				nst = nst -1;
				nsp += 2;
			}
			else {
				nst +=1;
				nsp -=2;
			}
			
			rows += 1;
		}

	}

}
