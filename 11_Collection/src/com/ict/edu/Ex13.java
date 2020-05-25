package com.ict.edu;

import java.util.ArrayList;

public class Ex13 {
	public static void main(String[] args) {
		ArrayList<String> List1 = new ArrayList<String>();
		ArrayList<String> List2 = new ArrayList<String>();
		// 다 담음
		List1.add("a");
		List1.add("b");
		List1.add("c");
		List1.add("d");
		List1.add("e");
		List1.add("f");

		List2.add("1");
		List2.add("2");
		List2.add("3");
		List2.add("4");
		List2.add("5");
		List2.add("6");
		List2.add("7");
		List2.add("8");

		// 위에서 뽑으면
		for (int i = 0; i < 3; i++) {
			String team = "";
			for (int j = 0; j < 2; j++) {
				int k = (int) (Math.random() * List1.size());
				String name = List1.get(k);
				team += name+", ";
				List1.remove(name);

			}
			System.out.println(i + 1 + "조 : " + team );
		}
		System.out.println("========================");
		for (int i = 0; i < 3; i++) {
			String team = "";
			for (int j = 0; j < 3; j++) {
				int k = (int) (Math.random() * List2.size());
				String name = List2.get(k);
				team += name+", ";
				List1.remove(name);

			}
			System.out.println(i + 1 + "조 : " + team );
		}

	}

}
