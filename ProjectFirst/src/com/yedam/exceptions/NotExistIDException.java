package com.yedam.exceptions;
//p.449 7번문제
public class NotExistIDException extends Exception {
	public NotExistIDException() {		
//	super("아이디가 존재하지 않습니다.");
//		System.out.println("아이디가 존재하지 않습니다.");
		
	}	
	public NotExistIDException(String message) {
		super(message);
	}

}
