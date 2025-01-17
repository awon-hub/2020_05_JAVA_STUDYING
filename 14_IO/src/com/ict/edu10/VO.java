package com.ict.edu10;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class VO implements Externalizable {

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private String hak;

	public VO() {
	}

	// 생성자를 만드는데 다 선택하는게 아니야
	// 왜냐면 정보는 이름 점수만 전달받을 거거든.
	// 생성자 왜만들어? 초기값 주려고. 방법은 많아.근데 그중 생성자에서 넣는 방법
	public VO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

		sum = kor + math + eng;
		avg = (int) (sum / 3.0 * 10) / 10.0;

		hak = "";
		if (avg >= 90) {
			hak = "A";
		} else if (avg >= 80) {
			hak = "B";
		} else if (avg >= 70) {
			hak = "C";
		} else {
			hak = "F";
		}

	}
	//역직렬화
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		name=(String)in.readObject();
		sum= (int)in.readObject();
		avg= (double)in.readObject();
		hak = (String)in.readObject();
	}

	@Override //쓰는거 직렬화
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(sum);
		out.writeObject(avg);
		out.writeObject(hak);
		//fm은 kor, eng, math 까지 다 써야해.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

}
