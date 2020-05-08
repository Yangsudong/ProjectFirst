package com.yedam.classes;

public class Student {
	//(속성) -> 필드
	String name;	//이름
	int age;		//나이
	double height;	//키
	double weight;	//몸무게
	
	//(기능) -> 메소드(method)
	
	void study() {		//공부
		System.out.println("공부합니다.");	 //"공부합니다." 라는 문자를 출력하는 메소드
	}	
	void exercise() {	//운동
		System.out.println("운동합니다."); 	 //"운동합니다." 라는 문자를 출력하는 메소드	
	}		
	void eat(String str) {	//식사
		System.out.println( str + "을 먹는다."); //" ~을 먹는다" 를 출력
	}
	
	//(생성자) -> 필드의 초기값 지정.
	Student(){
//		System.out.println("생성자 호출.");
	}
	Student(String name){
		this.name = name;	//필드에 정의되어있는 name을 얘기함
	}
}
