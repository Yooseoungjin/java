package variable;

public class P54 {

	public static void main(String[] args) {
		//boolean
		boolean b1 = 10 > 5;
		
		//정수
		int n1 = 10;
		long n2 = 0L; //int가 default 값이라서 에러가남 따라서 뒤에 L을 붙여서 long으로 자료형 변환해줘야함
		n2 = 2222222222222222L;
		
		//실수
		double d1 = 1.0;
		float f1 = 1.0F; //double가 default 값이라서 에러가남 따라서 뒤에 f을 붙여서 float으로 자료형 변환해줘야함
		
		double d2 = (1/2);
		System.out.println(d2);
		
		double d3 = 10.0/3.0;
		System.out.println(d3);
		
		float f2 = 10.0F/3.0F;
		System.out.println(f2);
		
		// char
		char c1 = 'A';
		System.out.println(c1);
		
		char c2 = 65; // 국제 표준임 char의 65이 대문자 A로 표기됨. 따라서 66은 대문자 B임
		System.out.println(c2);
		
		int n3 = 10;
		double n4 = 10.0;
		double result = n3 + n4;
		System.out.println(result);
		
	}

}
