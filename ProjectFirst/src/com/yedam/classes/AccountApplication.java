package com.yedam.classes;

import java.util.Scanner;

import com.yedam.classes.statics.Account;

public class AccountApplication {

		private Scanner scn = new Scanner(System.in);
		private Account[] accounts = new Account[100];
		
		//생성자..
		//1.계좌생성
		private void createAccount() {
			System.out.println("계좌생성 선택.");
			System.out.println("계좌번호를 입력하세요.");
			String getAno = scn.nextLine();
			System.out.println("예금주를 입력하세요.");
			String owner = scn.nextLine();
			System.out.println("금액을 입력하세요.");
			int balance = scn.nextInt();
			Account acnt = new Account(getAno, owner, balance);
			for(int i=0; i<accounts.length; i++) {
				if(accounts[i] == null) {	//베열에 값이 비어있는지 확인하고 값을 넣기위한 문구
				accounts[i] = acnt;
				break;	//값이들어가면 break를 통해 멈춰줘야한다 그렇지 않으면 모든배열이 찰때까지 반복된다.
				}
			}
			System.out.println("계좌가 생성되었습니다.");
		}
		//2.계좌목록
		private void accountList() {
			System.out.println("계좌목록 선택");
			// 전체 배열중에 값이 있는 경우에만 출력 (null 제외)
			for(Account acc : accounts) {
				if(acc != null) {
				System.out.println(" 계좌번호 : " + acc.getAno() + 
								   " 예금주 : " + acc.getOwner() + 
								   " 잔액 : " + acc.getBalance());
				}
			}
		}
		//3.입금
		private void deposit() {
			System.out.println("예금 선택");
			System.out.println("계좌번호를 입력하세요.");
			String ano = scn.nextLine();
			System.out.println("예금액을 입력하세요.");
			int balance = scn.nextInt();
			//전체 배열중에 값이 있는 경우 && 입력계좌번호와 동일한 건에 처리.
/*			for(Account acc : accounts) {
				if(acc != null && acc.getAno().equals(ano)) {
					int result = acc.getBalance();						//현재잔액
					acc.setBalance(result + balance);
				}
			}		*/									
			Account acnt = findAccount(ano);				
			if (acnt != null) {
				acnt.setBalance(acnt.getBalance() + balance);
				System.out.println("예금 처리가 되었습니다.");
			}else {
				System.out.println("해당계좌가 없습니다.");
			}
		}
		//4.출금
		private void withdraw() {
			System.out.println("출금 선택");
			System.out.println("계좌번호를 입력하세요.");
			String ano = scn.nextLine();
			System.out.println("출금액을 입력하세요.");
			int balance = scn.nextInt();
			//전체 배열중에 값이 있는 경우 && 입력계좌번호와 동일한 건에 처리.
/*			for(Account acc : accounts) {
				if(acc != null && acc.getAno().equals(accountNumber)) {
					int result = acc.getBalance();						//현재잔액
					acc.setBalance(result - balance);
				}
			}		각 for문 대신 findAccount 메소드를 생성해서 대체함 */														
			Account acnt = findAccount(ano);				
			if (acnt != null) {
				acnt.setBalance(acnt.getBalance() - balance);
				System.out.println("출금 처리가 되었습니다.");
			}else {
				System.out.println("해당계좌가 없습니다.");
			}
		}
		
			
		
		//5.종료		
		
		//6.계좌번호입력하면 해당 Account를 반환해주는 메소드 
		private Account findAccount(String ano) {			
			for(Account acc : accounts) {
				if(acc != null && acc.getAno().equals(ano)) {								
				   return acc;
				}
			}	
			return null;
		}
		public void execute() {
			while(true) {
				System.out.println("---------------------------------");
				System.out.println("1.계좌생성  2.계좌목록  3.예금  4.출금  5.종료");
				System.out.println("---------------------------------");
				System.out.print("선택 > ");
				int menu = scn.nextInt(); scn.nextLine();
				if(menu==1) {			//1.계좌생성
					createAccount();
				}
				else if(menu == 2) {	//2.계좌목록	
					accountList();
				}
				else if(menu == 3) {	//3.예금	
					deposit();
				}
				else if(menu == 4) {	//4.출금	
					withdraw();
				}
				else if(menu == 5) {	//5.종료	
					System.out.println("프로그램 종료.");
					break;
				}				
		
			}// end of while()
		}
		
		
	}
