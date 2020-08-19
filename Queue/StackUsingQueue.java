package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueue {

	/*Stack will be implemented using 2 Queue
	 * there are 2 approach push efficient or pop efficient 
	 * this one will be push efficient 
	 * */
	
	private Queue<Integer> primary = new LinkedList<Integer>();
	private Queue<Integer> secondary = new LinkedList<Integer>();
	
	public void push(int val) {
		primary.add(val);
	}
	public int pop() {
		while(primary.size() != 1) {
			int i = primary.peek();
			primary.remove();
			secondary.add(i);
			
		}
		int i = primary.peek();
		primary.remove();
		Queue<Integer> temp = primary;
		primary = secondary;
		secondary = temp;
		
		return i;
	}
	public int top() {

		while(primary.size() != 1) {
			int i = primary.peek();
			primary.remove();
			secondary.add(i);
			
		}
		int i = primary.peek();
		primary.remove();
		secondary.add(i);
		Queue<Integer> temp = primary;
		primary = secondary;
		secondary = temp;
		
		return i;
	}
	public void display() {
		for (Integer integer : primary) {
			System.out.print(integer+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingQueue s = new StackUsingQueue();
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		System.out.println(s.pop());
		s.display();
		s.push(40);
		 
		s.display();
		 
		

	}

}
