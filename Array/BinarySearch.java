package Array;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		int t = sc.nextInt();
		int loc = binarySearch(arr,t);
		System.out.println(loc);

    

	}

	private static int binarySearch(int[] arr, int t) {
		// TODO Auto-generated method stub
		int low = 0, high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] < t) {
				low = mid+1;
			}else if(arr[mid] > t) {
				high = mid-1;
			}else {
				return mid;
			}
		 
		}
		
		
		return -1;
	}

}
