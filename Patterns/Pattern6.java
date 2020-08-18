package Patterns;

import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int rows = 1;
		while(rows <= n) {
			
			int cst = 1;
			if(rows == 1 || rows == n) {
				while(cst <=n) {
					System.out.print("+ ");
					cst++;
				}
			}
			else {
				while(cst <=n) {
					if(cst == 1 || cst == n) {
						System.out.print("+ ");
					}
					else
						System.out.print("  ");
					
				cst++;
			}
		}
			
			System.out.println();
			rows = rows +1;
		}
		
	}

}
