package generics;

public class Car {
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
		return "S: "+this.speed + " P: "+ this.price+" C: "+this.color;
	}
	 

}
