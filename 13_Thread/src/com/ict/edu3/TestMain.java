package com.ict.edu3;

public class TestMain {
	public static void main(String[] args) {
		Ex01 testA = new Ex01();
		Ex02 testB = new Ex02();
	// 스타트가 없음.
	// testA, testB는 Runnable 을 가지고 구현했으므로,
	// start() 메소드가 없다.
	//start() -> run() 으로 가지 않으면 스레드 처리가 아니다.
	//무조건 start를 만들어서 런에게 줘야하는데?
	//testA.run() 이거 메인이 처리해서 아님.
		
		//start()는 Thread클래스가 가지고 있음.
		//Thread 클래스를 활용해야 한다.
		
		
		//방법 1. Runnable 을 상속받은 객체를 Thread 생성자에 넣어준다. 
		Thread thread = new Thread(testA);
		thread.start();
		
		new Thread(testB).start();
		
		
		// 방법2 : 안드로이드에서 사용하는 방법 (익명 내부 클래스)
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName()+"가가가가가가");
				}
			}
		}).start();
		
		
		
	}
}
