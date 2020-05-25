package com.ict.edu2;



public class TestMain {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() +"시작");
		
		Ex01 t1 =new Ex01();
		Ex02 t2 =new Ex02();
		Ex03 t3 =new Ex03();
		
		t1.start();
		t2.start();
		t3.start();
		
		//순서는 스케쥴에 의해 나온다.
		//스레드를 상속받은애가 런을 가지고 있고,
		// 객체생성한 클래스가 스타트를 가지고 있다.
		
		
		System.out.println(Thread.currentThread().getName() + "끝");
		
		
	}
}
