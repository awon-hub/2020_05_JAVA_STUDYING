package com.ict.edu01;

//열거형 (enum): 상수를 하나의 객체로 인식하고, 여러개의 상수객체들을 한 곳 에 모아둔
//				 하나의 묶음(객체)
public class Ex01 {
	static final int JAVA = 200; // 상수
	static final int HTML = 1000;

	public enum Lesson {
		// static final ( 상수)의 집합
		JAVA, JSP, SPRING, ANDRIOD, HTML // ,1000 오류

	}

	public static void main(String[] args) {
		// enum에서 한개 추출
		Lesson s1 = Lesson.JAVA;
		System.out.println(s1); // 객체
		System.out.println(Ex01.JAVA); // 데이터
		System.out.println(Ex01.HTML); // 데이터 1000
		System.out.println(Lesson.HTML); // 객체

		System.out.println("==================================");
		// 한번에 추출
		Lesson[] items = Lesson.values();
		//ordinal : index()
		for (Lesson k : items) {
			System.out.println(k + " : "+k.ordinal());
		}
		
	}
}
