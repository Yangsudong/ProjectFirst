package com.yedam.dev;
//	p.524 Comparable 구현클래스
public class Member implements Comparable<Member> {
	String name;
	
	Member(String name) {
		this.name = name;		
	}	
	@Override
	public int compareTo(Member o) {		
		return name.compareTo(o.name);
	}	
}
