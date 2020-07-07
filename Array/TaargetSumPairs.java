package Array;
import java.util.Scanner;

public class TaargetSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m = n+1;
		int[] arr = new int[m];

		for(int i=0;i<=n;i++){
			arr[i] = sc.nextInt();
		}
		int target = arr[n];
		for(int i =0;i < n;i++){
			for(int j=i+1;j<n;j++){
				if((arr[i]+arr[j]) == target)
					System.out.println(arr[i]+" "+arr[j]);
			}
		}

	}

}
