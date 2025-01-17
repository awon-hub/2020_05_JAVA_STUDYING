package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
		// switch ~ case : if문과 같이 조건문
		// if는 조건식이 boolean형이다. 즉, 비교연산, 논리연산, boolean형 사용
		// switch문은 인자값이 byte, short , int ,char , String 일 때 사용
		
		
		// swtich (인자값) {
		//	case 조건값1 : 인자값과 조건값1과 같을 때 수행할 문장 ; break;
		//	case 조건값2 : 인자값과 조건값2과 같을 때 수행할 문장 ; break;
		//	case 조건값3 : 인자값과 조건값3과 같을 때 수행할 문장 ; break;
		//	default : 조건값1,2,3 모두 같지 않을 때 수행할 문장 ;
		//  }
		
		//break 가 없으면 break 를 만날 때 까지 모든 실행문을 실행
		//break 역할은 현 실행 하고 있는 범위(블럭)를 벗어나는 역할
		
		
		
		// char k1 A아프리카 B브라질, C캐나다 ,나머지 한국
		char k1= 'B';
		String res="";
		switch (k1) {
		//case 'A': res = "아프리카";
		case 'A': System.out.println("아프리카"); break;
		case 'B': System.out.println("브라질"); break;
		case 'C': System.out.println("캐나다"); break;
		default:System.out.println("한국"); break;
		}
		
		
		//break가 없으면 값은 한국. 
		char k2= 'B';
		switch (k2) {
		case 'A': res = "아프리카"; break;
		case 'B': res = "브라질"; break;
		case 'C': res = "캐나다"; break;
		default: res = "한국"; break;
		}
		System.out.println("결과 : " + res);
		
		
		// char k3 Aa아프리카 Bb브라질, Cc캐나다 ,나머지 한국
		char k3= 'c';
		switch (k3) {
		case 'A': res = "아프리카"; break;
		case 'a': res = "아프리카"; break;
		case 'B': res = "브라질"; break;
		case 'b': res = "브라질"; break;
		case 'C': res = "캐나다"; break;
		case 'c': res = "캐나다"; break;
		default: res = "한국"; break;
		}
		System.out.println("결과 : " + res);
		
		switch (k3) {
		case 'A': 
		case 'a': res = "아프리카"; break;
		case 'B': 
		case 'b': res = "브라질"; break;
		case 'C':
		case 'c': res = "캐나다"; break;
		default: res = "한국"; break;
		}
		System.out.println("결과 : " + res);
		
		
		
		// int k4 1,3 남자 2,4 여자
		int k4 = 2;
		
		switch (k4) {
		case 1:
		case 3: res ="남자"; break;

		case 2:
		case 4: res ="여자"; break;

		}
		System.out.println("결과 : " + res);
	

	
		
		// String k5가 한국= 서울,중국=북경,일본=동경,미국=워싱턴

		String k5="일본";
		
		switch (k5) {
		case "한국": res= "서울";break;
		case "중국": res= "북경";break;
		case "일본": res= "동경";break;
		case "미국": res= "워싱턴";break;
		}
		System.out.println("결과 : " + res);
		
		
		//  swtich 문의 범위가 넓어지면 사용하지말자
		//int k6 90이상 a . 80이상 b  70이상 c 나머지 f
		
		
		int k6 =60;
		switch ((int)(k6/10)) {
		case 10:
		case 9: res = "A"; break;
		case 8: res = "B"; break;
		case 7: res = "C"; break;
		default: res = "F"; break;
		}
		System.out.println("결과 : " + res);
		
		
		
		
		
		
	}
}
