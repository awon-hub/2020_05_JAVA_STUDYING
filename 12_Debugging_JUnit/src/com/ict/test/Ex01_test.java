package com.ict.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.junit.Ex01;

//JUnit : 단위 (무슨 단위냐면 ~ 메소드 단위임!!!) 테스크 도구, 이클립스에서 기본적으로 제공
//블랙박스 테스트 : 입력값을 넣어서 예상값이 일치 성공,
//					예상값이 일치하지 않으면 실패

// assertEquals : 기본형 변수 또는 객체의 값이 예상값과 일치한지 검사하는 메소드. ( 값이 같냐?)
// assertSame : 두 객체가 같은 객체인지 검사 ( 주소가 같냐?) 
// assertNull : Null 검사
// assertNotNull : Null이 아닌지 검사
// assertTrue(a) : a가 참인지 검사
// assertArrayEquals(a,b) : 배열a, 배열b가 일치한지 확인

//실행방법은 지금 아무것도 안해서 false 가 나옴.

public class Ex01_test {

	Ex01 t1; // (선언만 했어)

	// 테스트 전 실행할 메소드의 클래스를 객체 생성 하자.
	// 정해져 있음.
	@Before   // 아~ 테스트전에 이거 하라는 뜻이구나! : 어노테이션 : 
	//주석의 일종: 컴파일러에게 지시를 내린다.
	public void testBefore() {
		System.out.println(" 실행할 클래스를 객체 생성하기.");
		t1 = new Ex01(); // 생성은 여기서 해야지~
		
	}

	// 테스트를 실행하는 메소드
	@Test
	public void addTest() {
		// 메소드를 실행할 결과값 예상값 구하기 (값을 넣어서 구하기) (30) 
		int res = t1.add(10, 20);
		
		// expected ->예상값 (내가 집어넣기)  actual -> 결과값
		assertEquals(30, res);
	}

	@Test
	public void subTest() {
		// 메소드를 실행할 결과값 예상값 구하기 (값을 넣어서 구하기) (30) 
		int res = t1.sub(1, 5);
		
		// expected ->예상값 (내가 집어넣기)  actual -> 결과값
		assertEquals(-4, res);
	}
	
	
	
	// 테스트 실행 후
	@After
	public void testAfter() {
		System.out.println("테스트 실행 후 메소드 실행 ");
	}

}
