package CodeForces;

import java.util.Scanner;

public class CF_282A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0;
		String[] str = new String[n];
		for(int i=0;i<str.length;i++) {
			str[i] = sc.next();
			if(str[i].equals("++X"))
				++x;
			if(str[i].equals("X++"))
				x++;
			if(str[i].equals("--X"))
				--x;
			if(str[i].equals("X--"))
				x--;
			
		}
		
		System.out.println(x);

	}

}
