package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// 이름 국어 영어 수학정보
		// 이름 총점 평균(소수점 첫째자리) 학점 출력
		Scanner sc = new Scanner(System.in);

	

		esc: while (true) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			System.out.print("국어 점수를 입력하세요 : ");
			int kor = sc.nextInt();
			System.out.print("영어 점수를 입력하세요 : ");
			int eng = sc.nextInt();
			System.out.print("수학 점수를 입력하세요 : ");
			int math = sc.nextInt();

			int sum = kor + eng + math;
			double avg = (int)(sum / 3.0*10)/10.0;
			String score = " ";
			if (avg >= 90) {
				score = "A";
			} else if (avg >= 80) {
				score = "B";
			} else if (avg >= 70) {
				score = "C";
			} else {
				score = "F";
			}
			
			System.out.println("이름 : " + name);
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("학점 : " + score);

			while (true) {
				System.out.println("계속할까요? (1.예/2.아니요)>>");
			int ans = sc.nextInt();
			if (ans == 1) {
				continue esc;
			} else if (ans == 2) {
				break esc;
			} else {
				System.out.println("다시 입력하세요.");
				continue;
			}
			
		}
	}
		System.out.println("수고하셨습니다.");
}
}