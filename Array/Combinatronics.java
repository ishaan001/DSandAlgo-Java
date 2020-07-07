package Array;

import java.util.ArrayList;

import javax.xml.stream.events.StartDocument;

public class Combinatronics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		 printSubArrays(arr,0,0);
		 
	}
	//iterative Approach

	private static void getSubArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for(int k=i;k<arr.length;k++) {
				
				for(int j=i;j<=k;j++)
					System.out.print(arr[j]);
				System.out.println();
				
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	static void printSubArrays(int []arr, int start, int end) 
	{      
	    // Stop if we have reached the end of the array      
	    if (end == arr.length)  
	        return; 
	      
	    // Increment the end point and start from 0  
	    else if (start > end)  
	        printSubArrays(arr, 0, end + 1); 
	          
	    // Print the subarray and increment the starting point  
	    else
	    { 
	        System.out.print("["); 
	        for (int i = start; i < end; i++){ 
	            System.out.print(arr[i]+", "); 
	        } 
	          
	        System.out.println(arr[end]+"]"); 
	        printSubArrays(arr, start + 1, end); 
	    } 
	      
	    return; 
	} 
 

}
