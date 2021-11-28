package javaexp.a00_exp;

import java.util.ArrayList;

public class A07_1106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2021-11-08
//		[1단계:기본]1. java에서 필드값을 private로 설정하는 이유를 encapsulation 개념을 찾아보시고 기술하세요.
/*			필드값을 직접적인 접근을 하는 것을 방지함으로 데이터의 효과적인 보안 처리와 객체지향 프로그램의 encapsulation
 * 			개념에 합치되게 처리하기 위한 것이다.
 * 			encapsulation이란 특정 데이터를 접근하기 위한 방법을 마련하여, 해당 방법으로만 해당 데이터를 처리하기 위한
 * 			개념으로 vo 객체같은 경우 읽기를 하는 메서드 getXXX()와 쓰기를 하는 메서드 setXXX()로만 데이터를 처리하게
 * 			한 것을 말한다.
 * 
 * */		
		
//		[1단계:기본]2. VO객체의 구성에 있어서 접근제어자 형태를 기술하세요.
/*
		public class Book { 
			// 하나의 파일로 하나의 클래스만 public 클래스를 사용할 수 있다.
			// 보통 파일명으로 지정한 클래스를 public 클래스로 사용한다.
			// 외부에서 선언할 때, 패키지가 달라도 선언이 가능하게 한다.
			// main()
			// Book bk;
			public Book() {}
			// 선언된 클래스를 객체 생성을 통해서 처리할 때, 접근제어자에 의해
			// 영향을 미친다.
			// 외부 패키지에서도 해당 객체를 생성할려면 접근 제어자가 public 이어야 한다.
			// bk = new Book();
			
			private String title;
			// 필드에 선언된 private는 직접적인 접근을 불가능 하게 선언한다.
			
			// 생성자를 통해서 초기화
			public Book(String title) {
				super();
				this.title = title;
			}
			// getXXX()/setXXX() 메서드를 통해서 읽기와 쓰기가 분리되어 처리하게 한다.
			// public으로 처리되었기 때문에 외부에서 접근이 가능하다.
			public String getTitle() {
				return title;
			}
			public void setTitle(String title) {
				this.title = title;
			}
		}
  
 * */		
		
		
//		[1단계:응용]3. Computer라는 VO객체를 만들고, 필드(제조사,cpu, ram, hdd)를 설정하고, 
//		            main()를 통해서 객체 생성 호출 처리하는 프로그램을 만드세요.
/*
public class Computer02 {
	private String company;
	private String cpu;
	private int ram;
	private int hdd;
	public Computer02() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Computer02(String company, String cpu, int ram, int hdd) {
		super();
		this.company = company;
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHdd() {
		return hdd;
	}
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
} 
 */		
		Computer02 com = new Computer02("apple","3.2GHz",16,500);
		System.out.println("제조사:"+com.getCompany());
		System.out.println("cpu:"+com.getCpu());
		System.out.println("ram:"+com.getRam());
		System.out.println("hdd:"+com.getHdd());
		
		
//		[1단계:응용]4. 동적배열 ArrayList와 배열의 차이점을 기술하고, 지난 주말의 가장 중요한 일정을 순서별로 
//		                5가지 추가/변경/호출하세요.
/*			배열은 데이터를 한번 저장하면 크기를 변경할 수 없지만, ArrayList 컬렉션 객체는 데이터를 추가,
 * 			변경, 삭제할 수 있다. 동적으로 데이터의 크기가 변경될 수 있다는 의미이다.
 * */		
			// ArrayList<데이터유형> : 해당 데이터 유형으로만 데이터 입력 가능하게 처리.
			ArrayList<String> slist = new ArrayList<String>();
			// 1. 추가.
			slist.add("운동");
			slist.add("휴식");
			slist.add("친구와 만남");
			slist.add("자기 개발");
			slist.add("자유로운 시간");
			slist.add(0, "산책"); // add(추가할 index, 추가할 데이터);
			slist.set(4, "좋은 환경에서 고민해보는 시간");
			slist.remove(2);  //  remove(삭제할 index);
			System.out.println("ArrayList의 크기:"+slist.size());
			System.out.println("# 주말의 일정 우선순위 #");
			// idx<slist.size() : ArrayList의 크기는 index의 크기보다 1크다 
			for(int idx=0;idx<slist.size();idx++) {
				// index와 순번과의 차이가 1이기에 +1로 순번 처리를 하였다.
				System.out.println(idx+1+"번째 일정:"+slist.get(idx));
			}
