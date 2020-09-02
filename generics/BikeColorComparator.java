package generics;

import java.util.Comparator;

public class BikeColorComparator implements Comparator<Bike> {

	@Override
	public int compare(Bike o1, Bike o2) {
		// TODO Auto-generated method stub
		return o1.color.compareTo(o2.color);
	}

}
