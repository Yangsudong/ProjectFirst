package com.yedam.nestedInterfaces;

public class Button {
	// 인터페이스 
	OnClikListener listener;
	
	void setOnClikListener(OnClikListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClik();
	}
		
	interface OnClikListener {
		void onClik();
	}

}
