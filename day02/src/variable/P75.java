package variable;

import java.util.Random;
import java.util.Scanner;

public class P75 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
//		a++;
//		++b;
		System.out.printf("%d,%d\n",a,b);
		
		int result = ++a + b++;
		System.out.printf("%d,%d\n",a,b);
		System.out.println(result);
		
		int result2 = a + b;
		System.out.println(result2);
		
		System.out.println(5 == 5);
		
		int aa = 10;
		int bb = 10;
		
		System.out.println((aa++ >= 0) || (bb++ >= 0)); 
		//짝대기가 2개인경우 앞쪽 aa의 논리가 true인경우 뒤에 bb증감하지 않고 종료함. 작대기를 한개 쓰는 경우 뒤에꺼도 무조건 증가시킴
		System.out.printf("%d,%d\n",aa,bb);
	
	}
	
}