package com.yedam.exceptions;
//p.449 7번문제
public class WrongPasswordException extends Exception{
	public WrongPasswordException() {
//		super("패스x");
//		System.out.println("패스워드가 틀립니다.");
		
	}
	public WrongPasswordException(String message) {
		super(message);
	}

}
