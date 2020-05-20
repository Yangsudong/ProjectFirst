package com.yedam.exceptions;

public class Account {
	private long balacne;
	public long getBalance() {
		return balacne;
	}
	// 입금 (deposit)
	public void deposit(int money) {	// 입금 (deposit)
		this.balacne += money;	// balacne에 누적시키는역할
	}
	// 출금(withdraw)
	public void withdraw(int money) throws BalanceInsufficientException {	
		if(balacne < money) {
			throw new BalanceInsufficientException("잔고 부족 " + (money-balacne) + " 부족");
		}
		this.balacne -= money;	// balacne에 출금시키는역할
	}
}
