package com.ict.edu6;

public class Student extends Person {
	private int id;

//public Student() {
	// super() 오류 난 이유
//}
	// public Student() {
	// super("우아원",26); // 오류아님
	// Person 클래스에 기본생성자 만들어도 오류 아님.
	// }

	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void print() {
		System.out.println("이름 : " + super.getName() + ", 나이 : " + getAge() + ", 학번 : " + id); // private이어도 같은 곳이라서
																								// 상관없음.
	}

}
