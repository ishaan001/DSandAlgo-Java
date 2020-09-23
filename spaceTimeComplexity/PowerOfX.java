package spaceTimeComplexity;

public class PowerOfX {
	public static void main(String[] args) {
		System.out.println(calPower(2,5));
	}

	//calculate the powe of x  in logn time
	private static int calPower(int x, int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return 1;
		}
		int pb2 = calPower(x, n/2);
		if(n%2 == 1) {
			return pb2*pb2*x;
		}
		else {
			return pb2*pb2;
		}
	}
}
