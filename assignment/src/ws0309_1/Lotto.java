package ws0309_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Lotto {
	private HashSet<Integer> winningNum;
	private int prizeMoney;

	public Lotto() {
		winningNum = new HashSet<>();
		makeWinningNumberMoney();
	}

	private void makeWinningNumberMoney() {
		Random rand = new Random();
		while (winningNum.size() < 3) {
			winningNum.add(rand.nextInt(25) + 1);
		}

		for (Integer win : winningNum) {
			System.out.println("당첨번호 " + win);
		}

		prizeMoney = rand.nextInt(2000000000) + 1;
		System.out.printf("상금은 %s 입니다.", prizeMoney);
	}

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

	public double prizeMoney(int grade) {
		switch (grade) {
		case 1:
			return prizeMoney * 0.7; // 1등 상금
		default:
			return 0; // 꽝
		}
	}
}