package CodeForces;

import java.util.Scanner;

public class CF_96A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Boolean flag = false;
		for(int i=0;i<str.length();i++) {
			if((i+6) < str.length()) {
				//System.out.println(str.substring(i, i+7));
				if(str.substring(i, i+7).equals("0000000") || str.substring(i, i+7).equals("1111111")) {
					flag =true;
					break;
				}
			}
		}
		if(flag)
			System.out.println("YES");
		else
			System.out.println("NO");
		

	}

}
