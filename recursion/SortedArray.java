package recursion;

import java.util.Scanner;

public class SortedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i =0; i< arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int SI = 0;
		Boolean b = isSorted(arr, SI);
		Boolean b1 = isSortedDiffApproach(arr, SI);
		System.out.println(b);
		System.out.println(b1);
	}
	private static Boolean isSortedDiffApproach(int[] arr, int si) {
		// TODO Auto-generated method stub
		if(si == arr.length-1)
			return true;
		
		if(arr[si] > arr[si+1])
			return false;
		else {
			return isSortedDiffApproach(arr, si+1);
		}
		
	}
	/*
	 * to check whether the array is sorted or not using recursion */
	private static Boolean isSorted(int[] arr, int sI) {
		// TODO Auto-generated method stub
		if(sI == arr.length-1)
			return true;
		if(isSorted(arr, sI+1)) {
			if(arr[sI] < arr[sI+1])
				return true;
			else
				return false;
		}
		else
			return false;
	}

}
