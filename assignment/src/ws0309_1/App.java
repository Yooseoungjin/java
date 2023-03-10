package ws0309_1;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
// 복권 생성
		Lotto lottery = new Lotto();
// 본인이 선택한 숫자
		ArrayList<Integer> myNum = new ArrayList<>();
		myNum.add(3);
		myNum.add(7);
		myNum.add(12);
		System.out.println("선택하신번호는: " + myNum);
// 본인이 선택한 숫자와 당첨 번호 비교 후 등수 확인
		int rank = lottery.checkRanking(myNum);
// 등수에 따른 상금 계산
		double money = lottery.prizeMoney(rank);
// 결과 출력
		if (rank == 0) {
			System.out.println("아쉽게도 꽝입니다.");
		} else {
			System.out.println("축하합니다! " + rank + "등입니다.");
			System.out.println("상금은 " + money + "원입니다.");
		}
	}
}