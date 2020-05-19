package com.ict.eud5;

//추상클래스를 추상클래스가 상속을 하면
//오버라이딩 할 필요가 없다.
abstract class Tiger extends Animal{

	
}

//구체화 미루기 
abstract class Tiger2 extends Animal{
	public abstract void sleep();
	
}