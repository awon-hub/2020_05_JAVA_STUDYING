package com.ict.edu06;
//ObjectOutStream : 객체 출력 스트림 : 바이트 스트림:
//WriteObject() :직렬화 메소드. (내용을 못봐요) -> 인풋스트림으로 역으로 풀어야함. 
//입력하는데 (쓴다) 그래서 Output, VO가 필요해 
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Output {
	public static void main(String[] args) {
		
		String pathname 
		= "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io09.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos =null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			
			//하나의 객체 정보를 담아 보자
			
			VO vo = new VO("고길동", 34, 70.4, true);
			
			//쓰는게 객체 직렬화 하는거라구, 그때 writeObject 쓰라구, 누가 가지고 있어? oos
			
			oos.writeObject(vo);
			oos.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				oos.close();
				bos.close();
				fos.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}finally {
				
			}
		}
		
	}
}
