package array;

import java.util.Arrays;
import java.util.Random;

public class P114 {

	public static void main(String[] args) {

		int arr[][] = new int[5][5];

		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = r.nextInt(9) + 1;
			}
		}
		// System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println("");
		}
		// 위의 내용을 for-each로 변경하시오
		System.out.println("----------------------------------");

		for (int a[] : arr) {
			for (int data : a) {
				System.out.printf("%d\t", data);
			}
			System.out.println("");
		}
	}
}
