package hackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Stack;
/*
 *  Fun Game <Capillary> 
 *  
 *  */
public class FunGame {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int n = Integer.parseInt(br.readLine().trim());
         String[] arr_arr = br.readLine().split(" ");
         int[] arr = new int[n];
         for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
         {
         	arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
         }

         int[] out_ = funGame(arr);
         System.out.print(out_[0]);
         for(int i_out_=1; i_out_<out_.length; i_out_++)
         {
         	System.out.print(" " + out_[i_out_]);
         }

         wr.close();
         br.close();
    }
    static int[] funGame(int[] arr){
        // Write your code here
        Stack<Integer> A = new Stack<>();
        Stack<Integer> B = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        int[] result = null;
        
        for(int i=0; i<arr.length; i++) {
        	A.push(arr[arr.length-(i+1)]);
        	B.push(arr[i]);
        }
        while(!A.isEmpty() && !B.isEmpty()) {
        	if(A.peek() > B.peek()) {
        		res.add(1);
        		B.pop();
        	}else if(A.peek() < B.peek()) {
        		res.add(2);
        		A.pop();
        	}else {
        		res.add(0);
        		A.pop();
        		B.pop();
        	}
        }
        
        result = new int[res.size()];
        for(int i=0; i<res.size();i++) {
        	result[i] = res.get(i);
        }
        
        
        return  result;
    
    }

}
