package com.ict.edu02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Ex09 {
	public static void main(String[] args) {

		String pathname = "C:" + File.separator + "study" + File.separator + "Util" + File.separator + "io03.txt";

		File file = new File(pathname);

		FileInputStream fis = null;
		// 속도 향상을 위해 Buffer사용
		BufferedInputStream bis = null; //요고 앞으로는 얘랑 같이써요! 
		try {
			// 유식한 말로 스트림 체인이라고 한다 혼자서 못써요.
			fis =  new FileInputStream(file);
			bis = new BufferedInputStream(fis); //요거 더생긴것 뿐. 앞으로는 얘랑 같이써요! 
			
			//하나만 읽는거. 
			//int m = bis.read();
			//System.out.println(m +" : "+(char)(m));
			
			// 다 읽는 방법 3가지. (파일의 모든 내용 읽기)
			// 1 while
			//int m = 0;
			//while ((m=bis.read())!= -1) {
			//	System.out.print((char)(m));
			//}
			
			
			//2 배열을 이용한다.
	//		byte[]b = new byte[(int) file.length()]; // 파일의 크기를 알아낼수 있잖아!! 그 파일의 크기를 재서 가져와
		//										//원래는 long 형으로 반환이 되어서 인트로 바꿔달라고 함. 
			//bis.read(b);   //읽어서 배열에 넣어주세요.
			//for (byte k : b) {
			//	System.out.print((char)(k));
			//}
			
			//3 스트링을 이용한다.
			byte[]b = new byte[(int) file.length()]; 
			bis.read(b);
			
			String msg = new String(b);
			System.out.print(msg);
			
			
		} catch (Exception e) {
		} finally {

		}
		try {
			if (bis != null)
				bis.close();
			if (fis != null)
				fis.close();
		} catch (Exception e) {
		} finally {

		}

	}
}
