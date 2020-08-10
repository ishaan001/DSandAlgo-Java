package codechef;

import java.util.Scanner;

public class ChefLinearChess {
	/*
	 * AUGUST LONG CHALLANGE - LINCHESS
	 */

	public static void main(String[] args) {
		// your code goes here
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 long tc = sc.nextLong();
		 
		while(tc > 0) {
			long min = -1;
			long min1 = 1000000000;
			long n = sc.nextLong();
			long k = sc.nextLong();
			long[] arr = new long[(int) n];
			for(long i=0;i<n;i++) {
				arr[(int) i]= sc.nextLong();
			}
			
			for(long i=0; i<arr.length; i++) {
				if(k%arr[(int) i]==0) {
					long temp = k/arr[(int) i]-1;
					if(temp < min1) {
						min1 = temp;
						min=arr[(int) i];
					}
				}
			}
			System.out.println(min);
			tc--;
		} 
	
	}

}
