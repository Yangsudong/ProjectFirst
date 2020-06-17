package com.yedam.classes.morning;

import java.util.Random;

public class Code20200617 {
	public static void main(String[] args) {
		int [] num = new int[11];
		Random random = new Random();
		
		for(int i=0; i<num.length; i++) {
			num[i] = random.nextInt(num.length)+1;
			for(int j=0; j<i; j++) {
				if(num[i] == num[j]) {
					i--;
				}
			}		
		}
		for(int k=0; k<num.length; k++) {
			if(k==num.length) {
		}
			else {
				System.out.print(num[k] + " ");
			}
		}		
	}
}

	
