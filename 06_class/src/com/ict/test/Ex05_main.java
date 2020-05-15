package com.ict.test;

import com.ict.edu.Ex05;

public class Ex05_main {

	public static void main(String[] args) {

		//클래스 참조변수  = new 생성자
		
		Ex05 a = new Ex05();
		
		//패키지가 달라도 public 사용가능 (import)
		System.out.println(a.su1);
		
		// protected - 다른패키지 
		// default - 다른패키지
		// System.out.println(a.su2);    
		// System.out.println(a.su3);	 
		//System.out.println(a.su4); //private
		//객체를 생성해도 접근 안됌
		
		
		System.out.println(Ex05.k1);
		// System.out.println(Ex05.k2); 
		// System.out.println(Ex05.k3); 
		// System.out.println(Ex05.k4); //private
		// private > static 접근자가 우선임.
	}
}
