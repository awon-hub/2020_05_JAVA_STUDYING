package com.ict.edu;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

//URL Connection 클래스 : 원격지 서버의 자원 결과와 원격 서버의 헤더정보들을 가져올 수 있다.


public class Ex03 {
	public static void main(String[] args) {
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			URL url = new URL("http://www.naver.com");
			URLConnection conn = url.openConnection();

			isr = new InputStreamReader(conn.getInputStream());
			br = new BufferedReader(isr);
			
			System.out.println("인코딩 :"+conn.getContentEncoding());
			System.out.println("길이 :"+conn.getContentLength());
			System.out.println("문서타입 :"+conn.getContentType());
		
		//**인터넷 정보는  헤더와 바디로 나눠진다.
		// 헤더 정보를 가지고 웹 브라우저가 해석하고 실행한다.
			//헤더 정보 얻어내는 방법
			
			Map<String,List<String>> list = conn.getHeaderFields();
			//키밸류를 배웠어요. 키를 관리해서 받는다고 했지.
			for (String k : list.keySet()) {
				System.out.println(list.get(k));
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				br.close();
				isr.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
