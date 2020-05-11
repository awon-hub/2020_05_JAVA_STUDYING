package com.ict.edu;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int count =0;
		while (true) {
			i+=1;
			System.out.print("숫자 입력 : ");
			int su = sc.nextInt();
			String result = " ";
			if (su % 2 == 0) {
				result = "짝수";
				count+=1;
			} else {
				result = "홀수";
			}
			System.out.println(result);
			System.out.print("계속할까요? 1. Yes / 2. No >>");
			int su1 = sc.nextInt();
			if (su1 == 2) break;
		
			
		}
		System.out.println("수고하셨습니다.");
		System.out.println("전체 반복횟수 : " + i +",  그 중 짝수 횟수는 " + count + "번");
		
		//총 몇번했고, 그중 짝수가 몇번 나왔냐
		
	}
}
