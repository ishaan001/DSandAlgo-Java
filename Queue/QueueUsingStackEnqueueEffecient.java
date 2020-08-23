package Queue;

import java.util.Stack;

public class QueueUsingStackEnqueueEffecient {
	private Stack<Integer> primary = new Stack<>();
	private Stack<Integer> secondary = new Stack<>();
	//O(n)
	public void dequeue() {
		while(primary.size() != 1) {
			int val = primary.peek();
			primary.pop();
			secondary.push(val);
		
		}
		primary.pop();
		while(!secondary.isEmpty()) {
			primary.push(secondary.peek());
			secondary.pop();
		}
			
	}
	//O(n)
	public int front() {

		while(primary.size() != 1) {
			int val = primary.peek();
			primary.pop();
			secondary.push(val);
		
		}
		int front = primary.peek();
		while(!secondary.isEmpty()) {
			primary.push(secondary.peek());
			secondary.pop();
		}
			
	
		return front;
	}
	//O(1)
	public void enqueue(int item) {
		primary.push(item);
	}
	//O(n)
	public void display() {
		while(!primary.isEmpty()) {
			int val = primary.peek();
			primary.pop();
			secondary.push(val);
		
		}
		while(!secondary.isEmpty()) {
			System.out.print(secondary.peek()+" ");
			primary.push(secondary.peek());
			secondary.pop();
		}
		System.out.println();
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingStackEnqueueEffecient q = new QueueUsingStackEnqueueEffecient();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.display();
		q.dequeue();
		q.display();
		System.out.println(q.front());
		q.enqueue(50);
		q.display();
		

	}

}
