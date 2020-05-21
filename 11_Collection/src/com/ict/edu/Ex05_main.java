package com.ict.edu;

import java.util.HashSet;
import java.util.Scanner;

public class Ex05_main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashSet<Ex05> person = new HashSet<Ex05>();

		// for (int i = 0; i < 5; i++) {
		while (true) {
			Ex05 p = new Ex05(); // 돌때 마다 객체 생성되어야함.

			System.out.print("이름을 입력해주세요: ");
			String name = sc.next();
			System.out.print("국어점수를 입력해주세요: ");
			int kor = sc.nextInt();
			System.out.print("영어점수를 입력해주세요: ");
			int eng = sc.nextInt();
			System.out.print("수학점수를 입력해주세요: ");
			int math = sc.nextInt();

			p.setName(name);
			p.s_sum(kor, eng, math);

			person.add(p);

			System.out.println("계속할까요?(y/n)");
			String str = sc.next();
			if (str.equalsIgnoreCase("n")) break; // 대소문자 상관없음.

		}
		
		//순위
		
		for (Ex05 k : person) {
			for (Ex05 j : person) {
				if (k.getSum() < j.getSum()) {
					k.setRank(k.getRank()+1);
				}
			}
		}
		
		
		
		//출력
		
		for (Ex05 k : person) {
			System.out.print(k.getName()+"  ");
			System.out.print(k.getSum()+"  ");
			System.out.print(k.getAvg()+"  ");
			System.out.print(k.getHak()+"  ");
			System.out.println(k.getRank()+"  ");
		}
		
		//정렬은 안한다. 
		
		
	}

}