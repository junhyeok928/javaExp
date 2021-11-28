package javaexp.a00_exp;

public class A04_1103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# 조별 활동 
1. 기초 학습이 어느 정도 되어 있는 멤버
	- 과제/수업태도
	- 개인 면담
2. 2주차부터, 위 내용으로 조편성을 진행하여 간단하게 조별 과제를 진행
 	- 3명~4명부터 편성.
 	- 조편성을 늘어나고 어느 정도 시간이 지나면 재편성
 	- 조장은 각 프로젝트 마다 터닝 방식으로 진행
3. 3개월차 내에서 최종으로 갈 조편성을 완료
 	- 선임..
4. 지켜야할 룰
	1) 조편성에 들어가면 반드시 프로젝트는 마치고 인원변경이 가능.
	2) 조의 모든 편성이나 진행에 관련해서 협의해서 진행..
5. 1차 조편성은 11/12(금) 진행 : 임시 조편성

# 과제 제출
1. 제출 기한 : 저녁 9~10시 
2. 제출 내용 : 열심히 할 수 있는데까지 하시고, 한 내용까지 제출.
3. 과제 제출 시, 어렵거나 이해 안되는 내용, 추가 설명이 더 필요한 내용 마지막에 멘트로 남기시면
	다음날 리뷰시도 도움을 드리겠습니다.
4. 제출 형식 : 정말 결과 내용 정도는 캡쳐해주면 좋겠지만, 가능한한 소스를 나누어서라도
	텍스트로 그대로 메시지를 붙어서 제출 부탁드립니다.
	
	
2021-11-03
[1단계:개념]1. 클래스와 객체의 관계 기술하세요
	클래스은 실제 객체를 만들 설계도 역할을 한다.
	코드로 만들 클래스는 컴파일 단계까지만 진행되며, 이 컴파일 된 클래스는
	main()가 있는 클래스에서 실행으로 해당 클래스를 new 생성자()형태로 호출하여 메모리에 로딩할 수 있다.
	클래스명 참조변수 = new 생성자();
	하나의 선언된 클래스에서 여러 개의 객체를 생성할 수 있고, 이렇게 생성된 객체는 heap영역에 메모리를 만들고,
	참조변수에 의해서 stack영역에 heap영역의 주소값을 저장하여 처리된다.
[1단계:개념]2. 자바의 메모리 중 stack과 heap영역이 있는데, 객체가 이 메모리를 어떻게 활용하는지를 클래스, 객체 선언을 통해서 설명하세요.
	객체는 생성이 되면 heap영역에 메모리를 만들어 생성을 하고, 이 heap영역의 주소값을 stack영역에 참조변수로 저장한다.
	하나의 클래스를 통해서 만들어진 여러 객체들을 각각 다른 heap영역에 저장되기에 다른 주소값을 가진다.
	Person p1 = new Person();
	Person p2 = new Person();
	new Person() : 힙영역에 객체가 생성, p1, p2 참조변수로 힙영역의 주소값을 스택영역에 저장한다.
	System.out.println(p1); // 해당 참조변수를 확인할 수 있다.
	ex) 도서관의 실제 책이 있는 것(힙영역에 객체가 생성), 
	이 책이 있는 곳을 단말기를 통해 검색해서 그 위치를 파악(스택영역에 힙영역의 위치 저장)	
[1단계:개념]3. 클래스를 통해서 선언할 생성자 중에 default 생성자라는 개념이 있다. 이것을 언제 사용되고, 소멸이 되는지 기술하세요.
	class Person{
		Person(String name){}
	}
	1. 클래스만 선언하여도 내부적으로 Person(){} 모양의 생성자가 default로 선언이 된다.
		그래서, main()메서드를 통해서 Person p01 = new Person();으로 해당 클래스의 생성자를 호출할 수 있다.
	2. default생성자는 개발자가 추가 코딩을 통해서 생성자를 선언할 때, 사라진다.
		이 때는 선언한 생성자가 있을 때만 해당 객체가 생성자를 통해서 생성이 되고, 호출이 가능하다. 
		ex) main()메서드
		Person p01 = new Person();와 같은 코드의 경우, 생성자를 선언하지 않을 때는 에러가 발생하지 않지만,
		위와 같이 생성자를 매개변수가 있는 생성자를 선언했을 때, 에러가 발생한다.
		선언하는 순간 default 생성자는 사라진다.
	3. 기존에 매개변수가 없는 생성자도 에러없이 사용하고 싶으면, 추가하여 default생성자와 모양이 같은 매개변수가
		없는 생성자를 선언하면 된다.
		class Person{
			Person(){}
			Person(String name){}
		}		
