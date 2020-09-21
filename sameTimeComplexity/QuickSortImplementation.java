package sameTimeComplexity;

public class QuickSortImplementation {

	public static void main(String[] args) {
		int[] arr = { 10, 70, 44, 5, 9, 1, 85, 67 };
		quickSort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void quickSort(int[] arr, int lo, int hi) {
		// TODO Auto-generated method stub
		if (lo >= hi) {
			return;
		}
		// 1. partition
		int mid = (lo + hi) / 2;
		int pivot = arr[mid];

		int left = lo;
		int right = hi;
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}

		// smaller left 2 sub arrays
		// left halt containing element unsorted but less than pivot;
		// right halt containing element unsorted but greater than pivot;
		quickSort(arr, lo, right);
		quickSort(arr, left, hi);
	}
}
