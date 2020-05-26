package com.yedam.collection.list;


public class Board {
String title,content,name;
	
	Board(String title,String content,String name) {
		this.title = title;
		this.name = name;
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
	public String toString() {
		return "제목 : " + title + "\t"+"\t 내용 : " + content + "\t 작성자 : " + name;
	}		
	
}				
	
	

