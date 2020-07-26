package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FormLargestNo {
	static void findMaxNum(int arr[], 
            int n) 
		{  
			//Declare a hash array of  
			//size 10 and initialize  
			//all the elements to zero 
			int []hash = new int[10]; 
			
			//store the number of occurrences  
			//of the digits in the given array 
			//into the hash table 
			for(int i = 0; i < n; i++) { 
				hash[arr[i]]++; 
			} 
			
			//Traverse the hash in descending 
			//order to print the required number 
			for(int i = 9; i >= 0; i--) { 
			// Print the number of  
			// times a digits occurs 
			for(int j = 0; j < hash[i]; j++) 
				System.out.print(i); 
			} 
		} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		BubbleSort bs = new BubbleSort();
		
		while(tc>0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i =0 ;i<arr.length; i++){
		        arr[i] =sc.nextInt();
		    }
		    n = arr.length; 
		      
		    findMaxNum(arr,n);
		     
		    tc = tc -1;
		}

	}

}
