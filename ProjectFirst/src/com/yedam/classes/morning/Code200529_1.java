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
	}
}

	
