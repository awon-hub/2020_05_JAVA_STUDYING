package com.ict.edu03;
//PrintStream  (출력스트림) : 모든 자료형을 출력할 수 있어요.
// 보통은 화면이나 파일에 출력한다.
//출력전용( 다른것들은 짝이 있는데, 얘는 없어요. 그냥 출력만 하는 거야. 그냥 sysout쓰는듯이.)

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex02 {
	public static void main(String[] args) {
	
		String pathname = "C:" + File.separator + "study" + File.separator + "Util" + File.separator + "io05.txt";
		File file = new File(pathname);
		FileOutputStream fos= null;
		BufferedOutputStream dos= null;
		PrintStream ps= null;
		
		try {
			//화면에 출력
			//System.out 이 PrintStream 중 하나임.
			System.out.println(true);
			System.out.println(10);
			System.out.println(24.1);
			System.out.println('c');
			System.out.println("Hello");
		
			
			//파일에 출력
			fos = new FileOutputStream(file);
			dos = new BufferedOutputStream(fos);
			ps = new PrintStream(dos);
			
			ps.println(true);
			ps.println(10);
			ps.println(24.1);
			ps.println('c');
			ps.println("Hello");
			ps.println("대한민국");
			ps.flush(); // 반드시 플러쉬 
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		try {
			ps.close();
			dos.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
		}
	}
}
