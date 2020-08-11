package linkedlist;

 

public class LinkedListAsqueue {
	private class Node{
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	private int size;
	
	public void display() {
		Node temp = head;
		System.out.println("-------------------------------");
		while(temp != null) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.print("END.");
		System.out.println("\n-------------------------------");
	}
	
	public void enqueue(int  item) {

		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		
		//if linked list is not empty
		if(this.size >= 1) {
			this.tail.next = nn;
		}
		
		//summary object
		//basically where will head and tail will point under which scenario
		
		if(this.size ==0) {
			this.head = this.tail = nn;
			this.size++;
		}else {
			this.tail = nn;
			this.size++;
		}
	//	System.out.println(this.size);
	
	}

	public int dequeue() throws Exception {

		 
		 if(this.size ==0) {
			 throw new Exception("empty");
		 }
		 int val = head.data;
		 if(size == 1) {
			 
			 head =null;
			 tail =null;
			 
		 }else {
			 head = head.next;	 
		 }
		 this.size--;
		 System.out.println(this.size);
		 return val;
	 
		
	}

	public int front() throws Exception {
		int data;
		if(this.size ==0) throw new Exception ("EMPTY");
		else {
			data = this.head.data;
		}
		return data;
		
	}

	public int size() {
		return this.size;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	LinkedListAsqueue ll = new LinkedListAsqueue();
	ll.enqueue(10);
	ll.display();
	ll.enqueue(30);
	ll.enqueue(60);
	ll.display();
	System.out.println(ll.dequeue());
	ll.display();
	System.out.println(ll.front());
	System.out.println(ll.size);
	

	}

}
