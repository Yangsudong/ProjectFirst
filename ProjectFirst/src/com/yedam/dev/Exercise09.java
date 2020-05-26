package com.yedam.dev;

import java.util.Scanner;
							//p.182 9번문제
public class Exercise09 {
	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null; //배열
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt(); //scanner.nextLine();
			
			//학생수(배열의 크기)를 넣는 과정이 1번
			if(selectNo == 1) {
				System.out.print("학생수를 입력하세요. > ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];	// ex 5를 넣으면 5개가들어갈수있는 배열이 생성			
				System.out.println("배열생성 되었습니다.");
			}
			//점수(각 배열에 들어갈 값)
			else if(selectNo == 2) {
				int i = 0;
				for(int score : scores) {       // 학생의 수만큼 값을 받아야하기때문에 반복문을 작성
				System.out.print("점수를 입력하세요. > ");
				score = scanner.nextInt(); 		//score = 점수
				scores[i++] = score;
				}
			}
			//점수 리스트 (사용자가 입력한 정수값을 출력)
			else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			}
			//분석(전체 점수의 합계와 평균)
			else if(selectNo == 4) {
				int sum = 0;					//점수를 더해서 값을 받을 변수
				int count = 0;					
				for(int score : scores) {
					sum += score;
					count++;					//반복문으로 인해 학생수 만큼 카운터가 됨
				}
				double avg = (double) sum / count;
				
				//최고점수 구하는 for문
				int maxValue = Integer.MIN_VALUE;
				for(int i=0; i<scores.length; i++) {
					if(scores[i] >= maxValue ) {
						maxValue=scores[i];
					}
				}						
				System.out.println("합계는 : " + sum);
				System.out.println("최고점수는 : " + maxValue);				
				System.out.printf("평균은 : " + "%.1f",avg);		//소수점 한자리까지 나타냄
				System.out.println();
				
			}
			//프로그램 종료
			else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	
	 
	}
}
