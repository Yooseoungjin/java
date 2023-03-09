package com.kbstar.dto;

public class AccountDTO {
	private String accNo;
	private double balance;
	private String Holder;

	public AccountDTO() {
	}

	public AccountDTO(String accNo, double balance, String holder) {
		this.accNo = accNo;
		this.balance = balance;
		Holder = holder;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getHolder() {
		return Holder;
	}

	public void setHolder(String holder) {
		Holder = holder;
	}

	@Override
	public String toString() {
		return "AccountDTO [accNo=" + accNo + ", balance=" + balance + ", Holder=" + Holder + "]";
	}

}
