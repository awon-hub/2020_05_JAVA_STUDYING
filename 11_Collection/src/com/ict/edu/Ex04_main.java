package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		Ex04[] arr = new Ex04[5];

		for (int i = 0; i < arr.length; i++) {
			HashSet<Ex04> person = new HashSet<Ex04>();
			System.out.print("이름을 입력해주세요: ");
			String name = sc.next();
			System.out.print("국어점수를 입력해주세요: ");
			int kor = sc.nextInt();
			System.out.print("영어점수를 입력해주세요: ");
			int eng = sc.nextInt();
			System.out.print("수학점수를 입력해주세요: ");
			int math = sc.nextInt();

			
		

		/*for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() < arr[i].getSum()) {
					arr[i].setRank(arr[i].getRank() + 1);
				}*/

				Iterator<Ex04> it1 = person.iterator();
				while (it1.hasNext()) {
					Ex04 res = (Ex04) it1.next();
					System.out.println(res);
				}
				System.out.println();

			}
		}
	}
