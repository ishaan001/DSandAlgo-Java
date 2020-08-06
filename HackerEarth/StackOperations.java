package hackerEarth;

import java.util.Scanner;
import java.util.Stack;

public class StackOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		int count = 0;
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<>();
		for(int i=arr.length-1; i>=0;i--) {
			stack.push(arr[i]);
		}
		
		int max =-1 ;
		for(int i=0; i<n&& i<k+1;i++)
			if(i != k-1) max = Math.max(max,arr[i]);
		 
		
		if(n==1 && k==1) {
			System.out.println("-1");
		} 
		else {
			System.out.println(max);
		}

	}

}
