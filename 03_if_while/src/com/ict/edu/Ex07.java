package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		//while 문 : for 문과 같은 반복문
		// 형식 : 
		//		초기식
		//      while(조건식){
		//		조건식이 참일 때 실행; 
		//		증감식;
		//		}
		//	while문 끝을 만나면 무조건 조건식으로 가라.
		
		// 형식 2 :
		//		초기식
		//      while(true){
		//		if ( 빠져나갈 조건) break;
		//		조건식이 참일 때 실행; 
		//		증감식;
		//		}
		//	while문 끝을 만나면 무조건 조건식으로 가라.
		
		// 0-10 까지 출력 (for 문)
		for (int i = 0; i < 11; i++) {
			System.out.print(i+ " "); // " " 띄어쓰기 ln 없으면 옆으로 찍힘
		}
		System.out.println();  // 다음줄로 넘어가라
	
		
		// 0-10 까지 출력 (while 문)
		int k1 = 0 ;
		while ( k1 < 11 ) { // 참일 때 하는것
			System.out.print(k1 + " ");
			k1++;
		}
		System.out.println();
		
		
		int k2 = 0;
		while (true) {
			if ( k2 >= 11 ) break; //거짓일때 찍는다.
			System.out.print(k2 + " " );
			k2++;
		}
		System.out.println();
		
		// 0 - 10 까지 짝수만 출력하기 
		
		int k3 = 0;
		while (	k3<11) {
			if (k3% 2 == 0) {
				System.out.print(k3 + " ");
			}
			k3++;
		}
		System.out.println();
			
			
		// 0 - 10 까지 홀수만 출력 
		
		int k4 = 0;
		while (k4<11) {
			if (k4%2==1) {
				System.out.print(k4 + " ");
			}
			k4++;
		}
		System.out.println();
		
		
		// 0 - 50 까지 7의 배수 출력
		
		int k5 = 0;
		while (k5 < 51) {
			if (k5%7==0) {
				System.out.print(k5 + " ");
			}
			k5++;
		}
		System.out.println();
		
		// a - g 까지 출력
		char i = 'a';
				while (i < 'h') {
					System.out.print(i + " ");	
					i++;
		}
		System.out.println();
		
		// 5단 출력 
		int k7 =1;
		while (k7<10) {
			System.out.println("5 * " + k7 + " = " + (5*k7));
			k7++;
		}
		System.out.println();
		
		
		// 0 0 0 0
		// 0 0 0 0 
		// 0 0 0 0 
		// 0 0 0 0 
		int k8 = 1;
		while (k8 < 5) {
			System.out.println("0 0 0 0");
			k8++;
		}	
		System.out.println();
		
		int k9 = 1;
		while (k9<17) {
			System.out.print("0 ");
			if (k9%4==0){
				System.out.println();
			}
			k9++;
		}
		
		
		// 숙제
		// 0-10누적합 (합계)
		// 0-10 홀수의 합계,
		// 0-10 짝수의 합계
		// 0-10 홀수, 짝수의 합계
		// 7!(7 * 6 * 5 * 4 * 3 * 2 * 1)
		
	}
}
