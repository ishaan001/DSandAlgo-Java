package recursion;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {50,40,30,20,10};
		 
		bubble(arr,0,arr.length-1);
		for(int i =0;i<=arr.length-1;i++)
			System.out.print(arr[i]+" ");
	}

	private static void bubble(int[] arr, int si, int li) {
		// TODO Auto-generated method stub
		if(li ==0)
			return;
		if(si == li) {
			bubble(arr, 0, li-1); 
			return;}
		if(arr[si] > arr[si+1])
		{
			int temp = arr[si];
			arr[si] = arr[si+1];
			arr[si+1] = temp;
		}
		bubble(arr, si+1, li);
		
	}

}
