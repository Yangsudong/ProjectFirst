package com.yedam.classes.interfaces;

import com.yedam.classes.inherit.RemoteControl;

public class Audio implements RemoteControl {
	//	implemnts == 구현하다

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
		
	}
	@Override
	public void turnOff() {
		System.out.println("Audio를 켭니다");
		
	}
	
}
