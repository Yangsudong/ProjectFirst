package com.yedam.classes.morning;

import java.util.Scanner;

public class Code200529 {
	public static void main(String[] args) {
		int com[] = new int[3]; // 컴퓨터의 배열 3개
		int user[] = new int[3]; // 사용자의 배열 3개
		int num = 0;
		int counter = 0;

		boolean randomball = true;

		while (randomball) {
			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * 9) + 1;
			}
			// 중복제거
			if (com[0] != com[1] && com[0] != com[2] && com[1] != com[2])

			{
				randomball = false;
			}
		}
		randomball = true;

		System.out.println("야구게임 시작");
		while (randomball) {
			int strike = 0;
			int ball = 0;
			System.out.print("숫자를 입력하세요");
			Scanner scn = new Scanner(System.in);

			for (int i = 0; i < user.length; i++) {
				try {
					num = scn.nextInt();
					user[i] = num;
					if (num > 10 || num < 0) {
						System.out.print("1~9의 숫자를 입력하세요");
					}
				} catch (Exception e) {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
			// 컴퓨터배열(숫자)과 사용자배열(숫자)을 비교함
			for (int i = 0; i < com.length; i++) {
				for (int j = 0; j < user.length; j++) {
					// 배열이(숫자)같고 위치까지 같으면 스트라이크
					if (com[i] == user[j] && i == j) {
						strike++;
					} else if (com[i] == user[j] && i != j) // 배열이(숫자)같고 위치가 다르면 볼
					{
						ball++;
					}

				}
			}
			System.out.println("스트라이크  : "+ strike + "\n" + "볼 : " + ball);
			// 스트라이크가 세개는 맞췄다는 뜻이니깐 빠져나갈 수 있도록
			if (strike == 3) {
				randomball = false;
			}
			counter++;
		}
		System.out.println("횟수 : " + counter);
		System.out.println("게임 끝");

	}
}
