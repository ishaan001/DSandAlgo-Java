package linkedlist;

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
	
	private Node getNodeAt(int index) throws Exception{
		if(this.size ==0)
			throw new Exception("empty");
		if(index < 0 || index >= this.size)
			throw new Exception("invalid details");
		Node temp =head;
		for(int i=1; i<= index;i++) {
			 temp=temp.next;
		} 
		return temp ;
	}

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
	}
}
