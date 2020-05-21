package com.ict.edu;

import java.util.Scanner;

//throws: 예외전가, 예외 양도
//		 예외가 발생하면 에외처리를 하지 않고, 자신을 호출한 곳으로 
//		예외객체를 전달한다.

public class Ex04 {
	public void setData(String msg) throws NumberFormatException{
		
		//인자인 msg의 값이 있으면
		if (msg.length()>=1) {
			//msg의 첫번째 자리를 str에 저장해라.
			String str = msg.substring(0,1);
			//다른 메소드 호출
			prnData(str);
		}
		
	}
	public void prnData(String str) throws NumberFormatException{
		int dan = Integer.parseInt(str);
			System.out.println(dan+ "단");	
	for (int i = 0; i < 10; i++) {
		System.out.println(dan + " * "+ i +" =" + (dan*i));
	}
	
	
	}
	
	
	public static void main(String[] args) {
		Ex04 test = new Ex04();
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("정수를 입력하세요.>>");
			String msg = sc.next();
			test.setData(msg);
			
		} catch (Exception e) {
			System.out.println("숫자만 입력해주세요.");
		}
	
		
	}
}
