package inherit2;

public class Manager extends Employee {
	private double bonus;

	// 컨스트럭터를 상속이 되지 않으니 아래와 같이 만들어야한다~~~~~~
	public Manager() {
		super();
	}

	public Manager(String id, String name, double salary) {
		super(id, name, salary);
	}

	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	//함수의 재정의(overriding)
	@Override
	public double getAnnSalary() {
		double result = 0.0;
//		result = (this.getSalary()+this.bonus)*12;
		result = (super.getAnnSalary()+this.bonus*12); 
		//▲위와 같이 코드를짜는 경우 연봉을 구하는 로직수정시 Employee에서만 수정하면된다
		return result;
	}

	@Override
	public String toString() {
		return super.toString()+" "+bonus;
	}

}
