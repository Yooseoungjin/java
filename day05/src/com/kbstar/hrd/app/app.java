package com.kbstar.hrd.app;

import com.kbstar.hrd.Employee;
import com.kbstar.hrd.Manager;

public class app {

	public static void main(String[] args) {
		Employee e= new Employee("100","이말숙",500);
		System.out.println(e.toString()); //java에서는 투스트링 안써도 출력된다~참고하렴
		System.out.println(e.getAnnTax());
		System.out.println(e.getSalary());
		System.out.println(e.getTax());
		System.out.println(e.getAnnSalary());
		System.out.println(e.getAnnTax());
		
		System.out.println("========================================");
		
		Employee emps[] = new Employee[3];
		emps[0] = new Employee("201","홍말자",400);
		emps[1] = new Employee("202","정말자",450);
		emps[2] = new Employee("203","장말자",480);
		
		//배열을 단순 조회할때는 for each문을 사용하면 편하다 잊지 마라
		for(Employee em:emps) {
			System.out.println(em);
			System.out.println(em.getTax());
			System.out.println(em.getAnnSalary());
			System.out.println(em.getAnnTax());
		}
		System.out.println("========================================");
		Manager mana[] = new Manager[3];
		mana[0] = new Manager("301","전지현",600,100);
		mana[1] = new Manager("302","김사랑",650,200);
		mana[2] = new Manager("303","송혜교",680,300);
		
		for(Manager ma:mana) {
			System.out.println(ma);
			System.out.println(ma.getAnnSalary());
			System.out.println(ma.getAnnTax());
			System.out.println(ma.getTax());			
		}
	}

}
