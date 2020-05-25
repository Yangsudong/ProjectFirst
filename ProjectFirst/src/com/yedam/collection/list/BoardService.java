package com.yedam.collection.list;

import java.util.List;

public interface BoardService {
	// 삽입
	void insertBoard(List<Board> list,Board board);
	// 수정
	void updateBoard(List<Board> list,Board board);
	// 삭제
	void deleteBoard(List<Board> list,Board board);
	// 조회
	void listBoard(List<Board> list,Board board);
	
	void getlist(List<Board> list);
	
}
