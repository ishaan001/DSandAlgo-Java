package generics;

public class GenericClient {

	public static void main(String[] args) {
		// Generic class with one pair of it's own kind
		/*
		 * We can't use primitive Type like "int, char, long"
		 * because they don't have class and we can't bound the limitation in them 
		 * aur jo wrapper classes hoti hai usse hum override kar sakte hai kyunki woh comparable ko implement karti hai
		 * */
		GenericCPairOne<Integer> gc= new GenericCPairOne<Integer>(10, 20);
		System.out.println(gc.getObject());
		
		//Generic class with two pair of different Kind
		GenericCTwoPairs<Integer, String> gctp = new GenericCTwoPairs<>();
		gctp.setOne(10);
		gctp.setTwo("Twenty");
		 System.out.println(gctp.getTwo());

	}

}
