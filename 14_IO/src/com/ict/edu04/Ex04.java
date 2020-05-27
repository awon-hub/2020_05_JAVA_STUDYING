package com.ict.edu04;
//BufferedReader: 속도향상, 

//readLine() 메소드로 -> 한줄씩 읽는다. 더이상 읽을 수 없을때 null이 된다.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex04 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io07.txt";
		File file = new File(pathname);
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			// 한줄 읽기
			// String msg = br.readLine();
			// System.out.println(msg);

			// 모두읽기
			String msg = null;
			String str = "";
			StringBuffer sb = new StringBuffer(); //1 버퍼를 쓰세요.
			while ((msg = br.readLine()) != null) {
				// System.out.println(msg); 한줄 읽고 한번에 읽기위해저장하고 싶어 ! 그럼 어떻게 해야하지?
				// str = str.concat(msg+"\n");
				sb.append(msg+"\n"); //2 어팬드를쓰세요.메모리는 한개짜리야 계속 누적돼. 이거 쓰는게 마장. 뒤에 붙는다공. 그럼 한줄로가. 
				

			}
			System.out.println(str);
			System.out.println(sb.toString()); //3볼때는 to.String을 쓰세요. 
		} catch (Exception e) {
			// TODO: handle exception
		} finally {

		}
		try {
			br.close();
			fr.close();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {

		}
	}
}
