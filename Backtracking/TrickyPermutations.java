package Backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class TrickyPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		List<String> l = getPermutations(s);
		TreeSet<String> treeSet = new TreeSet<String>(l); 
		for (String string : treeSet) {
			System.out.println(string);
		}

	}

	public static ArrayList<String> getPermutations(String str) {
		// TODO Auto-generated method stub
		
		if(str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String rest = str.substring(1);

		ArrayList<String> rr = getPermutations(rest);
		ArrayList<String> mr = new ArrayList<>();
		for (int i = 0; i < rr.size(); i++) {
			for (int j = 0; j <= rr.get(i).length(); j++) {
				String val1 = rr.get(i);
				String val2 = val1.substring(0, j) + ch + val1.substring(j) ;
				mr.add(val2);
			}
		}

		return mr;
	}

}
