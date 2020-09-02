package generics;

import java.util.Comparator;

public class BikeSpeedComparator implements Comparator<Bike> {

	@Override
	public int compare(Bike o1, Bike o2) {
		// TODO Auto-generated method stub
		return o1.speed - o2.speed;
	}
	

}
