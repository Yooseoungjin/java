package cthis;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		Employee e = new Employee("이숙자", 500);
		System.out.println(e);
		Employee e2 = new Employee("이말자", 700);
		System.out.println(e2);
		
		
		Date d = new Date();
		System.out.println(d);
		java.sql.Date dd = new java.sql.Date(0);
		System.out.println(dd);
	}

}
