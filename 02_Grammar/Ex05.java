class Ex05{
	public static void main(String[] args){
	//�Ǽ� : �Ҽ����� ����.
	//float < double
	// �Ǽ��� �⺻ double


	// float�� ���� �ڿ� �ݵ�� F,f�� �ٿ��� �Ѵ�. (������ ����) ������ ����.
	//24�� �����̹Ƿ� float �Ǽ��� ����ȴ�.
	float su1 =24;
	System.out.println(su1);
	
	//31.4�� f or F�� �ٿ��� �Ѵ�.
	float su2 =31.4F;
	System.out.println(su2);

	// char c1�� float�� ������ �� �ִ�.
	char c1 = 97;
	System.out.println(c1);

	float su3 = c1;
	System.out.println(su3);

	//double �� byte,short,char,int,long,float ��� �޾� ������ �� �ִ�.
	double su4=3.14;
	System.out.println(su4);


	double su5= su3;
	System.out.println(su5);
	
	double su6= c1;
	System.out.println(su6);

	}
}