package array;

public class P103 {

	public static void main(String[] args) {
		
		//int arr[] = new int[3];
//		int[]arr = new int[3];
		
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
		int arr[] = {10,20,30}; // 30.0으로 못한다 모두다 int로 통일(하나의 타입반 가능)
		System.out.println(arr);
		
		for(int i =0;i<arr.length ;i++) {
			System.out.printf("%d \t",arr[i]);
		}
		System.out.println("Type 2 ");
		for(int data:arr) {
			System.out.printf("%d \t",data);
		}
	}

}
