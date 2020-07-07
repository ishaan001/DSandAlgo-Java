package CodeForces;

import java.util.Scanner;

public class CF_69A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m= sc.nextInt();
		Boolean flag = false;
	 
		 int x=0,y=0,z=0;
		
		// 2-D array Scanning
		for(int i=0; i<m;i++) {
	 
				x += sc.nextInt();
				y += sc.nextInt();
				z += sc.nextInt();
		 
		}

		 
		 
		
		if(x==0&&y==0&&z==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
