package Queue;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// TODO Auto-generated method stub
//Input	- 	c	b	a	b	c	a	a	d	b	d
//Output -	c	c	c	c	a	-1	-1	d	d	-1
// BRUTE FORCE SOLUTION O(n^2)
public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		StringBuilder sb = new StringBuilder();
		HashMap<Character, Integer> hm = new HashMap<>();
		while(c != '.') {
			sb.append(c);
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			} 
			Boolean flag = true;
			for(int i=0;i<sb.length();i++) {
				char f  = sb.charAt(i); 
				if(hm.get(f) == 1) {
					System.out.println(f);
					flag = false;
					break;
				}
				
			}
			if(flag)
				System.out.println("-1");
			c = sc.next().charAt(0);
		}
		 
	 
		
	 

	}

	 
		 
		
		
	 

}
