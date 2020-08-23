package Queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 	first non repeating character in O(n) time using queues */
public class NonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> hm = new HashMap<>();
		Queue<Character> queue = new LinkedList<Character>();
		char ch = sc.next().charAt(0);
		while(ch != '.') {
			queue.add(ch);
			if(hm.containsKey(ch)) {
				int oldValue = hm.get(ch);
				oldValue+=1;
				hm.put(ch, oldValue);
			}
			else {
				hm.put(ch, 1);
			}
			
			while(!queue.isEmpty()) {
				char front = queue.peek();
				if(hm.get(front) == 1) {
					System.out.println(front);
					break;
				}
				else {
					queue.poll();
				}
			}
			
			if(queue.isEmpty())
				System.out.println("-1");
			
			ch = sc.next().charAt(0);
		}

	}

}
