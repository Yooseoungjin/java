package whilecontrol;

public class P94 {

	public static void main(String[] args) {
		// 합과 평균을 구하시오
		// 짝수의 합과 평균을 구하시오
		// i%2 ==0 < 요게짝수
		System.out.println("Start ...");
		int cnt = 0;
		int sum = 0;
		double avg = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
				cnt++;
			}
			if (i == 8) {
				break; // for문을 멈춰라
			}
		}
		avg = sum / (cnt * 1.0);
		System.out.printf("%d, %f \n", sum, avg);
		System.out.println("END..." + cnt);
	}

}
