package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;

// 매게값이없는 메소드
public class BoardServiceImpl2 implements BoardService2{
	List<Board> list = new ArrayList<>();

	@Override
	public void insertBoard(Board board) {
		list.add(board);
	}

	@Override
	public void updateBoard(Board board) {
		for(int i=0; i<list.size(); i++) {
			// 찾고자 하는 제목이 같을때
			if(list.get(i).getTitle().equals(board.getTitle())) {
				list.get(i).setContent(board.getContent());
				System.out.println("내용 수정 완료");
			}
			else {
				System.out.println("찾는 제목이 없습니다.");
			}
		}
	}

	@Override
	public void deleteBoard(String title) {
		for(int i=0; i<list.size(); i++) {
			// 찾고자 하는 제목이 같을때
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				System.out.println("삭제 완료");
			}
			else {
				System.out.println("찾는 제목이 없습니다");
			}
		}
	}

	@Override
	public void listBoard() {
		for(Board board : list) {
			System.out.println(board.toString());
		}
	
	}

}
