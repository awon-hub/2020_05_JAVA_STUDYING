package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
		
		// for 문: 정해진 규칙에 따라 실행문을 반복 처리하는 문
		// for (초기식; 조건식;증감식){
		//		조건식이 참일 때 실행할 문장;
		// }		
		// for 문은 무조건 초기식부터 시작한다.
		// 그후 조건식으로 이동.
		// 조건식은 boolean형(블린, 비교연산, 논리연산)
		// 조건식이 참이면 for 문 안쪽 블록 실행.
		// 조건식이 거짓이면, for 문을 실행하지 않는다.
		
		// for문의 끝을 만나면, 무조건 증감식으로 간다.
		// 증감식은 초기식을 증가하거나 감소시킨다.
		// 다시 조건식으로 간다.

		//초기식=> 조건식=> 블럭끝=> 증감식=> 조건식=> 블럭끝 => 증감식
		// 자바에서는 if문, switch문, for문 안에서 만든 변수는
		// 밖에서 사용할 수 없다.  "지역변수"
		
		// 안녕하세요 열번 출력
		
		//++i 이면 2인 상태로 2로 int에 다시 대입
		//  i++ 1임  int 에 2로 대입.  
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i + "= Hello");
		}

		// 0-10 까지 출력 i 는 for에서 변하는 값이구나~
		
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}	
		
		
		// 0-10 까지 짝수만 출력
		
		for (int i = 0; i < 11; i = i+2) {
			System.out.println(i);		
		}
		
		// 0-10 까지 짝수만 출력 #2
		
		for (int i = 0; i < 11; i++) {
			if (i%2==0) {System.out.println(i);}		
		}
		for (int i = 0; i < 11; i++) {
			if (i%2==1) {System.out.println(i);}		
		}
		
		
		
		
		
		
	}
}
