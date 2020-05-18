package com.yedam.classes.morning;

public class Code20200518 {
	public static void main(String[] args) {
		
		int[] intAry = {10, 8, 5, 3, 7, 1};
		// {1, 3, 5, 7, 8, 10} 이 나오게 출력
				
		for(int i=0; i<intAry.length; i++) {
			for(int j=i+1; j<intAry.length; j++) {
				// intAry[i] < intAry[j] 하면 내림차순
				if(intAry[i] > intAry[j]) {		
					int temp = intAry[i];
					intAry[i] = intAry[j];
					intAry[j] = temp;						
				}							
			}				
			System.out.print(intAry[i]+ " ");
		}
	}
}
