package com.yedam.classes;

public class StudentExample {
	public static void main(String[] args) {
		// 인스턴스 생성 (p.191 참고)
		
		// class를 정의한후에 stu라는 변수에 값을넣어주는과정
		Student stu = new Student(); 
		stu.name = "Hong";
		stu.age = 20;
		stu.height = 178.4;
		stu.weight = 70.5;
//		stu.study();
//		stu.eat("banana");
//		stu.exercise();

//		System.out.println("이름은 : " + stu.name + " 나이는 : " + stu.age);
		
		// class를 정의한후에 stu1라는 변수에 값을넣어주는과정
		Student stu1 = new Student();
		stu1.name = "Park"; // stu1에서는 필드에 직접 값을 넣음
		stu1.age = 30;
		stu1.height = 178.4;
		stu1.weight = 70.5;
//		stu1.eat("사과");
//		System.out.println("이름은 : " + stu1.name + " 나이는 : " + stu1.age);	
		
		// class를 정의한후에 stu2라는 변수에 값을넣어주는과정
		Student stu2 = new Student("Choi"); // stu1와 다르게 st2는 main필드에 choi라는 값을 생성한다
		stu2.age = 40;
		stu2.height = 168.4;
		stu2.weight = 60.5;
//		stu2.eat("수박");
//		System.out.println("이름은 : " + stu2.name + " 나이는 : " + stu2.age);

		int[] intary = new int[5];
		intary[0] = 10;

		Student[] s1 = new Student[3]; // 배열로 인스턴스를 생성
		s1[0] = stu;
		s1[1] = stu1;
		s1[2] = stu2;

		String inputStr = "Choi";	
	
		// 반복문을 통해 이름과나이가 출력되게함
		for (Student stud : s1) { 
			System.out.println(stud.name + "/" + stud.age);
			// inputStr에 있는 Choi와 비교해서 같은값이 있으면 그대로 출력하게 하는 비교문
			if (inputStr.equals(stud.name)) {					
				System.out.println("\""+stud.name + "\"" + " 같습니다.");
			} else {
				System.out.println("\""+stud.name + "\"" + " 다릅니다.");
			}
		}
	}

}
