package Array;

import java.util.Scanner;

public class ReverseInGroups {
	
	public static void main(String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		while(testCase>0){
		    int len = sc.nextInt();
		    int group = sc.nextInt();
		    int[] arr = new int[len];
		    for(int i= 0;i<arr.length;i++) {
		    	arr[i] = sc.nextInt();
		    }
		     reverse(arr,len,group);
		     for(int i=0; i<arr.length;i++) {
		    	 System.out.print(arr[i]+" ");
		     }
		    System.out.println();
			testCase--;
		    
		}
		
	}

	private static void reverse(int[] arr, int len, int group) {
		// TODO Auto-generated method stub
		for(int i=0;i<len;i+=group) {
			
			int left = i;
			int right = Math.min(i+group-1, len-1);
			int temp;
			
			while(left < right) {
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			
		}
		
	}
}
