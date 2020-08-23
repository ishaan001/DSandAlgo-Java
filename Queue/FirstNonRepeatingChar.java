package Queue;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s =new String();
		BruteForceSolution(s);

	}

	private static void BruteForceSolution(String s) {
		// TODO Auto-generated method stub
		//Input	- 	c	b	a	b	c	a	a	d	b	d
		//Output -	c	c	c	c	a	-1	-1	d	d	-1
		Map<Character, Integer> m = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(m.containsKey(s.charAt(i)))
				m.put(s.charAt(i), m.get(s.charAt(i))+1 );
			else
				m.put(s.charAt(i), 1);
		}
		
		
		
	}

}