//		[1단계:기본]5. 웹에서 서버와 클라이언트란 무엇인가?
/*			웹에서 서버란 클라이언트에게 특정한 웹화면과 웹화면을 통해서 정보나 화면을 지원해주는 데몬을 말한다.
  			웹서버라고 하는데, apache, IIS 등이 있다. 이 웹서버에 DB나 java와 같은 프로그램을 컴파일 시켜서
  			처리해주는 것을 웹어플리케이션서버(WAS)라고 한다. tomcat, jeus, weblogic 등이 대표적은 was라고
  			할 수 있다.
  			웹에서 클라이언트란 웹서버에 요청을 하여, 특정한 화면이나 정보를 전달받는 프로그램을 말한다.
  			html형식으로 전달 받아, 랜더링하여 tag에 지정된 형태로 화면을 출력처리하는 브라우저를 말한다.
  			브라우저의 종류로는 인터넷익스플로러, 사파리, 오페라, 크롬 등이 있다.
  			두개의 웹서버와 클라이언트는 네트웍이라는 환경하에 상호간에 요청과 반응을 하면서 사용자가 필요로 하는 정보나
  			화면, 서비스을 전달받는 처리를 한다.
 			
*/			
//		[1단계:기본]6. html와 css, javascript의 차이를 기술하세요.(오늘 정리한 내용 + 인터넷 확인)
/*			html 기본적으로 웹 화면을 구성하는 태그 언어를 말한다. 
 			테이블형식 리스트처리, 타이틀, 메뉴 목록 처리, 화면 구성 처리 등을 지원하는 태그들로 구성하고 있다.
 			css는 html에 지원한 기본 태그에서 확장된 모양과 색상 크기를 지원하는 언어이다.
 			효과적으로 웹화면을 구성할 수 있도록 지원한다.
 			javascript는 html와 css에 동적인 기능 처리를 할 수 있게 프로그램적으로 지원하는 것을 말한다.
 			html과 css에서 지원한 태그나 코드들을 DOM(document object model)이라는 개념으로 객체화하여
 			객체지향적으로 프로그래밍화 하여 지원하는 것을 말한다.
 			# javascript ==> jquery ==> ajax ==> node? ==> vue
 * */			
			
//		[1단계:실습]7. 오늘 설치한 vscode 및 eclipse에서 설정한 내용을 ppt로 자료를 만들어, 과제 내용과 함께 제출하세요.
//		[3단계:실습]8. 오늘 만든 52개 카드 배열을 활용하여, 친구 4명에게 임의 7장씩 카드를 출력하세요..
/*			1) api에서 지원되는 내용으로 처리..
 			2) 알고리즘을 활용하는 방법
 				- 카드 클래스 만들기 : 필드를 선언해보기.
 				- 카드 배열/동적배열 만들어서 데이터 입력하기.
 					카드의 모양할당하기(for문)
 					카드의 번호할당하기(for문)
 					모양과 번호를 할당하는 (for문)
 				- 52의 배열객체 중에서 램덤 7개 카드 뽑아내기.(중복상관없이)
 					7개의 카드 중복상관없이 뽑아 내기..
 					전체 카드 Card[] cards = ....
 					
 					// 한사람이 랜덤으로 만들어진 카드 내용..
 					Card[] p01 = new Card[7];
 					for(int idx=0;idx<7;idx++){
 						var ranIdx = (int)(Math.random()*52);
 						p01[idx] = cards[ranIdx];
 					}
 				
 				- 중복하지 않고, 데이터를 섞어 만들고, 순서별로 카드를 만들어 돌리기..
 					1) 52개를 랜덤으로 중복 상관없을 카드를 할당
 					2) 이중반복문 이용.
 						index번호
 						0 1 2  3  4  5  6 7  8.....
 						3,5,10,42,52,22,1,42, .........
					3) 앞 내용과 동일한 index를(즉 동일한 카드) 가지고 있는 때는
						동일한 index가 안 나올 때까지 반복..
						이중 반복문에서 누적해서 앞에 있는 고유 index를 계속 check해서
						전체 반복이 안될 때까지 처리하면 끝..
 				
 		cf) 알고리즘 연습의 단계
 		1. 조건문 처리하기
 			변수 중에 최대/최소값 뽑내기.
 		2. 반복문 활용하기.
 			아래와 같이 화면에 여러가지 출력형식 처리하기
 			*****
 			*
 			***
 			*****
 		3. 배열 데이터를 처리하기.
 			임의의 데이터를 배열에 등록하기
 			배열의 데이터 중에 가장 큰수/가장 작은 수 호출하기
 			배열의 데이터 합산 처리하기
 			배열의 데이터 중, 짝수/호출만 출력하기.
 			배열의 데이터 짝수만 합산 처리하여 총계 처리하기.		
 		4. 배열의 활용한 정렬 알고리즘 처리하기
 			임의의 수를 할당하여
 			순서로 정렬하기
 			quick정렬
 			버블정렬..
 			
			
 * */			
	}

}



