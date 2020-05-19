package com.ict.eud5;

public abstract class Animal {
	// 추상 클래스 : 추상메소드를 가지고 있는 클래스를 추상 클래스라고 한다.
	// 일반적인 멤버필드와 멤버메소드를 가지고 있을 수 있다.

	// 추상 메소드 : body({실행내용})가 없는 메소드를 추상 메소드라고 한다.
	// 반드시 abstract 예약어를 사용해아한다.

	// 일반 멤버필드
	int su1 = 10; // 인스턴스 변수
	static int su2 = 20; // static 변수
	final int SU3 = 30; // 인스턴스 상수
	static final int SU4 = 40; // static 상수

	// 일반 메소드
	public void play() {
		su1++;
		su2++;
		// SU3++; //상수는 값 변경이 안된다.
		// SU4++;

	}

	// static 메소드
	public static void prn() {
		int k1 = 100;
		// static int k2 = 200; // 지역변수 static 사용할 수 없다.
		// System.out.println(su1); //static 메소드는 전역변수에서 static 만 사용가능.
		System.out.println(su2);
		// System.out.println(SU3);
		System.out.println(SU4);
	}

	
	public abstract void like(); // 추상메소드, 추상메소드는 반드시 abstract 붙여야 한다.
	//문제는 추상메소드를 상속받을 때.
}
