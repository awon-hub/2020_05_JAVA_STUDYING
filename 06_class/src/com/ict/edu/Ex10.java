package com.ict.edu;

public class Ex10 {

		private String name ;
		private int sum ; 
		private double avg ;
		private String score;
		private int rank = 1 ;
		
		//합계
		public int s_sum(int kor, int eng, int math) {
			return kor +eng + math ;
		
		}
		
		//평균
		public double s_avg() {
			return (int)(sum / 3.0 *10) /10.0;
			
		}
		//학점
		public String s_score() {
			if (avg>=90) {
				score = "A";
			}else if (avg>=80) {
				score = "B";
			}else if (avg>=70) {
				score = "C";
			}else {
				score = "F";
			}
			return score;
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


