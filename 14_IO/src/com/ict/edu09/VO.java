package com.ict.edu09;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

//Serializable외 다른방법
//얘는 되게 웃긴데.
//1.Externalizable
// writeExternal => 직렬화, readExternal => 역직렬화 
//제외 시키는 방법 : transient소용이 없다.
//writeExternal()와  readExternal()안에있는 멤버를 동시에 제외시킨다.
public class VO implements Externalizable {

	private String name;
	private int age;
	private double weight;
	private boolean gender;

	public VO() {
		// TODO Auto-generated constructor stub
	}

	public VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}

	@Override //역직렬화. 
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		name = (String)in.readObject(); //같이 써줘야해 안쓰면 제외
		age = (int)in.readObject();
		//weight = (double)in.readObject();
		gender = (boolean)in.readObject();
	}

	@Override // 쓰는게 직렬화 이게 먼저.
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(name); //같이 써줘야해 안쓰면 제외
		out.writeObject(age); //같이 써줘야해 안쓰면 제외
		//out.writeObject(weight); //같이 써줘야해 안쓰면 제외
		out.writeObject(gender); //같이 써줘야해 안쓰면 제외
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
