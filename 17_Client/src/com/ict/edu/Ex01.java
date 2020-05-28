package com.ict.edu;

import java.net.Socket;

// 클라이언트 : 소켓만 사용
public class Ex01 {
	public static void main(String[] args) {
		Socket s = null;   //따로 나눔. 
		try {
			s= new Socket("203.236.220.70", 7777);
			System.out.println("클라이언트 : 수고하셨습니다.");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				s.close(); // 끊으면 닫아줘야죠. 
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
