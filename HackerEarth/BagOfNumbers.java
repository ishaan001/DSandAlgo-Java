package hackerEarth;

import java.util.Scanner;
import java.util.Stack;

public class BagOfNumbers {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//System.out.println(s);
		String[] arr = s.split(" ");
		Stack<String> stack = new Stack<>();
		Stack<String> helper = new Stack<>();
		for(int i=1; i<arr.length; i++) {
			stack.push(arr[i]);
		}
		//displayStack(stack);
		int l = arr[0].length();
		Boolean putColon = false;
		if(arr[0].charAt(l-1)==':')
			putColon =true;
	 
		resverseStack(stack,helper,0);
		displayStack(stack,putColon);
		 
	}

	private static void displayStack(Stack<String> stack1,Boolean putcolon) {
		// TODO Auto-generated method stub
		if(putcolon)
			System.out.print("output: ");
		else {
			System.out.print("output ");
		}
		while(!stack1.isEmpty()) {
			System.out.print(stack1.peek()+" ");
			stack1.pop();
		}
		
	}

	private static void resverseStack(Stack<String> stack, Stack<String> helper, int i) {
		// TODO Auto-generated method stub
		if(stack.isEmpty())
			return;
		String item = stack.pop();
		resverseStack(stack, helper, i+1);
		helper.push(item);
		if(i ==0) {
			while(!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}
		
	}

}
