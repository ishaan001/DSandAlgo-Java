package codechef;

import java.util.Scanner;

public class SmallestNo {

	  
	// Function to get sum of digits 
	/*static int getSum(int n) 
	{ 
	    int sum = 0; 
	    while (n != 0)  
	    { 
	        sum = sum + n % 10; 
	        n = n / 10; 
	    } 
	    return sum; 
	} */
	  
	// Function to find the smallest 
	// number whose sum of digits is also N 
	static String smallestNumber(int val) 
	{ 
		/*int num ;
	    int i = 1; 
	    while (1 != 0)  
	    { 
	        // Checking if number has 
	        // sum of digits = N 
	        if (getSum(i) == N)  
	        { 
	            num = i; 
	            break; 
	        } 
	        i++; 
	    } 
		int num = 	 (int) ((N % 9 + 1) *  Math.pow(10, (N / 9)) - 1) ;
	    return Integer.toString(num);*/
		
			val = Math.abs(val);
		    int ninecount =  val / 9;
		    int remainder = val % 9;
		    int scale = (int)Math.pow(10, ninecount);
		    int result = remainder * scale + (scale - 1);
		    return Integer.toString(result);
	} 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int tc = sc.nextInt();
		 while(tc>0) {
			 int pc = sc.nextInt();
			 int pr = sc.nextInt();
			 String cPower = smallestNumber(pc);
			 String rPower = smallestNumber(pr);
			 System.out.println(cPower+" "+rPower);
			 System.out.println(cPower.length()+" "+rPower.length());
			 if(cPower.length() == rPower.length() || cPower.length() > rPower.length()) {
				 System.out.println(1+" "+rPower.length());
			}else if(cPower.length() < rPower.length()) {
				System.out.println(0+" "+cPower.length());
			 }
			 tc--;
		 }
	}

}
