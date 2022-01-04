package javaexp.a06_object;

import java.util.ArrayList;

public class A09_ObjVsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 1대 다 관계 처리.. 1. 하나의 객체안에 여러개의 객체들을 연결되어 처리되는 것을 말한다. 2. 종류에 따라 1) 동일한 종류는
		 * 배열이나 ArrayList<객체>를 사용하거나, 2) 다른 종류는 객체1, 객체2, ArrayList<상위공통객체>
		 */
		Mart m1 = new Mart("행복마트");
		m1.buyProduct(new MPorduct("사과", 2000));
		m1.showList();
		m1.buyProduct(new MPorduct("바나나", 4000));
		m1.showList();
	}

}
/*
# 1:다 관계 객체 처리 방법
1. 포홤된 배열/리스트 형태의 객체를 위한 단일 클래스 선언하기
	- 필드만 선언.
	- 생성자, set/get메서드 만들기 (자동)
2. 위 배열/리스트 객체를 포함할 객체를 위한 클래스 선언하기
	- 필드(메인속성, ArrayList<포함된단위객체>)
		ex) class Mart{
		private String name;
		private ArrayList<MProduct> mlist;
	- 생성자 선언
		매개변수가 없는 생성자.
		메인속성 하나의 값을 받는 생성자.
		list = ArrayList<VO>() 로 초기화 처리.
	- set/get 메서드 생성
	- list에 하나씩 추가할 메서드 선언
		ex)
		public void buyProduct(MProduct prod){
		list.add(prod)
	- name과 list를 출력할 메서드 선언.
 */
class MPorduct {
	private String name;
	private int price;

	public MPorduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MPorduct(String name, int price) {
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

class Mart {
	private String name;
	private ArrayList<MPorduct> mlist;

	public Mart() {
		super();
		mlist = new ArrayList<MPorduct>();
		// TODO Auto-generated constructor stub
	}

	public Mart(String name) {
		super();
		mlist = new ArrayList<MPorduct>();
		this.name = name;
	}

	public ArrayList<MPorduct> getMlist() {
		return mlist;
	}

	// 외부에서 다중의 객체인 ArrayList<MProduct>를 만들어 처리
	public void setMlist(ArrayList<MPorduct> mlist) {
		this.mlist = mlist;
	}

	// 기능 메서드를 통해서, 하나씩 ArrayList에 담아서 처리
	// 이 경우에 기존에 객체가 생성되어 있어야 하기에 초기 생성자 생성시
	// mlist = new ArrayList<MProduvt>(); 형태로 객체를 생성한다.
	public void buyProduct(MPorduct prod) {
		System.out.println("# 물건을 구매합니다 #");
		// 객체 생성 없이 기능 메서드 사용시, heap영역에 객체가 없기에
		// NullPointer예외 발생
		mlist.add(prod);
	}

	public void showList() {
		System.out.println(name + "에서구매");
		if (mlist.size() > 0) {
			for (MPorduct mp : mlist) {
				System.out.print(mp.getName() + "\t");
				System.out.println(mp.getPrice());
			}
		} else {
			System.out.println("구매물건 없음");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
