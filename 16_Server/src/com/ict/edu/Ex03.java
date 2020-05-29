package com.ict.edu;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//스레드 처리 해야하니까 상속은 무조건..
public class Ex03 implements Runnable {
	ServerSocket ss = null;
	public Ex03() {
		
		try {
			ss= new ServerSocket(7777);
			System.out.println("서버대기중.....");
			
			new Thread(this).start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println(Thread.currentThread().getName());
				Socket s = ss.accept(); //접속자 정보는 모두 s가 가지고 있어/
				System.out.println("ip" + s.getInetAddress().getHostAddress());
				System.out.println(Thread.currentThread().getName());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new Ex03();
		System.out.println(Thread.currentThread().getName());
		
	}
}
