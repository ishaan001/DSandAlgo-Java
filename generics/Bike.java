package generics;

public class Bike {
	int price;
	int speed;
	String color;
	public Bike(int price, int speed, String color) {
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
}
