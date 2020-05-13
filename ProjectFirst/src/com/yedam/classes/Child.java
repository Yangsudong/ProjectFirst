package com.yedam.classes;

public class Child extends Parent{
	Child() {
		super();
  }
	Child(String lastName, String firstName, String telNumber){
		super(lastName, firstName, telNumber);
	
	}
	
//	protected 구분.
	void showInfo() {
		Child child = new Child();
		child.getLastName(); //default X
		child.getFirsName(); // protected
		child.getTelNumber(); // public
	}
}
