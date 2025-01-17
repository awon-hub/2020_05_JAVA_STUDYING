package com.ict.edu3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server implements Runnable {
	ServerSocket ss = null;
	// 정보를 받기 위한 스트림
	InputStream in;
	InputStreamReader isr;
	BufferedReader br;

	OutputStream out;
	OutputStreamWriter osw;
	BufferedWriter bw;

	// 여러명의 접속자 정보를 받아서 처리하기 위한 컬렉션
	ArrayList<Player> list;

	public Server() {
		try {
			list = new ArrayList<Player>();
			ss = new ServerSocket(7788);
			System.out.println("멀티서버 대기중...");

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
				Player player = new Player(s, this); // 그냥 가면 안되고
				list.add(player);

				new Thread(player).start();

			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	// 리스트안에 존재하는 모든 클라이언트들에게 메세지 전달하기
	public void sendMsg(String msg) {
		try {
			msg += System.getProperty("line.separator");
			for (Player k : list) {

				k.bw.write(msg);
				k.bw.flush();
			}
		} catch (Exception e) {

		}

	}

	public static void main(String[] args) {
		new Server();
	}
}
