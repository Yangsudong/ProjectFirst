package com.yedam.classes.inherit;

public class VehicleExample {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();	//인스턴스(new Vehicle)생성후 vehicle에 담음
		
		vehicle.run();			// 여기는 vehicle 인스턴스

		vehicle = new Bus();	// 부모클래스 변수 = (자동형변환)자식클래스
		vehicle.run();			// 이시점까지는 Bus 인스턴스
		
		vehicle = new Taxi();	// 여기서는 Taxi 인스턴스
		vehicle.run();
		
	    // 자식클래스 = (강제형변환)부모클래스;
		Taxi taxi = (Taxi) vehicle;	//부모클래스를 자식클래스로 형변환할때는 강제 형변환(Taxi)을해줘야한다.
		taxi.run();
		
		
	}
}
