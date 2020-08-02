package stack;

public class DynamicStack extends StackUsingArray {

	public DynamicStack() {
		this(DEFAULT_CAPACITY);
	}
	
	public DynamicStack(int capacity) {
		super(capacity);
	}
	
	@Override
	public void push(int value) throws Exception {
		if(this.size() == this.data.length) {
			int[] arr = new int[2*this.data.length];
			for(int i=0; i<this.size(); i++) {
				arr[i] = data[i];
			}
			this.data = arr;
		}
		super.push(value);
	}
}
