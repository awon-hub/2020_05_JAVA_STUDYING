package com.ict.edu05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//	InputStreamReader : InputStream => Reader로  즉 바이트스트림을 문자스트림으로
//  (생략)InputStream => InputStreamReader => (생략)Reader => BufferedReader
public class Ex01 {
	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("원하는 문자입력 : ");
		 * String msg = sc.next(); System.out.println(msg);
		 */
		System.out.println("원하는 문자입력 : "); // 프린트 스트림이나로 쓰는거잖아.
		InputStreamReader isr = null;
		BufferedReader br = null;

		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			String msg = br.readLine();
			System.out.println("받은문자 :" + msg);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				isr.close();

			} catch (Exception e2) {
				// TODO: handle exception
			} finally {

			}
		}

	}
}
