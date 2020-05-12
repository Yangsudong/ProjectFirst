package com.yedam.classes.statics;
											
public class Account {
	//P.280 문제 19
	private String ano;	//계좌번호
	private String owner;			//예금주
	private int balance;			//잔액
	
	public Account(String accountNumber, String owner, int balance) {
		this.ano = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {
		return ano;
	}

	public void setAccountNumber(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}

