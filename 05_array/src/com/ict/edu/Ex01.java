package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// 배열 : 같은 자료형의 데이터들을 한 곳에 모아둔 묶음
		// 반드시 같은 자료형이어야 한다.
		// 생성할 때 크기를 지정하고, 지정된 크기는 변경 불가
		// 배열을 출력할 때는 일반적으로 for문 사용한다.

		// 배열 생성 순서 : 선언 > 생성 > 데이터 저장
		// 1. 선언 : 자료형[] 이름;
		// 자료형 이름 [] ;

		int[] su;

		// 2. 생성 : 이름 = new 자료형 [배열의크기 = 방의 수 = 1 부터 시작];
		// new 는 예약어 메모리에 데이터를 저장할 공간을 만들어라
		// => 인스턴스, 객체생성
		su = new int[4];

		// 3. 데이터 저장 : 이름[방번호 = index = 인덱스 = 0부터 시작] = 저자앟ㄹ 데이ㅓ
		// 이때 자료형은 같아야 한다. (단, 작은 자료형은 큰 자료형에 저장가능)
		su[0] = 100;
		su[1] = 200;
		su[2] = 'a';
		// su[3] = 3.14; 큰 자료형은 작은 자료형에 저장할 수 없다.
		su[3] = 300;
		su[1] = 100; // 데이터 중복가능, 현재 데이터가 있어도 저장 가능.
		// su[4] = 500; 오류가 발견 안됨. 실행에서 오류뜸. 방의 크기를 벗어나면 실행시 오류.

		// 배열의 주소가 출력된다.
		System.out.println(su);
		
		//배열안에 있는 데이터 출력하기
		 System.out.println(su[0]);
		 System.out.println(su[1]);
		 System.out.println(su[2]);
		 System.out.println(su[3]);
		
		System.out.println("====================================================");
		//for 문안 i < 4 에서 4는 배열의 크기를 말한다.  
		
		
		for (int i = 0;  i < 4; i++) {
			 System.out.println(su[i]);
			 if (i==2) {
				System.out.println((char)(su[i]));
			}
		}	 
		// su. length > 배열 su의 길이 (크기)	 
		for (int i = 0; i < su.length; i++) {
			 System.out.println(su[i]);
		}
		
		// 개선된 for 문 : 주로 배열이나 컬렉션에 사용된다.
		// 배열 전체에 대해서 정보 가공을 할 수 있으나 개별로는 가공할 수 없다. 
		//for each
		for (int k : su) {
			System.out.println(k);
			
		}
		
		
			 
		
			
		}
		 
		 
		 
	}

