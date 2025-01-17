class Ex15{
	public static void main(String[]args){
	//논리 연산자 : &&(AND, 논리곱), ||(OR, 논리합), !(NOT, 논리부정)
	//논리연산자의 대상 (들어오는 정보) : boolean, 비교연산, 논리연산
	//논리연산의 결과는 boolean형. 즉, 조건식에 사용된다.

	//AND (&&, 논리곱) 
	//주어진 조건이 모두 true일때 결과는 true
	// 즉, false 를 만나면 결과는 false
	//false 를 만나면 이후 연산을 하지 않음
	// a >=10&& a<=20 의 의미는 a는 10부터 20까지의 범위를 의미한다.

	int su1=10;
	int su2=7;
	boolean result = false;
	result = (su1>=7)&& (su2 >=5); // true = true && true
	System.out.println("결과 : " + result);

	
	result = (su1>=7)&& (su2 <=5); // false = true && false
	System.out.println("결과 : " + result);

	result = (su1<=7)&& (su2 >=5); // false = false && true
	System.out.println("결과 : " + result);

	result = (su1<=7)&& (su2 <=5); // false = false && false
	System.out.println("결과 : " + result);
	System.out.println("=======================================================================");


	result= ((su1 = su1 +2 )> su2) && (su1 == (su2 = su2 +5));
	System.out.println("결과 : " + result);
	System.out.println("su1 : " + su1);
	System.out.println("su2 : " + su2);


	System.out.println("=======================================================================");

	//su2가 17이 되는게 아니라, 먼저 거짓을 만나 계산을 안하기 때문에 12 그대로 이다. 
	//&&는 false 를 만나면 결과는 거짓이고, 뒤 조건은 연산하지 않는다.
	result= ((su1 = su1 +2 )< su2) && (su1 == (su2 = su2 +5));
	System.out.println("결과 : " + result);
	System.out.println("su1 : " + su1);
	System.out.println("su2 : " + su2);


	System.out.println("=======================================================================");

	su1= 34;
	//  su1의 값이 20~30 사이의 값이냐?
	result = (su1>=20)&&(su1<=30);
	System.out.println("결과 : " +result);


	//  char c1이 소문자이냐?
	char c1 ='G';
	result = (c1>=97) && (c1<=122);
	System.out.println("결과 : " +result);

	
	result = (c1>='a') && (c1<='z');
	System.out.println("결과 : " +result);

	}
}