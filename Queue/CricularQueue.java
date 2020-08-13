package Queue;

public class CricularQueue {
	
	private int arr[];
	private int cs; //count size
	private int ms; //max size
	private int front;
	private int rear;
	private static int DEFAULT_CAPACITY = 10;
	
	public CricularQueue() {
		// TODO Auto-generated constructor stub
		this(DEFAULT_CAPACITY);
	}

	public CricularQueue(int capacity) {
		// TODO Auto-generated constructor stub
		this.arr = new int[capacity];
		this.cs = 0;
		this.ms = capacity;
		this.front = 0;
		this.rear = capacity -1;
	}
	
	public boolean isFull() {
		return this.cs == this.ms;
	}

	public boolean isEmpty() {
		return this.cs == 0;
	}
	
	public void enQueue(int val) {
		if(!this.isFull()) {
			this.rear = (this.rear +1)%this.arr.length;
			this.arr[this.rear] = val;
			this.cs++;
		}
	}
	
	public void deQueue() {
		if(!this.isEmpty()) {
			this.front = (this.front+1)%this.arr.length;
			this.cs--;
		}
	}
	
	public int getFront() {
		return this.arr[this.front];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		CricularQueue c1 = new CricularQueue(5);
		c1.enQueue(20);
		c1.enQueue(30);
		c1.enQueue(40);
		c1.enQueue(15);
		c1.enQueue(55);
		c1.enQueue(66);
		System.out.println(c1.getFront());
		c1.deQueue();
		System.out.println(c1.getFront());
		
	}

}
