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
		// coinChangePermutations(denominations, 10, "");
		coinChangeCoinRespect(denominations, 0, 10, "");
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
			//if (amt >= denominations[i]) {

			coinChangePermutations(denominations, amt - denominations[i], ans + denominations[i] + " ");
			//}
		}
	}

	// coin change w.r.t to coin 
	//vidx = virtual index which mean from where we need to move the in the donomination array 
	public static void coinChangeCoinRespect(int[] Denom, int vidx, int amount,String ans) {
		
		//+ve base case 
		if(amount == 0) {
			System.out.println(ans);
			return;
		}
		//if amount is negative or the denomination array is empty 
		if(amount < 0 || Denom.length == vidx) {
			return;
		}
		//yes case  - is the denom is included
		coinChangeCoinRespect(Denom, vidx, amount-Denom[vidx], ans + Denom[vidx]);
		//no case  - denomination not included
		coinChangeCoinRespect(Denom, vidx + 1, amount, ans);
		
	}
}
