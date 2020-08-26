package Queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class SlidingWindowNegativeCase {
/*
 * 	First Negative integer in every window of size K
 * 	O(n)
 *  * 	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Deque<Integer> dq = new LinkedList<Integer>();
		QueueUsingLL lq = new QueueUsingLL();
		int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
		int k = 3;
		int i=0;
		for(;i<k;i++) {
			if(arr[i]<0) {
					lq.enQueue(i);
			}
		}
		for(;i<arr.length;i++) {
			if(!lq.isEmpty()) {
				System.out.print(arr[lq.getFront()]+" ");
			}else {
				System.out.println("0 ");
			}
			
			while(!lq.isEmpty() && lq.getFront()<=i-k) {
				lq.deQueue();
			}
			if(arr[i]<0) {
				lq.enQueue(i);
			}	
		}
		if(!lq.isEmpty()) {
			System.out.print(arr[lq.getFront()]+" ");
		}else {
			System.out.println("0 ");
		}
		
		
		
	}

}
