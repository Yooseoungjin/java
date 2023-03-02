package ws0302;

import java.util.Scanner;

import ws0228.Employee;
import ws0228.Manager;

public class App {

	public static void main(String[] args) {
		Account[] acc = new Account[6];
		int Sum = 0;
		int cnt = 0;

		acc[0] = new Account("james1", 10000, 0.35, "VIP");
		acc[1] = new Account("james2", 10000, 0.45, "GOLD");
		acc[2] = new Account("james3", 10000, 0.55, "SIVER");
		acc[3] = new Account("james4", 10000, 0.15, "GOLD");
		acc[4] = new Account("james5", 10000, 0.28, "SIVER");
		acc[5] = new Account("james6", 10000, 0.31, "VIP");

		for (int i = 0; i < acc.length; i++) {
			System.out.println((i + 1) + "번째 계좌정보 " + acc[i].toString());
		}
		for (int i = 0; i < acc.length; i++) {
			System.out.println((i + 1) + "번째 계좌이자 " + acc[i].getInterest());
		}

		// VIP잔액 합계 및 평잔1 : 이 방법은 코드가 길어 진다
		for (int i = 0; i < acc.length; i++) {
			if (acc[i].getGrade().equals("VIP")) {
				Sum += acc[i].getBalance();
				cnt++;
			}
		}
		System.out.printf("VIP 잔액합계 %d VIP 평잔 %.0f", Sum, (Sum * 1.0) / cnt);

		
// 단순히 조회목적으로 만들땐느 for each방법이 간단하다
		
//		// 이자금액 : for each 방법
//		for (Account a : acc) {
//			System.out.println(a.getInterest());
//		}
//		// VIP잔액 합계 및 평잔 : for each 방법
//		for (Account a : acc) {
//			if (a.getGrade().equals("VIP")) {
//				Sum += a.getBalance();
//				cnt++;
//			}
//		}
//		System.out.printf("\nVip잔액합계 = %d VIP평잔 = %.0f", Sum, (Sum * 1.0) / cnt);
	}
}
