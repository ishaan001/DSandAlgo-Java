package CodeForces;

import java.util.Scanner;

public class CF_58A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hello";
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int pass=0;
		int j=0;
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) == a.charAt(j)) {
				pass++;
				j++;
			}
			if(pass == 5)
				break;
			
		}
		
		if(pass==5)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
