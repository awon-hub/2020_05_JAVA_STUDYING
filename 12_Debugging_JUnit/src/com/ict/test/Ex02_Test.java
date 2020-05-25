package com.ict.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.junit.Ex02;

public class Ex02_Test {

	Ex02 t2 ; 
	@Before
	public void t2Before() {
		t2 = new Ex02();
	}      //장바구니 전 로그인 했니?
	@Test
	public void t2Test() {
		int res = t2.mul(50, 20);
		assertEquals(1000, res);
	}   //장바구니 담기!
	@After
	public void t2After() {
		System.out.println("테스트 실행 후 메소드 실행 ");
	}

}
