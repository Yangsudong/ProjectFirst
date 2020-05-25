package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add(new String("Hello"));
		list.add("World");
		list.add(2,"Hong");
		list.add(2,"Hong");	// 같은 자리에 넣으면 밀어넣음
		list.add(2,"Hwang"); // 같은 자리에 넣으면 밀어넣음
		list.set(2, "Park"); // set을 쓰면 치환
		
		
		for(String str : list) {
			System.err.println(str.toString());
		}
		
		System.out.println(list.get(1));
		
		list.remove(4);
		System.out.println("after remove(4)");
//		for (String str : list) {
//			System.out.println(str.toString());
//		↑↓같음
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
