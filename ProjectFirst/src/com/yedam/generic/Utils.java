package com.yedam.generic;

public class Utils {
//			Box<T> 는 제네릭입니다라는 표시를 위해 앞에 <T>를 적어준다.
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);		
		return box; 
	}	
	
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K,V> p2) {
		boolean keyComp = p1.getKey().equals(p2.getKey());
		boolean valComp = p1.getValue().equals(p2.getValue());		
		
		return keyComp && valComp;
	}
	
	public static <T extends Number> int compare(T t1, T t2) {
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();		
		return Double.compare(d1, d2);
		
		
	}
	
}
