package CodeForces;

import java.util.Scanner;

public class CF_546A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int costOfBanana = sc.nextInt();
		int CurrentMoney = sc.nextInt();
		int quantity = sc.nextInt();
		
		int totalAmount = 0;
		
		for(int i =1;i<=quantity;i++) {
			totalAmount += (i*costOfBanana);
		}
		
		System.out.println(totalAmount > CurrentMoney ? totalAmount-CurrentMoney : 0 );
		
	}

}
