package com.yedam.classes;

public class Gugudan {
	public static void main(String[] args) {
		//구구단 가로출력		
		//단출력하기위한 for문
		for(int i=2; i<=9; i++) {
			System.out.print(i+"단"+"\t"+"\t");
		}
		System.out.println();
		//가로로 2*1 3*1 4*1 ~ 9*1 순으로 하기 위한 for문
		for(int i=1; i<=9; i++){			
            for(int j=2; j<=9; j++){              	
                System.out.print(j + " X "+ i + " = " + (j*i) + "\t");                
            }System.out.println();
        }
		
		
    }
}
