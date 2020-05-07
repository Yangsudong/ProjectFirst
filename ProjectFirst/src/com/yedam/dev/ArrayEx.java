package com.yedam.dev;

public class ArrayEx {

	public static void main(String[] args) {
		int num1 = 100;
		String str1 = "Hello";
		
		int[] intAry = {10,20};
		
		String[] strAry = {"hell"};
		for(String str : strAry) {
			System.out.println(str);
		}
		
		int result = sumAry(intAry);
		System.out.println(result);
		
		double[] doubAry = new double[] {1.1, 2.2, 3.3};
		double reuslt1 = avgAry(doubAry);
		
	}
	public static double avgAry(double[] ary) {
		double sum = 0, avg = 0;
		for(int i=0; i<ary.length; i++) {
			sum += ary[i];			
		}
		avg = sum / ary.length;
		return avg;
	}

	public static int sumAry(int[] ary) {
		int sum = 0;
		for(int i=0; i<ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
	
}
