package com.yedam.collection.list;

import java.util.List;

	// BoardService 를 구현하는 BoardServiceImpl
public class BoardServiceImpl implements BoardService{
			
	@Override
	public void insertBoard(List<Board> list, Board board) {
		list.add(board);
	}
	@Override
	public void updateBoard(List<Board> list, Board board) {	
		for(int i=0; i<list.size(); i++) {
			// 찾고자 하는 제목이 같을때
			if(list.get(i).getTitle().equals(board.getTitle())) {
				list.get(i).setContent(board.getContent());
			}
			else {
				System.out.println("찾는 제목이 없습니다.");
			}
		}
	}
	@Override
	public void deleteBoard(List<Board> list, String title) {
		for(int i=0; i<list.size(); i++) {
			// 찾고자 하는 제목이 같을때
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
			}
			else {
				System.out.println("찾는 제목이 없습니다.");
			}
		}
	}
	@Override
	public void listBoard(List<Board> list) {		
		for(Board board : list) {
			System.out.println(board.toString());
		}
	}
}
