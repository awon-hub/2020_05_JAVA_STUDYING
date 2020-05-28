package com.ict.edu;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//불편한 버전 (안좋은 케이스)
//서버는 닫을일이 없어요.... 원래는  그래서 무한루프랑 쓰레드를 같이 처리해야해돼.
//스레드 처리 어떻게 해야돼?

public class Ex02 implements Runnable {
	public static ServerSocket ss;
	public static void main(String[] args) {
		// 203.236.220.70 내 컴 주소
		
		try {
			 ss = new ServerSocket(7777);
			System.out.println("서버 대기중...");

			Ex02 e2 = new Ex02();
			Thread thread = new Thread(e2); // 쓰레드안에 스타트 런이 있죠
			thread.start(); // 하면 런으로 넘어가죠!

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void run() {
		while (true) { //이상이 있어도 다시 돈다고.
			try {
				Socket s = ss.accept();
				System.out.println("ip:"+s.getInetAddress().getHostAddress());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
