package com.yedam.classes.inherit;

import java.util.Scanner;

public class friendsapplication {
	Scanner scn = new Scanner(System.in);
	friends[] Friends = new friends[100];
	
	//주소록추가
	void addAddress() {		 	
		System.out.println("이름를 입력하세요.");
		String getName = scn.nextLine();
		System.out.println("전화번호를 입력하세요.");
		String telNum = scn.nextLine();
				
		friends addray = new friends(getName, telNum);
		for(int i=0; i<Friends.length; i++) {
			if(Friends[i] == null) {	//베열에 값이 비어있는지 확인하고 값을 넣기위한 문구
			Friends[i] = addray;
			break;	//값이들어가면 break를 통해 멈춰줘야한다 그렇지 않으면 모든배열이 찰때까지 반복된다.
			}
		}
		System.out.println("주소록이 추가되었습니다.");		
	}
	//대학친구 주소록추가 
	void ACaddAddress() {			
		System.out.println("이름를 입력하세요.");
		String getName = scn.nextLine();
		System.out.println("전화번호를 입력하세요.");
		String telNum = scn.nextLine();
		System.out.println("전공을 입력하세요.");
		String major = scn.nextLine();
		
		acfriends addray = new acfriends(getName, telNum, major);
		for(int i=0; i<Friends.length; i++) {
			if(Friends[i] == null) {	//베열에 값이 비어있는지 확인하고 값을 넣기위한 문구
			Friends[i] = addray;
			break;	//값이들어가면 break를 통해 멈춰줘야한다 그렇지 않으면 모든배열이 찰때까지 반복된다.
			}
		}
		System.out.println("주소록이 추가되었습니다.");		
	}
	//대학친구 주소록추가 	
	void CPaddAddress() {		
		System.out.println("이름를 입력하세요.");
		String getName = scn.nextLine();
		System.out.println("전화번호를 입력하세요.");
		String telNum = scn.nextLine();
		System.out.println("부서를 입력하세요.");
		String department = scn.nextLine();
		
		cpfriends addray = new cpfriends(getName, telNum, department);
		for(int i=0; i<Friends.length; i++) {
			if(Friends[i] == null) {	//베열에 값이 비어있는지 확인하고 값을 넣기위한 문구
			Friends[i] = addray;
			break;	//값이들어가면 break를 통해 멈춰줘야한다 그렇지 않으면 모든배열이 찰때까지 반복된다.
			}
		}
		System.out.println("주소록이 추가되었습니다.");		
	}
	
	private void addressList() {
		System.out.println("전체목록");
		// 전체 배열중에 값이 있는 경우에만 출력 (null 제외)
		for(friends ad : Friends) {
			if(ad != null) {
				ad.showinfo();
			}
		}
	}
	//3.이름조회
	private void showname() {
		System.out.println("이름조회");
		System.out.println("이름를 입력하세요.");
		String fname = scn.nextLine();
		
		friends ad = findName(fname);				
		if (ad != null) {
			System.out.println("해당이름이 있습니다");			
		}else {
			System.out.println("해당이름이 없습니다.");
		}
				//전체 배열중에 값이 있는 경우 && 입력이름과 동일한 건에 처리.
			
	}//이름 조회를위한 for문
	private friends findName(String fname) {			
		for(friends ad : Friends) {
			if(ad != null && ad.getName().equals(fname)) {				   
				return ad;
			}
		}	
		return null;
	}

	public void execute() {
		while(true) {
			System.out.println("--------------------------------");
			System.out.println("1.주소록추가  2.전체목록  3.이름조회  4.종료 ");
			System.out.println("--------------------------------");
			System.out.print("선택 > ");
			int menu = scn.nextInt(); scn.nextLine();
			if(menu==1) {			//1.주소록추가
				System.out.println("메뉴를 선택하세요.");
				System.out.println("1.일반 주소록추가  2.학교친구 주소록추가  3.대학친구 주소록추가");
				System.out.print("선택 > ");
				int menu2 = scn.nextInt(); scn.nextLine();
				switch(menu2) {
				case 1:
					addAddress();
					break;
				case 2:
					ACaddAddress();
					break;
				case 3: 
					CPaddAddress();
					break;
				}
				
			}
			else if(menu == 2) {	//2.전체목록	
				addressList();
			}
			else if(menu == 3) {	//3.이름조회
				showname();
			}			
			else if(menu == 4) {	//5.종료	
				System.out.println("프로그램 종료.");
				break;
			}				
	
		}// end of while()
		
	}
}
