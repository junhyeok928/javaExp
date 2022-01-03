package javaexp.a06_object;

import javaexp.a06_object.vo.Person;

public class A03_Method {
	/*
	 * # 메서드의 기능에 대한 이해와 실습 1. 리턴값에 대한 이해 1) 리턴값을 메서드를 통해 리턴되는 데이터 유형을 말한다. 2) 초기에
	 * 선언된 유형으로 실제 마지막에 return @@@; 부분에 데이터를 리턴하여야 한다. 3) 실제 할당이 가능한 데이터 유형을 선언하여야
	 * 한다. 4) 리턴되는 데이터가 없을 때는 void를 선언하여야한다. -void가 선언되었을 때는 return @@; 구문이 필요가 없다.
	 * 2. 기본 형식 리턴 유형 메서드명(){} 3. 연습예제 static(객체생성이 사용가능), main()클래스가 있는 클래스에서 언언(객체
	 * 생성이 메서드 바로 활용)를 이용해서
	 */

	static String getString() { // 리턴유형이 String
		return "홍길동"; // 실제 리턴 되는 데이터 "홍길동" String s = "홍길동"; 이 가능하기에 선언
	}

	static void show() {
		System.out.println("러턴 유형이 없는 기능메서드");
	}

	static byte getByte() {
		return 25;
	}

	static byte getShNumber() {
		short s = 70; // 지역변수 선언 리턴
		return (byte) s;
	}

	static int num01;

	static int getNumber() {
		num01 = 25;
		// 전역변수의 데이터를 리턴 static 메서드 안이라 전역변수도 static변수어어야 한다.
		// static 객체 공유 메모리 선언시 활용
		return num01;
	}

	static double getDb1() {
		int num02 = 50;
		return num02; // double num01 = 50; 형식으로 자동형 변환(promote)이 일어나기에 가능하다.
	}

	static boolean getBoolean() {
		return num01 >= 70; // 전역변수의 데이터를 비교연산하여 boolean값을 리턴한다.
	}
	static Person getPerson() {
		Person p01 = new Person("홍길동");
		return p01;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ret1 = getString();
		System.out.println(ret1);
		show();
//		String s = shw(); 리턴유형이 없기에 에러 발생
		byte b1 = getByte();
		System.out.println("리턴1(byte):" + b1);
	}

}
