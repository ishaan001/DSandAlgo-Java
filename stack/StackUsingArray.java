package stack;

public class StackUsingArray {
	protected int[] data;
	protected int top;
 
	
	protected static final int DEFAULT_CAPACITY = 10;
	public StackUsingArray() {
		this(DEFAULT_CAPACITY);
	}
	
	public StackUsingArray(int capacity) {
		data = new int[capacity];
		this.top = -1;
	}
	
	public int size() {
		return this.top + 1;
	}
	public Boolean isEmpty() {
		return(this.size() == 0);
	}
	public void display() {
		for(int i =top; i>=0; i--) {
			System.out.print(data[i]+" ");
		}
		System.out.println("END");
	}
	
	public void push(int value) throws Exception{
		if(this.size() > data.length) {
			throw new Exception("stack is full");
		}
		this.top++;
		this.data[this.top] = value;
		
	}
	
	public void pop() throws Exception {
		if(this.size() == 0) {
			throw new Exception("stack is empty");
		}
		
		this.data[this.top] = 0;
		this.top--;
	}
	
	public int topVal() throws Exception {
		if(this.size() == 0) {
			throw new Exception("stack is empty");
		}
		int rval = this.data[this.top];
		return rval;
		
	}
}
