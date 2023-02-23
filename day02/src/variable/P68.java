package variable;

import java.util.Random;

public class P68 {

	public static void main(String[] args) {
		String s1 = "10";
		int s2 = Integer.parseInt(s1);
		int a = 7;
		System.out.println(s2 + a);

		int n1 = 3;
		// String n2 = n1+""; //숫자를 스트링으로 변환(간단한 방법이나 실무에선 없어 보임)
		String n2 = String.valueOf(n1); // 숫자를 스트링으로 변환
		System.out.println(n2);

		Random r = new Random();
		int rndNumber = r.nextInt(2);
		System.out.println(rndNumber);
	}
}
