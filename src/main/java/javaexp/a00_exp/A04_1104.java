package javaexp.a00_exp;

public class A04_1104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
2021-11-04
[1단계:개념]1. 생성자와 메서드의 차이점을 기술하세요.
	1) 객체 생성시
		생성자를 통한 데이터 처리는 객체 생성시 한번만 처리할 수 있다.
		ex) Person p1 = new Person("홍길동", 25, "서울");
			p1 = new Person("신길동", 27, "부산"); // heap영역에 다른 객체가 생성이 되기에 같은
			객체라고 할 수 없다.
		메서드는 계속 2번이상 호출하여 같은 객체에 데이터를 변경이 가능하다.
		 	p1.setName("신길동");
		 	p1.setAge(24);
		 	p1.setAge(23);
	2) 리턴값 처리
		생성자는 리턴값이 없다. 주로 매개변수를 통해서 필드의 초기화를 위해서 선언하는 경우가 많다.
		메서드는 리턴값이 있다. 외부에서 호출한 데이터를 return 형식으로 처리해준다. 
	3) 공통 
		매개변수를 통해서 데이터 처리
		오버로딩 : 매개변수의 갯수, 타입, 타입이 다른 순서

[1단계:기본연습]2. 생성자와 메서드 연습이 필요한 분들 아래 내용 필드 정하시고, 리턴값이 있는 메서드를
            선언하고 객체들 만들어 호출해 보세요.
                연필, 노트, 화장품, 기차, 컵, 집, 도서관
		// Pencil p01 = new Pencil("HB", 800);
		// p01.showInfo();
		// System.out.println("리턴값:"+p01.getKind());
		// Pencil p02 = new Pencil("4B", 850);
		// p02.showInfo();
		// System.out.println("리턴값:"+p02.getPrice());
		class Pencil{
			String kind;
			int price;
			Pencil(String kind, int price){
				this.kind = kind;
				this.price = price;
			}
			String getKind() {
				return kind;
			}
			int getPrice() {
				return price;
			}
			void showInfo(){
				System.out.println("# 연필의 정보 #");
				System.out.println("종류:"+kind);
				System.out.println("가격:"+price);
			}
		}              
[2단계:응용]3. ElProduct(전자제품) 클래스를 선언하고, 필드는 전자제품명, 가격을 선언,
            생성자로 전제제품명과 가격
            메서드는 buy1() : 하나구매했을 때, 총비용리턴, buy2(갯수) : 갯수에 맞는 총비용 리턴,
            buy3(갯수, 할인율) : 갯수와 할인율이 입력받아 총 비용을 리턴하여 출력 처리하세요.
		ElProduct prod = new ElProduct("사과",2000);
		int tot = prod.buy();
		System.out.println("총비용1:"+tot);
		System.out.println("총비용2:"+prod.buy(5));
		System.out.println("총비용3:"+prod.buy(3,0.2));		
class ElProduct{
	String name;
	int price;
	ElProduct(String name, int price){
		this.name = name;
		this.price = price;
	}
	int buy() {
		System.out.println(name+" 1개 구매 비용:"+price+"원");
		return price; 
	}
	// 같은 메서드명이지만 매개변수가 다르기에 overloading 처리가 가능하다.
	int buy(int cnt) {
		System.out.println(name+" "+cnt+"개 구매 비용:"+price+"원");
		return price*cnt; 
	}	
	int buy(int cnt, double discount) {
		int tot = price*cnt;
		System.out.println(name+" "+cnt+"개  할인율 "
				+(int)(discount*100)+"% 적용 구매 비용:"+price+"원");
		return (int)(tot-(tot*discount));
	}
	// 타입이 순서가 바뀌어기 때문에 외부에서도 다른 데이터로 식별이 가능하기에 선언할 수 있다.
	int buy(double discount, int cnt) {
		int tot = price*cnt;
		System.out.println(name+" "+cnt+"개  할인율 "
				+(int)(discount*100)+"% 적용 구매 비용:"+price+"원");
		return (int)(tot-(tot*discount));
	}	
} 
[1단계:개념]4. 생성자와 메서드의 오버로딩이란 무엇인지 예제를 통해서 기술하세요.
	같은 이름을 생성자와 매서드를 정의할 수 있는 원칙이 있는데, 호출하는 곳에서 식별이 가능 할 때를 말한다.
	일반적으로 매개변수의 갯수, 데이터유형, 다른 데이터 유형의 순서 처리로 가능한 것을 말한다.
		 void buy(){}
		 void buy(int no){}  갯수
		 void buy(double discount){} 데이터 유형 
		 void buy(int no, double discount){}
		 void buy(double discount, int no){}  순서
	
[1단계:개념]5. static 변수와 일반변수의 차이점을 오늘 진행한 예제와 함께 기술하세요.
	class Building{
		String owner; //일반변수
		String loc;	  //일반변수 :	 각 객체가 가지고 있는 메모리 영역
		static int drawPay; // static 변수 : 객체가 생성되더라도 공유할 수 있는 메모리 영역
		Building(String owner, String loc){
			this.owner = owner;
			this.loc = loc;
		}
	}
	main()
	Building b1 = new Building("홍길동","서울");
	Building b2 = new Building("김길동","부산");
	Building b3 = new Building("신길동","제주시");
	b1.owner;
	b1.drawPay=100000; // 하나의 객체에 static 변수를 변경하면, 다른 객체에도 영향을 미치기때문에
	 					// 참조변수가 아니라 클래스변수라고 하기도 한다. Building.drawPay 형식으로
	 					// 객체 생성 없이도, 사용할 수 있다.
	b2.owner;
	b3.owner;
	b1.drawPay, b2.drawPay, b3.drawPay 모두가 데이터가 동일하여 처리된다.

[2단계:응용]6. static 변수를 활용하여 Friend필드로 전 친구들의 공유 금액(static-내년에 함께 여름휴가 갈 돈) 이름,
    본인용돈을 선언하고, 생성자로 이름 설정, 용돈과 친구와 내년에 갈 여행 경비을 입금처리하고, 변경하여, 친구3명의 데이터를 
    변경 처리하세요.
*/
		Friend f1 = new Friend("홍길동", 100000);
		Friend f2 = new Friend("김길동", 120000);
		Friend f3 = new Friend("신길동", 200000);
		f1.addCommMoney(10000);
		f1.addCommMoney(20000);
		f2.addCommMoney(30000);
		f3.addCommMoney(20000);
		f3.addCommMoney(50000);
	}
}
class Friend{
	String name;
	int money;
	static int comMoney;
	Friend(String name, int money){
		this.name = name;
		this.money = money;
	}
	void addCommMoney(int money) {
		System.out.println("입금액:"+money);
		this.money -= money;
		comMoney += money; // 매개변수로 입력된 만큼 본인 금액은 차감, 공유 금액은 증가.
		showInfo();
	}
	void showInfo() {
		System.out.println(name+"의 정보");
		System.out.println("개인 계좌 잔액:"+money);
		System.out.println("친구와 함께 갈 경비:"+comMoney);
	}
	
}
