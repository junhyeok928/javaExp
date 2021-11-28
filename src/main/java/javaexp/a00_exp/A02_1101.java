package javaexp.a00_exp;

import java.util.Scanner;

public class A02_1101 {
	//  기본유형 byte, short, char, int, long, float, double, boolean
	static byte getByte(){
		return 25;
	}
	static short getShort() {
		return 35;
	}
	static char getChar() {
		return 'A';
	}
	static int getInt() {
		return 10000;
	}
	static long getLong() {
		return 4225L; //  정수형 long데이터를 표시를 위해 L를 붙임..
	}
	static float getFloat() {
		return 342.25F; // 실수형 float데이터를 표시하기 위해 F를 붙임
	}
	static double getDouble() {
		return 2433.22;
	}
	static boolean getBoolean() {
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 기본 입력 형식 코드를 기술하고, 가계부를 기준으로
//			현재 잔액이 100000일 때, 날짜, 수입지출구분, 내용, 금액 입력받아, 
//			날짜, 수입지출구분, 내용, 금액, 처리 후 잔액을 출력하세요.
		// 1) 변수지정.
		/*
		int restMoney = 100000;
		String date=null; // 객체의 경우 초기값을 null로 선언한다.
		String div=null;  // 수입지출구분
		String content = null;
		int money = 0;  // 숫자형 데이터 초기값을 0으로 선언한다.
		// 2) Scanner객체 생성
		Scanner sc = new Scanner(System.in);
		// 3) 데이터 입력 처리..
		System.out.print("날짜를 입력하세요(MM/DD):");
		date = sc.nextLine();
		System.out.print("수입지출구분(수입/지출):");
		div = sc.nextLine();
		System.out.print("내역을 입력:");
		content = sc.nextLine();
		System.out.print("금액을 입력:");
		money = sc.nextInt();
		System.out.println("# 처리 결과 #");
		System.out.println("날짜\t구분\t내용\t금액\t잔액");
		System.out.print(date+"\t");
		System.out.print(div+"\t");
		System.out.print(content+"\t");
		System.out.print(money+"\t");
		//System.out.print(restMoney+"\t");
		// 조건으로 잔액의 증가 또는 감소 처리.
		// 문자열의 비교는 ==(자바의 경우에는 문자열 비교시 문제 발생 경우 있음),
		//  문자열1.equals("문자열2")
		if(div.equals("수입")) {
			restMoney += money;
		}else {
			restMoney -= money;
		}
		System.out.print(restMoney+"\n");
		*/
		// 4) 입력된 데이터를 출력형식에 맞게 출력 처리.
//		2. 자바에서 사용되는 괄호의 종류를 기술하고, 사용방법을 정리하세요.
/*			소괄호() : 메서드나 생성의 매개변수를 선언/호출시
  			Person(String name){}
  			Person p = new Person("홍길동");
  			중괄호{} : 클래스,생성자,메서드,조건,반복문에 쓰이면 코드를 처리할 때,
  				종속된 코드는 계층적을 탭을 이용해서 처리하세요..
  				class Person{
  				
  				}
  				주의, 자바에서만 배열을 데이터를 한꺼번에 입력과 할당을 할 때 사용된다.
  				String []arry = {"사과","바나나","딸기"};
  				가능한한, 계층적 처리에 신경을 써야 한다.(에러의 경우 많음) 
  				
  			대괄호[] : 배열을 선언하고, index별로 데이터를 저장 호출할 때, 사용한다.
  			String[] array = null;
  			array = new String[3];
  			array = new String[]{"사과","바나나","딸기"};	
 
 * */				
//		3. 변수명 중복 선언 사용시, 나타나는 에러 내용과 처리 방법을 기술하세요.
			int num01;
//			int num01=24; // 선언하고, 다시 데이터유형을 선언하고, 같은 이름으로 선언시 발생
			// 라인이 한 화면에서 처리되지 않고, 전체 페이지가 변경되는 경우 발생하는데,
			// duplicate local variable이라고 나온다.
			num01=24; // 데이터 유형을 선언하지 않으면 에러가 발생하지 않는다.
		
//		4. 배열의 선언과 할당 유형을 기술하세요.
			String[] arry=null;
			String arry2[]=new String[3];
			arry = new String[] {"사과","바나나","딸기"};
			arry2[0] = "홍길동";
			arry2[1] = "김길동";
			arry2[2] = "신길동";
			String arry3[] = {"오렌지","수박","딸기"};
//		5. 배열로 좋아하는 가수3명, 노래명3개를 선언하여 출력하세요.
			String[] singers = {"이무진","MSG워너비","정동하"};
			String[] musics = {"신호등","바라만 본다","추억은 만남보다 이별에 남아"};
			System.out.println(singers[0]+":"+musics[0]);
			System.out.println(singers[1]+":"+musics[1]);
			System.out.println(singers[2]+":"+musics[2]);
//		6. 증감연산자에서 확장한 증감대입연산자란 무엇인지 예제를 통해서 기술하세요.
			int no = 1;
			no++; //1씩 증가
			no += 3;//3씩 증가 : 증감하고 대입을 하는 연산자.
			System.out.println("현재 no의 데이터:"+no);			
//		7. 배열은 크기를 넘어서서 index 를 선언한다는 말이 어떤 경우인지 기술하세요.
			// 초기에 배열의 크기가 지정되었는데
			int [] arry4 = new int[3];
//			arry4[3]=25; // 배열의 크기(arry4.length)는 3이지만, index는 0,1,2까지만
			// 할당이 가능하다. index 3은 배열의 크기가 4일때 가능하다.
//		8. primitive data 타입(기본데이터 유형)으로 리턴되는 메서드를 기술하고,
//			실제 코드를 나열하세요..
			System.out.println("메서드 호출:"+getByte());
			System.out.println("메서드 호출:"+getBoolean());
			System.out.println("메서드 호출:"+getChar());
			
			
//		9. 상속의 기본형식을 기술하세요..
/*
			class 상위클래스{
				구성요소
			}
			class 하위클래스 extends 상위클래스{
				
			}
 * */
//		ctrl + (/) : 줄단위 주석 생성
		
	}

}
