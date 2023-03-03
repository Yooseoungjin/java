package calculator;

public class Ui {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int result = 0; // 리절트 받을 준비하라
		result = cal.sum(10, 20); // cal의 sum메소드 실행
		System.out.println(result); // 화면으로 출력!!
		
		cal.save(result);
	}
	
}
