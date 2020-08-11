package linkedlist;

public class LinkedListAsStack {
		 private LinkedList stack ;
		 
		 public LinkedListAsStack() {
			 this.stack = new LinkedList();
		 }
		 
		 public void push(int val) {
			 this.stack.addFirst(val);
		 }
		 
		 public int pull() throws Exception{
			 return this.stack.removeFirst();
		 }
		 
		 public void top() throws Exception {
			 this.stack.getFirst();
		 }
		 
		 public void display() {
			 this.stack.display();
		 }
		 
		 public int size() {
			 return this.stack.size();
		 }
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedListAsStack ls = new LinkedListAsStack();
		ls.push(10);
		ls.display();
		ls.push(20);
		ls.display();
		ls.top();
		System.out.println(ls.pull());
		ls.display();
	}

}
