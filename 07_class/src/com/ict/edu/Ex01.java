package com.ict.edu;

public class Ex01 {

	// String 클래스와 주요 메소드

	public static void main(String[] args) {
		// String 객체 생성

		String str1 = "abc";

		char data[] = { 'a', 'b', 'c' };
		String str2 = new String(data);

		// 가끔 IO (입출력할때) 기계끼리
		byte data2[] = { 97, 98, 99 };
		String str3 = new String(data2);

		String data3 = "ABC";
		String str4 = new String(data3);

		String str5 = new String("ABC");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		System.out.println("====================================");
		
		//같다
		// char, int, double 숫자 자료형은 
		// '같다'라는 표현을 '==' 사용한다.
		
		// 그러나 문자열(String)은 '==' 사용하면 안됨
		// 이유는 숫자는 내용이 같다라는 뜻이고,
		//			문자열은 내용이 아니라, "주소가 같냐" 라는 뜻.
		
		//그러므로 문자열에서 데이터가 같다라는 뜻은
		// equals()나 , equalsIgnoreCase() 메소드를 사용해야 된
		
		if (str1 == str2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		//객체와 객체가 같냐? 다르다!
		
		if (str4 == str5) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		System.out.println("====================================");
		
		if (str1.equals(str2)) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		// 내용이 같냐?
		
		//equalsIgnoreCase
		//대소문자 무시해서  검사하는 방법 
		// db는 대소문자 구분해서 중요
		
		if (str3.equalsIgnoreCase(str4)) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		
		
	}

}
