package com.yedam.classes;

public class Student2 {
	//필드
	String name;
	int age;
	String major;
	
	//생성자 (필드값 초기화) 생성자:인스턴스를 만드는값,필드값을 초기화하는 역할
	public Student2() {
	//디폴트 생성자가 있어야 에러가 안남			
	}
	//생성자 오버로딩
	public Student2(String name) {
		this.name = name; 		//this 인스턴스
	}
	public Student2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Student2(String name, int age, String major) {
		this(name,age); //위에서 생성한걸 호출
		this.major = major;
	}
	
	
	//메소드
	void setMajor(String major) {
		this.major = major;
	}
	String getMajor() {
		return major;
	}
}
