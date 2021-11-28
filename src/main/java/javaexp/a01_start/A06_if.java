package javaexp.a01_start;

public class A06_if {
	public static void main(String args[]) {
		/*
		# 조건문..
		1. if(비교연산자)
		 * */
		int inputPoint = 60;
		System.out.println("입력한 점수:"+inputPoint);
		if(inputPoint>=70) {
			// 비교연산자의 결과가 true일 때만 해당 내용을 수행 처리..
			System.out.println("통과!!");
		}
		System.out.println("처리 끝!!");
		/*
		2. if(비교연산자){
				비교 연산자가 true일 때, 처리할 부분
		   }else{
		   		비교 연산자가 true가 아닐 때, 처리할 부분..
		   } 
		 */
		int age = 15;
		System.out.println("입력한 나이:"+age);
		if(age>=18) {
			System.out.println("성인입니다!");
		}else {
			System.out.println("미성년입니다!");
		}
		// ex) 가격과 갯수를 변수를 선언하고 할당한 후, 총비용이 10000이상이면
		//    10%할인 입니다. 그외에는 5%할인입니다를 출력 처리..
		int price = 3000;
		int cnt = 20;
		int tot = price*cnt;
		
		if(tot>=10000) {
			System.out.println("10%할인:"+tot*0.9);
		}else {
			System.out.println("5%할인:"+tot*0.95);
		}
		
	}
}
