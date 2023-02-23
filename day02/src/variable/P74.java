package variable;

import java.util.Random;
import java.util.Scanner;

public class P74 {
//	public static void main(String[] args) {
//	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력 하시오(10~100)");
//		int cmd = sc.nextInt();
//		
//		Random r = new Random();
//		int rndNumber = r.nextInt(cmd)+1;
//		//System.out.println(rndNumber);
//		
//		// 10~100 사이의 정수를 입력 받는다
//		// 1부터 입력 받은 숫자 까지의 범위에서 랜덤한 숫자를 발생하시오
//		
//		System.out.printf("%s이 출력 됐습니다.",rndNumber);
//		sc.close();
//	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력 하시오(10~100)");
		String cmd = sc.next();
		
		Random r = new Random();
		int num = Integer.parseInt(cmd); //이미 입력된 String cmd를 Int로 변환(내꺼랑은 다르게 만드심)
		int rndNum =r.nextInt(num)+1;
		System.out.println(rndNum);

		sc.close();
	}
	
}