package com.yedam.classes;

public class Calculator {
	
	String model;

//	public Calculator() {} //아무것도 생성하지않으면 기본적으로 기본생성자가 자동생성된다

	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	int sum(int num1, int num2) {
		return num1 + num2;	
	}
	double sum(double num1, double num2) {
		return num1 + num2;
	}
	void println(String str) {		
		System.out.println("결과값은 : " + str);
	}
	void println(int str) {		
		System.out.println("결과값은 : " + str);
	}
	void println(double str) {		
		System.out.println("결과값은 : " + str);
	}
	void printf(int str) {		
		System.out.printf("결과값은 : " + "%.1f",str);
	}
	void printf(double str) {		
		System.out.printf("결과값은 : " + "%.1f",str);
	}
	//직사각형의 넓이
	double getAreaRectangle(double width, double height) {
		return width * height;
	}
	//정사각형의 넓이
	double getAreaRectangle(double width) {
		return width * width;
	}
	
	
}
