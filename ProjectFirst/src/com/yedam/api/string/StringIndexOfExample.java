package com.yedam.api.string;

public class StringIndexOfExample {
	public static void main(String[] args) {
		// 문자열 포함 여부 조사
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		// -1값을 리턴하면 특정문자열이 포함되어 있지 않다는 뜻
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");			
		}
		else {
			System.out.println("자바와 관련없는 책이군요.");
		}
	}

}
