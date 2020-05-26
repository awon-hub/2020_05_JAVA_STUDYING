package com.ict.edu2;
//1. 바이트 스트림 1바이트 (기계중심)
//글자에 최적화
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//	모든 처리를 1byte씩 처리한다. 
//			대상 : byte로 이루어진 모든 파일 ( 음악, 동영상 사진 등 모든 파일 + 영문자)
//최상위 클래스은 :InputStream(입력), OutputStream(출력)

//FileOutputStream 주요 메소드. ( 아웃풋 스트림은 쓰는거야 파일에다가 쓰는거야 뭐를 글자를 )
//write(int b) : int b =>아스키코드(숫자)하나 쓸수 있다. -> 한글자 쓰기
//				char 하나를 사용할수 있다
//				영문자 대소문자 숫자 일부 특수문자 쓰기 가능
//				영어를 뺀 나머지 글자는 사용 불가

//2. write(byte[] b) : byte 배열사용할 수 있다.
//3. flush() : write 후 반드시 사용
//4. close() : open 된 Stream을 닫기 (finally 로 처리)
public class Ex04 {
	public static void main(String[] args) {
		
	
	String pathname 
	= "C:"+File.separator+"study"+File.separator+"Util"+File.separator+"io02.txt";
	FileOutputStream fos = null;  // 여기도 지역이야. 
	File file = new File(pathname);
	try {
		//해당 파일이 없으면 만들고, 없으면 덮어쓰기 된다. true 붙으면 이어쓰기 된다. 
		//이어쓰기
		fos = new FileOutputStream(file);  // 파일을 열었으면 finally 해. 첫 트라이 캐치.
	
	
		String str = "Phone\n010-7761-8633\n이름 : 우아원\nage : 28";   
		byte[]b2 = str.getBytes();
		fos.write(b2);
		fos.flush();
		
	} catch (FileNotFoundException e) { // 캐치 파일이 발견안되면
		e.printStackTrace();
	} catch (IOException e) { // 캐치 입출력을 못하면
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			//if(fos!=null) 사용했으면 닫아주세요 fm. 후에 안씀. 
				fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
			
}

}
