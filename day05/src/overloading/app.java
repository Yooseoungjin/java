package overloading;

import access.Employee;

public class app {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.sum(10,20));
		System.out.println(c.sum(10,20,30));
		System.out.println(c.sum(10,20,30,50));
		
		Employee e = new Employee();
	}

}
