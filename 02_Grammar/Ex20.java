
public class Ex20 {
	public static void main(String[] args) {
	// 중첩 삼항 연산자 : 삼항연산자가 중첩된것
	// char k1이 대문자, 소문자, 기타문자 인지 판별하자
		
		char k1 ='p';
		String res = (k1>='A'&& k1<='Z') ? "대문자" : (k1>='a'&& k1<='z')? " 소문자" : "기타문자";
		System.out.println(res + "이다");
		
		System.out.println("--------------------------");
		
		//int k2가 90이상이면 A학점 ,80이상이면 B학점, 나머지는 F학점
		
		int k2 = 94;
		res = (k2 >=90)? "A학점" : (k2 >=80)? "B학점" : "F학점";
		System.out.println("결과 : " + res);

	//(k2 >=80 && k2<90)라고 쓸필요 없음.
	// 대전제에서 이미 걸러진다.
		
		// int k3 가 1 또는 3이면 남자, 2 또는 4이면 여자 , 나머지는 외국인
		int k3 =1;
		res = (k3==1 || k3==3)? "남자" : (k3==2 || k3==4)? "여자" : "외국인";
		System.out.println(" 결과 : " + res);		
		
		// int k3 가 1 또는 3이면 남자, 2 또는 4이면 여자 , 나머지는 외국인
		// 1 또는 2이면 1900년대 생, 3 또는 4이면 , 2000년대에대 생
		
		int k4 =5;
		res = (k4==1 || k4==3)? ((k4==1)? "1900년대생 남자 " : "2000년대생 남자")
				
				
				: (k4==2 || k4==4)? ((k4==2)? "1900년대생 여자" : "2000년대생 여자") : "외국인";
	 
		System.out.println(" 결과 : " + res);		
				
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
