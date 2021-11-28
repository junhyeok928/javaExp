package javaexp.a00_exp;

import java.util.Scanner;

public class A11_1112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 
[1단계:기본]1. form 태그의 속성을 기술하고, 검색내용:[   ][검색] ==> 검색을 클릭시, 새로운 페이지(jsp)에서
            검색내용을 출력하세요.
[1단계:기본]2. input 태그의 type에 따른 여러가지 형식을 확인할 수 있다. type의 속성값을 기술하고, 해당 속성값
            에 따른 특징을 기술하세요.
[1단계:확인]3. form 객체의 하위 요소객체와 속성을 활용하여 table로 선언된 화면에서 회원가입화면을 만들고,
            가입된 내용을 출력처리하세요. 회원가입내용:아이디, 패스워드, 이름, 성별, 주소, 포인트
[1단계:확인]4. javascript의 기본 출력형식을 기술하고, 하나의 화면에 출력하세요
[1단계:확인]5. h3를 클릭시, 경고문구로 로그인 페이지 이동이라고 출력되게 처리하세요.
== 주간 정리 문제 ==
[1단계:기본]6. css와 javascript의 외부 파일 호출방식을 기술하세요.
[1단계:기본]7. link, img등에 사용되는 상대주소/절대주소의 개념을 예제와 함께 간단하게 기술하세요.
[1단계:기본]8. java와 테이블을 이용하여, 구매할 컴퓨터 부품목록을 리스트 하는 처리를 하세요.
[2단계:알고리즘] 9. 랜덤에 의해 만들어진 구구단을 Scanner 입력값에 의해 맞추면 정답/틀리면 오답을 출력처리하세요.
			구구단을 외자!! 문제 내는 것(컴퓨터) 
			맞추는 사람 Scanner에 의해 데이터 입력..
`				(int)(Math.random()*경우의수+시작수)
		 	임의의 구구단 : 단수(랜덤 2~9), 곱한수(랜덤 1~9)
		 		경우의 수 8가지 시작수 2  : 
		 		
 *  */
		int rGrade=(int)(Math.random()*8+2);
		int rNum=(int)(Math.random()*9+1);
		int corReply= rGrade*rNum;
		System.out.println("## 구구단의 외자!(컴퓨터와 대결) ##");
		System.out.println(rGrade+" X "+ rNum +" ? ");
		Scanner sc = new Scanner(System.in);
		int rply = sc.nextInt();
		if(corReply == rply) {
			System.out.println("정답입니다.!!");
		}else {
			System.out.println("오답입니다.!!");
		}
		System.out.println("답은 "+corReply+" 입니다!!");
		
	}

}
