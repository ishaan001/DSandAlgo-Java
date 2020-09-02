package generics;

import java.util.Comparator;

public class DemoDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arrI = {10, 20, 30, 40};
		String[] arrS = {"Hi", "Ishaan", "Veer", "Dadhwal"};
		display(arrI);
		display(arrS);
		
		Car[] cars = new Car[5];
		cars[0] = new Car(1000, 50, "Red");
		cars[1] = new Car(5000, 210, "Yellow");
		cars[2] = new Car(7000, 330, "White");
		cars[3] = new Car(2000, 90, "Purple");
		cars[4] = new Car(1500, 70, "Black");
		
		display(cars);
		bubbleSort(cars);
		display(cars);
		
		Bike[] bikes = new Bike[3];
		bikes[0] = new Bike(3000, 110, "White");
		bikes[1] = new Bike(4500, 170, "Blue");
		bikes[2] = new Bike(5000, 190, "Grey");
		
		//display(bikes);
		bubbleSort(bikes,new BikeSpeedComparator());
		display(bikes);
		bubbleSort(bikes, new BikeColorComparator());
		display(bikes);
		bubbleSort(bikes, new BikePriceComparator());
		display(bikes);
		

	}
	/*
	 * For ever Data Type we will create a new display method is rigorous task 
	 * and is unOptimised 
	 * 
	 * for the solution of that we have created Generics
	 * 
	 * one Stop solution for all the data types
	 * */
	/*public static void display(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void display(String[] arr) {
		for (String i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}*/
	
	
	/*
	 * If we print the custom Made class it will print the hash code 
	 *so for that we hava to override the toString() -> object class 
	 *as System.out.println() internally calls  toString()
	 *
	 * generics.Car@7852e922 generics.Car@4e25154f generics.Car@70dea4e generics.Car@5c647e05 generics.Car@33909752 
	 * 
	 * */
	public static <T> void display(T[] arr) {
		for (T i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	/*
	 * 
	 * To compare the data type of a particular custom made class
	 * that particular class have to implement the comparable interface 
	 * 
	 * and override with compareTo function
	 * */
	
	public static <T extends Comparable<T>>void bubbleSort(T[] arr){ 
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int swapped =0;
			for(int j=0; j<n-1-i; j++) {
				if(arr[j].compareTo(arr[j+1])>0){
					T temp = arr[j]; 
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					swapped = 1;	
				}
			}
			if(swapped == 0) 
				break;
		}
		 
	}
	
	/*
	 * suppose a situation where we haven't implemented the comparable interface  
	 * then we use the comparator interface by creating the different class implementing the comparator interface
	 * 
	 * */
	public static <T >void bubbleSort(T[] arr,Comparator<T> comparator){ 
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int swapped =0;
			for(int j=0; j<n-1-i; j++) {
				if(comparator.compare(arr[j], (arr[j+1]))>0){
					T temp = arr[j]; 
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					swapped = 1;	
				}
			}
			if(swapped == 0) 
				break;
		}
		 
	}

}
