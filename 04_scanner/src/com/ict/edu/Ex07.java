package com.ict.edu;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	esc: while (true) {
	System.out.print("입금액 : " );
	int input = sc.nextInt();
		
	System.out.print("1. 커피음료 (3,500) \n  2. 이온음료 (2,500) \n  3. 물 (1,500) \n  4. 과일쥬스 (4,500) \n" );
	System.out.print("메뉴를 선택하세요 : ");
	int menu = sc.nextInt();	
		
	int dan = 0;
	String drink =" ";

		
	switch (menu) {
	case 1:dan = 3500; drink ="커피음료";break;
	case 2:dan = 2500;drink ="이온음료";break;
	case 3:dan = 1500;drink ="물";break;
	case 4:dan = 4500;drink ="과일쥬스";break;

	}

	int vat = (int) (dan * 0.1);
	int cost = dan + vat;
	int output = input - cost;
			
	
	System.out.println("선택한 음료 : " + drink);
	System.out.println("입금액 : " + input );
	System.out.println("잔돈 : " + output );
	
	
	while (true) {
		System.out.println("계속할까요? (1.예/2.아니요)>>");
	int ans = sc.nextInt();
	if (ans == 1) {
		continue esc;
	} else if (ans == 2) {
		break esc;
	} else {
		System.out.println("다시 입력하세요.");
		continue;
	}
	}
	
	
}
}
}
