package spaceTimeComplexity;

public class Array_zeros_ones_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 0, 2, 0, 1, 2 };
		int[] ans = sort(arr);
		System.out.print("[");
		for (int i : ans) {
			System.out.print(i+", ");
		}
		System.out.print("]");
	}
	/*
	 * sort 0's 1's and 2's 
	 * with the condition in mind that 
	 * time complexity should be O(n) // means it should traverse only 1 time.
	 * and space complexity should be O(1) // means now extra variable should be used
	 * */
	public static int[] sort(int[] arr) {
		int low = 0;
		int mid = 0;
		int hi = arr.length - 1;

		while (mid <= hi) {
			if (arr[mid] == 0) {
				swap(arr, mid, low);
				low++;
				mid++;
			}else if(arr[mid] == 1) {
				mid++;
			}else {
				swap(arr, mid, hi);
				hi--;
			}
		}

		return arr;
	}

	public static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
