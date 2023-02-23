package variable;

public class P64 {

	public static void main(String[] args) {
		int a = 10;
		double d = 10.2345;
		String str1 = "abc";
		String str2 = "abc";
		str1 = "def";
		System.out.printf("%d\t%4.2f\t%s\t%s \n",a,d,str1,str2); // \t는 단락간 간격 조정
		if(str1 == str2) {
			System.out.println("OK");
		}
			if(str1.equals(str2)){    // 이퀄을 써서 비교시에는 stack메모리에 들어있는 값으로 비교함
			System.out.println("OK2");
		}
		String str3 = new String("abc");  //new로 생성을 할 경우 stack메모리에 상위 str1,str2와 다른 코드를 부여 하고 
		String str4 = new String("abc");  // heap메모리에서도 각각의 메모리를 할당하여 방을 만든다
		
		if(str3 != str4) {
			System.out.println("다름");
			
			//comment 열심히 하시네요
		}
	}
}
