package com.ict.edu6;

public class Producer implements Runnable {
	private Car car;

	public Producer(Car car) {
		this.car = car;
//Car 클래스에서 뭔가를 가져오겠어. 
	}

	public void run() {
		String carName = null;
		for (int i = 0; i < 50; i++) {
			//생산 메소드실행!
			carName = car.getCar();  //이거 쓰려고. 
			
			//창고에 넣는 메소드 실행!
			car.push(carName);
			try {
				Thread.sleep((int) (Math.random() * 300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
