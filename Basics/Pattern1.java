package Basics;

import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 

		
 

				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				
				//rows
				int rows = 1;
				int nst = n;
				while(rows <= n) {
					
					//work_done
					int cst = 1;
					while(cst <= nst) {
						System.out.print("*");
						cst++;
					}

				//prep
				System.out.println();	
				rows = rows + 1;
				nst = nst -1;
				}
				
			}

		 

}
