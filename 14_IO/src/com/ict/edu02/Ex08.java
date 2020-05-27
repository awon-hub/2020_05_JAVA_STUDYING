package com.ict.edu02;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex08 {
	public static void main(String[] args) {

		String pathname = "C:" + File.separator + "study" + File.separator + "Util" + File.separator + "io03.txt";

		File file = new File(pathname);

		FileOutputStream fos = null;
		// 속도 향상을 위해 Buffer사용
		BufferedOutputStream bos = null; //요고 앞으로는 얘랑 같이써요! 
		try {
			// 유식한 말로 스트림 체인이라고 한다. 혼자서 못써요.
			fos =  new FileOutputStream(file);
			bos = new BufferedOutputStream(fos); //요거 더생긴것 뿐. 앞으로는 얘랑 같이써요!
			//엮는거예요. 체인방식. 내가 쓸수 있는건 bos예요.
			//write() 똑같아요. 바이트 배열. 인트 숫자 하나.
			bos.write(105);
			bos.write('c');
			bos.write('t');
			
			//배열이용
			byte[]b = {'e','d','u'};
			bos.write(b);
			//String 이용
			String msg = " Hello, World! ";
			byte[]b2 = msg.getBytes();
			bos.write(b2);
			
			bos.flush(); // 맨날 기본적으로 하는거 당장 배출하는것. 원래는 캐쉬가 다차야 출력. 
			
			//그럼 io03이 만들어지겠죠? 
			
		} catch (Exception e) {
		} finally {

		}
		try {
			if (bos != null)
				bos.close();
			if (fos != null)
				fos.close();
		} catch (Exception e) {
		} finally {

		}

	}
}
