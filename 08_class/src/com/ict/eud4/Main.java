package com.ict.eud4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//오버로딩 : 한 클래스 안에서 같은 이름의 메소드가 여러 개 존재 하는 것.
		//			(인자의 자료형이나, 개수가 다르다)
		//				사용자 편의 
		//오버라이딩: 상속 관계에서 부모 메소드와 자식 메소드가 같은 것.
		//			 이때 자식클래스가 부모 메소드를 가져다 쓰는 대신에 
		//			 내용은 자기에 맞게 변경해서 사용하는 것.
		//			 부모 메소드가 숨겨진다. (은닉화, = 캡슐화)
		//			 같은 메소드를 호출하여도 다른 내용을 실행한다. (다형성)
			//반대개념 final 
					//명령어는 똑같은데, 실행방식이 다름.
		
		Animal d = new Dog ();
		Animal c = new Cat ();
		
		System.out.println(d.eyes);
		System.out.println(d.legs);
		d.likes();
		d.sound(); // 멍! 멍! 부모로 선언했는데, 자식 것이 나옴 . 
		
		
		System.out.println("=========================");
		System.out.println(c.eyes);
		System.out.println(c.legs);
		c.likes();
		c.sound(); // 멍! 멍! 부모로 선언했는데, 자식 것이 나옴 . 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("선택하세요 1. 고양이, 2.강아지 >>");
		int su = sc.nextInt();
		
		Animal a = null;
		if (su==1) {
			a= new Cat();
			
		}else if (su==2) {
			a = new Dog();
		}
		a.sound();
		a.likes();
		//a.hobby(); 자식만 가지고 있어서 사용 못함 
		
		
		
		/*
		if (su==1) {
			Cat cat = new Cat();
			cat.sound();
			cat.likes();
			cat.hobby();
			
			
		}else if (su==2) {
			Dog dog =new Dog();
			dog.sound();
		}
		*/
		
	}
}
