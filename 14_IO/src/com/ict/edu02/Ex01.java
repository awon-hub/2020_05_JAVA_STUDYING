package com.ict.edu02;

public class Ex01 {
	//Stream(스트림)
	// 데이터를 목적지까지 입력,출력 하기 위한 방법
	// 스트림에서 데이터를 쓰는 경우 (출력 스트림)
	// 스트림에서 데이터를 읽는 경우 (입력 스트림)
	
	// 스트림의 종류는  1 바이트 스트림 2 문자 스트림
	//				그 사이에    바이트 + 문자 스트림 결합
	// 				   3. 오브젝트 스트림.
	// 1. 바이트 스트림 1바이트 (기계중심)
	//	모든 처리를 1byte씩 처리한다. 
	// 대상은 1byte로 이루어진 모든 파일 ( 음악, 동영상 사진 등 모든 파일 + 영문자)
	//왜냐면 영문자도 1byte 니까.
	// 최상위 클래스은 :InputStream(입력), OutputStream(출력)
	//
	// 2. 문자 스트림 : 사람중심 
	// 모든 처리를 2byte씩 처리한다.
	// 대상: 세계 모든 언어 구성된 문서 파일을 입출력할 때 사용
	// 최상위 클래스 : Reader(입력), Writer(출력)
	
	//3. 바이트- 문자 스트림 결합 : 기계를 통해 입/출력한 정보를 사람이 사용할 수 있도록
	//입출력하는것 
	//	해당클래스 :: inputStreamReader(입력), OutputStreamWriter(출력)
	
	
	//4. 오브젝트 스트림 : 객체를 직렬화 한 후 객체 단위로 입출력을 하는 것.
	//		해당 클래스 : ObjectInputStream(readObject()) : 객체 직렬화
	//					 ObjectOutputStream(writeObject()) : 객체 역 직렬화 
	
}
