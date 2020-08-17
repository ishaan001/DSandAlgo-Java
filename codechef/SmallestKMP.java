package codechef;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallestKMP { 
	 	void KMPSearch(String s, String p) 
	    { 
	 		int STRING_LENGTH = 26;
	 		int s_arr[] = new int[STRING_LENGTH];
	 		int p_arr[] = new int[STRING_LENGTH];
	 		for(int i=0;i<s.length();i++) {
	 			s_arr[s.charAt(i)-'a']++;
	 		}
	 		for(int i=0;i<p.length();i++) {
	 			p_arr[p.charAt(i)-'a']++;
	 			s_arr[p.charAt(i)-'a']--;
	 		}
	 		pLexographically(s_arr,p_arr,p);
	    } 
	 	
	 	void pLexographically(int[] s_arr, int[] p_arr, String p) {
			// TODO Auto-generated method stub
	 		char firstChar = p.charAt(0);
	 		String s = "";
	    	for(int i=0;i<s_arr.length;i++) {
	    		int num = 97+i;
	    		for(int j=0;j<s_arr[i];j++) {
	    			s = s + String.valueOf((char)num);
	    		}
	    	}
	    	
	    	//System.out.println(s);
	    	String f= "";
	    	boolean flag = true;
	    	for(int i=0; i<s.length(); i++) {
	    		if(s.charAt(i) >firstChar && flag) {
	    			f = s.substring(0,i) + p +s.substring(i,s.length());
	    			
	    			break;
	    		}
	    	}
	    	System.out.println(f);
			
		}

		public static void main(String args[]) 
	    { 
	    	Scanner sc = new Scanner(System.in);
	    	int t = sc.nextInt();
	    	while(t>0) {
	        String s = sc.next();
	        String p = sc.next(); 
	        new SmallestKMP().KMPSearch(s, p);
	        t--;
	    	}
	    }
}
