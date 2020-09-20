package recursion;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSS("abc"));
		System.out.println(getsswASCII("ab"));
		printSS("abc","");
		
		 

	}

	 

	public static void printSS(String string, String result) {
		// TODO Auto-generated method stub\
		if(string.length() ==0 ) {
			System.out.println(result);
			return;
		}
		
		
		char cc = string.charAt(0);
		String rest = string.substring(1);
		printSS(rest,	result);
		printSS(rest, result+cc);
		
	}



	/*
	 * always remember that recursion always works
	 * jo chhiye uska chotta part socho mil gaya and then ab woh add karo usme jo chhiye
	 * and condition laga kar ban gaya result
	 *  */
	private static ArrayList<String> getsswASCII(String string) {
		// TODO Auto-generated method stub
		if(string.isEmpty())
		{
			ArrayList<String> bc = new ArrayList<>();
			bc.add(" ");
			return bc;
		}
		
		char cc = string.charAt(0);
		int asciiVal = (int)cc;
		String ros = string.substring(1);
		ArrayList<String> result = new ArrayList<>();
		ArrayList<String> rec = getsswASCII(ros);
		for(int i=0;i < rec.size();i++) {
			result.add(rec.get(i));
			result.add(cc+rec.get(i));
			result.add(asciiVal + rec.get(i));
		}
		return result;
	}

	//recursion always Works  :P
	//always remember that
	// ss -  string Subsequence
	private static ArrayList<String> getSS(String string) {
		// TODO Auto-generated method stub
		if(string.isEmpty()) {
			ArrayList<String> baseCase = new ArrayList<>();
			baseCase.add(" ");
			return baseCase;
		}
		
		char cc = string.charAt(0);
		String rest = string.substring(1);
		ArrayList<String> result = new ArrayList<>();
		ArrayList<String> rec	= getSS(rest);
		for(int i=0; i<rec.size(); i++) {
			result.add(rec.get(i));
			result.add(cc+rec.get(i));
		}
		return result;
	}
	
	

}
