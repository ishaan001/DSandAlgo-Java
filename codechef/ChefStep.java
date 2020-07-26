package codechef;

import java.util.Scanner;

public class ChefStep {

	public static void main(String[] args) {
		/*https://www.codechef.com/LTIME86B/submit/CHEFSTEP*/	    
		Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc>0){
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        int[] arr = new int[n];
	        String s="";
	        for(int i=0;i<n; i++){
	            arr[i] = sc.nextInt();
	        }
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]%k==0)
	                s=s+1;
	            else
	                s=s+0;
	        }
	        System.out.println(s);
	        tc--;
	    }
		 
	
	}
}
