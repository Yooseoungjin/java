package p214;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input num....");
		int num = 0;
		try {
			num = Integer.parseInt(sc.next());
			int result = 10 / num;
			System.out.println(result);
		} catch (ArithmeticException e1) {
			System.out.println("분모가 0입니다.");
			return;
			//e1.printStackTrace(); < 개발자용 오류 위치 확인 
		} catch (NumberFormatException e2) {
			System.out.println("숫자를 입력하세용");
			return;
		}finally { // 입력 오류로 리턴 되더라도 클로즈를 반드시 해주기 위해서 사용
			System.out.println("반드시  실행....");
			sc.close();	
		}	
		System.out.println("End Application....");
	}

}
