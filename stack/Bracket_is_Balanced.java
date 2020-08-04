package stack;

import java.util.Scanner;
import java.util.Stack;
/*return true is paranthesis
 *  are balanced and false if they aren't
*/
public class Bracket_is_Balanced {
	
	public static String isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(' ) {
				stack.push(str.charAt(i));
			}else if( str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')' ) {
				if(stack.isEmpty()) {
					return "NO";
				}
				if( str.charAt(i) == '}') {
					if(stack.peek() == '{') {
						stack.pop();
					}else
						return "NO";
				} else if( str.charAt(i) == ']') {
					if(stack.peek() == '[') {
						stack.pop();
					}else
						return "NO";
				} else if( str.charAt(i) == ')') {
					if(stack.peek() == '(') {
						stack.pop();
					}else
						return "NO";
				}
			}else {
				// Do nothing
			}
			
		}
		if(stack.isEmpty()) {
			return "YES";
		}
		else {
			return "NO";
		}
	}
	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int test = s.nextInt();           
	        // Write your code here
	        for(int i=0;i<test;i++){
	            String str = s.next();
	            System.out.println(isBalanced(str));
	            
	        }

	}
	
	
}
		

