package variable;

import java.util.Scanner;

public class P73 {

	public static void main(String[] args) {
		System.out.println("명렁어를 입력 하시오(q,i,d,s)");
		Scanner sc = new Scanner(System.in);
		String cmd = sc.next();
		System.out.printf("%s를 입력 했습니다.",cmd);
		sc.close();
	}

}
