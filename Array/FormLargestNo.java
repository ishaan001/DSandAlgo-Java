package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FormLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		while(tc>0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i =0 ;i<arr.length; i++){
		        arr[i] =sc.nextInt();
		    }
		    Arrays.sort(arr);
		    String s = "";
		    for(int i=arr.length-1;i>=0;i--){
		        s = s+arr[i];
		    }
		    System.out.println(s);
		    tc = tc -1;
		}

	}

}
