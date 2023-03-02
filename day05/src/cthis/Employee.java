package cthis;

import java.util.Calendar;

public class Employee {
	private String id;
	private String name;
	private int salary;

	public Employee() {
		Calendar cal = Calendar.getInstance();
		
		this.id = ""+cal.get(Calendar.YEAR)+cal.get(Calendar.MILLISECOND); // ""+은 int인 YEAR을 String으로 변경해주는거다
	}

	public Employee(String name, int salary) {
		this(); // 얘는 상위에 퍼블릭 임플로이를 호출함
		this.name = name;
		this.salary = salary;
	}

	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	public double getTax() {
		double result = 0.0;
		result = this.salary * 0.17;
		return result;
	}

	public int getAnnSalary() {
		int result = 0;
		result = this.salary * 12;
		return result;
	}

	public double getAnnTax() {
		double result = 0.0;
//		result = (this.salary*12)*0.17; 이렇게 코드짜면 나중에 getAnnSalary와 이 메소드를 둘다 수정해야함 그래서 아래와 같이 만드는게 좋다
		result = this.getAnnSalary() * 0.17;
		return result;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
