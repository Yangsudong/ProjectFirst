package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain2 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);		
		BoardServiceImpl2 service = new BoardServiceImpl2();
	
		while(true) {
			System.out.println("===============================");
			System.out.println("1.입력 2.수정 3.삭제 4.리스트 5.종료");
			System.out.println("===============================");
			System.out.print("선택 > ");
				
			int menu = scn.nextInt(); scn.nextLine();
				
			// 입력
			if(menu == 1) {				
				System.out.print("제목입력 : ");
				String title = scn.nextLine();
				System.out.print("내용입력 : ");
				String content = scn.nextLine();
				System.out.print("작성자입력 : ");
				String name = scn.nextLine();
				Board board = new Board(title, content, name);	//Board 클래스의  인스턴스 생성, board 안에 담음
				service.insertBoard(board); // list컬렉션에 위에 만든 board를 담는다					
			 	}
					
			// 수정
			else if(menu == 2) {
				System.out.print("변경 제목 입력 : ");
				String title = scn.nextLine();
				System.out.print("수정 내용 입력 : ");
				String content = scn.nextLine();
				Board board = new Board(title, content, null);
				
				service.updateBoard(board);							
					
				}
				
			// 삭제
			else if(menu == 3) {
				System.out.println("삭제할 제목 입력 : ");
				String title = scn.nextLine();
				
				service.deleteBoard(title);
				}
				
			// 조회
			else if(menu == 4) {
				service.listBoard();
			}
				
			//종료
			else if(menu == 5) {
				System.out.println("종료");
				break;
				}								
			}
			System.out.println("end of prog.");
		
	}
}
