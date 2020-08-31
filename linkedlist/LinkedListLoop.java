package linkedlist;

import java.util.HashSet;

public class LinkedListLoop {

    Node head; // head of list 
  
    /* Linked list Node*/
    class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    /* Inserts a new Node at front of the list. */
    public void push(int new_data) 
    { 
        /* 1 & 2: Allocate the Node &  
                Put in the data*/
        Node new_node = new Node(new_data); 
  
        /* 3. Make next of new Node as head */
        new_node.next = head; 
  
        /* 4. Move the head to point to new Node */
        head = new_node; 
    } 
    /*
     *  Hashing
		Approach:
		Traverse the list one by one and keep putting the node addresses in a Hash Table.
		 At any point, if NULL is reached then return false and if next of 
		 current node points to any of the previously stored nodes in Hash then 
		 return true
     * */
    static  Boolean detectLoopHashSet(Node head) {
    	HashSet<Node> s = new HashSet<>();
    	while(head != null ) {
    		if(s.contains(head))
    			return  true;
    		
    		s.add(head);
    		
    		head = head.next;
    	}
		return false;
    	
    }
  /*
   * Floyd’s Cycle-Finding Algorithm
	Approach: This is the fastest method and has been described below:
	
	Traverse linked list using two pointers.
	Move one pointer(slow_p) by one and another pointer(fast_p) by two. 
	If these pointers meet at the same node then there is a loop. If pointers do not meet then linked list doesn’t have a loop.
   * */
    void detectLoopSlowFast() 
    { 
        Node slow_p = head, fast_p = head; 
        int flag = 0; 
        while (slow_p != null && fast_p != null && fast_p.next != null) { 
            slow_p = slow_p.next; 
            fast_p = fast_p.next.next; 
            if (slow_p == fast_p) { 
                flag = 1; 
                break; 
            } 
        } 
        if (flag == 1) 
            System.out.println("Loop found"); 
        else
            System.out.println("Loop not found"); 
    } 
  
    /* Driver program to test above functions */
    public static void main(String args[]) 
    { 
        LinkedListLoop llist = new LinkedListLoop(); 
  
        llist.push(20); 
        llist.push(4); 
        llist.push(15); 
        llist.push(10); 
  
        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head; 
  
        llist.detectLoopSlowFast(); 
    } 

}
