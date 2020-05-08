package com.yedam.classes;

public class PeopleExample {
	public static void main(String[] args) {
		
		People p1 = new People();
		p1.gender = "남";
		p1.age = 21;
		p1.job = "학생";
		//System.out.println("성별 : "+ p1.gender + "\n" +"나이 : " + p1.age + "\n" + "직업 : " + p1.job);
		p1.hobby("축구");
		p1.area("대구");
		
		People p2 = new People();
		p2.gender = "여";
		p2.age = 30;
		p2.job = "회사원";		
		p2.hobby("음악");
		p2.area("서울");
		
		People p3 = new People();
		p3.gender = "남";
		p3.age = 35;
		p3.job = "프리랜서";		
		p3.hobby("독서");
		p3.area("부산");
		
		People[] pary= new People[3];	//pary라는 변수에 People값을 배열로 넣어준다
		pary[0] = p1;
		pary[1] = p2;
		pary[2] = p3;
		
		for (People ps : pary) {	//for문안에 showinfo를 집어넣어서 반복해서 배열에 넣은값을 출력
			ps.showInfo();		
		}
		
	}

}
