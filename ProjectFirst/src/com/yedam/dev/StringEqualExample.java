package com.yedam.dev;

class Student{
	String name;
}
// 기본타입은 값이 저장, 참조 타입은 주소값이 저장된다.
public class StringEqualExample {
	public static void main(String[] args) {
		
		Student st1 = new Student();
		Student st2 = new Student();
		st1.name = "Hong";
		st2.name = "Park";
		
		System.out.println(st1); // 15db9742 주소값 저장
		System.out.println(st2); // 6d06d69c 주소값 저장
		
		String str1 = "Hello"; //new String("Hello");
		String str2 = "Hello";
		String str3 = new String("Hello");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		if(str1 == str2){
			System.out.println("참조가 같다.");
		}
		else {
			System.out.println("참조가 다르다.");
		}
		if(str1 == str3){
			System.out.println("참조가 같다.");
		}
		else {
			System.out.println("참조가 다르다.");
		}
	}

}
