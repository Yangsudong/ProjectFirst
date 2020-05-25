package com.yedam.collection.list;

import java.util.List;


public class BoardServiceImpl implements BoardService{
			
	@Override
	public void insertBoard(List<Board> list, Board board) {
		list.add(board);
	}
	@Override
	public void updateBoard(List<Board> list, Board board) {	
		int i = 0 ;
		int check = 0;
		Board a = null;
		for(Board bor : list) {
			if(bor != null && ((Board)(bor)).getTitle().equals(list)) {				   
			i = list.indexOf(bor);
			check = 1;
			break;
			}
			if(check == 1) {
				
				
			}
		}
	}
	@Override
	public void deleteBoard(List<Board> list, Board board) {
	
	}
	@Override
	public void listBoard(List<Board> list, Board board) {		
		
	}
	@Override
	public void getlist(List<Board> list) {
		System.out.println(String.format("제목" + "\t" + "내용" +"\t" + "작성자"));
		for(Board b : list) {
			b.show();	
		}
	}
}
