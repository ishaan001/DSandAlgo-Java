package linkedlist;

public class LL_AS_q {
	 private LinkedList queue;
	 
	 public LL_AS_q() {
		 this.queue = new LinkedList();
	 }
	 
	 public void enqueue(int val) {
		 this.queue.addLast(val);
	 }
	 
	 public int dequeue() throws Exception {
		 int val = this.queue.removeFirst();
		 return val;
	 }
	 
	 public void front() throws Exception {
		 this.queue.getFirst();
	 }
	 
	 public void display(){
		 this.queue.display();
	 }
	 
	 public void size() {
		 this.queue.size();
	 }
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LL_AS_q ll = new LL_AS_q();
		ll.enqueue(10);
		ll.enqueue(20);
		ll.enqueue(30);
		ll.display();
		System.out.println(ll.dequeue());
		ll.display();
	}

}
