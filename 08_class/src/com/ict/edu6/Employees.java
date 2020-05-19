package com.ict.edu6;

public class Employees extends Person{

	private String dept;

	public Employees(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public void print(){
		System.out.print("이름 : " + super.getName() + ", 나이 : " + getAge() + ", 부서 : " + dept);
	}
	
	
	
	
}
