package javaexp.a01_start;

public class A03_Declare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// # 선언
		// 데이터유형 사용할이름;
		int num01; // 정수형데이터를 할당할 것이고, 이름을 num01이라고 명명
		// 변수명 = 할당할 데이터
		num01 = 27; //  num01이라는 변수에 25가 할당이 됨.
		System.out.println(num01);// num01을 통해서 할당된 데이터를 출력
		System.out.println("num01에 할당된 데이터는 "+ num01 + "입니다");
		// ex) 사과의 가격(price)을 변수로 선언하고, 3000 할당하여 출력
		//     갯수를 변수(cnt)로 선언하고, 3을 할당하고 출력..
		//     사과의 가격은 @@@원 이고, 구매한 갯수는 @@개 입니다.
		int price;	// 선언 : 어떤 크기의 메모리를 @@이름으로 선언
		price =3000; // 할당
		//int price = 4000; 에러발생
		price = 4000; // 재할당
		int price2 = 4000; // 다른 이름으로  선언과 할당.
		
		
		int cnt = 3;  // 선언 + 할당
		System.out.println("사과의 가격은 "+price+"원이고, 구매한 갯수는 "+cnt+"개 입니다.");
		// 산출연산자와 그 결과를 대입 연산자를 통해 결과를 할당하여 처리.
		int tot = price*cnt;
		System.out.println("총비용은 "+tot+"원");
		// 문자열 데이터
		// String 변수명 = "할당할 문자열";
		String name = "홍길동";
		System.out.println("이름:"+name);
		
		
		
		
		
		
		
		
	}

}
