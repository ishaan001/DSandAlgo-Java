package linkedlist;

import org.omg.CORBA.Current;

public class LinkedList {
	/*
	 * the node is the inner class of the linked list
	 * if we create a separate node class everyone can access it 
	 * but we want everyone to create node through linked list only */
	private class Node{
		int data;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	//O(n)
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
	
	//O(1)
	public void addLast(int item) {
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
		System.out.println(this.size);
	}
	
	//O(1)
	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		
		if(this.size >=1) {
			nn.next = head;
		}
		
		if(this.size == 0) {
			this.head = this.tail = nn;
			this.size++;
		}else {
			this.head = nn; 
			this.size++;
		}
		System.out.println(this.size);
	}

	//O(1)
	public void getFirst() throws Exception {
		if(this.size==0)
			throw new Exception("Linked list is empty");
		else
			System.out.println(this.head.data);
	}

	//O(1)
	public void getLast() throws Exception {
		if(this.size==0)
			throw new Exception("linked list is empty");
		else
			System.out.println(this.tail.data);
	}
	//o(n)
	public void getAt(int index) throws Exception {
		
		if(size==0) {
			throw new Exception("ll is empty");
		}else if(index< 0 || index >= this.size) {
			throw new Exception("Linked list: Out of bound - Invalid Index");
		}
		else {
			Node temp = head;
			int counter =0;
			while(temp != null) {
				if(counter == index) {
					System.out.println(temp.data);
					break;
				}
				temp = temp.next;
				counter++;
			}
		}
	}
	//o(n)
	public int getAtVersion2(int index) throws Exception{
		if(this.size ==0)
			throw new Exception("empty");
		if(index < 0 || index >= this.size)
			throw new Exception("invalid details");
		Node temp =head;
		for(int i=1; i<= index;i++) {
			 temp=temp.next;
		}
		
		return temp.data;
	}
	
	//O(n)
	private Node getNodeAt(int index) throws Exception{
		if(this.size ==0)
			throw new Exception("empty"+this.size);
		if(index < 0 || index > this.size)
			throw new Exception("invalid details"+this.size);
		Node temp =head;
		for(int i=1; i<= index;i++) {
			 temp=temp.next;
		} 
		return temp ;
	}

	//O(n)
	public void addAt(int index) throws Exception {
		
		if(index < 0 || index > this.size)
			throw new Exception("invalid details");
		
		if(index ==0)
			addFirst(60);
		else if(index == this.size) {
			addLast(60);
		}else {
			Node prevNode = getNodeAt(index-1);
			Node nn = new Node();
			nn.data = 60;
			nn.next = null;
			
			nn.next = prevNode.next;
			prevNode.next = nn;
			this.size++;
		}
		System.out.println(this.size);
	}
	
	//O(1)
	public int removeFirst() throws Exception {
		 
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

	public int removeLast() throws Exception{
	int val ;
	if(size == 0) {
		throw new Exception("empty");
	}
	if(this.size == 1) {
		val = tail.data;
		head = null;
		tail = null;
		
	}else {
		Node temp = getNodeAt(this.size-2);
		val = temp.next.data;
		tail = temp;
		tail.next = null;
	}
	this.size--;
	System.out.println(this.size);
	return val;
}
	
	public int removeAt( int index ) throws Exception {
		int val;
		if(this.size ==0 )
			throw new Exception("empty");
		if(index < 0 || index >=  this.size)
			throw new Exception("invalid details");
		else if(index == 0) {
			val = removeFirst();
		}
		else if(index == this.size-1)
			val = removeLast();
		else {
			Node temp = getNodeAt(index-1);
			val = temp.next.data;
			temp.next = temp.next.next;
			this.size--;
		}
		
		System.out.println(this.size);
		return val;
	}
	
	public void reverseData() throws Exception {
		int left = 0;
		int right = this.size -1 ;
		System.out.println(this.size);
		while(left < right) {
			Node ln = getNodeAt(left);
			Node rn = getNodeAt(right);
			
			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;
			
			left++;
			right--;
		}
	}
	
	public void reversePointer() throws Exception{
		
		Node prev = this.head ;
		Node current = prev.next;
		
		
		while(current != null) {
			Node ahead = current.next;
			current.next = prev;
			prev = current;
			current = ahead;
		}
		Node temp = this.head;
		this.head  = this.tail ;
		this.tail = temp;
		this.tail.next = null;
		 
	}
	
	/*return the midpoint without using the size and in one traversal
	 * we are using the fast and slow or (rabbit, turtle race)
	 * */
	public int midPoint() {
		Node temp = this.head;
		Node slow = temp;
		Node fast = temp;
		while(fast.next  != null && fast.next.next !=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
}





















