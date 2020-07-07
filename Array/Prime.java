package Array;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
       
		
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		int[] ul = new int[testCases];
		int[] ll = new int[testCases];
		
		for(int i=0; i<testCases;i++) {
			int m =sc. nextInt();
			int n = sc.nextInt();
			ul[i] = m;
			ll[i] = n;
		}
		
		 
		for(int k=0;k<testCases; k++) {
			
			int m = ul[k];
			int n = ll[k];
			int count ;
			int totalCount=0;
			for (int j = m; j <= n; j++) {
				count = 0;
				for (int i = 1; i <= j; i++) {
					if (j % i == 0) {
						count++;
					}
				}
				if (count == 2)
					totalCount++;
			}
			System.out.println(totalCount);
		}
		 
	}

}
