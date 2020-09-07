package recursion;

public class PdiSkipCheck1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		pdiskip(n);
		

	}

	private static void pdiskip(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return;
		
		if(n%2==0) {
			pdiskip(n-1);
			System.out.println(n);
		}else {
			System.out.println(n);
			pdiskip(n-1);
		}

		
		
	}

}
