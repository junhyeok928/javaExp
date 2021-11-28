package javaexp.a02_middle;

public class A24_Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d1 = new Driver("홍길동");
		d1.show();
		Passenger p1 = new Passenger("마길동");
		p1.showInfo();		
		Car01 c1 = new Car01("람보로기니");
		Bus02 bus1 = new Bus02("7700");
		c1.setDriverName("운전기사1");
		c1.setDriver( new Driver("마길동") ); 
		System.out.println(c1.dname);
		c1.driving();
	}
}
// ex) Car vs Driver
// 1. 클래스 선언
class Car01{
	// 차의 종류를 필드로 선언
	String kind;
	// 차안에  운전자 클래스 선언..
	Driver driver; //  new Driver("마길동") 들어간 상황..
	// 운전기사를 문자열로 선언.
	String dname; // "운전기사"
	
	Car01(String kind){
		this.kind = kind;
	}
	// 차안에 운전기사 객체를 할당 처리하는 메서드 선언..
	void setDriver(Driver driver) { // Driver driver = new Driver("마길동");
		this.driver = driver;
	}
	//  운전기사 이름을 문자열로 할당.
	//  c.setDriverName("운전기사1");
	//  System.out.println(c.dname); // "운전기사1"   출력...
	void setDriverName(String dname) {  // String dname = "운전기사1";
		this.dname = dname;	// 
	}
	void driving() {
		System.out.println(kind+"로 운행을 합니다.");
		if(driver!=null) {
			driver.show();
		}else {
			System.out.println("기사가 탑승하지 않았습니다.");
		}	
	}
}
//  1:1 관계의 메모리 설정..
// ex) Bus02, Passenger   Bus안에 버스번호를 필드로 선언, 생성자를 초기화, Passenger를 필드로 선언.. (2단계)
//   1. Bus02 클래스 선언.
//   2. Bus02 클래스 안에 필드 선언 : 버스번호, Passenger
//   3. Bus02 클래스 안에  생성자를 통해 버스 번호 할당.
//   4. main()에서 객체 생성.
//      
class Bus02{
	String no;
	Passenger pass;
	Bus02(String no){
		this.no = no;
	}
}

class Driver{
	String name;
	Driver(String name){
		this.name = name;
	}
	void show() {
		System.out.println("운전자:"+name);
	}
}
// ex) 1단계 완료 안된 분들  Passenger클래스 필드:승객명, 생성자:승객명 할당, 메서드:showInfo() 통해서 출력(승객명:@@@)하는 객체 처리..
class Passenger{
	String name;
	Passenger(String name){
		this.name = name;
	}
	void showInfo() {
		System.out.println("승객명:"+name);
	}
}
//   -------------0.5단계 ---------
// 2. 클래스 안에 필드 만들기
//		Driver : 기사이름, show() 기사의 이름 출력
//   -------------1단계 ---------------
//    	Car : 차종, Driver
// 3. 생성자를 통해서 초기값 설정.
//   -------------2단계 ---------------
// 4. Car의 setDriver()를 통해, 기사(Driver)를 설정
//   -------------3단계 ---------------
// 5. Car의 driving() @@ 차를 타다, 기사는 @@이다. 
//   -------------4단계 ---------------
// 6. main() 처리..
//   -------------마지막 --------------
// 7. Driver(기사의 나이, 사는 곳), Car(배기량, 속도...)의 여러가지 속성을 설정하고 할당 처리..
//    추가메서드(속도올리기, 속도 내리기, 승객탑승)..

