package com.ict.edu;

public class Ex10 {
	public static void main(String[] args) {
		
		// break 와 continue 
		// break : 현재 위치의 블록를 탈출할 때 사용하는 예약어
		// continue : continue문 이하 수행문을 포기하고 다음 회차로 진행하는 예약어
					 // continue문 이하 수행문을 포기하고 증감식으로 간다.      
		
		
		// break , continue 둘다 보통 if 문과 함께 사용된다
		
		
		
		// 1 - 10 까지 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i +"\t");
		}
		System.out.println();
		
		
		// i 가 6 일때 break;
		for (int i = 1; i < 11; i++) {
			if (i==6) break;
			System.out.print(i +"\t");
		}
		System.out.println();
		
		// i 가 6 일때 continue;
		for (int i = 1; i < 11; i++) {
			if (i==6) continue;
			System.out.print(i +"\t");
		}
		System.out.println();	
		
		// 0 부터 10 까지 짝수출력 (기존)
		
		for (int i = 0; i < 11; i++) {
			if (i%2==0)
			System.out.print(i+ " ");
		}
		System.out.println();	
		
		
		// 0 부터 10 까지 짝수출력 (홀수를 스킵하자)
		
		for (int i = 0; i < 11; i++) {
			if (i%2==1) continue;
			System.out.print(i+ " ");
		}
		System.out.println();		
		
		
		// 0 부터 10 까지 짝수출력 (홀수를 스킵하자)
		
		
		
		
		
		
		
		
		
		
		
	}
}
