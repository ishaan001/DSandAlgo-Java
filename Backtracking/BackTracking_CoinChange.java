package Backtracking;

/*
 * {2, 3, 5, 6} using these we have to make 10 rs
 * possible ans  - 22222
 * 					235
 * 					555
 * */
public class BackTracking_CoinChange {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] denominations = { 2, 3, 5, 6 };

		// coinChangeCombination(denominations, 10, "", 0);
		coinChangePermutations(denominations, 10, "");
	}

	static int count = 0;

	public static void coinChangeCombination(int[] denominations, int amt, String ans, int lastDenominationIdx) {
		if (amt == 0) {
			count++;
			System.out.println(count + ". " + ans);
			return;
		}

		for (int i = lastDenominationIdx; i < denominations.length; i++) {
			if (amt >= denominations[i]) {
				coinChangeCombination(denominations, amt - denominations[i], ans + denominations[i] + " ", i);
			}
		}
	}

	static int counter = 0;

	public static void coinChangePermutations(int[] denominations, int amt, String ans) {
		if (amt == 0) {
			counter++;
			System.out.println(counter + ". " + ans);
			return;
		}
		// we can add negative base case just like board path in recursion instead of adding if statement before call
		if (amt < 0) {
			return;
		}
		for (int i = 0; i < denominations.length; i++) {

			coinChangePermutations(denominations, amt - denominations[i], ans + denominations[i] + " ");

		}
	}

}
