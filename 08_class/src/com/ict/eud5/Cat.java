package com.ict.eud5;

//  tiger클래스가 있긴하지만 그냥 추상클래스로 body를 완성하지 않음
// tiger을 상속받은 Cat은 tiger가 완성하지 않은 body 완성.
class Cat extends Tiger {

	@Override
	public void like() {
		System.out.println("그루밍 하기 ");
	}

}

//class Cat2 extends Tiger2 { // 얘도 abstract 하거나, 오버라이드를 animal 꺼, tiger2꺼 두번 해주기.
class Cat2 extends Tiger2 { //일반클래스를 만나면 오버라이딩을 해야함 

	@Override
	public void like() {
		System.out.println("그루밍 하기 ");
	}

	@Override
	public void sleep() {
		System.out.println("늦잠 자기 ");
	}
}
