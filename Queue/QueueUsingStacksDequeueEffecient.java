package Queue;

import java.util.Stack;

public class QueueUsingStacksDequeueEffecient {
	private Stack<Integer> primary;
	private Stack<Integer> secondary;
	
	public QueueUsingStacksDequeueEffecient() {
		// TODO Auto-generated constructor stub
		this.primary = new Stack<>();
		this.secondary = new Stack<>();
	}
	
	public int size() {
		return this.primary.size();
	}
	public Boolean isEmpty() {
		return this.primary.isEmpty();
	}
	public void dequeue() {
		if(this.primary.size() == 0)	System.out.println("empty Queue");
		else	this.primary.pop();
	}
	public int front() {
		return this.primary.peek();
	}
	public void enqueue(int item) {
		
		while(!this.primary.isEmpty()) {
			int val = this.primary.peek();
			this.primary.pop();
			this.secondary.push(val);
		}
		this.primary.push(item);
		while(!this.secondary.isEmpty()) {
			this.primary.push(this.secondary.peek());
			this.secondary.pop();
		}
	}
	
	public void display() {
		while(!this.primary.isEmpty()) {
			int val = this.primary.peek();
			this.primary.pop();
			System.out.print(val+" ");
			this.secondary.push(val);
		}
		System.out.println();
		while(!this.secondary.isEmpty()) {
			this.primary.push(this.secondary.peek());
			this.secondary.pop();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingStacksDequeueEffecient s = new QueueUsingStacksDequeueEffecient();
		s.enqueue(10);
		s.enqueue(20);
		s.enqueue(30);
		s.enqueue(40);
		s.display();
		System.out.println(s.front());
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		s.dequeue();
		s.display();
		System.out.println(s.front());
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		
	}

}
