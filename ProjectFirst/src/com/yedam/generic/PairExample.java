package com.yedam.generic;

public class PairExample {
	public static void main(String[] args) {
		
//		Pair<Integer,String> p1 = new Pair<Integer, String>(1, "스트링");
//		↑↓같음
		Pair<Integer, String> p1 = new Pair<>(1,"사과");
		Pair<Integer, String> p2 = new Pair<>(2,"사과");
		if (Utils.compare(p1, p2))
			System.out.println("논리적으로 동등한 객체");
		else
			System.out.println("논리적으로 다른 객체");
		
		// 앞이 크면 1, 같으면 0, 뒤가 크면 -1
		int result = Utils.compare(10, 20);
		System.out.println(result);
		
	}
}
