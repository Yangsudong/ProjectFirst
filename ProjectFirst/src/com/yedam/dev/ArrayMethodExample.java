package com.yedam.dev;

public class ArrayMethodExample {
	public static void main(String[] args) {
		
		int result=sum(10,11);
		int[] intAry = {1,2,3,4,5};
		sumAry(intAry);
		System.out.println("배열 intAry 합 : " + result);

		double[] dobAry = { 1.1, 2.2, 3.3, 4,4};
		
				
		avgAry(dobAry);
		double result2 = avgAry(dobAry);
		System.out.format("배열 doulbeAry 합의 평균 : " + "%.1f",result2);
	}
	public static double avgAry(double[] ary) {
		//매개값으로 받은 배열의 요소들의 평균을 계산하는 메소드.
		// 1.배열의 각 요소의합
		
		// 2.평균 : 합 / 배열크기
		double sum=0;		
		double avg = 0.0;
		for(int i=0; i<ary.length; i++) {
			sum += ary[i];
			}			
		avg = sum / ary.length;
		return avg;	
	}	
	
	public static int sumAry(int[] ary) {
		int sum=0;
		for(int i=0; i<ary.length; i++) {
			sum += ary[i];
			}
		return sum;
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
}

