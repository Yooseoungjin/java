package array;

import java.util.Arrays;
import java.util.Random;

public class P104 {

	public static void main(String[] args) {

		int arr[] = new int[10];
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
//			int data = r.nextInt(99)+1;
//			arr[i]=data;
			arr[i] = r.nextInt(99) + 1;
		}
		System.out.println(Arrays.toString(arr));

		for (int a : arr) {
			System.out.printf("%d \t", a);
		}
		// 배열의 합과 평균을 구하시오
		
		int sum = 0; //for문 바깥에서 선언해서 포문이 돌때마다 0으로 초기화가 안된다
		for (int a: arr) {
			sum += a;
		}
		System.out.printf("합: %d 평균:%4.2f\n",sum,(sum*1.0)/(arr.length));
	}

}
