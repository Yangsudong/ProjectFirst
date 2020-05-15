package com.yedam.classes.inherit;

public interface RemoteControl {
	//상수 final static(포함)
	public int MAX_VOLUME =0;
//	MAX_VOLUME = 1; //인스턴스 선언을 하면 바뀔수가없다. (상수)
	public int Min_VOLUME = 1;
	
	//추상메소드.
	public void turnOn();
	public void turnOff();
	
}
