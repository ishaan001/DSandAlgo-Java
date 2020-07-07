package CodeForces;

import java.util.Scanner;

public class CF_236A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder(s);
		StringBuilder sb1 = new StringBuilder();
		
		for(int i=0;i<sb.length();i++)
		{
			char ch = sb.charAt(i);
			String charsec = Character.toString(ch);
			if(!sb1.toString().contains(charsec))
				sb1.append(charsec);
				
		}
		if((sb1.length()%2) == 0)
			System.out.println("CHAT WITH HER!");
		else
			System.out.println("IGNORE HIM!");
		

	}

}