[1단계:개념]4. 생성자를 통해서 필드를 초기화할 때, this를 사용하는 이유를 기술하세요.
		class Person{
			String name;
			int age;
			Person(String name, int age){
				this.name = name;
				this.age = age;
			}
			this라는 것은 객체가 생성되었을 때, 내부적으로 현재 호출된 이 객체를 지칭한다.
			this.필드, this.메서드(), this(){현재 객체의 선언된 생성자} 를 호출한다.
			외부에서는 참조변수로 호출하여 참조변수.멤버로 처리하지만, 객체에서는 this로 현재 생성된 이 객체를 지칭한다.
			자바에서는 조금 여유롭게 this라는 키워드를 선언하지 않아도 필드나 메서드를 지칭하지만,
			객체지향적은 프로그램에서 반드시 선언하여야 하는 경우가 많다.
			자바에서는 주로 외부에서 입력되는 매개변수의 변수명과 필드명이 동일할 때, 활용되는 경우가 많다.
		}
		Person p01 = new Person("홍길동",25);
		p01.name; // 생성자에 의해서 필드값이 할당되어 해당 데이터를 호출하여 사용할 수 있다.
		p01.age;
		p01.show();
[1단계:개념]5. 생성자를 여러 개 선언할 수 있다. 이렇게 여러 개의 생성자를 선언할 수 있는 규칙이 무엇인지 기술하세요?
		class Person{
			Person(){ System.out.println("생성자1");}
			//Person(){ System.out.println("생성자2");} (X)
			Person(String name){}
			//Person(String alias){} (X) 매개변수의 이름으로는 외부에서 호출할 때, 식별이 불가능하다.
			Person(int name){} 
			Person(String name, int age){}
			Person(int age,String name){}
		}
		1. 생성자는 오버로딩규칙에 의해서 여러 개를 하나의 클래스에서 선언할 수 있다.
		2. 오버로딩규칙이 있는 근본적인 이유는 외부에서 호출할 때, 다르게 식별하여 호출이 가능하기 때문이다.
		3. 생성자도 메서드도 이름을 같지만, 매개변수가 다르면 다른 생성자로, 다른 메서드로 식별할 수 있기 때문에
			선언이 가능한 것이다.
			Person p1 = new Person();  : 88라인/89라인 둘다 선언되어 있으면 해당 생성자로 어떤 것을 호출할지
				구분을 할 수 없기 때문에 둘중에 하나는 삭제를 하여야 에러가 발생하지 않는다.
			Person p2 = new Person("홍길동");	 90라인에 있는 생성자를 호출하는 것이 명백하기 때문에 같은 이름이라도
				선언을 할 수 있다.
			Person p3 = new Person(25); 92라인을 호출하는 것이 명확하기에 선언이 가능하다.
			Person p4 = new Person("홍길동",25); 93라인을 호출하는 것이기에 해당 생성자도 선언이 가능하다.
		4. 결론적으로 생성자나 메서드는 식별이 가능하게 매개변수가 선언되면 선언이 가능하고 이것을 오버로딩이라고 하는데,
			일반적으로 매개변수의 갯수, 매개변수의 데이터유형, 매개변수의 타입이 다른 선언 순서에 따라서 다른 생성자/메서드를 선언할 
			수 있는 것을 말한다.
