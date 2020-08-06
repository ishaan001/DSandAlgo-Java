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
		
		while(temp != null) {
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
	}

}
