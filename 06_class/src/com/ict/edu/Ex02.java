package com.ict.edu;

public class Ex02 {
	//멤버필드 : 상태값, 속성, 특징, 데이터
	// instance 필드(객체생성할때생성), static 필드 (객체생성과 상관없이 먼저 생성 - static 이라 붙여야함)
	// 객체 생성 유무
	// final > 상수 없으면 변수
	int kor = 80 ; 				//인스턴스 변수 (계속 쓰던거)
	static int ENG = 85; 		//static 변수 
	final int math = 90; 		//인스턴스 상수
	final static int COM = 95 ; //static 상수 (일반적 상수)
	
	//데이터의 자료의 형태. 
	
	//변수와 상수의 차이
	//메소드 : 기능, 동작
	//메소드 구성 : 접근제한자 메소드종류 반환형 메소드이름 ({인자]){실행내용} 
	//void는 되돌아갈 때 결과가 없다. 
	
	public void prn() {
		//변수이기 때문에 변경가능
		kor = kor +10;
		ENG = ENG +10;
		//상수이기 때문에 오류
		//math = math +10;
		//COM = COM +10;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
