package com.yedam.classes.inherit;
	//학교친구 클래스
public class acfriends extends friends {
	String major;	
	public acfriends(String name, String telNum, String major) {
		super(name,telNum);
		this.major = major;
	}
	@Override
	public void showinfo() {
//		super.showinfo();
		System.out.println("이름은 : " + name + " 전화번호 : " + telNum + " 전공 : " + major);
		System.out.println("-----------------------------------------");
	}
}
