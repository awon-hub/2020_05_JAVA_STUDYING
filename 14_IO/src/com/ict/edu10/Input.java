package com.ict.edu10;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Input {
	public static void main(String[] args) {
		
	
		String pathname 
		= "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io13.txt";
		File file = new File(pathname);
		
	
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois =null;
	
		
		String savepath = // 쓰는위치
				"C:" + File.separator + "study" + File.separator + "Util" + File.separator + "io13_전환.txt";
		File file2 = new File(savepath);
		
		//문자 스트림을 쓰시지요.
		FileWriter fw = null;
		BufferedWriter bw =null;
		
	
		
		
		try {
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			
			fis =new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			ArrayList<VO> list = (ArrayList<VO>) ois.readObject();
			System.out.println("이름\t총점\t평균\t학점");
			for (VO k : list) {
				System.out.print(k.getName()+"\t");
				System.out.print(k.getSum()+"\t");
				System.out.print(k.getAvg()+"\t");
				System.out.println(k.getHak());
				
				
				bw.write(k.getName()+"\t");
				bw.write(k.getSum()+"\t");
				bw.write(k.getAvg()+"\t");
				bw.write(k.getHak()+"\n");
			
				
			}
			bw.flush();
		
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				bw.close();
				fw.close();
				ois.close();
				bis.close();
				fis.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
}
