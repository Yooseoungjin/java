package oop3;

public class App {

	public static void main(String[] args) {
		Car car = new Car("C1", "red", 1000, 50);
		System.out.println(car.toString());
		
		Car car2 = new Car("C1", "red", 1000, 50,20);
		System.out.println(car2.toString());
		
//		car2.setCfsize(-100);
//		car2.setCfsize(30);
		car2.setCfsize(30);
		car2.go(100);
		car2.go(200);
	}
	
}
