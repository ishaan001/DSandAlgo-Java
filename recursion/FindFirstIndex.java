package recursion;

public class FindFirstIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6, 8, 1, 1, 8, 3, 4};
		int data = 4;
		int firstIndex = findFirstIndex(arr,0,data);
		System.out.println(firstIndex);

	}

	private static int findFirstIndex(int[] arr, int i, int data) {
		// TODO Auto-generated method stub
		//baseCase
		if(i == arr.length)
			return -1;
		
		
		if(arr[i] == data) {
			return i;
		}
		else {
			int foundOrNotFound = findFirstIndex(arr, i+1, data);
			return foundOrNotFound;
		}
	}

}
