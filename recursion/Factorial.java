package recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = fib(n);
		int factorialResult = fact(n);
		System.out.println(factorialResult);

	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		 if(n == 0)
			 return 0;
		 if(n == 1)
			 return 1;
		int f = fib(n-1) + fib(n-2);
		return f;
	}

	
	public static int fact(int n) {
		if(n==1)
			return 1;
		return n * fact(n-1);
	}
}
