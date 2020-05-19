package com.ict.edu3;

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
	
	public void print(){
		super.print();
		System.out.print(", 부서 : " + dept);
	}
	
	
	
	
}
