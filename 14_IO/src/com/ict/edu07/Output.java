package com.ict.edu07;
//ObjectOutStream : 객체 출력 스트림 : 바이트 스트림:
//WriteObject() :직렬화 메소드. (내용을 못봐요) -> 인풋스트림으로 역으로 풀어야함. 
//입력하는데 (쓴다) 그래서 Output, VO가 필요해 
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Output {
	public static void main(String[] args) {
		
		String pathname 
		= "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io10.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos =null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			
			//여러개의 객체 정보를 담아 보자
			//배열아니면, 컬랙션에 담을 수 있지요.
			
			VO vo1 = new VO("고길동", 34, 70.4, true);
			VO vo2 = new VO("마이콜", 16, 56.4, false);
			VO vo3 = new VO("둘리", 14, 86.7, true);
			VO vo4 = new VO("희동이", 3, 20.5, true);
			VO vo5 = new VO("도우너", 47, 94.1, false);
			
			ArrayList<VO> list= new ArrayList<VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			//쓰는게 객체 직렬화 하는거라구, 그때 writeObject 쓰라구, 누가 가지고 있어? oos
			
			oos.writeObject(list);
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
