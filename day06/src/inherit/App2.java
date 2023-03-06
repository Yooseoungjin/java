package inherit;

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

		for (Employee em : ea) {
			System.out.println(em);
			System.out.println(em.getAnnSalary());
			if (em instanceof Sales) { // em에 들어있는 객체가 Sales 타입이니?하로 물어보는것이다
				Sales s = (Sales) em; // em에 들어있는 세일즈 객체를 Sales로 변경하는것. 하는 이유는 겟인센티브가 폴리모피즘을 할수 없기때문에 타입을 변환시켜주는 것이다
				System.out.println(s.getIncentive());
			}
		}
		// 의미는 같다 = 정보를 출력해라 . 하지만 매니져는 보너스가 추가로 출력되므로 다르다. 이것이 다형성이다
	}
}
