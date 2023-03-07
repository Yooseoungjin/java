package p214;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		int num = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Input num....");
			num = Integer.parseInt(sc.next());
			int result = 10 / num;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("잘못 입력했어요....");
		}
		System.out.println("End Application....");
	}

}
