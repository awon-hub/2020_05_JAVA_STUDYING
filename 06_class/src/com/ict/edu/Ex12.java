package com.ict.edu;

public class Ex12 {

	private String name;
	private int sum;
	private double avg;
	private String score;
	private int rank;

	// 생성자
	public Ex12() {
	}

	public Ex12(String name, int sum, double avg, String score, int rank) {
		this.name = name;
		this.sum = sum;
		this.avg = avg;
		this.score = score;
		this.rank = rank;

	}
	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
