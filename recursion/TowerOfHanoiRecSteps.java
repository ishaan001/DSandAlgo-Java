package recursion;

public class TowerOfHanoiRecSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		//int count =0;
		int c =  tohRec(n,"src","dest","helper");
		System.out.println("total steps = "+c);
	}

	private static int tohRec(int n, String src, String dest, String helper) {
		// TODO Auto-generated method stub
		int count = 1;
		if(n == 1) {
			System.out.println("move "+n+"th disk from "+src+" to "+dest);
			return count; 
		}
		else {
			
			count += tohRec(n-1, src, helper, dest);
			System.out.println("move "+n+"th disk from "+src+" to "+dest);
			count += tohRec(n-1, helper, dest, src);
		}
		
		return count;
	}

}