[1단계:응용]6. 컴퓨터 클래스를 선언하고, 컴퓨터의 속성(제조사,cpu, ram, hdd)를 필드로 선언하여, 생성자를 통해 할당하고,
            showInfo()기능 메서드를 통해 출력하세요.
		class Computer{
			String company;
			String cpu;
			int ram;
			int hdd;
			Computer(String company, String cpu, int ram, int hdd){
				this.company = company;
				this.cpu = cpu;
				this.ram = ram;
				this.hdd = hdd;
			}
			// cpu를 교체하는 메서드
			// 1. 메서드의 기능 가운데 필드값의 변경 처리하는 메서드를 선언한다.
			// 2. 변경된 내용을 순서를 잘 확인하여 메모리가 할당되는 것을 고민하여 처리하여야 한다.
			//    1) 필드에 cpu 메모리 값 할당하기 전에 출력
			//    2) 필드에 매개변수로 온 데이터 할당.
			void setCpu(String cpu) {
				System.out.println("# cpu변경 #");
				System.out.println(this.cpu+"==>"+cpu);
				this.cpu = cpu;	
			}
			// ram의 기능을 두배나 향상하여 데이터를 리턴하는 메서드
			// 1. 리턴할 데이터유형 확인. int
			// 2. 처리할 프로세는 확인 기존값에서 *2
			// 3. 최종으로 리턴할 데이터  ram
			int getDblPerform() {
				ram = ram*2;   // ram *= 2;  기존의 데이터에서 연산자를 처리하여 다시 데이터에 할당.
				return ram;
			}
			void showInfo() {
				System.out.println("# 컴퓨터 정보 #");
				System.out.println("제조사:"+company);
				System.out.println("cpu:"+cpu);
				System.out.println("ram:"+ram);
				System.out.println("hdd:"+hdd);
			}
		}
		main()
		Computer com = new Computer("삼성전자","i7 3.6GHz",16,256);
		com.showInfo();
		
[2단계:응용]7. 위 클래스에서 cpu를 교체하는 메서드를 선언하여, 변경이 되게 처리하세요.
	void setCpu(String cpu) {
		System.out.println("# cpu변경 #");
		System.out.println(this.cpu+"==>"+cpu);
		this.cpu = cpu;	
	}
	main()호출
	com.setCpu("AMD 4.2Ghz");
[2단계:응용]8. 위 클래스에서 ram의 기능을 두배나 향상하여 데이터를 리턴하는 메서드를 선언하여, 호출하세요.
	int getDblPerform() {
		ram = ram*2;   // ram *= 2;  기존의 데이터에서 연산자를 처리하여 다시 데이터에 할당.
		return ram;
	}
	main()호출
		int dblRam = com.getDblPerform();
		System.out.println("현재 컴퓨터의 ram 두배 사양:"+dblRam);	
[2단계:응용]9. AirPlane 클래스를 선언하여 제작사, 현재속도, 탑승객수를 필드로 선언하고, 초기값을 생성자를 통해서 생성하고,
            메서드로 현재속도를 올리는 처리, 현재속도를 내리는 처리를 하고, 탑승객수는 매개변수를 통해서 탑승객의 인원 수를 입력받아서,
            누적처리되게 하세요.(비행기 두개가 탑승객을 태우고, 속도를 올리고, 속도는 내리고, 탑승객에 내리는 처리를 하세요)
		class AirPlane{
			String company;
			int curSpeed;
			int numOfPass;
			AirPlane(String company, int curSpeed, int numOfPass){
				this.company = company;
				this.curSpeed = curSpeed;
				this.numOfPass = numOfPass;
			}
			void getCurSpeed() {
				System.out.println(company+"제작 비행기 속도 증가 후 현재 속도:"+curSpeed);
			}
			void speedUp() {
				curSpeed+=50;
				getCurSpeed(); // 내부에 있는 메서드 호출.. this.getCurSpeed() 라고 해도 된다.
			}
			void speedDown() {
				curSpeed-=50;
				getCurSpeed(); 
			}
			void boardAirPlane(int numOfPass) {
				if(numOfPass>0) {
					System.out.println("비행기에 탑승 하다.");
				}else if(numOfPass<0) {
					System.out.println("비행기에서 하차 하다.");
				}else {
					System.out.println("비행기에 있습니다.(승/하차 인원 없음)");
				}
				System.out.println("변경 인원:"+numOfPass);
				this.numOfPass+=numOfPass;
				System.out.println("현재 인원:"+this.numOfPass);
			}
		}  
		main()          

		AirPlane ap01 = new AirPlane("보잉",0,0);
		ap01.boardAirPlane(100);
		ap01.boardAirPlane(100);
		ap01.speedUp();
		ap01.speedUp();
		ap01.speedUp();
		ap01.speedDown();
		ap01.speedDown();
		ap01.speedDown();
		ap01.boardAirPlane(-50);		
		ap01.boardAirPlane(-50);		
		ap01.boardAirPlane(-50);		
		ap01.boardAirPlane(-50);		
		
		AirPlane ap02 = new AirPlane("티웨이항공사",0,0);
		ap02.boardAirPlane(100);
		ap02.speedUp();
		ap02.speedUp();
		ap02.speedDown();
		ap02.speedDown();
		ap02.boardAirPlane(-50);		
		ap02.boardAirPlane(-50);			
		           
