package com.yedam.generic;

class Apple {
	
}
class Orange {
	
}

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("Hello");
		String str = box.get();
//		리턴받는 값이 String 이므로 형변환을 해줘야함, 제네릭을 사용하면 형변환이 필요없다.
//		String str = (String)box.get();	

		Box<Apple> appleBox = new Box<Apple>();
		appleBox.set(new Apple());
		
		Box<Orange> orangeBox = new Box<Orange>();
		orangeBox.set(new Orange());
		
	}
}
