package com.yedam.collection.list;

import java.util.List;

public interface BoardService2 {
	// 삽입	
	void insertBoard(Board board);	
		
	// 수정	
	void updateBoard(Board board);
		
	// 삭제	
	void deleteBoard(String title);
	
	// 조회
	void listBoard();
}
