package com.ict.edu;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {
	public static void main(String[] args) {
		int[] su = { 3, 4, 9, 5, 6, 1, 8, 2, 10, 8 };
		int temp = 0;// 자리 바꾸기를 위한 변수

		for (int i = 0; i < su.length - 1; i++) {
			for (int j = i + 1; j < su.length; j++) {
				if (su[i] > su[j]) { // 오름차순  i>j내림차순
					// 자리바꾸기
					temp = su[i];
					su[i] = su[j];
					su[j] = temp;
				}
			}
		}

		//출력하기
		for (int k : su) {
			System.out.print(k +" ");
		}
	System.out.println("\n===============================================");	
	
	int[] su2 = { 3, 4, 9, 5, 6, 1, 8, 2, 10, 8 };
	//Arrays 클래스는 배열 복사 정열 list 로 변환하는 클래스   
	//sort()메소드로 오름차순만 가능
	Arrays.sort(su2);
	for (int k : su2) {
		System.out.print(k + " ");
	}
	
	
	System.out.println("===============================================");
	

	
	
	
	
	}
}
