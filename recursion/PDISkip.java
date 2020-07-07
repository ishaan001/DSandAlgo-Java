package recursion;

import java.util.Scanner;

public class PDISkip {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		//recFun(n);
		//int result  = fact(n);
		//System.out.println(result);
		int pow = power(x,n);
		System.out.println(pow);
	 }
	/*
	 * to calculate the number[x] to the power[n]
	 * */
	private static int power(int x, int n) {
		// TODO Auto-generated method stub
			if(n ==1)
				return x;
		
			int p1 = power(x, n-1);
			int pow = x * p1;
			return pow;
	}

	/* To print the factorial of the particular number name "n"*/
	private static int fact(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return 1;
		
		int fnm1 = fact(n-1);
		int fn = n * fnm1;
		return fn;
	}

	/*
	 * To print the output for n = 5
	 * 5
	 * 3
	 * 1
	 * 2
	 * 4
	 * 
	 * */
	private static void recFun(int n) {
		// TODO Auto-generated method stub
		
		if(n==0) {
			return;
		}
		if(n%2!=0) {
			System.out.println(n);
			recFun(n-1);
		}
		if(n%2 == 0) {
			recFun(n-1);
			System.out.println(n);
		}
		
		
		
	}

}
