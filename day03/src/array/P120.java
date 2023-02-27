package array;

public class P120 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = 0;
		int i = 0;
		int cnt = 0;
		double avg = 0;
		
//		for (i = 0; i < a.length; i++) {
//			sum += a[i];
//			cnt++;
//		}
//		굳이 위에꺼 처럼 i 를 넣을 필요없이 아래 처럼 for each를 쓰는게 더 짧게 코딩 가능
		
		for(int data:a) {
			sum += data;
		}
		System.out.println(sum);
		avg = sum / (a.length * 1.0);
		System.out.printf("%d, %4.2f", sum, avg);

	}
}
