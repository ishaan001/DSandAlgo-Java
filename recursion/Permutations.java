package recursion;

import java.util.ArrayList;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		ArrayList<String> res = getPermu(str);
		System.out.println(res);
	}
	/*
	 * print all the permutation of a particular string
	 * str = "abc"
	 * 
	 * result = [abc, bac, bca, acb, cab, cba]
	 * 
	 * */
	private static ArrayList<String> getPermu(String str) {
		// TODO Auto-generated method stub
		if(str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			//to run the first loop
			baseResult.add("");
			return baseResult;
		}
		
		char ch = str.charAt(0);
		String rest = str.substring(1);
		
		ArrayList<String> recursionResult = getPermu(rest);
		
		ArrayList<String> myResult = new ArrayList<>();
		
		//traversing through array list
		for(int i=0;i<recursionResult.size();i++) {
			String val1 = recursionResult.get(i);
			//traversing through a particular String
			for(int j =0;j<=val1.length();j++) {
				//to inset a character to all the possible positions
				String val2 = val1.substring(0,j) + ch + val1.substring(j);
				myResult.add(val2);
			}
		}
		return myResult;
	}

}
