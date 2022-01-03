package javaexp.a06_object;

public class A07_ObjVsObj {
	/*
	 * # 객체안에 객체 처리하기.. 1. 클래스를 통해서 만들어진 객체는 하나의 객체만 사용되는 것보다 1:1, 1:다 관계를 통해서 처리되는
	 * 경우가 많다.
	 * 
	 * 2. 일반적으로 클래스에서 선언된 다른 클래스를 선언하고, 생성자나 기능메서드를 통해서 외부 객체를 들어오게 하여 처리한다. private
	 * Wing w; public void setWing(Wing w){ whis.w =w; } public void flying(){
	 * if(w!=null){ w.fly(); } }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopProduct sp1 = new ShopProduct("사과","2000");
		
		ShopMember sm1 = new ShopMember();
		sm1.setName("홍길동");
		sm1.showBuyInfo();
//		sm1.setProd("아이폰");
//		sm1.showBuyInfo();
	}

}

class ShopProduct {

	// 물건명과 가격
	String name;
	String price;

	public ShopProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShopProduct(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}

class ShopMember {
	String name;
	ShopProduct prod; // 구매한 물건
	public void showBuyInfo() {
		System.out.println("구매자:"+name);
		if(prod!=null) {
			System.out.println("# 구매 물건 #");
			System.out.println("제품:"+prod);
		}
	}
	public ShopMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShopMember(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ShopProduct getProd() {
		return prod;
	}
	public void setProd(ShopProduct prod) {
		this.prod = prod;
	}
	
}