package com.ict.edu;


import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		// 5명의 이름, 국어, 영어, 수학을 입력받아서
		// 이름 총점 평균 학점 순위를 구하고 정렬.

		Scanner sc = new Scanner(System.in);

		Ex09[] arr = new Ex09[5];

		for (int i = 0; i < arr.length; i++) {
			Ex09 person = new Ex09();

			System.out.print("이름을 입력해주세요: ");
			person.setName(sc.next());
			System.out.print("국어점수를 입력해주세요: ");
			int kor = sc.nextInt();
			System.out.print("영어점수를 입력해주세요: ");
			int eng = sc.nextInt();
			System.out.print("수학점수를 입력해주세요: ");
			int math = sc.nextInt();

			person.s_sum(kor, eng, math);
			//person.s_avg();
			//person.s_score();

			arr[i] = person;

		}

		// 순위는 다비교. 정렬은 한번만.
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].getSum() < arr[i].getSum()) {
					arr[i].setRank(arr[i].getRank()+1);
							  //k++  하면안됌	
				}
			}
		}
		//정렬		
		//임시 저장 클래스
		
		Ex09 temp = new Ex09();
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getRank() > arr[i].getRank()) {
					temp = arr[i];
					arr[i] = arr [j];
					arr[j] = temp;
				}
			}
		}
				
				
			
	
		
		
		
		//출력
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i].getName());
				System.out.print(arr[i].getSum());
				System.out.print(arr[i].getAvg());
				System.out.print(arr[i].getScore());
				System.out.println(arr[i].getRank());
			}
		
		
		
	}

}
