class Ex14{
	public static void main(String[]args){
	//비교연산자 : >,< >=,<=,==,!=
	//비교연산자를 사용할 수 있는 자료형 : char, 정수, 실수, (String X)
	//연산 결과는 무조건 boolean형 (true, false)


	int su1 = 90;
	int su2 = 80;

	char su3 = 'a';
	char su4 = 'A';

	double su5 = 97.0;
	double su6 = 78.0;


	boolean result = su1 > su2;
	System.out.println("결과 : " + result);

	//boolean result = su3 > su4;   ERROR!! 변수의 문제가 아니라, 선언을 한번만하기
	//System.out.println("결과 : " + result);
	
	result = su3 > su4;   
	System.out.println("결과 : " + result);

	result = su5 > su6;   
	System.out.println("결과 : " + result);

	
	result = su1> su3;   
	System.out.println("결과 : " + result);

	//비교연산에서는 정수와 실수의 비교가 가능하다.
	result = su1> su5;   
	System.out.println("결과 : " + result);

	result = su3 == su5;   
	System.out.println("결과 : " + result);

	}
}