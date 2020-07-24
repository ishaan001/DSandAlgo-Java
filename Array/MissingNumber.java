package Array;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		//code
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		while(testCase>0){
		    int len = sc.nextInt();
		     
		    int[] arr = new int[len];
		    for(int i= 0;i<arr.length-1;i++) {
		    	arr[i] = sc.nextInt();
		    }
		      
		    for(int i=0;i<arr.length-1;i++) {
		    	if(arr[i+1]-arr[i] != 1) {
		    		System.out.println(arr[i]+1);
		    		break;
		    	}
		    }
		      
		    
		}
		System.out.println();
		testCase--;
	

	}

}
