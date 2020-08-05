package hackerEarth;

import java.util.Scanner;
import java.util.Stack;
/*
 * Stack - A game of numbers
 * Partially accepted */

public class NumberGame {
	public static int[] numberGame(int[] arr){
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[i]>stack.peek()){
                stack.pop();
                stack1.push(arr[i]);
                for(int j=i+1; j<arr.length; j++){
                    while(!stack1.isEmpty() && arr[j]<stack1.peek()){
                        arr[stack2.peek()] = arr[j];
                        stack2.pop();
                        stack1.pop();
                    }
                }

            }
            stack.push(arr[i]);
            stack2.push(i);
        }
        while(!stack.isEmpty()){
            stack.pop();
            arr[stack2.peek()] = -1;
            stack2.pop();
        }
        return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //Scanner
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        int[] arr = new int[testCases];
        for(int i=0; i<testCases; i++){
            arr[i] = s.nextInt();
        }

        int[] arr1 = numberGame(arr);
        for(int i=0;i<arr1.length; i++){
            System.out.print(arr[i]+" ");
        }
    

	}

}
