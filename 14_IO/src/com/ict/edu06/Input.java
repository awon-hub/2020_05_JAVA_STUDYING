package com.ict.edu06;
//ObjectInputStream : 객체 입력 스트림, 바이트 스트림 (인풋스트림이라고 되어있잖아) 글자빼고 다 바이트야!
//readObject() => 역직렬화 메소드
// 받아서 읽는 애. Input, VO 클래스가 필요해. 

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Input {
	public static void main(String[] args) {
		
	
		String pathname 
		= "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io09.txt";
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois =null;
		
		
		try {
			fis =new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			VO vo = (VO) ois.readObject();
			System.out.println(vo.getName());
			System.out.println(vo.getAge());
			System.out.println(vo.getWeight());
			System.out.println(vo.isGender());
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}finally {
				
			}
		}
		
		
	}
}
