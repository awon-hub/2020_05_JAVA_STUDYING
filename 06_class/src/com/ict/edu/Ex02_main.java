package com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		//static 멤버 필드 호출
		 System.out.println(Ex02.COM); // 스테틱은 이렇게 호출 . 클래스.멤버필드.
		 System.out.println(Ex02.ENG);
		 
		 //static이 아니기 때문에 호출 못함
		// System.out.println(Ex02.kor); 오류
		// System.out.println(Ex02.math); 오류
		
		
		
		
		// Ex 02 클래스 객체 만들기
		// 클래스 이름 참조변수 = new 생성자();
		// Ex02에 생성자가 없으면 기본 생성자로 생성.
		Ex02 test = new Ex02();
		
		//멤버 필드 호출 ; 객체참조변수.멤버필드
		System.out.println(test.kor);
		System.out.println(test.ENG); // 옳은 방식 아님. 
		System.out.println(test.math);
		System.out.println(test.COM);
		
		
		System.out.println(test);
		
	}
}
