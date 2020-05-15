package com.ict.edu;

public class Ex06_main {
	public static void main(String[] args) {

		Ex06 e6 = new Ex06();

		System.out.println(e6.name);
		String s = e6.s_name();
		System.out.println(s);

		System.out.println(e6.age);
		int s1 = e6.s_age();
		System.out.println(s1);

		// weight 이 private이라서 바로 접근할 수 없다.
		// System.out.println(e6.weight);

		// 메소드를 이용해서 접근한다. (getter)
		double s2 = e6.s_weight();
		System.out.println(s2);

		System.out.println("================");
		// 이름: 둘리 변경 (setter)
		e6.re_name("둘리"); // 이름변경
		System.out.println(e6.name);
		s = e6.s_name();
		System.out.println(s);

		// 나이 : 5000살

		e6.re_age(5000);
		System.out.println(e6.age);
		s1 = e6.s_age();
		System.out.println(s1);

		// 몸무게 : 10000
		e6.re_weight(10000);
		s2 = e6.s_weight();
		System.out.println(s2);

	}
}
