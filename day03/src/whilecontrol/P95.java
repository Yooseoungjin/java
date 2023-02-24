package whilecontrol;

public class P95 {

	public static void main(String[] args) {
		System.out.println("Start ...");
		int i = 1;
		int cnt = 0;
		int sum = 0;
		double avg = 0;

		while (i <= 10) {
			if (i % 2 == 0) {
				sum += i;
				cnt++;
			}
			if (i == 8) {
				break; // for문을 멈춰라
			}
			i++; // < 이녀석의 위치가 상위 if((i==8)의 위에 있으면 i가 7로 입력되어져서 sum이 안된경우에도 브뤠잌크가 걸린다.한번 생각해 봐라
		}
		System.out.println(i);
		System.out.println(cnt);
		avg = sum / (cnt * 1.0);
		System.out.printf("%d,%f \n", sum, avg);
	}

}
