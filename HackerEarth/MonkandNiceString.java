package hackerEarth;

import java.util.Scanner;

public class MonkandNiceString {
    public static void main(String args[] ) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();
    String[] arr = new String[tc];
    for(int i=0;i<4;i++) {
        arr[i] = sc.next();
    }
    
    for(int i=0; i<arr.length; i++){
        int count =0;
        for(int j =0 ;j <i;j++){
                if( arr[i].charAt(0) < arr[j].charAt(0) ) {
                	System.out.println(arr[i].charAt(0)+" < "+arr[j].charAt(0));
            	  count++;
                }
            
        }
        System.out.println(count);
    }
   }
}
