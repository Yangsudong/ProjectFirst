package com.yedam.classes;

public class StudentExample2 {
	public static void main(String[] args) {
		Student2 s1 = new Student2();
		int num1 = 100;
		s1.name = "Hong";
		s1.age = 20;
		s1.major = "English";
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.major);
		
		Student2 s2 = new Student2("park");
//		s2.name = "park" 
		s2.age = 22;
		s2.major = "History";
		
		Student2 s3 = new Student2("Choi",25);
//		s3.name = "Choi";
//		s3.age = 25;
		s3.major = "Math";
		
		Student2[] students = new Student2[4];
		students[0] = s1;
		students[1] = new Student2();
		students[2] = s2;
		students[3] = s3;
	
	
		for(Student2 s : students) {
			System.out.println(s.name);
		}
	}
}
