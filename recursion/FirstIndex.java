package recursion;

import java.util.Scanner;

public class FirstIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		
		for(int i =0; i< arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int data = sc.nextInt();
		int si = 0;
		int result = firstI(arr, si, data);
		System.out.println(result);

	}
	/*
	 * to check find the first index of the element to be searched inside the array
	 * OR return -1 if not found 
	 * */
	private static int firstI(int[] arr, int si, int data) {
		// TODO Auto-generated method stub
		if(si == arr.length-1)
			return -1; 
		if(arr[si] == data) {
			return si;
		}
		else
		{
			int result = firstI(arr, si+1, data);
			return result;
		}
	}

	 

}
