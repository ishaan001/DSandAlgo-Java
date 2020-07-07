package recursion;

import java.util.Scanner;

public class Recusion1 {

	public static void recusionExample(int n) {
		if(n==0){
			return;
		}
		
		System.out.println(n);
		recusionExample(n-1);
		System.out.println(n);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		recusionExample(n);
	}

}