[2단계:응용]10. Bus 클래스를 만들고, 필드로 버스번호, 노선의 출발지, 노선의 종착지, 승객수 생성자를 통해서 초기화, 
			loadPerson을 통해서 매개변수의 승객수만큼 탑승		
 */
		Bus b1 = new Bus("M1001","서울","고양시",0);
		b1.loadPerson(5);
		b1.loadPerson(5);
		b1.loadPerson(10);
		b1.loadPerson(15);
		// 기본 개념 ==> 이해 ==> 습득 ==> 기본예제 ==> 확인예제를 통한 연습 ==> 여러가지 상황에 적절한 응용예제	
	}
}
class Bus{
	String no;
	String start;
	String end;
	int passCnt;
	Bus(String no, String start, String end, int passCnt){
		this.no = no;
		// nos = no; // 변수명을 다르게 지정하면 this를 생략해도 된다.
		this.start = start;
		this.end = end;
		this.passCnt = passCnt;
	}
	void loadPerson(int passCnt) {
		System.out.println("## " + start+"~"+end+"노선 "+no+"번 버스 승차 정보 ##");
		System.out.println("승차 인원:"+passCnt);
		this.passCnt += passCnt;
		System.out.println("현재 총 승객:"+this.passCnt);
	}
}



class AirPlane{
	String company;
	int curSpeed;
	int numOfPass;
	AirPlane(String company, int curSpeed, int numOfPass){
		this.company = company;
		this.curSpeed = curSpeed;
		this.numOfPass = numOfPass;
	}
	void getCurSpeed() {
		System.out.println(company+"제작 비행기 속도 증가 후 현재 속도:"+curSpeed);
	}
	void speedUp() {
		curSpeed+=50;
		getCurSpeed(); // 내부에 있는 메서드 호출.. this.getCurSpeed() 라고 해도 된다.
	}
	void speedDown() {
		curSpeed-=50;
		getCurSpeed(); 
	}
	void boardAirPlane(int numOfPass) {
		if(numOfPass>0) {
			System.out.println("비행기에 탑승 하다.");
		}else if(numOfPass<0) {
			System.out.println("비행기에서 하차 하다.");
		}else {
			System.out.println("비행기에 있습니다.(승/하차 인원 없음)");
		}
		System.out.println("변경 인원:"+numOfPass);
		this.numOfPass+=numOfPass;
		System.out.println("현재 인원:"+this.numOfPass);
	}
}




class Computer{
	String company;
	String cpu;
	int ram;
	int hdd;
	Computer(String company, String cpu, int ram, int hdd){
		this.company = company;
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	// cpu를 교체하는 메서드
	// 1. 메서드의 기능 가운데 필드값의 변경 처리하는 메서드를 선언한다.
	// 2. 변경된 내용을 순서를 잘 확인하여 메모리가 할당되는 것을 고민하여 처리하여야 한다.
	//    1) 필드에 cpu 메모리 값 할당하기 전에 출력
	//    2) 필드에 매개변수로 온 데이터 할당.
	void setCpu(String cpu) {
		System.out.println("# cpu변경 #");
		System.out.println(this.cpu+"==>"+cpu);
		this.cpu = cpu;	
	}
	// ram의 기능을 두배나 향상하여 데이터를 리턴하는 메서드
	// 1. 리턴할 데이터유형 확인. int
	// 2. 처리할 프로세는 확인 기존값에서 *2
	// 3. 최종으로 리턴할 데이터  ram
	int getDblPerform() {
		ram = ram*2;   // ram *= 2;  기존의 데이터에서 연산자를 처리하여 다시 데이터에 할당.
		return ram;
	}
	
	
	void showInfo() {
		System.out.println("# 컴퓨터 정보 #");
		System.out.println("제조사:"+company);
		System.out.println("cpu:"+cpu);
		System.out.println("ram:"+ram);
		System.out.println("hdd:"+hdd);
	}
}




