package com.yedam.classes.statics;

public class Calculator {
	
	static double pi = 3.14; //static 으로 인해 인스턴스를 생성하지않아도 pi라는 메소드를 쓸수있다
	static int sum(int a, int b) {
		return a + b;
	}
	
}
