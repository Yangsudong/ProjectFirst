package com.yedam.classes.morning;

public class Code20200515 {

	public static void main(String[] args) {
			
		
		//2차원배열 
		int[][] intAry = new int[5][5];
//		intAry[0] = new int[] { 1, 2, 3, 4, 5 };
//		intAry[1] = new int[] { 6, 7, 8, 9, 10 };
//		intAry[2] = new int[] { 11, 12, 13, 14, 15};
//		intAry[3] = new int[] { 16, 17, 18, 19, 20};
//		intAry[4] = new int[] { 21, 22, 23, 24, 25 };
		
		// 1씩 증가시켜서 배열에 담는다 [5][5] 이기때문에 1~25까지 담긴다
		int count = 1;		
		for(int i=0; i<intAry.length; i++) {
			for(int j=0; j<intAry.length; j++) {
				intAry[i][j] = count ++;							 
			}
		}
		
				
		for(int i=0; i<intAry.length; i++) {
			for(int j=0; j<intAry[i].length; j++) {
				System.out.print(intAry[i][j] + "\t");
			}
			System.out.println();            
		}
		
		System.out.println();
		System.out.println("====================================");
		System.out.println();
		
		for(int i=0; i<intAry.length; i++) {
			for(int j=0; j<intAry[i].length; j++) {
				System.out.print(intAry[j][i] + "\t");
			}
			System.out.println();            
		}
		
		System.out.println();
		System.out.println("====================================");
		System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print((i+1)+(j*5)+"\t");
			}
			System.out.println();
		}
		
		
		
	}		
	
}
