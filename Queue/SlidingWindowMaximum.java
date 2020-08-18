package Queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class SlidingWindowMaximum {

	// very important 
	//first run it in debug mode to understand
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();*/
		int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
		
		int windowSize = 3;
	
		ArrayList<Integer> a = slidingWindowUsingDeQue(arr,windowSize); 

		for (Integer integer : a) {
			System.out.print(integer+ " ");
		}
	}

	//O(n) -- best solution // other solution [tree, priority Queue, bruteForce]
	private static ArrayList<Integer> slidingWindowUsingDeQue(int[] arr, int k) {
	 
		// TODO Auto-generated method stub
		Deque<Integer> d = new LinkedList<Integer>();
		ArrayList<Integer> solution = new ArrayList<>();
		int i=0;
		for(;i<k;i++) {
			//if the current element is greater than the last element.
			while(!d.isEmpty() && arr[i] > arr[d.getLast()]) {
				d.removeLast();
			}
			d.addLast(i);
		}
		
		for(;i<arr.length;i++) {
			solution.add(arr[d.getFirst()]);
			// if the greatest element in DeQue is out of the window then it should be removed 
			while(!d.isEmpty() && d.getFirst() <= i-k ) {
				d.removeFirst();
			}
			while(!d.isEmpty() && arr[i] > arr[d.getLast()]) {
				d.removeLast();
			}
			d.addLast(i);
			
		}
		solution.add(arr[d.getFirst()]);
		return solution;
	 
	}

	 

	 

}
