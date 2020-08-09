package linkedlist;

public class LlClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
	 
		ll.addLast(20);
		ll.addLast(30);
	 
		ll.addFirst(40);
		ll.addFirst(50);
		ll.display();
		
		ll.getFirst();
		ll.getLast();
		
		ll.getAt(1);
		//System.out.println(ll.getAtVersion2(3));
		ll.addAt(0);
		ll.display();
		System.out.println(ll.removeFirst());
		ll.display();
		System.out.println(ll.removeLast());
		ll.display();
		System.out.println(ll.removeAt(4));
		ll.display();

	}

}
