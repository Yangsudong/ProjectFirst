package com.yedam.classes.inherit;

public class friends {
		
	public String name;	//이름
	public String telNum;	//전화번호
	
	public friends(String name, String telNum) {
		this.name = name;
		this.telNum = telNum;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTelNum() {
		return telNum;
	}
	
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	public void showinfo() {
		System.out.println("이름은 : " + name + " 전화번호 : " + telNum);
		System.out.println("-----------------------------------------");
	}
	
		
	
}

