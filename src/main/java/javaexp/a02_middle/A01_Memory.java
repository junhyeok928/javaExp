package javaexp.a02_middle;

public class A01_Memory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p01 = new Person();
		Person p02 = new Person();
		// Person객체는 heap영역에 저장되는데, stack영역에서는
		// 해당 객체의 주소만 저장한다.
		// @5305068a  heap영역의 주소.
		System.out.println("p1객체의 heap영역 주소:"+ p01);
		System.out.println("p2객체의 heap영역 주소:"+ p02);
	}

}
class Person{} // Person 클래스를 선언
