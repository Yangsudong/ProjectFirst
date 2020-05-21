package com.yedam.generic;

// 제네릭을 사용하면 타입을 정해준게 아니라 모든 타입을 나중에 받을수있다. TypeParameter T가 아니여도 상관은없다 
public class Box<T>{
//	Object object;
//	Object란 타입을 받아서 모든 타입을 받을수있다.
	T object;
	
	void set(T object) {
		this.object = object;
	}
	
	// object로 받은 타입을 get메소드에서 반환
	T get() {
		return object;
	}
}
