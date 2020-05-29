package com.yedam.classes.morning;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Code200529_1 {
	public static void main(String[] args) {
		int [] comAry = new int[9];
		Random random = new Random();
		int comNum = 0;
		int strike = 0;
		int counter = 0;
		boolean equl = true;
		
		int ball = 0;
		System.out.print("computer num : ");
		for(int i=0; i<9; i++) {
			comAry[i] = random.nextInt(9)+1;
			for(int j=0; j<i; j++) {
				if(comAry[i] == comAry[j]) {
					i--;
				}
			}		
		}
		for(int k=0; k<3; k++) {
			if(k==3) {
				comNum = comAry[k];
		}
			else {
				System.out.print(comAry[k] + " ");
			}
		}
		
		System.out.println("야구게임 시작");
		
		while(equl) {
		System.out.print("숫자을 입력하세요 : ");
		Scanner scn = new Scanner(System.in);
		
		int[] userAry = new int[3];
		for(int a=0; a<userAry.length; a++) {
			try {
			strike = scn.nextInt();
			userAry[a] = strike;
			if(strike > 0 || strike < 10) {
				System.out.println("1~9의 숫자입력");
			}
		}catch(Exception e) {
			System.out.println("숫자 범위가 아님");
		}
		for (int i=0; i<comAry.length; i++) { 
			for (int j=0; j<userAry.length; j++) { 
				if (comAry[i] == userAry[j] && i == j) { 
					strike++; 
				} 
				else if (comAry[i] == userAry[j] && i != j) // 
				{ 
					ball++; 
				} 
			}
		}
		
		System.out.println(strike + "스트라이크  " + ball + "볼"); 
		if (strike == 3){ 
		equl = false; 
		} 
		counter++; 
		}
		System.out.println("횟수 : " + counter); 
		System.out.println("게임 끝"); 
		
		}
	}
}

	
