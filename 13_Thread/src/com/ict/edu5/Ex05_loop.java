package com.ict.edu5;

// 두개의 스레드를 생성하여 첫번째 스레드의 출력을 1~50까지 출력하고
// 두번째 스레드의 출력을 51~ 100까지 출력하고
// 다시 첫번째 스레드가 101~150까지 출력
// 다시 두번째 스레드가 151~ 200
public class Ex05_loop implements Runnable {
	int x = 0;

	@Override
	public synchronized void run() {
		for (;;) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + ": " + ++x);
				if (x % 2 == 0) {

					wait();

				} else {
					notify();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {
		Ex05_loop t = new Ex05_loop();

		new Thread(t, "tiger").start();
		new Thread(t, "lion").start();

	}

}
