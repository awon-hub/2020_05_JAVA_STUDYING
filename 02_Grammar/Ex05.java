class Ex05{
	public static void main(String[] args){
	//실수 : 소숫점이 있음.
	//float < double
	// 실수의 기본 double


	// float는 숫자 뒤에 반드시 F,f를 붙여야 한다. (생략시 오류) 더블로 본다.
	//24가 정수이므로 float 실수에 저장된다.
	float su1 =24;
	System.out.println(su1);
	
	//31.4에 f or F를 붙여야 한다.
	float su2 =31.4F;
	System.out.println(su2);

	// char c1는 float에 저장할 수 있다.
	char c1 = 97;
	System.out.println(c1);

	float su3 = c1;
	System.out.println(su3);

	//double 은 byte,short,char,int,long,float 모두 받아 저장할 수 있다.
	double su4=3.14;
	System.out.println(su4);


	double su5= su3;
	System.out.println(su5);
	
	double su6= c1;
	System.out.println(su6);

	}
}