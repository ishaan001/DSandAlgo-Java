package Queue;

import  java.util.LinkedList;

public class QueueUsingLL {
	private LinkedList<Integer> Queue;
	
	QueueUsingLL(){
		this.Queue = new LinkedList<>();
	}
	
	public boolean isEmpty() {
		return this.Queue.isEmpty();
	}
	
	public void enQueue(int val) {
		this.Queue.addLast(val);
	}
	
	public void deQueue() {
		this.Queue.removeFirst();
	}
	
	public int getFront() {
		return this.Queue.getFirst();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueUsingLL ll = new QueueUsingLL();
		ll.enQueue(20);
		ll.enQueue(30);
		
		for(int i=1;i<5;i++) {
			ll.enQueue(i);
		}
		while(!ll.isEmpty()) {
			System.out.println(ll.getFront());
			ll.deQueue();
		}
		
	}

}
