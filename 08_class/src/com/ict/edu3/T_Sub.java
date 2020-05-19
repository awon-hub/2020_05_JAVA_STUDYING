package com.ict.edu3;

public class T_Sub extends T_Super{
	String addr;
	int car;
	
	
	
	public T_Sub() {
		//super(); //1번예시
		this("서울 홍대입구");
		System.out.println("자식생성자1");
	}
	
	public T_Sub(String addr) {
		//super(); //2번예시
		this(2);
		this.addr = addr;
		System.out.println("자식생성자2");
	}
	
	public T_Sub(int car) {
		//super(); //3번예시
		this.car = car;
	}
	
	public T_Sub(String addr,int car) {
		this.addr = addr;
		this.car = car;
	}
	
	public T_Sub(int car,String addr) {
		this.car = car;
		this.addr = addr;
	}
	
}
