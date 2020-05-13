package com.yedam.classes.inherit;
	//회사친구
public class cpfriends extends friends {
	String department;
	public cpfriends(String name, String telNum, String department) {
		super(name,telNum);
		this.department = department;
	}
	@Override
	public void showinfo() {
//		super.showinfo();
		System.out.println("이름은 : " + name + " 전화번호 : " + telNum + " 부서 : " + department);
		System.out.println("-----------------------------------------");
		
	}	
	
}
