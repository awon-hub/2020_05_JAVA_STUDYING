package com.ict.eud4;

// final : 종단, 끝의 의미
// final class => 상속 안됨 
// final method -> 오버라이딩이 안됨.
// final 변수 -> 값 변경안됨 = 상수 (대문자)


public class Animal {
	int eyes =2 ;
	int legs= 4;
	

	
	
	public void likes() {
	System.out.println("잠자기");	
	}
	
	public void sound() {
		System.out.println("울음소리");
	}

	
	public final void sleep() {
		System.out.println("6시간만 잠을 잔다.");
	}
}
