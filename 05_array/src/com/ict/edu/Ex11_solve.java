package com.ict.edu;

import java.util.Scanner;

public class Ex11_solve {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[5][5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("번호 : ");
			int no = sc.nextInt();
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			System.out.print("수학 : ");
			int math = sc.nextInt();

			int sum = kor + eng + math;
			int avg = sum / 3;
			int hak = 0;
			if (avg >= 90) {
				hak = 'A';
			} else if (avg >= 90) {
				hak = 'B';
			} else if (avg >= 70) {
				hak = 'C';
			} else {
				hak = 'F';
			}

			int rank = 1;
			arr[i][0] = no;
			arr[i][1] = sum;
			arr[i][2] = avg;
			arr[i][3] = hak;
			arr[i][4] = rank;
		}
		// 순위

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][1] < arr[j][1]) {
					arr[i][4]++;
				}
			}
			}
		
				int[] temp = new int[5];
				for (int i = 0; i < arr.length - 1; i++) {
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[i][4] > arr[j][4]) {
							temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}
				}

				System.out.println("번호\t총점\t평균\t학점\t순위");
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						if (j == 3) {
							System.out.print((char) (arr[i][j]) + "\t");
						}
						System.out.print(arr[i][j] +"\t");
					}
					System.out.println();
				}
	}
}
