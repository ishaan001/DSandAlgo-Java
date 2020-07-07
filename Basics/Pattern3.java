package Basics;

import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row =1,nst = n,nsp=0;
		while(row <= n) {
			
			int csp = 0;
			while(csp < nsp) {
				System.out.print(" ");
				csp+=1;
			}
			
			int cst =1;
			while(cst <= nst) {
				System.out.print("+");
				cst+=1;
				
			}
			
		System.out.println();
		nst -=1;
		nsp+=1;
		row+=1;
		}

	}

}
