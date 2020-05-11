package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = " ";
		int kor = 0;
		int math = 0;
		int eng = 0;
		
			
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		System.out.print("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		math = sc.nextInt();

		int sum = kor + eng + math;
		double avg = (sum / 3);
		String score = " ";
		if (avg >= 90) {
			score = "A";
		} else if (avg >= 80) {
			score = "B";
		} else if(avg >= 70) {
			score = "C";
			} else score = "F";

			System.out.println("이름 : " + name);
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("학점 : " + score);
		
		
		
	}
}
