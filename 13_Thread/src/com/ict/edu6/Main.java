package com.ict.edu6;

public class Main {
	public static void main(String[] args) {
		
		//세개를 다 객체생성하자! 
		Car c = new Car();
		Producer producer = new Producer(c);
		Thread tProducer = new Thread(producer);
		Customer customer = new Customer(c);
		
		Thread tCustomer = new Thread (customer);
		tProducer.start();
		tCustomer.start();
		
		//new Thread(customer).star();
		//new Thread(producer).star();
		
		
		//여러가지 일을 동시에 할때 : 스레드 처리. (무조건 하는게 아님)
		//메인이 더 빠를 수도 있음 
		//통신 , io, start run / 어 막돌아가네? 동기화 syn. 어 다돌때까지 안도네? 자라! 웨잇. 깨라!   노티파이. 
		// 스타트는 쓰레드 이용해서 만들고, 런은 런에이블을 상속. 
		//런 으로 가는 순간 스레드생성. 알아서 처리.
	}
}
