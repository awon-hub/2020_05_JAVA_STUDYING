package com.ict.edu2;

public class Main {
	public static void main(String[] args) {
		DcaPhone dca = new DcaPhone();
		
		dca.call(); // 부모
		dca.sms(); //부모
		dca.dca(); //자식
		
		System.out.println("===========");
		//자식 = 자식
		Mp3Phone mp3= new Mp3Phone();
		mp3.call();// 부모
		mp3.sms();// 부모
		mp3.sound();//자식
		
		System.out.println("===========");
		GamePhone gp = new GamePhone();
		gp.call();// 부모
		gp.sms();// 부모
		gp.play();//자식
		
		System.out.println("===========");
		
		//부모 = new 자식
		Phone p1 = new DcaPhone();
		p1.call(); // 부모
		p1.sms(); //부모
		//p1.dca(); //자식 자식에서 오류.
		
	}
}
