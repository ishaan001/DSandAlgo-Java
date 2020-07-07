package Array;

import java.util.*;

public class BubbleSort {
	public static void bubbleSort(int[] arr){ 
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int swapped =0;
			for(int j=0; j<n-1-i; j++) {
				if(arr[j] > arr[j+1]){
					int temp = arr[j]; 
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					swapped = 1;	
				}
			}
			if(swapped == 0) 
				break;
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
		bubbleSort(arr);
		displayArray(arr);

    }

}
