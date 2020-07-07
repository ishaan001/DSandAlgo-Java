package Basics;

import java.util.Scanner;

public class FibbonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int i = 0;
		int num0 = 0;
		int num1 = 1;
		while(i <= num) {
		 
				
				System.out.print(num0+" ");
				int sum = num0 + num1;
				num0 = num1;
				num1 = sum;
				
			 
			
			
			i = i+1;
		}

	}

}
