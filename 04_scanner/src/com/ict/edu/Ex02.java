package com.ict.edu;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		
		// 숫자를 받아서 홀수 짝수를 구분하자.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int su1 = sc.nextInt();
		String result ="";
			if (su1%2==0) {
				result ="짝수";
			}else {
				result = "홀수";
			}
		System.out.println( "결과 : " + result );
		
		//근무시간 8 8590
		//초과 1.5
		//근무시간 입력 하면 금액 출력
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("근무시간 : ");
		int hour = sc1.nextInt();
		int cost = 8590;
		int pay =0;
			if (hour > 8) {
				pay = cost * 8 + (int)((hour-8) * cost *1.5);
			}else {
				pay = cost * hour;
			}
		System.out.println( "총 : " + pay + "원" );
		
		// 나라 수도 1. 한국 서울 2. 중국 베이징 3. 일본 도쿄 나머지 데이터 없음
		System.out.print("나라입력 : 1. 한국 = 서울 , 2. 중국 = 베이징 3. 일본 도쿄 >>");
		int num = sc1.nextInt();
		result = "";
		if (num==1) {
			result = "서울";
		}else if (num ==2) {
			result = "베이징";
		}else if (num ==3) {
			result = "도쿄";
		}else {
			result = "데이터 없음";
			System.out.println("데이터 없음");
		}
	
		System.out.println("결과 : " + result);
		
		
		//  스트링으로 받기
		
		System.out.print("나라 입력: 한국, 중국, 일본>>");
		String country = sc1.next();
		result = "";
		switch (country) {
		case "한국": result = "서울";  System.out.println(result);break;
		case "중국": result = "베이징";	System.out.println(result);break;
		case "일본": result = "도쿄";	System.out.println(result);break;
		default: result = "데이터에 없음";	System.out.println(result);break;
		}
		
		
		//menu1 카페모카 3500
		// 2 카페라떼 4000
		// 3 아메리카노 3000
		//4 과일주스 3500
		//두잔 10000원
		// 메뉴와 잔돈 출력 (10 포함)
		
		
		System.out.print("Menu 선택 : \n1. 카페모카(3500), \n2. 카페라떼 (4000) \n3. 아메리카노(3000) \n4. 과일쥬스 (3500) >>");
		
		
		int menu = sc1.nextInt();
		int menucost = 0;
		String drink = "";
		int serv =2;
		int total = 0;
		int vat = 0;
		int input =10000;
		int change = 0;
		
		if (menu==1) {
			menucost = 3500;
			drink = "카페모카";
		}else if (menu==2) {
			menucost = 4000;
			drink = "카페라떼";
		}else if (menu==3) {
			menucost = 3000;
			drink = "아메리카노";
		}else if (menu==4) {
			menucost = 3500;
			drink = "과일쥬스";
		}
		
		 total = menucost*serv;
		vat = (int)(total *0.1);
		change = input - (total+vat);
		
		System.out.print( drink + serv +"잔, 잔돈은 " + change + "원 입니다.");
		
	}
}
