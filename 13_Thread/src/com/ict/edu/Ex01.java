package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// 클래스 . 메소드. 메소드 호출.
		// 현재 실행중인 스레드. 그 스레드의 이름값 호출
		
		// 혼자 일하는 것을 싱글 스레드 라고 함.
		System.out.println(Thread.currentThread().getName());

		Ex02 test = new Ex02();
		test.play();
		System.out.println(1);
		String name = test.sound();
		System.out.println(name);
		System.out.println(2);

		System.out.println("===================");
		
		Ex03 test2 = new Ex03();
		System.out.println(Thread.currentThread().getName()+": 1");
		test2.go();
		System.out.println(Thread.currentThread().getName()+": 2");
		//test2.run(); 일반적인애.
	
		//반드시 스타트 에서 런으로 가야지 일꾼이 생김 
		
		test2.start(); //run ()메소드로 감. 
		System.out.println(Thread.currentThread().getName()+": 3");
		//먼저찍힘(멀티스레드일때) 싱글스레드일때는 나중에 찍힘.
	}
}
