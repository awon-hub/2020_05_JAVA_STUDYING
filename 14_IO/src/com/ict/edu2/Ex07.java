package com.ict.edu2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex07 {
	public static void main(String[] args) {
		
		//사진, 동영상, 음악은 1byte씩 무조건 처리.
		// 먼저 읽어야 쓰지. 읽어야겠죠.
		String pathname1 = // 읽는 위치
				"C:" + File.separator + "study" + File.separator + "Util" + File.separator + "java.png";
		File file1 = new File(pathname1);

		String pathname2 = // 쓰는위치
				"C:" + File.separator + "study" + File.separator + "java.png";
		File file2 = new File(pathname2);

		FileInputStream fis= null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(file1);
			fos = new FileOutputStream(file2);
			
			int k = 0;
			while ((k=fis.read())!= -1) {
			fos.write(k);
			}
			fos.flush();}
		 catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				try {
					if (fos !=null) fos.close();
					if (fis !=null) fis.close();
				}catch (Exception e2) {
				}
				}finally {
					
				}		}
		}
}
		
	
