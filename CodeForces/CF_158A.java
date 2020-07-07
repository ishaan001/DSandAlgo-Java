package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class CF_158A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		//Arrays.sort(arr);
		int count =0;
		int k = arr[m-1];
		if(k==0) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i] > k)
					count++;
			}
			
		}
		else {
			for(int i=0;i<arr.length;i++) {
				if(arr[i] >= k)
					count++;
			}
		
		}
		System.out.println(count);

	}

}
