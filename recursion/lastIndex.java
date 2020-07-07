package recursion;

import java.util.Scanner;

public class lastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		
		for(int i =0; i< arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int data = sc.nextInt();
		int si = 0;
		int result = lastI(arr, si, data);
		System.out.println(result);

	}

	private static int lastI(int[] arr, int si, int data) {
		// TODO Auto-generated method stub
		if(si == arr.length)
			return -1;
		
		int index = lastI(arr, si+1, data);
		if(index == -1) {
			if(arr[si] == data)
				return si;
			else
				return -1;
		}else
			return index;
	}

}
