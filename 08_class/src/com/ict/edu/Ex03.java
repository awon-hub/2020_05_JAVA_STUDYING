package com.ict.edu;

import java.util.Random;

//Random 클래스를 상속받아서 사용 (이런짓은 안함. 그냥 예제임)
public class Ex03 extends Random{
	public static void main(String[] args) {
		//main 메소드도 static 이기 때문에  static 지역변수 못 만든다.
		//static int num = nextInt(10)+1;
		
		//static 메소드가 아니라 못씀	
		//int num = nextInt(10)+1;
		//System.out.println(num);
		
		// play()를 사용하기 위해서는 현재 클래스를 객체로 만들어야한다.
		
		Ex03 t1 = new Ex03();
		t1.play();
		
	}
	
	public void play() {
		int num = nextInt(10)+1;
		System.out.println(num);
	}
	
}
