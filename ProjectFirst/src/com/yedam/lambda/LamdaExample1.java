package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

// p.718 예제 5번

//plan a
class GetMax implements IntBinaryOperator {

	@Override
	public int applyAsInt(int left, int right) {
		return left > right ? left : right;
	}
}

//plan a
class GetMin implements IntBinaryOperator {

	@Override
	public int applyAsInt(int left, int right) {
		return left < right ? left : right;
	}
}

public class LamdaExample1 {
	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		// plan a
		int min = maxOrMin(new GetMin());
		System.out.println("최소값 : " + min);
		int max = maxOrMin(new GetMax());
		System.out.println("최대값 : " + max);

		// plan a(lamda)
		int min2 = maxOrMin((left, right) -> left < right ? left : right);
		System.out.println("최소값 : " + min2);
		int max2 = maxOrMin((left, right) -> left > right ? left : right);
		System.out.println("최대값 : " + max2);

		// plan b
//	    int max = maxOrMin(
//			(a,b) -> {
//				if(a<=b) { return a; }
//				else { return b; }
//			});
//		System.out.println("최대값 : " + max);
//		
//		int min = maxOrMin(
//			(a,b) -> {
//				if(a<=b) { return a; }
//				else { return b; }
//			});
//		System.out.println("최소값 : " + min);
	}
}
