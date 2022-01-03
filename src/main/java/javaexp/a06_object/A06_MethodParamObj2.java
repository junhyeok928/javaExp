package javaexp.a06_object;

import java.util.ArrayList;

public class A06_MethodParamObj2 {
	// 구매 매서드 선언..2
	public static void buy(Product p) {
		// 구매한 물건정보(물건명, 가격, 갯수)출력3
		System.out.println("# 구매 정보 #");
		System.out.println("물건명:" + p.getName());
		System.out.println("가격:" + p.getPrice());
		System.out.println("갯수:" + p.getCnt());

	}
	// DB에 검색할 내용을 매개변수로 넘기고.
	// 검색해서 나온 list형 데이터를 ArrayList<VO>객체를 통해서 처리
	public ArrayList<Product> getList(Product sch){
		ArrayList<Product> list = new ArrayList<Product>();
		// DB 처리...
		return list;
	}

	public static void takeBus(Passenger ps) {
		System.out.println("# 버스를 탄 승객 정보 #");
		System.out.println("성별:" + ps.getGender());
		System.out.println("나이:" + ps.getAge());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 물건 객체 생성 및 데이터 할당.4
		Product p1 = new Product("사과", 3000, 2);
		// 메서드를 통해 객체 전달5
		buy(p1);
		buy(new Product("오렌지", 2000, 2));
		Passenger ps = new Passenger("여", 25);
		takeBus(ps);
	}

}

// 물건 객체 선언.1
class Product {
	// 물건명 가격 갯수 필드 및 생성자 메서드 선언
	String name;
	int price;
	int cnt;

	public Product(String name, int price, int cnt) {
		super();
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}

class Passenger {
	private String gender;
	private int age;

	public Passenger(String gender, int age) {
		super();
		this.gender = gender;
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}