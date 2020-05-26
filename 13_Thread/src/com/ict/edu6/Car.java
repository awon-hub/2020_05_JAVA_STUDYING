package com.ict.edu6;

import java.util.*;

public class Car {
	private List<String> carList = null; //List 컬렉션.  인터페이스니까    아직 아무것도 없죠.

	public Car() {    // 생성자. 					/ 객체생성 못해서
		carList = new ArrayList<String>();				// 부모자식 만들었어요. 

	}

	
	//랜덤으로 자동차 생산하기 
	//메소드로 만들었죠
	public String getCar() { 
		String carName = null;
		switch ((int) (Math.random() * 3)) {  // 0 1 2 세가지 나옴.
		case 0:
			carName = "SM5";
			break;
		case 1:
			carName = "매그너스";
			break;
		case 2:
			carName = "카렌스";
			break;
		}
		return carName;    // 실행할때마다 랜덤으로 숫자가 나오고 이름이 값이 리턴 (자동차가 생성된다)
	}
	//	소비자가 자동차 판매하는 메소드 
	public synchronized String pop() {
		String carName = null;
		//재고가 없을때는 판매를 멈춰라 
		if (carList.size() == 0)      // 자동차 창고의 크기가 0이면, 재고가 없다. 
			try {
				System.out.println("차가 없습니다. 생산 할 때 까지 기다리세요");
				this.wait(); //아무것도 없으면 재우잖아.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		//맨 나중에 생성된 애가 가지고 온다. -1 (최근에 만들어진애를 판다) 
		//재고가 있을 때는 가장 나중에 들어간 차를 삭제( 판매)
		carName = (String) carList.remove(carList.size() - 1);
		System.out.println("손님이 차를 사갔습니다.. 손님이 구입한 차 이름은 => " + carName + "\t");

		return carName;
	}
	//자동차 창고에 차넣기.
	public synchronized void push(String car) {
		//받은 car를 자동차 창고(carList)에 넣기 
		carList.add(car);
		System.out.println("차가 만들어졌습니다. 차이름은 " + car + "입니다. ");
		//재고가 없을 때 wait()된 스레드 다시 실행시키기. 
		if (carList.size() == 5)
			this.notify();
	}

}
