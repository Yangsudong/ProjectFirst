package com.yedam.classes.inherit;

import com.yedam.classes.interfaces.Audio;
import com.yedam.classes.interfaces.Television;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		

	}

}
