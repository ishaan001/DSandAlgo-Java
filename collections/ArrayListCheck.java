package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		List<Integer> l = new ArrayList<>();
		
		al.add(1);
		al.add(2);
		System.out.println(al.contains(2));
		al.add(3);
		al.add(4);
		al.add(5);
		List<Integer> l1 = (List<Integer>) al.clone();
		l = (List<Integer>) al.clone();
		l.add(1);
		al.add(4, 99);
		al.add(6,78);
		System.out.println(al.subList(1, 4));
		System.out.println(al);
		System.out.println(l);

	}

}
