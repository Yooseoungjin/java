package oop2;

import java.util.Calendar;
import java.util.Random;

public class Employee {
	private String id; // 프라이빗을 넣으면 처음 셋팅 이후에 접근이 막힘따라사 App.java에서 수정할 수가 없음
	private String name;
	private int salary;

	public Employee() {
		this.id = "temp0001"; // default 컨스트럭터 : 유저가 아무것도 입력하지 않아도 생성되는 값
		this.name = "temp"; // default 컨스트럭터 : 유저가 아무것도 입력하지 않아도 생성되는 값
		this.salary = 10000000; // default 컨스트럭터 : 유저가 아무것도 입력하지 않아도 생성되는 값
	}

	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		if (salary < 0) {
			this.salary = 0;
		} else {
			this.salary = salary;
		}
	}

	public Employee(String name, int salary) {
		this("10000", name, salary); //여기서 this를 사용하면 아규먼트가 3개가 있는 동레벨의 칸스트럭처를 호출함. 교재 143p
	}

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

	public int getAnnSalary() {
		return this.salary * 12;
	}

	public double getTax() {
		return this.salary * 0.175;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
