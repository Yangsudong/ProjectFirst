package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.classes.statics.Account;

public class BoardMain {
	public static void main(String[] args) {
		
	
	Scanner scn = new Scanner(System.in);
	List<Board> list = new ArrayList<>();
	
	BoardService service = new BoardServiceImpl();
//		System.out.println("제목입력 : ");
//		String title = scn.nextLine();
//		System.out.println("내용입력 : ");
//		String content = scn.nextLine();
//		System.out.println("작성자입력 : ");
//		String name = scn.nextLine();
//		Board board = new Board(title, content, name);		
//		service.insertBoard(list, board);
			
		while(true) {
			System.out.println("1.입력 2.수정 3.삭제 4.리스트 5.종료");
			System.out.println("===============================");
			System.out.print("선택 > ");
			
			int menu = scn.nextInt();
						
			if(menu == 1) {				
				System.out.println("제목입력 : ");
				String title = scn.nextLine();
				System.out.println("내용입력 : ");
				String content = scn.nextLine();
				System.out.println("작성자입력 : ");
				String name = scn.nextLine();
				Board board = new Board(title, content, name);
				service.insertBoard(list, board);			
				
			}
			
			
			else if(menu == 2) {
				System.out.println("변경 제목 입력 : ");
				String title = scn.nextLine();
				System.out.println("수정 내용 입력 : ");
				String content = scn.nextLine();
				Board board = new Board(title, content, "");
				service.updateBoard(list,board);							
				
				}
			
			else if(menu == 3) {
				System.out.println("삭제할 제목 입력 : ");
				String title = scn.nextLine();
				
				service.deleteBoard(list, null);
			}
			
			else if(menu == 4) {
				service.listBoard(list);
			}
			
			else if(menu == 5) {
				System.out.println("종료");
				break;
			}			
		
		scn.close();			
		}
	
	}
	
}
