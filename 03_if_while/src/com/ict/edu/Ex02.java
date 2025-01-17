package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// if ~ else : 조건식이 참일때와 거짓일때 각각 나눠서 처리한다.
		// 형식 : if (조건식){
		// 조건식이 참일때 실행 문장;
		// 조건식이 참일때 실행 문장;
		// } else {
		// 조건식이 거짓일때 실행 문장;
		// 조건식이 거짓일때 실행 문장;
		// }

		// int k2 60 이상이면 합격, 60미만은 불합격
		int k1 = 78;
		String str = "";
		if (k1 >= 60) {
			str = "합격";
		} else {
			str = "불합격";
		}
		System.out.println("결과 : " + str);

		// 홀수 짝수 판별
		int k2 = 42;
		if (k2 % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		System.out.println("결과 : " + str);

		// 대문자, 소문자 판별
		char k3 = 'q';
		if (k3 >= 'A' && k3 <= 'Z') {
			str = "대문자";
		} else {
			str = "소문자";
		}
		System.out.println("결과 : " + str);

		// 1또는 3이면 남자. 아니면 여자
		int k4 = 2;
		if (k4 == 1 || k4 == 3) {
			str = "남자";
		} else {
			str = "여자";
		}
		System.out.println("결과 : " + str);

		// 근무시간 8590 ,초과시 1.5 근무시간 10 얼마?

		int time = 10;
		int dan = 8590;
		int pay = 0;

		if (time > 8) {
			pay = (int) (8 * dan + (dan * 1.5) * (time - 8));
		} else {
			pay = time * dan;
		}

		System.out.println("결과 : " + pay + "원");

		// 두 수 중 큰 값을 출력하시오
		int k5 = 42;
		int k6 = 56;
		int result = 0;
		if (k5 > k6) {
			result = k5;
		} else {
			result = k6;
		}
		System.out.println("결과 : " + result);
	}
}
