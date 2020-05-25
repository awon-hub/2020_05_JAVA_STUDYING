package com.ict.edu;
//Thread 클래스에는 start()메소드, run()메소드  -실행이 런. 가 존재한다.
//멀티스레드. 객체한 클래스엔 스타트. 상속받은앤 런. 
public class Ex03 extends Thread{
	
	public void go() {
		System.out.println(currentThread().getName() + ":  go() 메소드");//Thread.currentThread().getName()); 상속이므로 클래스 이름 안붙임. 
	}
	
	public void run() {
		System.out.println(currentThread().getName() + ":  run() 메소드");
		System.out.println(currentThread().getName() + ":  run() 메소드");
		System.out.println(currentThread().getName() + ":  run() 메소드");
		System.out.println(currentThread().getName() + ":  run() 메소드");
		System.out.println(currentThread().getName() + ":  run() 메소드");
		System.out.println(currentThread().getName() + ":  run() 메소드");
	}
	//담당일꾼이 생김 ( 메인이 올필요가 없음) 
	//
	
	
}
