package com.yedam.classes;

public class People {
	//속성(필드) 3가지
	String gender;  //성별
	int age;		//나이
	String job;		//직업
	
	//기능(메소드) 2가지
	//취미는 ~입니다
	void hobby(String str) {	
		System.out.println("취미는 " + str + " 입니다.");
	}
	//사는지역은 ~입니다
	void area(String str) {
		System.out.println("사는지역은 " + str + " 입니다.");
	}
	//
	void showInfo() {	//showInfo 호출시에 입력된 출력문을 생성하게한다.
		System.out.println("gender : " + gender + " / " +" age : " + age + " / " +  " job : " + job);
	}	
}
