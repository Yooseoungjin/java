package access;

public class App {

	public static void main(String[] args) {
		Employee e = new Employee("111","말자",25);
		e.name = "";
		e.getAnnTax();
		System.out.println(e.getAnnTax());
	
	}

}
