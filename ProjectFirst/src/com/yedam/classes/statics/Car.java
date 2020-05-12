package com.yedam.classes.statics;

public class Car {
	
	//private를 붙이면 Car 클래스 이외의 외부 클래스에서는 호출할수없게한다 
	private int speed;			//초기값 : 0
	private boolean stop;		//초기값 : true
	
//	Car(int speed){
//		this.speed = speed;
//	}
	void setSpeed(int speed) {
		//속도가 -나 나올수없으므로 -값이나오면 0으로 만들어준다
		if(speed < 0)
			this.speed = 0;
		else
			this.speed = speed;
	}
	
	int getSpeed() {
		return this.speed;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
}
