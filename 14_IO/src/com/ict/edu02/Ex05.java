package com.ict.edu02;
//1. 바이트 스트림 1바이트 (기계중심)
//글자에 최적화
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//	모든 처리를 1byte씩 처리한다. 
//			대상 : byte로 이루어진 모든 파일 ( 음악, 동영상 사진 등 모든 파일 + 영문자)
//최상위 클래스은 :InputStream(입력), OutputStream(출력)

//FileInputStream 주요 메소드. ( 인풋 스트림은 읽는거야 파일을 )
//- read() :읽어라. 반환형 int 결과가 숫자 하나 로 나오는데 (아스키 코드로 나옴)
//		   char로 형변환 해서 문자로 변경해야 함.
// read(byte [] b) : int => 배열 크기를 지정해야함.  ( 아원: 랭스 처리?하나? )
// 해결 방법! :     1byte씩 배열에 저장하고, 읽는 수 만큼 반환한다.

//4. close() : open 된 Stream을 닫기 (finally 로 처리)



public class Ex05 {
	public static void main(String[] args) {

		String pathname 
		= "C:" + File.separator + "study" + File.separator + "Util" + File.separator + "io02.txt";
		File file = new File(pathname);
		
		FileInputStream fis = null; // 여기도 지역이야.
		try {
			fis = new FileInputStream(file);
			
			//한 글자 읽어 오기 : read(); 그림, 소리, 동영상을 파일을 읽는 방법. (중요!중요!중요!) 글자읽는방법아님.
			//비영어권은 못 읽는다. 
			
			//int k = fis.read();
			//System.out.println(k+":"+(char)(k));
			
			
			
			//int k2 = 0;
			//while (true) { 
			//k2 = fis.read();    얘랑
			//	if(k2==-1) break;// 얘가 축약.읽어온 숫자가 -1 이면 더 이상 읽을 수 없다.  -1이면 끝났다.
			//		System.out.print(k2+":"+(char)(k2)+"  ");
			//}
			
			//위를 줄이자
			
			/*
			int k2 = 0;
			while ((k2 = fis.read())!=-1 ) {   //-1일 아니면 돌아라. (읽어서 넘긴값)!= 1 
				System.out.print((char)(k2));
			}
			
			//비영어권은 못 읽는다. 
			*/
			
			//여기까지 하나씩 읽는 방법
			
			//여기부터는 배열로 읽는 방법! 그럼 배열을 미리 만들어야겠네?  글자니까 이렇게 쓰는거야. 그림ㄴㄴ
			
			//byte[]b = new byte[20];
			//byte[]b = new byte[(int)(file.length())];
			//읽어서 byte [] b에 넣어준다. (배열 크기만큼만 넣어준다.)
			//fis.read(b);
			//for (byte k : b) {
			//	System.out.print((char)(k));
			//}
			
			
			//String 이용하는 방법  : 한글 한자 다 나옴. 
			byte[]b = new byte[(int)(file.length())];
			fis.read(b); //파일에 있는 내용 다 읽어서 바이트에 넣는거.
			String str= new String(b); // 그거를 스트링으로 넣자.
			System.out.println(str);
			
			
			
		} catch (Exception e) {
		}finally {
			try {
				if (fis !=null)fis.close();
			} catch (Exception e) {
			}
		}
		
		

	}

}
