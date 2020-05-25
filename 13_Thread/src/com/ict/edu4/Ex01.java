package com.ict.edu4;
//데몬 스레드 : 일반 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드

//			  일반 스레드가 종료하면 데몬 스레드는 강제적으로 종료 됨 
public class Ex01 implements Runnable {
	boolean autoSave = false;

	@Override
	public void run() {
		while (true) {
			try {
				// 3초마다 대기상태
				Thread.sleep(1000 * 3);// 너 일초동안 쉬어*3 = 삼초이후에 실행해.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(1);
			}
		}
	

	

	public static void main(String[] args) {
		//start가 없어서 만들어야겠지?
		Ex01 e1 = new Ex01();
		Thread thread = new Thread(e1);
		//스타트와 객체 생성 사이에.
		thread.setDaemon(true);  //트루일때 데몬 스레드. 
		thread.start();
		
		for (int i = 1; i < 15; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("프로그램 종료");
	}
}
