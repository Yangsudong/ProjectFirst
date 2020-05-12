package com.yedam.classes;

public class Parent {
	
	private String lastName;
	private String firsName;
	private String telNumber; //집전화번호
	
	public Parent() {
		
	}

	public Parent(String lastName, String firsName, String telNumber) {
		super();	// Object 클래스 상속.(모든 클래스의 상위 클래스는 object클래스이다.)
		this.lastName = lastName;
		this.firsName = firsName;
		this.telNumber = telNumber;
	}
	
	protected String getLastName() {
		return lastName;
	}
	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	@Override
	public String toString() {	
		return  "lastName = " + lastName + "firstName = " + firsName;		
	}
	
	
}
