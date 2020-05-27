package com.ict.edu04;
//FileInputStream : read() :int -아스키코드 => char 형변환. read(byte[]b), 깨져요영어랑 숫자밖에 못읽어요.

//FileReader : read() :int -유니코드 => char 형변환. read(char[]b), 모든글자를 읽어와요.

import java.io.File;
import java.io.FileReader;

public class Ex03 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io06.txt";
		File file = new File(pathname);
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			
			//한글자씩읽기 : 모든 글자를 읽어 올 수 있다.
			//int k = fr.read();
			//System.out.println(k+ ": "+ (char)(k));
			
			//전체 읽기
			//int k = 0;
			//while ((k=fr.read())!=-1) {
			//	System.out.print((char)(k));
			//}
			
			//char[] 로 읽기  다 안나와 
			
			/*char[]c = new char[(int)(file.length())];
			fr.read(c);
			for (char k : c) {
				System.out.println(k);
			}*/
			
			//String 이용하는방법
			char[]c = new char[(int)(file.length())];
			fr.read(c);
			String msg = new String(c);
			System.out.println(msg);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {

		}
		try {
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {

		}

	}

}
