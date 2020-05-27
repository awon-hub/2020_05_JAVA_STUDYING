package com.ict.edu05;
//키보드 마우스가 아니면 바코드 찍거나,
//조이스틱이거나...
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex03 {
	public static void main(String[] args) {
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		InputStreamReader isr = null;
		BufferedReader br =null;
		try {//쓰는거고. 모니터
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			//읽는거잖아. 키보드
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);

			bw.write("원하는 문자: ");
			bw.flush();
			
			String msg = br.readLine();
			bw.write("받은내용 : "+msg);
			bw.flush();
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			try {
				osw.close();
				bw.close();
				br.close();
				isr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			} finally {

			}
		}
	}
}
