package com.yedam.classes.inherit;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {		
		++accumulatedRotation;	//한바퀴 돌때마다 회전수 누적
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명 " + (maxRotation - accumulatedRotation) + " 회 ");
			return true;
		}
		else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
	

}
