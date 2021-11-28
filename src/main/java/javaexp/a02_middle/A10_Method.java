package javaexp.a02_middle;

public class A10_Method {
	
	// static은 객체 생성없이 사용할 수 공유메모리 영역의 속성을 사용할 때,
	// 선언되는 키워드이다 - 클래스/객체에서 다시 언급
	// 1. 메서드의 구성요소
	// 	1) 리턴유형
	//	2) 매개변수
	//  3) 기능 프로세스 처리
	//  4) 리턴값

	
	
	static String getName(String name) {
		name = name+"님^^";
		return name;
	}	
	//  1. 리턴유형은 해당 메서드를 통해서 리턴하는 값의 유형을 선언하는 것으로
	//      리턴값에 할당할 수 있는 유형으로 선언되어야 한다.
	/*
	ex) 사람의 말을 하는 경우 : 객체가 저장된 음성데이터를 조합해서 말을 한다.
			결과물로 말이라는 것을 리턴한다.
		사람이 뛰어 간다 : 객체가 특정 상황에 판다하여 행동양식으로 뛰어가는 것을 처리함.
		메서드는 저장/프로세스처리/결과정보를 나오게 할 수 있는데,
			이 결과정보를 나오게 하는 것을 리턴처리라고 한다.
		형식으로는 어떤 데이터 유형이 리턴될지를 선언하고
		 리턴할데이터유형 메서드(){
		 
		 
		 	return  실제리턴할데이터;
		 }	
	 * 
	 * */
	static int getNum() {
		return 15;
	}
	// getNum() : 호출시, 15라는 데이터를 가지고 있다.
	// System.out.println(getNum()); // 바로 데이터를 호출
	// int num01 = getNum(); // 다른 변수에 할당 처리.
	
	
	static double getWeight() {
		return 30.5;
	}
	/*
	ex) 리턴 유형 선언
	1. 사원번호(정수형)을 리턴하는 메서드를 선언하고, 호출.
	2. 사원이름을 리턴하는 메서드를 선언하고 호출.
	3. 사원의 몸무게(실수형)를 메서드를 선언하고 호출..
	 * */
	static int getEmpno() {
		return 1100;
	}
	static String getEname() {
		return "홍길동(과장)";
	}
	static double getWeight2() {
		return 75.24;
	}
	static String getName() {
		return "홍길동";
	}
	static int[] getArray() {
		// 배열이 리턴되므로 데이터 유형 선언 
		// 한번에 여러개의 데이터를 리턴 처리
		return new int[]{2000,3000,4000};
	}
	/*
 	main()
 		int [] arry = getArray();
 		arry[0] : 2000;
 		arry[1] : 3000;
 		arry[2] : 4000;
 	
	 * */
	
	
	static double getChangeType() {
		
		double num01 = 25; // promote(작은데이터가 큰데이터유형에 할당)
		return 35;
	}
	static int getChangeTepe2() {
		int num02 = (int)42.24; // casting(큰데이터를 작은데이터유형에 할당될대는 casting)
//		int num03 = 42.24; // 바로 할당은 에러 발생..
		
		return (int)45.24; //
	}
	static int getInt2() {
		// 해당 변수명을 선언하여 데이터를 리턴하는 경우가 많다.
		int num01 = 25;
		num01+=3;	
		return num01;
	}
	//  리턴값이 없는 경우에는
	//  1. 입력값을 통해서 저장.
	//  2. 프로세스 처리.
	//  3. 화면 출력 처리..
	//  ==> 리턴유형 void를 쓴다. 마지막 라인에 return을 삭제..
	static void show() {
		System.out.println("출력하는 처리..(리턴값 필요 없음)");
	}
	static void show2(int num01) {
		int sum = 30;
		sum += num01;
		System.out.println("메서드에 입력된 값:"+num01);
		System.out.println("총합계:"+sum);
	}
	// ex) 리턴유형이 없는 메서드1 인사말(반갑습니다)출력, 메서드2 매개변수로 받은 문자열 출력  @@@님 안녕하세요
	static void greet() {
		System.out.println("반갑습니다.!!");
	}
	static void greet2(String name) {
		System.out.println(name+"님 안녕하세요!!");
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greet();
		greet2("홍길동");
		greet2("김길동");
		greet();
		greet2("신길동");
		
		
		show();
		show2(25);
		show();
		show();
		show2(30);
		show2(50); // 정의해 놓았기 때문에 중복해서 호출하여 사용할 수 있다.
		
		
		
		String name01 = getName("신길동");
		System.out.println("메서드 처리후 결과값:"+name01);
		System.out.println("메서드 처리후 결과값:"+getName("심혜영"));
		System.out.println(getNum()+30);
		System.out.println(getWeight());
		System.out.println("사원번호:"+getEmpno());
		System.out.println("이름:"+getEname());
		System.out.println("몸무게:"+getWeight2());
	}

}
