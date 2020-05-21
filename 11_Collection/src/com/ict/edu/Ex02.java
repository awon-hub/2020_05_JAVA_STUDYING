package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
	public static void main(String[] args) {
		// 인터페이스는 객체를 못만들어 (추상메소드)
		// 완벽하게 구현하는 애가 상속받는 애가 둘이 있어.
		// set 중복. 정렬이 안된다~

		// Set 인터페이스를 구현한 클래스 : HashSet, TreeSet;
		// 특징 : 중복안됨, 정렬안됨( 단 , TreeSet은 항상 오름차순 상태)

		// 컬렉션 생성 : HashSet<제네닉= 객체타입= 클래스> 참조변수 = new HashSet<제네닉>();
		HashSet<Integer> h1 = new HashSet<Integer>();
		HashSet<Double> h2 = new HashSet<Double>();
		HashSet<Boolean> h3 = new HashSet<Boolean>();

		TreeSet<Character> h4 = new TreeSet<Character>();
		TreeSet<String> h5 = new TreeSet<String>();

		// 해당 컬렉션에 객체 넣기
		// 1. 객체로 만들기
		Integer k1 = new Integer(10); // 박싱
		Integer k2 = new Integer("20");

		// 2. 컬렉션에 넣기(add)
		h1.add(k1);
		h1.add(k2);

		h1.add(new Integer(30));
		h1.add(new Integer("40"));

		h1.add(50); // 오토박싱 : 자료형 int 50을 자동으로 객체로 만들어서 넣어준다.
		h1.add(60);

		// Double 넣기
		Double d1 = new Double(10); // 인자로 받는게 자료형 그래서 인트를 넣을 수 있음.
		Double d2 = new Double("20");

		h2.add(d1);
		h2.add(d2);

		// h2.add(10); // 오토박싱은 자료형이 안맞으면 아예 안들어감.
		// 무조건 자료형이 맞아야 들어감.
		h2.add(10.0);

		h3.add(true);
		h3.add(false);
		h3.add(true); // 오류는 나지 않지만 들어가지 않는다. *중복허용xx

		h4.add('j');
		h4.add('a');
		h4.add('v');
		h4.add('a');// 오류는 나지 않지만 들어가지 않는다. *중복허용xx

		h5.add("java");
		h5.add("html");
		h5.add("jsp");
		h5.add("css");
		h5.add("db");

		System.out.println("==========================");
		System.out.println("전체내용보기"); // 배열과 보여주는 내용이 다름
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
		System.out.println(h5);
		System.out.println("==========================");

		System.out.println("하나씩 보기<개선된 for문, iterator>"); // 인덱스가 없어서,
															// 일반for문으로 못부름

		for (Integer k : h1) {
			System.out.print(k + " ");
		}
		System.out.println();

		// 언박싱 : 객체를 일반적으로 사용하는 자료형으로 변환
		for (int k : h1) {
			System.out.print(k + " ");
		}

		System.out.println();
		System.out.println("하나씩 보기 < iterator>");

		Iterator<Double> it = h2.iterator();
		while (it.hasNext()) { // 다음게 있니? y / n 다음객체가 존재하면 true
			// 다음 객체를 꺼대기 위해서 이동하고 반환한다.
			double res = (double) it.next();
			System.out.print(res + " ");
		}
		System.out.println();

		System.out.println("==========================");

		// h4, h5 출력
		// character string
		for (char k : h4) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		Iterator<Character> it3 = h4.iterator();
		while (it3.hasNext()) {
			char res = (char) it3.next();
			System.out.print(res+"    ");
		}
		
		System.out.println();
		
		System.out.println("==========================");
		for (String k : h5) {
			System.out.print(k+"  ");
		}
		System.out.println();
		
		
		  Iterator<String> it2 = h5.iterator();
		   while (it2.hasNext()) {
			String res = (String) it2.next();
			System.out.print(res+" ");
		}
		System.out.println();
		
		
	}
	   
	   
}
