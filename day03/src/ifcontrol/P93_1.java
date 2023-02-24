package ifcontrol;

import java.util.Scanner;

public class P93_1 {

	public static void main(String[] args) {
		// 숫자를 4개의 2자리수를 입력 받는다.
		// 만약 2자리수가 아니면 프로그램 종료
		Scanner sc = new Scanner(System.in); // System.in은 입력은 화면에서 입력받는다는 말, 화면과 웹에서 입력되는 값은 스트링 값이다
		int ko = 0;
		int en = 0;
		int ma = 0;
		int si = 0;
		// sc.next(); 입력하기를 기다린다는말 .Integer.parseInt는 화면 입력값이 스트링이므로 int로 변경한다

		System.out.println("국어성적 입력:");
		ko = Integer.parseInt(sc.next());
		if (ko <= 9 || ko >= 100) {
			sc.close();
			System.out.println("영어성적 입력:");
			en = Integer.parseInt(sc.next());

			if (en >= 10 && en <= 99) {
				System.out.println("수학성적 입력:");
				ma = Integer.parseInt(sc.next());

				if (ma >= 10 && ma <= 99) {

					System.out.println("과학성적 입력:");
					si = Integer.parseInt(sc.next());
					if (si >= 10 && si <= 99) {
					} else {
						System.out.println("과학입력오류");
						return;
					}
				} else {
					System.out.println("수학입력오류");
					return;
				}
			} else {
				System.out.println("영어입력오류");
				return;
			}
		} else {
			System.out.println("국어입력오류");
			return;
		}


		int sum = ko + en + ma + si;
		double ave = (double) (ko + en + ma + si) / 4;
		String hac = "";
		
		System.out.printf("%d \n, %4.2f ",sum,ave);
	}

	// 평균과 합계를 구합니다.

	// 평균이 90이상이면 A
	// 평균이 80이상이면 B
	// 평균이 70이상이면 C
	// 평균이 60이상이면 D
	// 평균이 60이하이면 F

	// 합계, 평균, 학점을 출력하시오.

}