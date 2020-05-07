package com.yedam.dev;

public class ArrayExample2 {

	public static void main(String[] args) {
				
/*		System.out.println(getLargeValue(10, 20, 15));
	 	
	 	int [] intAry = new int[] {3,17,2,9,10};
	 	System.out.println(getLargeValue(intAry));
	 	// ↑↓같음
	 	int maxValue = Integer.MIN_VALUE;
	 	maxValue = getLargeValue(intAry);
	 	System.out.println(maxValue);		*/
	
		String result = getString("Hello","World");
		System.out.println(result);
		
		String[] ary = {"Lee", "Kim", "Park", "Choi", "Han"};
		System.out.println(getString(ary));
		
		//배열 선언방식
		int[] intAry = { 1, 2, 3, 4 }; //크기가 4개인배열
		
		int[] intAry2 = new int[5];	// 크기만지정, 값을 지정해줘야한다
		intAry2 = new int[] {1, 2, 3, 4}; //new 배열타입을 써주고 intAry2 값을정해준다
		
		//2차원배열 
		int[][] intAry3 = new int[3][3];
		intAry3[0] = new int[] { 1, 2, 3 };
		intAry3[1] = new int[] { 4, 5, 6 };
		intAry3[2] = new int[] { 7, 8, 9 };
		
		//위와 같음
		intAry3[0][0] = 1;
		intAry3[0][1] = 2;
		intAry3[0][2] = 3;
	
		intAry3[1][0] = 4;
		intAry3[1][1] = 5;
		intAry3[1][2] = 6;

		intAry3[2][0] = 7;
		intAry3[2][1] = 8;
		intAry3[2][2] = 9;
		
		//fo r문으로 2차원배열 출력
		for(int i=0; i<intAry3.length; i++) {
			for(int j=0; j<intAry3[i].length; j++) {
				System.out.print(intAry3[i][j]);
			}
			System.out.println();
		}
	
	}
	
	// Kim-Park-Choi-Han- 가 나옴
	public static String getString(String[] strary) {
		String result = "";
		for(int i=0; i<strary.length; i++) {
			result =  result + strary[i] + "-";			
		}
		return result;
	}
	
	public static String getString(String str1, String str2) {
		String result = str1 + " - " + str2;
		return result;
	}
	
	
	
	// 가장 큰값 받아오는 메소드
	public static int getLargeValue(int[] ary) {
		int maxValue = Integer.MIN_VALUE; //최소값 
		for(int i=0; i<ary.length; i++) {
			if(ary[i] >= maxValue ) {
				maxValue=ary[i];
			}
		}		
		return maxValue;
	}
	
	public static int getLargeValue(int a, int b, int c) {		
		int maxValue = Integer.MIN_VALUE; // a,b,c값을 비교
		if(a >= maxValue) 		
			return a;
		if(b >= maxValue) 		
			return b;
		if(c >= maxValue) 		
			return c;			
		return maxValue; 		
	}

}
