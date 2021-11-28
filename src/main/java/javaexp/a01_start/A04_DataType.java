package javaexp.a01_start;

public class A04_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 다중행 주석
		 1. 정수형과 실수형 데이터 처리
		 2. char 유형의 변경..
		 * 
		 * */
		int num01 = 25;
		double num02 = 30.45;
		System.out.println("정수형 데이터:"+num01);
		System.out.println("실수형 데이터:"+num02);
		char ch01 = 'A'; //홋따옴표로 문자 한자를 할당할 수 있다.
		System.out.println("문자형 데이터:"+ch01);
		// int ==> char ==> char[](문자열) ==> String 문자열객체 사용..
		int code01 = 66; // 정수로 된 데이터 문자와 코드로 연결..
		char ch02 = (char)code01; // int형의 값을 유형변경으로 char로
		// 할당하면 해당 코드값에 연결된 문자가 할당될 수 있다.
		System.out.println(code01+"의 문자:"+ch02);
		// cf) 임시비밀번호==> 임의 비밀번호 생성
		// ex) 학생의 이름, 국어, 영어, 수학 점수 선언, 
		//     총점 데이터를 선언하고 국어,영어,수학점수를 할당 (+)
		//     평균 데이터  총점/3.0로 실수값을 할당하고..
		//    아래 형식으로 출력하세요..
		//     학생 이름 : @@
		//     국어 : @@
		//     영어 : @@
		//     수학 : @@
		//     총점 : @@
		//     평균 : @@
		String name ="홍길동";
		int kor = 70;
		int eng = 80;
		int math = 90;
		int tot = kor + eng + math;
		double avg = tot/3.0; // 실수값이 할당.
		System.out.println("학생 이름:"+name);
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		System.out.println("평균:"+avg);
		/*
		ex2) 구매한 과일의 값 합산 처리
		사과(3000), 2개 구매
		바나나(4000), 3개 구매
		딸기(12000), 5박스 구매
		총비용 : @@@
		다하신 분은 제출해주세요... - 오늘은 과제는 아닙니다. ㅎㅎ..
		
		 * */
		int apple = 3000;
		int appCnt = 2;
		int banana = 4000;
		int banaCnt = 3;
		int strawberry = 12000;
		int strawCnt = 5;
		int tot2 = apple*appCnt + banana*banaCnt + strawberry*strawCnt;
		System.out.println("사과("+apple+"), "+appCnt+"개 구매");
		System.out.println("바나나("+banana+"), "+banaCnt+"개 구매");
		System.out.println("딸기("+strawberry+"), "+strawCnt+"개 구매");
		System.out.println("총비용:"+tot2);
		
		
		
		
	}

}
