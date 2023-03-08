package set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		// 1~10까지의 숫자를 10개 입력하세요
		Random r = new Random();
		while (set.size() < 6) {
			int num = r.nextInt(45) + 1;
			set.add(num);
		}
		for (int data : set) {
			System.out.println(data);
		}
		System.out.println("숫자 몇개" + set.size());
	}
}