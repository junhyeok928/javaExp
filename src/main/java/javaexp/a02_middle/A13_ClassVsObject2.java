package javaexp.a02_middle;

public class A13_ClassVsObject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator(30,25);
		// 생성자를 통해 필드값을 받아,
		// 아래의 기능 메서드에 따라서 여러가지 형태로 데이터를 처리한다.
		c1.plus();
		c1.minus();
		c1.multi();
		c1.devide();
		Calculator c2 = new Calculator(50,5);
		c2.plus();
		c2.minus();
		c2.multi();
		c2.devide();		
	}

}
/*
# 클래스와 객체 그리고 구성요소..
1. 클래스는 객체를 만들기 위한 도면 역할을 한다.
2. 클래스의 구성요소는 
	1) 객체의 핵심 데이터를 저장하는 field
	2) 객체의 초기 데이터를 할당하는 생성자.
	3) 객체의 각 기능적인 처리를 하는 메서드.	
 * */
class Calculator{
	// 필드 :  num01, num02할당
	int num01;
	int num02;
	Calculator(int num01, int num02){
		this.num01 = num01;
		this.num02 = num02;
	}
	void plus() {
		System.out.println(num01+" + "+num02 +" = "+( num01+num02 ));
	}
	void minus() {
		System.out.println(num01+" - "+num02 +" = "+( num01-num02 ));
	}
	void multi() {
		System.out.println(num01+" X "+num02 +" = "+( num01*num02 ));
	}
	void devide() {
		System.out.println(num01+" / "+num02 +" = "+( num01/num02 ));
	}	
}
