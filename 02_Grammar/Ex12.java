class Ex12{
	public static void main(String[]args){
	//3989초는 몇 시간, 몇 분, 몇 초 인가?
	int time = 3989;
	int h = 0;
	int m = 0;
	int s = 0;
	int res = 0; //나머지 값

	//시간 구하기 ( 60*60 = 3600을 나는 몫이 시간)
	h = time / 3600; //정수 나누기 정수는 정수. 즉, 몫임

	//나머지 구하기
	res = time % 3600;

	//분 구하기
	m = res / 60;
	//초 구하기
	s = res % 60;
	

	//출력하기
	System.out.println(time + " 초는 " + h + " 시 " + m + " 분 " +  s + " 초 입니다.");
	}
}