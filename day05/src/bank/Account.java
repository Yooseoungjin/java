package bank;

public class Account {
	private String accNum;
	private String accName;
	private double balance;

	public Account() {
//		MakeAccountNumber makenum = new MakeAccountNumber();		
		this.accNum = MakeAccountNumber.makeAccNum(); 
//		< 해당 클래스에서 static을 사용했으므로 상위와 같이 해당 클래스의 메소드를 사용가능함 
	}

	public Account(String accName, double balance) {
		this();
		this.accName = accName;
		this.balance = balance;
	}

	public Account(String accNum, String accName, double balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + "]";
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double money) {
		if (money <= 0) {
			System.out.println("출금 금액을 확인하세요");
			return; // 출금금액이 오류일 경우 함수 종료
		}
		if (money > balance) {
			System.out.println("잔액이 부족합니다.");
			return; // 잔액이 부족할 경우 함수 종료
		}
		this.balance -= money;
	}

	public void deposit(double money) {
		if (money <= 0) {
			System.out.println("입금 금액을 확인하세요");
			return; // 입금 금액오류일 경우 함수 종료
		}
//		this.balance = this.balance + money; // this 는 생략 가능
		this.balance += money;
	}

}
