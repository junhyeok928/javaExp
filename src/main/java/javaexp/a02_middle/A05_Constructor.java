package javaexp.a02_middle;

public class A05_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("사과");
		// Product(String name)에 생성자로 매개변수값을 String유형으로 선언했기에
		// 입력값이 없는 생성자를 사용할 수 없다.
		// 객체의 참조변수.필드명으로 접근하여 사용할 수 있다.
		System.out.println(p1.name);
	}
}
// 클래스 구성요소2 : 생성자
// 1. 주로 필드값을 매개변수로 초기화한다.
//    매개변수 : 생성자나 메서드에서 데이터를 외부에 받을 때, 해당 데이터유형으로 
//    선언한 내용으로 데이터를 전송해서, 받은 데이터를 활용할 때 사용하는 변수이다.

class Product{
	String name;
	int price;
	Product(String name){  // String name = "홍길동"; String name=25;(X)
		this.name = name; // 매개변수로 넘겨오는 변수명과 필드명이 동일하기 때문에 구분하기 위하여
						// this.필드명으로 선언하여 할당하였다.
	}
}
// ex) 클래스로 Bus 선언하고 문자열로 버스 번호를 할당할 수 있게 필드와 생성자를 선언하고,
//     메인메서드에서 해당 객체를 생성하고, 버스번호를 호출하세요..
//     버스는 어떤 속성 있을까요? 버스 번호, 버스 노선, 버스 운전사, 버스 승객..
//     Bus b1 = new Bus("1001");
//     Bus b2 = new Bus("1002");
//     "버스의 번호:"+b1.no - 버스의 번호가 출력 참조변수.필드
//   
class Bus{
	String no;
	Bus(String no){
		this.no = no;
	}
}











