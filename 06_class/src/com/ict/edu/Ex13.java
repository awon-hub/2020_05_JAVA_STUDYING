package com.ict.edu;

public class Ex13 {
	// this 와 this ()
	// this : 객체 내부에서 객체 자신을 지칭하는 예약어
	// 지역 변수와 전역 변수의 이름이 같을 때 전역변수에 this
	// 붙여서 전역변수임을 나타낸다.

	// this() : 객체의 생성자를 지칭하는 예약어
	// 반드시 생성자!!의 첫번째 줄에 와야한다. 순환 ㄴㄴ
	// 목적: 생성자에서 다른 생성자를 호출 할 때
	
	String name = "고길동";
	int age = 37;

	// 생성자
	public Ex13() {
		//System.out.println("기본 생성자 : " + this);
		this("마이콜" , 47); //생성자가 생성자 호출
	}

	public Ex13(String name) {
		this.name = name;
	}

	public Ex13(int age) {
		this.age = age;
	}

	public Ex13(String name, int age) {
		this(24);
		this.name = name;
		this.age = age;

	}

	// GETTER SETTER

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// GETTER SETTER

}
