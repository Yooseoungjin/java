package ifcontrol;

public class Ws {
	public static void main(String[] args) {

		int cnt3 = 0;
		int sum3 = 0;
		double avg3 = 0;
		int cnt4 = 0;
		int sum4 = 0;
		double avg4 = 0;
		int cnt7 = 0;
		int sum7 = 0;
		double avg7 = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum3 += i;
				cnt3++;
			}
			if (i % 4 == 0) {
				sum4 += i;
				cnt4++;
			}
			if (i % 7 == 0) {
				sum7 += i;
				cnt7++;
			}
		}
		avg3 = sum3 / (cnt3 * 1.0);
		System.out.println("3의 배수합: " + sum3);
		System.out.println("3의 배수평균: " + avg3 + "\n");
		avg4 = sum4 / (cnt4 * 1.0);
		System.out.println("4의 배수합: " + sum4);
		System.out.println("4의 배수평균: " + avg4 + "\n");
		avg7 = sum7 / (cnt7 * 1.0);
		System.out.println("7의 배수합: " + sum7);
		System.out.println("7의 배수평균: " + avg7);

		
		
	}

}
