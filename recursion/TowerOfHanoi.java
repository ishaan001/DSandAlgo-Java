package recursion;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		toh(n,"src","dest","helper");

	}

	private static void toh(int n, String source, String dest, String helper) {
		// TODO Auto-generated method stub
		if(n==0)
			return;
		toh(n-1,source,helper,dest);
		System.out.println("Move "+n+"th disc from "+source+" to "+dest);
		toh(n-1,helper,dest,source);
		
	}

}
