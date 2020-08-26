package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLL queue = new QueueUsingLL();
		for(int i=1;i<=6;i++)
			queue.enQueue(i*10);
		queue.display();
		reverse(queue);
		System.out.println();
		queue.display();
		

	}

	public static void reverse(QueueUsingLL queue) {
		// TODO Auto-generated method stub
		if(queue.isEmpty())
			return;
		int element  = queue.getFront();
		queue.deQueue();
		reverse(queue);
		queue.enQueue(element);
		
		
	}

}
