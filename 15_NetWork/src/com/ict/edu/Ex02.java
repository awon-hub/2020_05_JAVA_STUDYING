package com.ict.edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

//URL 클래스 : URL ( Uniform Resource Locator)의 약자. 인터넷에서 접근 가능한 자원의 주소.
//			  원격지 서버 자원의 결과만 가져온다.
//final 클래스이다.( 상속안됨 )


public class Ex02 {
	public static void main(String[] args) {
		//해당 사이트 가서 정보 읽기.
		InputStream is = null;         //기계대 기계 
		InputStreamReader isr= null;   // 기계대 사람
		BufferedReader br = null;	   //그 글자 받아서 버퍼
		
		
		
		//내피시에 정보 저장하기
		String pathname 
		= "C:" + File.separator + "study" + File.separator + "util" + File.separator + "data01.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		try {
			URL url = new URL("https://www.naver.com");
			System.out.println("프로토콜 :"+url.getProtocol());
			System.out.println("포트  :" + url.getPort());
			System.out.println("path  :" +url.getPath());
			System.out.println("호스트  :" +url.getHost());
			System.out.println("안내  :" +url.getUserInfo());
			System.out.println("------------------");
			
			is = url.openStream(); // 스트림열어줘  두번째 캐치.
			isr = new InputStreamReader(is);
			br= new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer(); //스트링 누적
			while ((msg = br.readLine())!=null) {
				//System.out.println(msg+"\n"); 다못보니 저장.
				
				sb = sb.append(msg+"\n"); // 화면 출력안하고 저장.한거야.
				
				
				
				//파일로 저장할라면
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				bw.write(sb.toString());
				bw.flush();
				
			 
			}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
				
	}
}
