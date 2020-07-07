package Array;

import java.util.Scanner;

public class SelectionSort {
	public static void selectionSort(int[] arr,int N){
		for(int counter=0;counter<arr.length-1;counter++){
			int min = counter;
			for(int j=counter+1; j<arr.length-1; j++){
				if(arr[j] <arr[min])
					min = j;
			}
			int temp = arr[min];
			arr[min] = arr[counter];
			arr[counter] = temp;
		}

	}
	public static void displayArray(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		selectionSort(arr,N);
		displayArray(arr);

    }
}
