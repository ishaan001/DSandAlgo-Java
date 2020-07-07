package CodeForces;

import java.util.Scanner;

public class CF_112A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		int i = str1.compareToIgnoreCase(str2);
		if(i<0)
			System.out.println("-1");
		else if(i>0)
			System.out.println("1");
		else 
			System.out.println("0");

	}

}
