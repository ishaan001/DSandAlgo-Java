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

}
