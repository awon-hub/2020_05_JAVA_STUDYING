package com.ict.edu04;
//PrintWriter : 바이트 스트림 , 문자스트림 모두 인자로 받을 수 있다.

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ex05 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io08.txt";
		File file = new File(pathname);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		
		try {
			 fw = new FileWriter(file);
			 bw = new BufferedWriter(fw);
			 pw = new PrintWriter(bw);
			 
			 pw.print("PrintWriter를 가지고 연습한다.");
			 pw.print(true);
			 pw.print(12345);
			 pw.println();
			 pw.print(3.14);
			 pw.print('c');
			 pw.flush();
			 
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		
		try {
			pw.close();
			bw.close();
			fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
	}
}
}