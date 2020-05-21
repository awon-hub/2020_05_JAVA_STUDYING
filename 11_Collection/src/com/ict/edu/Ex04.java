package com.ict.edu;

public class Ex04 {

	
	private String name ;
	private int sum ; 
	private double avg ;
	private String score;
	private int rank = 1 ;
	
	//합계
	public void s_sum(int kor, int eng, int math) {
		sum = kor +eng + math ;
		s_avg();
	}
	
	//평균
	public void s_avg() {
		avg = (int)(sum / 3.0 *10) /10.0;
		s_score();
	}
	//학점
	public void s_score() {
		if (avg>=90) {
			score = "A";
		}else if (avg>=80) {
			score = "B";
		}else if (avg>=70) {
			score = "C";
		}else {
			score = "F";
		}
	}
		
		
		
		
	

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

	

