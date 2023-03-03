package calculator;

public class Calculator {
	public int sum(int a, int b) {
		int result = 0;
		result = a + b;
		return result; //리절트 값을 던저 줄 준비를 하라!
	}
	public void save(int a) { //void를 했으니 리턴은 필요 없지만 오류가 발생한경우 Ui에 출력을 해줘야하는 상황은 발생할 수 있다.
		System.out.printf("%d을 메모리에 저장했음",a);
	}
}
