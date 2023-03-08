package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random r = new Random();

		// 1~10까지의 숫자를 20개 입력한다
		// 단, while문을 이용한다.

		while (list.size() < 3) {
			int num = r.nextInt(10)+1;
			list.add(num);
			}
		for (int data : list) {
			System.out.println(data);
		}
		System.out.println("list 개수"+list.size());
	}

}
