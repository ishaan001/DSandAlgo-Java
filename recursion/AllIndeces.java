package recursion;

public class AllIndeces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		int[] arr = {3,4,1,8,8,4};
	 
		int si=0,count=0;
		int data=4;
		int[] arr1= allindex(arr,si,data,count);
		int[] arr2 = diffApproach(arr,si,data,count);
		
		for(int i=0; i<arr1.length;i++)
			System.out.print(arr1[i]+" ");
		
		System.out.println();
		for(int i=0; i<arr2.length;i++)
			System.out.print(arr2[i]+" ");
		
	}

	private static int[] diffApproach(int[] arr, int si, int data, int count) {
		// TODO Auto-generated method stub
		if(si == arr.length) {
			return new int[count];
		}
		int[] indeces = null;
		if(arr[si] == data) {
			indeces = diffApproach(arr, si+1, data, count+1);
		}else {
			indeces = diffApproach(arr, si+1, data, count);
		}
		
		if(arr[si] == data) {
			indeces[count] = si;
		}
		return indeces;
	}

	private static int[] allindex(int[] arr, int si, int data, int count) {
		// TODO Auto-generated method stub
		if(si == arr.length)
			return new int[count];
 
		if(arr[si] == data) {
			count++;
			
		}
		 
		int[] arr2 = allindex(arr, si+1, data, count);
		if(count >=1)
			arr2[count-1] = si;
		return arr2;
	}
	
	

}
