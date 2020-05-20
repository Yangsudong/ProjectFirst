package com.yedam.exceptions;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
	
		int[] intAry = new int[3];
		
		for(int i=0; i<= intAry.length; i++) {
			try {		
			
			intAry[i] = i + 1;		
			System.out.println(intAry[i]);
			int num1 = Integer.parseInt(args[0]); // Integer.parseInt : 문자열을 숫자로 바꿔주는 역할 
			}
			catch(ArrayIndexOutOfBoundsException e) { // AIOOBE =ArrayIndexOutOfBoundsException
				System.out.println("배열의 범위를 초과했습니다. intAry[" + i + "]");
			}
			catch(NumberFormatException e1) {
				System.out.println("반환불가");				
			}
			// 최상위 클래스 상속
			catch(Exception e2) {
				System.out.println("알수없는 오류 발생.");
			}
		}
		System.out.println("end of prog");		
	}
}
