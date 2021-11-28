package javaexp.a00_exp;

public class A01_1029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		블럭씌워서 ctrl+/ 하면 단일 주석 설정.
//		
//		
//		
//		
//		
		// 다중 주석 내용은 삭제 처리..
//		1. 자바의 기본 변수 선언과 할당을 통해 아래의 변수를 선언하고 출력하세요
//    		이름  나이 취미
		String name = "홍길동";
		int age = 25;
		String hobby;
		hobby = "음악감상";
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("취미:"+hobby);		
//  	2. 변수와 사칙연산자와 나머지 연산를 활용하여 아래와 같은 내용을 처리하세요
//	//    1) 곰돌이 3마리가 5개씩 빵을 먹은 총갯수
		int bearCnt = 3;
		int perBread = 5;
		int totBread = 20;
		System.out.println("곰돌이 3마리가 5개씩 빵을 먹은 총갯수"+(bearCnt*perBread));
//	//    2) 20개의 빵을 3마리의 곰돌이가 동일하게 먹은 갯수와 남은 나머지
		System.out.println("20개의 빵을 3마리의 곰돌이가 동일하게 먹은 갯수:"
				+(totBread/bearCnt)
				+"와 남은 나머지:"+(totBread%bearCnt));	
//	//    3) 총잔액 100000에서 교통비3000 2회 식대 7000, 간식비 3000을
//	//        뺀 나머지
		int rest = 100000;
		int tranPay = 3000;
		int foodPay = 7000;
		int food2Pay = 3000;
		// ()를 통해서 문자열 구분.. : 괄호 최우선, 곱셈/나눗셈, 덧셈/뺄셈
		System.out.println("총잔액 100000에서 교통비3000 2회 식대 7000, 간식비 3000을 뺀 나머지"
				+(rest-(tranPay*2+foodPay+food2Pay)));		
//	 	3. 컴퓨터 가격이 1000000이상이면 고가 그외는 저가로 처리하기로 했다.
//	//    해당 프로그램을 조건문에 의하여 처리하고 출력하세요.
		int comPrice = 1200000;
		if(comPrice>=1000000) {
			System.out.println("고가");
		}else {
			System.out.println("저가");
		}
		
//	 	4. 반복문을 이용하여 15~45까지 출력하고, 10부터 discount 0까지 출력하세요.
		for(int cnt=15;cnt<=45;cnt++) {
			System.out.print("카운드1:"+cnt+"\t");
		}
		System.out.println();
		for(int cnt=10;cnt>=0;cnt--) {
			System.out.print("카운드2:"+cnt+"\t");
		}		
		System.out.println();		
//	 	5. 자바의 heap영역과 stack영역에 대하여 객체의 메모리 사용 방법을 예제를 통해 기술하세요.
		/*		객체는 heap영역에 객체를 생성하고 stack영역에 객체의 주소값을 저장한다.
		  	    primitive데이터는 stack영역에 바로 데이터를 할당한다. */
		// new Product("사과") : 객체를 생성을 하면 heap영역에 객체가 생성이 되어 만들어 진다.
		// 이 heap영역의 주소값을 p1에 할당되어 진다.
		// p1을 통한 주소값은 stack영역에 할당되어 진다.
		Product p1 = new Product("사과");
		Product p2 = new Product("바나나");
		System.out.println("주소1:"+p1);
		System.out.println("주소2:"+p2);
		
	}

}
class Product{
   String name;
   Product(String name){
     this.name = name;
   }
}
	                     



