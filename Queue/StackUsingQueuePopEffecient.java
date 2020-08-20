package Queue;

public class StackUsingQueuePopEffecient {
	
	private QueueUsingLL primary;
	private QueueUsingLL Secondary;
	
	StackUsingQueuePopEffecient(){
		this.primary = new QueueUsingLL();
		this.Secondary = new QueueUsingLL();
	}

	public int size() {
		return this.primary.size();
	}
	
	public Boolean isEmpty() {
		return this.primary.isEmpty();
	}
	public int top() {
		return this.primary.getFront();
	}
	public void pop() {
		this.primary.deQueue();
	}
	public void push(int val) {
		while(this.primary.size() != 0) {
			this.Secondary.enQueue(this.primary.getFront());
			this.primary.deQueue();
		}
		this.primary.enQueue(val);
		while(this.Secondary.size() != 0) {
			this.primary.enQueue(this.Secondary.getFront());
			this.primary.deQueue();
		}
	}
	
	public void display() {
		this.primary.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackUsingQueuePopEffecient sp = new StackUsingQueuePopEffecient();
		System.out.println(sp.size());
		 sp.push(10);
		
		sp.display();
	}

}
