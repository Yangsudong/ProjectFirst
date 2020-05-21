package com.yedam.generic;

import java.util.ArrayList;
import java.util.List;


public class GenericExample {
	public static void main(String[] args) {
//		Object[] strAry = new Object[5]; // Object 타입상관없이 배열에 담을수있다.
//		strAry[0] = "Hello";
//		strAry[1] = new Integer(0);
//		
//		String str = (String)strAry[0];
//		Integer num = (Integer)strAry[1];
//		Integer num1 = (Integer)strAry[0];
		
//		List list = new ArrayList();
//				
//		list.add("Hello");
//		list.add("Wolrd");
//		list.add(new Double(2.4));
//		
//		String s1 = (String)list.get(0);
//		String s2 = (String)list.get(1);
//		Double d1 = (Double)list.get(0);
//		
		
//		 제네릭.
// 		strList에는 String 타입만 담을수있다.		
		List<String> strList = new ArrayList<String>();
		
//		strList.add(new Integer(0));	-- Integer타입은 담을수없다.
		strList.add(new String("Hello"));
		
		// intList에는 Integer 타입만 담을수 있다.
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(new Integer(10));
		
		System.out.println(strList);
	}

}
