package com.ict.edu2;

public class Ex01 extends Thread {

	// 부모 메소드를 그냥 가지고 와서 오버라이드.
	@Override
	public void run() {
		for (int i = 0; i <50; i++) {
			System.out.println(Thread.currentThread().getName()+" : 1111111");
		}
			
		
	}

}
