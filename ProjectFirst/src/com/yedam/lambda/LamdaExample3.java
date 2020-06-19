package com.yedam.lambda;

import java.util.function.UnaryOperator;

public class LamdaExample3 {
	public static void main(String[] args) {

		UnaryOperator<String> uo = new UnaryOperator<String>() {
			@Override
			public String apply(String t) {
				return t.substring(t.length() - 5);
			}
		};
		System.out.println(uo.apply("HelloWolrdNice"));
	}
}
