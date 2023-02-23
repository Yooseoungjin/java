package variable;

import java.util.Scanner;

public class P81 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력 하시오");
//		String num = sc.next();
//		int a = Integer.parseInt(num);

		int a = Integer.parseInt(sc.next()); // 위에 주석처리 된 2개 행을 한개로 합친거
		
		String result = (a > 0) ? "정상" : "비정상";
		System.out.println(result);
		
		sc.close();
		}
}