package com.ict.edu01;


enum Type{
	WALKING,RUNNING,TRACKING,HIKING
}
public class Ex02 {
	public String name;
	public int size;
	public Type type;
	
	
	public static void main(String[] args) {
		//System.out.println("name");
		
		Ex02 shoes = new Ex02();
		shoes.name = "나이키";
		shoes.size = 270;
		shoes.type = Type.RUNNING;
		
		System.out.println("신발 이름 : " + shoes.name);
		System.out.println("신발 사이즈 : " + shoes.size);
		System.out.println("신발 종류 : " + shoes.type);
		
		
	}
	
}
