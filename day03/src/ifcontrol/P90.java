package ifcontrol;

public class P90 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;		
		
		// 두가지 수의 최대 값과 최소 값을 구하시오
		int max =0;
		int min =0;
		
		if (a > b) {
			max = a;
			min = b;
		}else {
			min = a;
			max = b;}
		
		System.out.printf("max: %d,min: %d",max,min);
		
	}

}
