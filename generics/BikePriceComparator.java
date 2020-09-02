package generics;

import java.util.Comparator;

public class BikePriceComparator implements Comparator<Bike> {

	@Override
	public int compare(Bike o1, Bike o2) {
		// TODO Auto-generated method stub
		return o2.price - o1.price;
	}
	

}
