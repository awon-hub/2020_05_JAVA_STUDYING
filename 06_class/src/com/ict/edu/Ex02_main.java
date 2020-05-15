package com.ict.edu;

import java.util.Random;

public class Ex02_main {
	public static void main(String[] args) {
		//static 멤버 필드 호출
		 System.out.println(Ex02.COM); // 스테틱은 이렇게 호출 . 클래스.멤버필드.
		 System.out.println(Ex02.ENG);
		 
		 //static이 아니기 때문에 호출 못함
		// System.out.println(Ex02.kor); 오류
		// System.out.println(Ex02.math); 오류
		
		
		
		
		// Ex02 클래스 객체 만들기
		// 클래스 이름 참조변수 = new 생성자();
		// Ex02에 생성자가 없으면 기본 생성자로 생성.
		Ex02 test = new Ex02();
		
		//멤버 필드 호출 ; 객체참조변수.멤버필드
		System.out.println(test.kor);
		System.out.println(test.ENG); // 옳은 방식 아님. 
		System.out.println(test.math);
		System.out.println(test.COM);
		
		
		System.out.println(test);
		System.out.println("====================================================");
		
		//API를 이용해서 static 메소드와 인스턴스 메소드를 호출해보기
		//API 제공 Random 클래스의 nextInt(), nextInt(int n),nextDouble()
		//nextInt(), nextInt(int n),nextDouble()는 static이 아님
		//클래스를 객체로 만들어서 사용해야함.
		
		
		//1. 클래스를 객체로 만드는 방법. 
		//	클래스 참조변수  = new 생성자
		Random ran = new Random();
		int res = ran.nextInt();
		System.out.println(res);
		
		System.out.println("------------------");
		// nextInt(숫자) :반환값 (0~ 숫자전까지)
		res = ran.nextInt(6); //0~5까지
		System.out.println(res);
		
		// 정해지지 않은 0.0 ~1.0 미만의 실수(소수점 한자리가 아님)
		double res2 = ran.nextDouble();
		System.out.println(res2);
		System.out.println("-----------------");
		
		// res2 0 ~5 까지의 정수로 표현하자
		//난수 굿.
		System.out.println((int)(res2*6));
		
		
		//API 제공 static 메소드 사용하기
		//Math 클래스 메소드들은 static임으로 객체 생성없이 사용가능
		//-호출방법: 클래스이름.멤버필드, 클래스이름.멤버메소드
		
		
		System.out.println(Math.random());//0.0이상 ~1.0 미만
		
		//원하는 정수로 정해지지 않은 수 지정.
		System.out.println((int)(Math.random()*6)); // 0~5까지
		
		
		
	}
}
