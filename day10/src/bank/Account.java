package bank;

public class Account {
	private String accNo;
	private double balance;

	public Account() {
		this.accNo = MakeAccountNumber.makeAccNum();
	}

	public Account(double balance) throws Exception { // 쓰로우즈는 선언하는거야
		this();
		if (balance < 0) {
			throw new Exception("ER0001"); // 쓰로우가 던지는 함수
		}
		this.balance = balance;
	}

	public Account(String accNo, double balance) throws Exception {
		if (balance < 0) {
			throw new Exception("ER0001"); // 쓰로우가 던지는 함수
		}
		this.accNo = accNo;
		this.balance = balance;
	}

	public void widthdaw(double money) throws Exception {
		if(money <=0) {
			throw new Exception("ER0002");
		}
		if(balance < money) {
			throw new Exception("ER0003");
		}
		balance -= money; // 같은코드 : balance = balance- money;
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}
	

}
