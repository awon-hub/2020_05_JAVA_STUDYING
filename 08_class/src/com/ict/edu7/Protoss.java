package com.ict.edu7;
//unit이 추상 클래스이기 때문에

//일반클래스인 Protoss는 반드시 오버라이딩

public class Protoss extends Unit {
	String name;
	int energy;
	boolean fly;

	public Protoss() {
	}

	public Protoss(String name, int energy, boolean fly) {
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}

	@Override
	public void decEnergy() {
		energy = energy - 2;

	}

}
