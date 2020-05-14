package com.yedam.exceptions;

public class NullPointerExceptions {
	public static void main(String[] args) {
		
//		String str = null;
		String str = "Hello";
		
		//try { ... } 문안에서 오류가 발생하면 "실행중 오류가 발생 " 이라는 문구가 나오게 하기
		try {
			System.out.println(str.toString());
			Class.forName("java.lang.String2");
		}
//		    catch(NullPointerException e) {	//catch : 예외처리
//			System.out.println("실행중 오류가 발생.");
//		} 
			catch(Exception e) { 	//최상위 예외처리
			System.out.println("알수 없는 예외 발생.");
//			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료.");
		
	}
}
