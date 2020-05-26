package com.ict.edu6;

public class Customer implements Runnable {

	private Car car; // 클래스를 자료형으로 사용하고 있다. 

	//생성자에서 받은 인자를 전역변수로 변경시킨다. 기본법칙. 
	//나한테 없는거, 외부에서 받아서 쓰는게 인자인데 받아쓰낟. 
	public Customer(Car car) { // 생성자에서 인자가 있으면, 무조건 전역변수로 빼줘야한다.
		this.car = car;

	}

	public void run() {
		String carName = null;
		for (int i = 0; i < 50; i++) {
			carName = car.pop();
			try {
				Thread.sleep((int) (Math.random() * 200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
