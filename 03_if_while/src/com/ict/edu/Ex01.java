package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// 단순 if : 조건식이 참일때만 실행, 거짓일 때는 if문 무시
		// 조건식 : boolean, 비교연산, 논리연산
		// 형식 : if (조건식) {
		// 조건식이 참일때 실행 문장;
		// 조건식이 참일때 실행 문장;
		// }
		// 단, 실행문장이 한 줄 일 때는 {} 생략 가능

		// int k1 >60 이상이면 합격.

		int k1 = 59;
		String str = "초기값";
		if (k1 >= 60) {
			str = "합격";
		}
		System.out.println("결과 : " + str);
		// 거짓이면 "초기값" 이라고 나옴.
		// 그냥 무시해버림.

		// int k2 >60 이상이면 합격, 60미만은 불합격

		int k2 = 59;
		str = "초기값";
		if (k2 >= 60) {
			str = "합격";
		}
		if (k2 < 60) {
			str = "불합격";
		}
		System.out.println("결과 : " + str);

		// 이렇게 안씀

		int k3 = 59;
		str = "불합격";
		if (k3 >= 60) {
			str = "합격";
		}
		System.out.println("결과 : " + str);

		// 애초에 프리셋을 불합격으로 해놓음.

		// 홀수 짝수 판별
		int k4 = 7;
		str = "홀수";
		if (k4 % 2 == 0) {
			str = "짝수";
		}
		System.out.println("결과 : " + str);

		// 대문자, 소문자 판별
		char k5 = 'G';
		str = "대문자";
		if (k5 >= 'a' && k5 <= 'z') {
			str = "소문자";
		}
		System.out.println("결과 : " + str);

		// 1또는 3이면 남자. 아니면 여자

		int k6 = 1;
		str = "여자";
		if (k6 == 1 || k6 == 3) {
			str = "남자";
		}
		System.out.println("결과 : " + str);

		// 근무시간 8590 ,초과시 1.5 근무시간 10 얼마?/

		int time = 10;
		int dan = 8590;
		int pay = time*dan;

		if (time > 8) {
			pay = (int) (8 * dan + (dan * 1.5) * (time - 8));
		}
		System.out.println("결과 : " + pay + "원");

		// 두 수 중 큰 값을 출력하시오
		int k7 = 10;
		int k8 = 15;
		int result = 0;
		
		if (k7>k8) 
			System.out.println("결과 : " + k7 );
		
		if (k7<k8) 
			System.out.println("결과 : " + k8);	
	
	
		// 풀이 두 수 중 큰 값을 출력하시오
		int k9 = 10;
		int k10 = 15;
		int result1 = k10;
		
		if (k9>k10) {
			result1 = k9;
		}
			System.out.println("결과 : " + result1);
			
	
	
	
	
	
	}
}
