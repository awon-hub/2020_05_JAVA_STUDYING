package com.ict.eud5;

public class Dog extends Animal{
	// 아예 메소드 이름과, 인자가 정해져있어 (상속으로)
	@Override
	public void like() {
		System.out.println("늦잠 자기");
	}

}
