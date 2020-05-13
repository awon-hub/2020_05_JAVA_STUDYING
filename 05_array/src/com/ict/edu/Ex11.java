package com.ict.edu;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
	
		
		//{번호, 총점,평균,학점,순위}
		
		Scanner sc= new Scanner(System.in);
		int[][]arr = new int[5][5];

		for (int i = 0; i < arr.length; i++) {
			
			System.out.print("번호 : " );
			arr[i][0] = sc.nextInt();
			System.out.print("총점 : ");
			arr[i][1] = sc.nextInt();
			System.out.print("평균 : ");
			arr[i][2] = sc.nextInt();
			System.out.print("학점 : ");
			arr[i][3] = sc.nextInt();
		}
		
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i][1] < arr[j][1]) {
						arr[i][4]++;
					}
				}
			}
			
			int[] temp = new int[5];
			for (int i = 0; i < arr.length-1; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if (arr[i][4] > arr[j][4]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (j==3) {
						System.out.print((char)(arr[i][j])+"\t");
					}else {
						System.out.print(arr[i][j]+"\t");
					}
					
				}
				System.out.println();
			
			
		}
		
		
		
		
}
}
