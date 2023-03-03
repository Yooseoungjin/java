package inherit2;

public class App2 {

	public static void main(String[] args) {
		// Manager is a Empllyee!! 아주아주 대단히 중요한 거다. 제일중요하다. 이해해라
		Employee e = new Manager("100", "james", 500, 50);
		// Manager m = new Employee("100","james",550); 이건 성립되지 않는다

		Employee ea[] = new Employee[5];
		ea[0] = new Employee("100", "james", 500);
		ea[1] = new Employee("101", "james", 500);
		ea[2] = new Manager("102", "james", 500, 50);
		ea[3] = new Manager("103", "james", 500, 50);
		ea[4] = new Sales("104", "james", 500, "Seoul", 0.35);
		
		// 인헨스1과는 달리 타입캐스팅 안하고 쓰기위해 임플로이에서 겟인센티브를 리턴 = 0으로 만들어놓음
		for (Employee em : ea) {
			System.out.println(em);
			System.out.println(em.getAnnSalary());
			System.out.println(em.getIncentive());
		}
		System.out.println("--------------------------------------");
		TaxCal t = new TaxCal();
		double result = t.getTax(ea[3]);
		System.out.println(result);
	}
}
