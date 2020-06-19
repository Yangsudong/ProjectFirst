package com.yedam.lambda;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

//p.719 예제 6번
public class LamdaExample2 {
	private static Student[] students = { 
			new Student("홍길동", 90, 96), 
			new Student("신용권", 95, 93) };
	
	public static double avg(int a) {
		int sum = 0;
		for (Student student : students) {
			sum = sum + student.getEnglishScore();
		}
		return (double) sum / students.length;
	}
	
	// 일반 메소드 이용
	public static double avgTotal() {
		int sum = 0;
		for (Student student : students) {
			sum += student.getMathScore() + student.getEnglishScore();
		}
		double avg = (double) sum / students.length;
		return avg;
	}
	
	public static double avgEnglish() {
		int sum = 0;
		for (Student student : students) {
			sum += student.getEnglishScore();
		}
		double avg = (double) sum / students.length;
		return avg;
	}
	
	public static double avgMath() {
		int sum = 0;
		for (Student student : students) {
			sum += student.getMathScore();
		}
		double avg = (double) sum / students.length;
		return avg;
	} 
	// avg() 메소드 작성
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for (Student student : students) {
			sum = sum + function.applyAsInt(student);
		}
		double avg = (double) sum / students.length;
		return avg;
	}

	public static void main(String[] args) {
		
		System.out.println("영어 평균 점수 : " + avgEnglish());
		
		System.out.println("수학 평균 점수 : " + avgMath());
		
		System.out.println("전체 평균 점수 : " + avgTotal());
		
		double englishAvg = avg(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getEnglishScore();
			}
		}) ;
		System.out.println("영어 평균 점수 : " + englishAvg);
		
		double mathAvg = avg(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getMathScore();
			}
		}) ;
		System.out.println("수학 평균 점수 : " + mathAvg);

		double totalAvg = avg(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getEnglishScore() + value.getMathScore();
			}
		}) ;
		System.out.println("전체 평균 점수 : " + totalAvg);
		
		
//		double englishAvg = avg(s -> s.getEnglishScore());
//		double englishAvg = avg(Student::getEnglishScore);
//		System.out.println("영어 평균 점수 : " + englishAvg);

//		double mathAvg = avg(s -> s.getMathScore());
//		double mathAvg = avg(Student::getMathScore);
//		System.out.println("수학 평균 점수 : " + mathAvg);
	}

	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;

		public Student(String name, int englishScore, int mathScore) {
			super();
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}

		public String getName() {
			return name;
		}

		public int getEnglishScore() {
			return englishScore;
		}

		public int getMathScore() {
			return mathScore;
		}
	}
}
