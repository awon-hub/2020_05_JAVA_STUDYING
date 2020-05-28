package com.ict.edu;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//자바통신은 소켓 통신, 소켓은 읽기/ 쓰기 위한 인터페이스 제공
// 포트: 내부와 외부를 연결하는 게이트 역할 한다.
//		0-65535 , 0-1024는 사용자가 지정하지 않는다.
// 서버 : SeverSocket(쓰레드 같은애)
//클라이언트 : Socket

//서버는 닫을일이 없어요.... 원래는  그래서 무한루프랑 쓰레드를 같이 처리해야해돼.

public class Ex01 {
	public static void main(String[] args) {
		// 203.236.220.70 내 컴 주소
		try {
			ServerSocket ss = new ServerSocket(7777);
			System.out.println("서버 대기 중...");

			// 클라이언트가 접속할 때까지 대기
			// 접속을 하면 담당소켓을 하나 만든다.
			// 담당소켓s는 접속한 클라이언트의 정보를 가지고 있다.

			Socket s = ss.accept();

			// 클라이언트에 대한 정보 출력

			String ip = s.getInetAddress().getHostAddress();
			String name = s.getInetAddress().getHostName();

			System.out.println("ip : " + ip);
			System.out.println("name : " + name);
			System.out.println("서버 : 수고하셨습니다.");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
