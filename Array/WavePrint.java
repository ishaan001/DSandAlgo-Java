package Array;

import java.util.Scanner;

public class WavePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m= sc.nextInt();
		int n= sc.nextInt();
		int[][] arr =  new int[m][n];
		
		// 2-D array Scanning
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//System.out.println();
	
		for(int i=0; i<arr.length; i++) {
			if(i%2 == 0) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+", ");
				}
			}
			if(i%2!=0) {
				for(int j=arr[i].length-1; j>=0; j--) {
					System.out.print(arr[i][j]+", ");
				}
			}
		}
		
		System.out.println("END");
		/*// array printing
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i];j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			  
		}*/
	}

}


