package com.ict.edu;

import java.util.Scanner;

public class Ex12_main {
	public static void main(String[] args) {

		{
			// 5명의 이름, 국어, 영어, 수학을 입력받아서
			// 이름 총점 평균 학점 순위를 구하고 정렬.

			Scanner sc = new Scanner(System.in);

			Ex12[] arr = new Ex12[5];

			for (int i = 0; i < arr.length; i++) {

				System.out.print("이름을 입력해주세요: ");
				String name = sc.next();

				System.out.print("국어점수를 입력해주세요: ");
				int kor = sc.nextInt();

				System.out.print("영어점수를 입력해주세요: ");
				int eng = sc.nextInt();

				System.out.print("수학점수를 입력해주세요: ");
				int math = sc.nextInt();

				// ex10이 처리와 저장을 같이하지만
				// 처리와 저장을 별도로 할때는 많이 사용된다.

				int sum = kor + eng + math;

				double avg = (int) (sum / 3.0 * 10) / 10.0;

				String score = "";
				if (avg >= 90) {
					score = "A";
				} else if (avg >= 80) {
					score = "B";
				} else if (avg >= 70) {
					score = "C";
				} else {
					score = "F";
				}

				Ex12 person = new Ex12(name, sum, avg, score, 1);
				arr[i] = person;

			}

			// 순위는 다비교. 정렬은 한번만.

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i].getSum() < arr[i].getSum()) {
						arr[i].setRank(arr[i].getRank() + 1);
						// k++ 하면안됌
					}
				}
			}
			// 정렬
			// 임시 저장 클래스

			Ex12 temp = new Ex12();

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i].getRank() > arr[i].getRank()) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}

			// 출력
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i].getName());
				System.out.print(arr[i].getSum());
				System.out.print(arr[i].getAvg());
				System.out.print(arr[i].getScore());
				System.out.println(arr[i].getRank());
			}

		}
	}
}
