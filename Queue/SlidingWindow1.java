package Queue;

public class SlidingWindow1 {
	 static void printKMax(int arr[], int n, int k) 
	    { 
	        int j, max; 
	  
	        for (int i = 0; i <= n - k; i++) { 
	  
	            max = arr[i]; 
	  
	            for (j = 1; j < k; j++) { 
	                if (arr[i + j] > max) 
	                    max = arr[i + j]; 
	            } 
	            System.out.print(max + " "); 
	        } 
	    } 
	  
	    // Driver method 
	    public static void main(String args[]) 
	    { 
	        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}; 
	        int k = 3; 
	        printKMax(arr, arr.length, k); 
	    } 

}
