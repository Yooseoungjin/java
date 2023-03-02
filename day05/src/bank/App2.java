package bank;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Account acc = null; // while 함수 밖에서 acc변수를 선언해야 while문 안에서 여기저기 모두다 사용가능
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input Command[c,w,d,s,q]");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye...good day!");
				break;
			} else if (cmd.equals("c")) {
				System.out.println("Creat Account:");
				System.out.println("Input Account Info[name,balance]");
				System.out.println("Input Name:");
				String name = sc.next();
				System.out.println("Input Balance:");
				double balance = Double.parseDouble(sc.next());

				acc = new Account(name, balance);
				System.out.println(acc);

			} else if (cmd.equals("w")) {
				System.out.println("뺄돈 입력하세요:");
				double money = Double.parseDouble(sc.next());
				acc.withdraw(money);
				System.out.println(acc);
				
			} else if (cmd.equals("d")) {
				System.out.println("넣을돈 입력하세요:");
				double money = Double.parseDouble(sc.next());
				acc.deposit(money);
				System.out.println(acc);
				
			} else if (cmd.equals("s")) {
				System.out.println("계좌를 조회합니다:");
				System.out.println(acc);
			}
		}
		sc.close();
	}
}
