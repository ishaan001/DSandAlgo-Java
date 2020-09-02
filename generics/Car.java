package generics;

public class Car implements Comparable<Car> {
	int price;
	int speed;
	String color;
	public Car(int price, int speed, String color) {
		super();
		this.price = price;
		this.speed = speed;
		this.color = color;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nS: "+this.speed + " P: "+ this.price+" C: "+this.color;
	}

	@Override
	public int compareTo(Car other) {
		// TODO Auto-generated method stub
		//for the speed ---- return this.speed - other.speed;
		return this.color.compareTo(other.color);  // for string 
	}
		 
}
