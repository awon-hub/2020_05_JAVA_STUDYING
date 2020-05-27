package com.ict.edu05;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

// OutputStreamWriter : OutputStream => Writer 로 바꿔준다.
//바이트 스트림을 문자 스트림으로 바꿔주는 역할
// OutputStream -> OutputStreamWriter => Write => BufferedWriter
public class Ex02 {
	public static void main(String[] args) {

		// System.out.println("Hello, World");
		// 이거를 바꿔보겠어!
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;

		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			
			
			bw.write("Welcome 대한민국");
			bw.flush();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			try {
				bw.close();
				osw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			} finally {

			}
		}

	}

}
