package collections;

import java.util.HashMap;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer>	hm = new HashMap<>();
		hm.put(1, 2);
		hm.put(1, 3);
		hm.put(2, 2);
		hm.put(3, 8);
		System.out.println(hm);
		System.out.println(hm.keySet());

	}

}
