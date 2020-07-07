package CodeForces;

import java.util.Scanner;

public class CF_25A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr=new int[n];
		int even = 0,odd=0;
				
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]%2==0)
				even++;
			else
				odd++;
		}
		if(even ==1) {
			for(int i=0;i<n;i++) {
				if(arr[i]%2==0) {
					System.out.println(i+1);
					break;
				}
			}	
		}
		if(odd ==1) {
			for(int i=0;i<n;i++) {
				if(arr[i]%2!=0) {
					System.out.println(i+1);
					break;
				}
			}	
			
		}
		

	}

}
