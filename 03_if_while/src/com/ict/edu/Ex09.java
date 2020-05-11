package com.ict.edu;

public class Ex09 {
	public static void main(String[] args) {
		//do ~while 臾� : while 臾멸낵 媛숈� 諛섎났臾�
		//珥덇린�떇;
		//do{
		//�떎�뻾臾�;
		//利앷컧�떇;
		//}while(議곌굔�떇)
		
		
		// 0 -10 源뚯� 異쒕젰.
		int k1 = 0;
		do {
			System.out.print(k1 + " " );
			k1++;
		} while (k1<11);
		System.out.println();
		
		// 0-10  吏앹닔留� 異쒕젰
		int k2 = 0;
		do { 
			if (k2 %2 ==0) {
				System.out.print(k2 + " ");
			}
			k2++;	
			
		} while (k2<11);
		System.out.println();
		
		System.out.println();
		// 0 -10 �늻�쟻�빀
		int sum = 0; // �씠�쟾 媛믪쓣 湲곗뼲�떆�궗 蹂��닔
		int k3 = 0;
		do {
			sum = sum + k3;
			
			k3++;
		} while (k3 < 11);
		System.out.println("�늻�쟻�빀 : " + sum);
		System.out.println();
		
		//5�떒 異쒕젰
		int k4 = 1;
		do {
			System.out.println("5 * " + k4 + " = " + (5*k4));
			k4++;
		} while (k4<10);
		System.out.println();
		
		System.out.println("==================================");
	}
}
