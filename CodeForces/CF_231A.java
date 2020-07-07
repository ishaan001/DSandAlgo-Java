package CodeForces;

import java.util.Scanner;

public class CF_231A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int noOfProb = sc.nextInt();
		int[][] arr = new int[noOfProb][3];
		
		int problemAttempted =0;
		
		for(int i=0;i<arr.length;i++) {
			int counter=0;
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j] == 1)
					counter++;
			}
			if(counter >= 2){
				problemAttempted++;
				
			}
			
		}
		System.out.println(problemAttempted);
		
		
		

	}

}
