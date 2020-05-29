package com.ict.edu2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
//항상 인풋을 먼저 만들어야지. (인풋아웃풋 둘다 만들어야되는데..)
import java.net.ServerSocket;
import java.net.Socket;

// 에코 서버 
public class Ex02 implements Runnable {
	ServerSocket ss = null;

	InputStream in;
	InputStreamReader isr ;
	BufferedReader br;
	
	OutputStream out;
	OutputStreamWriter osw;
	BufferedWriter bw;
	
	// 정보를 받기 위한 스트림처리 (문자스트림)

	public Ex02() {
		try {
			ss = new ServerSocket(7777);
			System.out.println("에코서버 대기중");
			new Thread(this).start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				Socket s = ss.accept();
				
				// 클라이어트가 글자를 보내왔다.
				in = s.getInputStream();
				isr = new InputStreamReader(in);
				br = new BufferedReader(isr);
				
				String msg = br.readLine();
				System.out.println("받은 내용 : " + msg);
				
				// 클라이어트에게 보내기
				out = s.getOutputStream();
				osw = new OutputStreamWriter(out);
				bw = new BufferedWriter(osw);
				
				msg += System.getProperty("line.separator");
				bw.write(msg);
				bw.flush();
				
				
			}
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}

	}

	public static void main(String[] args) {
		new Ex02();
	}
}
