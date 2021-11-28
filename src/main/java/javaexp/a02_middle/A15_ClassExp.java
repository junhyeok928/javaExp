package javaexp.a02_middle;

public class A15_ClassExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book01 b1 = new Book01();
		Book01 b2 = new Book01();
		Book01 b3 = new Book01();
		b1.title = "자바기초";
		b1.price = 28000;
		b2.title = "JSP시작";
		b2.price = 30000;
		b3.title = "스프링완성";
		b3.price = 32000;
		System.out.println("b1 도서명:"+b1.title);
		System.out.println("b1 가격:"+b1.price);
		System.out.println("b2 도서명:"+b2.title);
		System.out.println("b2 가격:"+b2.price);
		System.out.println("b3 도서명:"+b3.title);
		System.out.println("b3 가격:"+b3.price);		
		Book01 b4 = new Book01("자바의 클래스",20000);
		System.out.println("b4 도서명:"+b4.title);
		System.out.println("b4 가격:"+b4.price);
	}

}
// ex) Book클래스에 도서명과 가격을 설정하여, 도서 3권을 호출하여 필드값을 할당하고 출력하세요

// ex) Book클래스에 생성자를 만들어 도서2권의 필드값을 할당하고 출력하세요.. 

class Book01{
	String title;
	int price;
	Book01(){} // 선언하는 순간 기존에 default생성자가 사라지기 때문에,
	// 추가 생성자를 선언할 시에는 선언은 해주서야 한다.
	Book01(String title, int price){
		this.title = title;
		this.price = price;
	}
}






