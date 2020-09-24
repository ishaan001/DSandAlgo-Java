package spaceTimeComplexity;

import java.util.Arrays;

public class SieveOfEratosthenes {

	/*
	 * O(nloglogn) technique for find all the prime numbers under a limit for ex -
	 * ffind first 200 prime no.s
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 250;
		SOE(n);

	}

	public static void SOE(int n) {
		
		Boolean[] prime = new Boolean[n+1];
		Arrays.fill(prime, true);
		prime[0] = prime[1] = false;
		
		for(int table = 2; table*table <= n; table++) {
			if(prime[table] == false)
				continue;
			
			for(int multi = 2; table*multi <=n; multi++) {
				prime[table*multi] = false;
			}
		}
		
		for(int i=0; i<prime.length; i++) {
			if(prime[i])
				System.out.println(i);
		}
		
	}

}
