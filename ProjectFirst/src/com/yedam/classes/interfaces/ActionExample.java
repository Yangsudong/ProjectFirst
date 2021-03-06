package com.yedam.classes.interfaces;
	// p.347 5번문제
interface Action {
	void work();
}

public class ActionExample {
	public static void main(String[] args) {
						//익명 구현 객체
		Action action = new Action(){
			@Override
			public void work() {				
				System.out.println("복사를 합니다.");
			}			
		};
		action.work();	//복사를 합니다.
	}
}
