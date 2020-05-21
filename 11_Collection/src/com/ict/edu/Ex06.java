package com.ict.edu;

import java.util.HashSet;

public class Ex06 {
	public static void main(String[] args) {
		//컬렉션을 배열로 변경 => toArray()
		// 배열을 컬렉션으로 변경
		String [] str = {"java","JAVA","Java","자바"};
		
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		HashSet<String> set3 = new HashSet<String>();
		
		//배열의 길이만큼 반복실행. set1이 아님.
		for (String k : str) {
			set1.add(k);
		}
		System.out.println(set1); //지 마음대로 나옴. 
		System.out.println("==========");
		
		//set1의 모든 요소를 set2에 넣어주세요. 
		set2.addAll(set1);
		
		
		
		//추가
		set1.add("HTML");
		set1.add("CSS");
		
		System.out.println(set1); // 추가 되어 나옴
		System.out.println(set2); // 4개만 있음. 
		System.out.println("==========");
		
		//set2의 "자바"삭제
		set2.remove("자바");
		System.out.println(set2); // 삭제됨
		System.out.println("==========");
		//set2의 다른정보 넣기.
		set2.add("jsp");
		set2.add("andorid");
		set2.add("Python");
		
		System.out.println(set1); //
		System.out.println(set2); //
		System.out.println("==========");
		
		//중복 검사
		//set 2에 정보를 set1에 추가한다.
		for (String k : set2) {
			//중복되었을때 (추가가 안되는 경우) 
			if (! set1.add(k)) {
				set3.add(k);
			}
		}
		
		System.out.println(set1);
		System.out.println(set3);
	}
}
