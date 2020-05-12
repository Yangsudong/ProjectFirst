package com.yedam.classes;

public class Car {
	String model;
	int maxSpeed;
	
	
	//생성자
	public Car() {
		maxSpeed = 100;	 //매개값이 없으면 100이라는 값을 준다	
	}
	public Car(int maxSpeed) {
		this.maxSpeed = maxSpeed;	
	}
	public Car(String model) {
		this.model = model;
	}
	public Car(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	void showInfo() {
		System.out.println("모델명 : " + model + ", 최고속도 : " + maxSpeed);
	}
	
}
