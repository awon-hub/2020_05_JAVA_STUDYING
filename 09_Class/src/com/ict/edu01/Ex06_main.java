package com.ict.edu01;

public class Ex06_main {
	public static void main(String[] args) {
		// 내부클래스 별도로 객체 생성 안됨
		//Inner01 in01 = new Inner01();
		
	 Ex06 e6 = new Ex06();
	 System.out.println(e6.name);
	 e6.sound();
	 
	 System.out.println("---------------------");
	 //1. 내부 클래스가 존재하는 메소드를 실행
	 e6.play();
	 // 내부 클래스가 존재하는 메소드 실행이 끝나면
	 // 내부 클래스 사용못함 
	 
	 System.out.println("외부메소드 끝: main");
	 //Member 내부클래스 만드는 방식으로 객체생성 못함
	// Ex06.Inner01 in01 = e6.new Inner01();
	 
	 
	 
	 
	 
	 
	}
}
