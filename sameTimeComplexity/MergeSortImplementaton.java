package sameTimeComplexity;

public class MergeSortImplementaton {
	public static void main(String[] args) {
		int[] arr = { 10, 70, 44, 5, 9, 1, 85, 67 };
		int[] sorted = mergeSort(arr, 0, arr.length - 1);
		for (int i : sorted) {
			System.out.print(i + " ");
		}
	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {
		// base case
		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}

		int mid = (lo + hi) / 2;

		// first half = fh result of the merged array
		int[] fh = mergeSort(arr, lo, mid);
		// second half = sh result of the merged array
		int[] sh = mergeSort(arr, mid + 1, hi);

		int[] merged = mergeTwoSortedArray(fh, sh);
		return merged;
	}

	public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int[] merged = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				merged[k] = arr1[i];
				i++;
				k++;
			} else {
				merged[k] = arr2[j];
				j++;
				k++;
			}
		}

		if (i == arr1.length) {
			while (j < arr2.length) {
				merged[k] = arr2[j];
				j++;
				k++;
			}
		}
		if (j == arr2.length) {
			while (i < arr1.length) {
				merged[k] = arr1[i];
				i++;
				k++;
			}
		}
		return merged;
	}
}
