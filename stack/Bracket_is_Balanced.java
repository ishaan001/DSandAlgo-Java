package stack;

import java.util.Stack;
/*return true is paranthesis
 *  are balanced and false if they aren't
*/
public class Bracket_is_Balanced {
	
	public Boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(' ) {
				stack.push(str.charAt(i));
			}else if( str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')' ) {
				if(stack.isEmpty()) {
					return false;
				}
				if( str.charAt(i) == '}') {
					if(stack.peek() == '{') {
						stack.pop();
					}else
						return false;
				} else if( str.charAt(i) == ']') {
					if(stack.peek() == '[') {
						stack.pop();
					}else
						return false;
				} else if( str.charAt(i) == ')') {
					if(stack.peek() == '(') {
						stack.pop();
					}else
						return false;
				}
			}else {
				// Do nothing
			}
			
		}
		if(stack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "{[({a+B})]}";
		Bracket_is_Balanced bb = new Bracket_is_Balanced();
		System.out.println(bb.isBalanced(str));

	}
	
	
}
		

