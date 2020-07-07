package CodeForces;

import java.util.Scanner;

public class CF_266A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		String s= sc.next();
		StringBuilder sb = new StringBuilder(s);
		int counter =0;
		for(i=0; i<sb.length()-1; i++) {
			if(sb.charAt(i) == sb.charAt(i+1))
				counter++;
		}
		
		System.out.println(counter);

	}

}
