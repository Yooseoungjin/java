package bank;

public class Account {
	private String accNo;
	private String name;
	private String accHolder;
	private double balance;

	// Constructor - 음수 예외 상황
	public Account() {
	}

	public Account(String accNo, String name, String accHolder, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.accHolder = accHolder;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", accHolder=" + accHolder + ", balance=" + balance + "]";
	}

	// 계좌 정보 조회

	// 잔액 조회

	// 입금 - 음수 예외 상황,

	// 출금 - 잔액 부족 예외 상황, 음수 예외 상황

}
