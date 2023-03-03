package inherit;

public class App {

	public static void main(String[] args) {
		Employee e = new Employee("100", "james", 500);
		System.out.println(e); // toString이 있어서 바로 출력가능
		System.out.println(e.getAnnSalary());

		Manager m = new Manager("200", "kim", 500, 50);
		System.out.println(m);
		System.out.println(m.getAnnSalary());
	}
}
