package com.yedam.lambda;

//class MyFunClass implements MyFunctionalInterface {
//	@Override
//	public void run() {	
//		System.out.println("실행.");
//	}	
//}

public class LambdaExample { 
	public static void main(String[] args) {
		// 1) 매개값이 없는 인터페이스
		MyFunctionalInterface fi = new MyFunctionalInterface() {
			// 익명구현객체
			@Override
			public void run() {				
				System.out.println("실행.");
			}			
		};
		fi.run();
	
		// 간단한 람다표현식
		MyFunctionalInterface fi2 = () -> {
			System.out.println("실행.");
		};
		fi2.run();
		// ↑↓같음
		MyFunctionalInterface fi3 = () -> System.out.println("실행.");			
		fi3.run();
		
		
		// 2) 매개값이 있는 인터페이스.
		
		/*		
	 		MySumInterface si = new MySumInterface() {
			
			@Override
			public void sum(int num1, int num2) {				
				int result = num1 + num2;
				System.out.println("두수의 합 : " + result);
			}
		};
		si.sum(10, 20);		
		*/
			
		
			// 람다식으로 표현
			MySumInterface si2 = (int num1, int num2) ->  {
				int result = num1 + num2;
				System.out.println("두수의 합 : " + result);
		};
		si2.sum(10, 20);
		
		// 3) 반환값과 매개값이 있는 인터페이스
			MyMultiInterface mi = (num1, num2) -> {	
					return num1 * num2;					
			 };
			 int result =mi.multi(10, 15);
			 System.out.println("결과값은 : " + result);
	}
}
