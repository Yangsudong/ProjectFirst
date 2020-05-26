package com.yedam.collection.list;

import java.util.List;

public interface BoardService {
	// 삽입	abstract 생략 (추상메소드)
	void insertBoard(List<Board> list,Board board);	// = abstract void insertBoard(List<Board> list,Board board);

	// 수정	abstract 생략 (추상메소드) 
	void updateBoard(List<Board> list,Board board);
	
	// 삭제	abstract 생략 (추상메소드)
	void deleteBoard(List<Board> list,String title);
	
	// 조회
	void listBoard(List<Board> list);
	
	
}
