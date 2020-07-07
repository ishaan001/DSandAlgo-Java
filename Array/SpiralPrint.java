package Array;
import java.util.Scanner;


public class SpiralPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr =  new int[4][4];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4;i++) {
			for(int j=0;j<4;j++) {
				arr[i][j] = sc.nextInt();
			}
			
			  
		}
		// 6params 
		int top,bottom,left,right,count,dir;
		top = 0;
		bottom = arr.length-1;
		left = 0;
		right = arr[top].length-1;
		count = (bottom+1)*(right+1);
		dir = 1;
		
		while (left <= right && top <= bottom) {
			if(count >0) {
				if(dir==1) {
					for(int i=left; i<=right;i++) {
						System.out.println(arr[top][i]+",");
						count--;
					}
					dir =2;
					top++;
				}
			}
			
			if(count >0) {
				if(dir==2) {
					for(int i=top; i<=bottom;i++) {
						System.out.println(arr[i][right]+",");
						count--;
					}
					dir =3;
					right--;
				}
			}
			if(count >0) {
				if(dir==3) {
					for(int i=right; i>=left;i--) {
						System.out.println(arr[bottom][i]+",");
						count--;
					}
					dir =4;
					bottom--;
				}
			}
			
			if(count >0) {
				if(dir==4) {
					for(int i=bottom; i>=top;i--) {
						System.out.println(arr[i][left]+",");
						count--;
					}
					dir =1;
					left++;
				}
			}
		}
		System.out.println("END");
		 
		
		
		
		
		
		
		 for(int i=0; i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			  
		}
	}

}
