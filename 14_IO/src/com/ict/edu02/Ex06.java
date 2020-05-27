package com.ict.edu02;
//복사 이동은 이것 뿐! // 패키지로 사용 가능하다. 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex06 {
	public static void main(String[] args) {
		
		//사진, 동영상, 음악은 1byte씩 무조건 처리.
		// 먼저 읽어야 쓰지. 읽어야겠죠.
		String pathname1 = // 읽는 위치
				"C:" + File.separator + "study" + File.separator + "Util" + File.separator + "video.mp4";
		File file1 = new File(pathname1);

		String pathname2 = // 쓰는위치
				"C:" + File.separator + "study" + File.separator + "Util" + File.separator + "비디오.mp4";
		File file2 = new File(pathname2);

		FileInputStream fis= null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(file1); //얘도 버퍼 붙일수 있어 그냥 속도 향상.
			fos = new FileOutputStream(file2); // 얘도 버퍼 붙일수 있어. 
			
			int k = 0;
			while ((k=fis.read())!= -1) {
			fos.write(k);
			}
			fos.flush();}
		 catch (Exception e) {
		} finally {
			try {
				try {
					System.out.println("수고하셨습니다."); //다하면 찍는다. 용량 커서... 그래서 버퍼를 쓰지요!
					
					if (fos !=null) fos.close();
					if (fis !=null) fis.close();
				}catch (Exception e2) {
				}
				}finally {
					
				}		}
		}
}
		
	
