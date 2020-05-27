package com.ict.edu06;

import java.io.Serializable;

//VO: 객체의 정보를 담당하는 클래스
//Serializable 인터페이스를 사용해서 직렬화 할 수 있다.
//직렬화 제외시키는방법! :변수 앞에 transient 예약어를 사용 (제외시키겠다. 비공개다 ㅎ 대신 기본값이 들어감)
public class VO implements Serializable{
	private String name;
	private int age;
	transient private double weight;
	private boolean gender;

	public VO() {}
	
// 컨스트럭터 유징 필드
	public VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}

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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	
	
}
