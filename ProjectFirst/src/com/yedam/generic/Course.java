package com.yedam.generic;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		this.students = (T[]) new Object[capacity];
	}
	
	public String getName() {
		return name;
	}
	public T[] getStudents() {
		return students;
	}
	// 배열에 비어있는 부분을 찾아 수강생을 추가하는 메소드 
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
	
	
	
}
