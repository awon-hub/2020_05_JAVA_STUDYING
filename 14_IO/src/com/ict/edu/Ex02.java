package com.ict.edu;
//파일만들기

import java.io.File;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) {
		String pathName = "c:" + File.separator + "study" + File.separator + "Util" + File.separator + "test.txt";

		// 없으면 만들어지고, 있으면 안만들어져! 두번째는 안만들어져.
		// 파일 클래스 안에 명령어가 있어요!

		// 위치가 다르면 오류가 날텐데?
		// 트라이 캐치 해줘.
		File file = new File(pathName);
		try {
			boolean res = file.createNewFile();

			if (res) {
				System.out.println("파일 생성 성공");
			} else {
				System.out.println("파일 생성 실패1 ");
			}

		} catch (IOException e) {
			System.out.println("파일 경로가 틀렸습니다. ");
			e.printStackTrace();
		}

		System.out.println("===============================");
		String pathName2 = "c:" + File.separator + "study" + File.separator + "Util" + File.separator + "test.txt";

		// 없으면 만들어지고, 있으면 안만들어져! 두번째는 안만들어져.
		// 파일 클래스 안에 명령어가 있어요!

		// 위치가 다르면 오류가 날텐데?
		// 트라이 캐치 해줘.
		File file2 = new File(pathName);

		boolean res2 = file2.mkdir();

		if (res2) {
			System.out.println("디렉토리 생성 성공");
		} else {
			// 경로가 틀리거나 같은 디렉토리가 있으면 실패
			System.out.println("디렉토리 생성 실패 ");
		}

		System.out.println("===============================");

		// 파일삭제
		// 디렉토리 삭제
		// delete();
		String pathName3 = "c:" + File.separator + "study" + File.separator + "Util" + File.separator + "test.txt";
		File file3 = new File(pathName);

		boolean res3 = file.delete();

		if (res3) {
			System.out.println("파일 생성 성공");
		} else {
			System.out.println("파일 생성 실패1 ");
		}

	}
}
