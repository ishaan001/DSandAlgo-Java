package Queue;

/*In a normal Queue, 
 * we can insert elements until queue becomes full. But once queue becomes full,
 *  we can not insert the next element even if there is a space in front of queue.
 *  
 *  for that reason CricularQueue was introduced 
*/
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
		c1.deQueue();
		c1.enQueue(66);
		System.out.println(c1.getFront());
		
		//System.out.println(c1.getFront());
		
	}

}
