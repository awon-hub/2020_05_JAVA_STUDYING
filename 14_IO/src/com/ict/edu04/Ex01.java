package com.ict.edu04;
//문자스트림 : 모든처리를 2byte씩 처리.

import java.io.BufferedWriter;

//		대상 : 세계 모든 언어 
//	최상위 클래스 : Reader( 입력) , Writer(출력)

import java.io.File;
import java.io.FileWriter;

//FileOutStream 와 비교 : 1byte 처리, write(아스키코드), write(byte[]b),
//FileWriter : 2byte 처리, write(유니코드) ,write(char[]b)- 잘안씀. 스트링있어서. , write(String str)
// *아스키나 유니코드나 둘다 int 

public class Ex01 {
	public static void main(String[] args) {

		String pathname = "C:" + File.separator + "study" + File.separator + "Util" + File.separator + "io06.txt"; // 무조건
		File file = new File(pathname);

		
		//파일에다가 쓰는거니까 파일 라이터겠지?
		//버퍼를 추가합시다.
		FileWriter fw = null;
			
		try {
			fw = new FileWriter(file);
			fw.write(97);
			fw.write('e');
			
			char[]c= {'j','a','v','a',};
			fw.write(c);

			fw.write("korea\n");
			fw.write("대한민국\n");
			fw.write("大韓\n");
			fw.write("12345\n");
			fw.flush();
			//getByte와 차이 
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			try {
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			} finally {

			}

		}
	}
}
