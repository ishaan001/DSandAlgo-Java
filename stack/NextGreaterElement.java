package stack;

import java.util.Stack;
/* find the next greater element 
 * for the each element present inside the array*/

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 3, 8, 6, 7, 5 };
		
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0; i<arr.length; i++) {
			while(!stack.isEmpty() && arr[i] > stack.peek()) {
				int rv = stack.pop();
				System.out.println(rv+"->"+arr[i]);
			}
			stack.push(arr[i]);
		}
		while(!stack.isEmpty()) {
			int rv = stack.pop();
			System.out.println(rv+"->"+"-1");
		}

	}

}
