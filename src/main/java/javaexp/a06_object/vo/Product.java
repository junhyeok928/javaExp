package javaexp.a06_object.vo;

public class Product {
	// 1. 필드로 물건명 선언.
	private String name;
	private int price;
	// 2. 생성자로 필드값 할당.
	public Product(String name) {
		this.name = name;
	}
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	// 3. 메서드로 필드값 출력
	public void buy() {
		System.out.println("구매한 물건명:"+name);
	}
	public void buy2() {
		System.out.println("구매한 물건명:"+name);
		System.out.println("구매한 물건명:"+name);
		System.out.println("가격"+price);
	}
}
