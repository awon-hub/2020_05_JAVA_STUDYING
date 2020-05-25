package com.ict.edu3;

public class Ex01 implements Runnable {
	//Runnalbe 인터페이스는 추상 메소드 run()만 가지고 있다.
	
	//런만 가지고 있는 추상 메소드. 그래서 오버라이딩
	//implemnets를 더 많이 씀. 
	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName() + ": 1111111");
		}
	}
//일반 메소드가 생겨도 쓰레드가 넘어가서 일함 
}
