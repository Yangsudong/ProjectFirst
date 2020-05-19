package com.yedam.nestedInterfaces;

class CallListener implements Button.OnClikListener {

	@Override
	public void onClik() {
		System.out.println("전화를 겁니다.");
	}	
}
class MessageListener implements Button.OnClikListener {

	@Override
	public void onClik() {
		System.out.println("문자를 보냅니다.");
	}	
}
public class ButtonExample {
	public static void main(String[] args) {
		
		Button btn = new Button();		
		CallListener clListener = new CallListener();
		btn.setOnClikListener(clListener);
		btn.touch();
		
		MessageListener mListener = new MessageListener();
		btn.setOnClikListener(mListener );
		btn.touch();
	}
}
