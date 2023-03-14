package ws0309;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {
	private static final int ArrayList = 0;
	private static final int Integer = 0;
	Set<Integer> winningNum = new HashSet<Integer>();
	int prizeMoney = 0;
	Random r = new Random();

	public void makeWinningNumberMoney() {
		// 로또번호 생성 함수
		while (winningNum.size() < 3) {
			int num = r.nextInt(25) + 1;
			winningNum.add(num);
		}
		for (Integer win : winningNum) {
			System.out.println(win);
		}
		// 상금 생성 함수
		prizeMoney = r.nextInt(2000000000) + 1;
		System.out.printf("상금은 %d 입니다.", prizeMoney);}

	public int checkRanking(ArrayList<Integer> myNum) {
		int count = 0;
		for (int num : myNum) {
			if (winningNum.contains(num)) {
				count++;
			}
		}
		switch (count) {
		case 0:
		case 1:
		case 2:
			return 0; // 꽝
		case 3:
			return 1; // 1등
		default:
			return 0;
		}
	}
}