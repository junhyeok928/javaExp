package javaexp.a00_exp;

import java.util.Scanner;

public class A06_1105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2021-11-05
//		# 주간문제
//		[1단계:기본]1. java을 컴파일과 실행과정을 Person.java를 기준으로 기술하세요.
		/*
			컴파일과정(코드==>기계어로 변경, ctrl+s 저장) javac Person.java ==> Person.class
			실행과정(main()메서드가 있는 클래스에서 호출할 때) java Person ==> memory에 로딩과 내부적인 코딩 내용이 수행.
		 * */
//		[1단계:기본]2. 기본 출력 형태를 기술하고, 특수문자(\t, \n 등)를 통한 기능 처리를 기술하세요
		/*
		  	System.out.println("마지막에 줄바꿈 출력");
		  	System.out.print("줄바꿈 없는 출력");
		  	System.out.println("사과\t바나나\t"); \t : 데이터와 데이터 사이에 고정 크기로 설정된 탭간격
		  	System.out.pint("안녕\n하세요\n반갑습니다.\n); \n : 데이터와 데이터 사이에 줄바꿈 처리. 
		  	
		  	
		 * */
//		[1단계:확인]3. 변수를 지정하여, 아래와 같은 형식을 출력하세요.
//		            이름  국어 영어 수학 총점 평균  : 각 내용을 탭간격 설정
//		            홍길동 70  80  90 240 80
//		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
//		System.out.print("홍길동\t");
//		System.out.print("70\t");
//		System.out.print("80\t");
//		System.out.print("90\t");
//		System.out.print("240\t");
//		System.out.print("80\n");
//		[1단계:기본]4. 위 출력은  Scanner 객체를 통해서, 데이터를 입력 받아 출력하세요.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름을 입력:");
//		String name = sc.nextLine();
//		System.out.print("국어 점수입력:");
//		int kor = sc.nextInt();
//		System.out.print("영어 점수입력:");
//		int eng = sc.nextInt();
//		System.out.print("수학 점수입력:");
//		int math = sc.nextInt();
//		int tot = kor + eng + math;
//		int avg = tot/3;
//		System.out.print(name+"\t");
//		System.out.print(kor+"\t");
//		System.out.print(eng+"\t");
//		System.out.print(math+"\t");
//		System.out.print(tot+"\t");
//		System.out.print(avg+"\n");		
//		[1단계:기본]5. 계층적 블럭설정을 통해 클래스를 작성할려고 한다. 아래 내용을 포함 시켜 클래스를
//		            작성해보세요. 클래스명, 필드명, 생성자명, 메서드명, 조건문, 반복문
/*		
class Person{ // 클래스 선언 : 최상위
	// 클래스명 하위에 탭간격으로 포함되어 있는 필드 선언.	
	String name;
	Person(String name){
		// 생성자의 하위 종속적인 데이터를 탭간격으로 표시하여 처리.
		this.name = name;
	}
	String getName() {
		return name;
	}
	void showInfo(String data) {
		// 조건문의 하위 종속인 데이터 처리를 탭간격으로 표시하여 처리하다.
		// cf) 문자열1.equals(문자열2) : 문자열1과 문자열2가 동일한지를 나타내는 기능 메서드
		//     == : 주소값 비교로 내용 비교와 차이가 있는 경우가 발생한다.
		if(data.equals("홍길동")) {
			System.out.println("관리자");
		}
		
	}
}
 */		
//		[1단계:기본]6. 기본 데이터 유형의 종류를 기술하고, 각 기본 데이터르 유형에 데이터를 할당하여 출력하세요.
//       	정수형 : byte, short, **int, long, char
//			실수형 : float, **double
//			boolean
//		[1단계:기본]7. 타입 캐스팅이 무엇인지 기술하고, 해당 예제를 통해 출력하세요.
//			형변환 중, 큰데이터 유형이 작은 데이터유형의 메모리에 할당될 때, 사용된다.
			double dblVal = 25;
			int intVal = (int)dblVal;
//		[1단계:기본]8. 비교연산자와 논리연산자의 차이를 기술하고, 예제로 점수가 80이상 90미만인 데이터를 B학점으로 
//		            표기하는 처리를 하세요.
//			비교연산자 : 두개의 피연산자의 데이터를 비교하여 boolean값을 도출하는 연산자이며(boolean isPass = point>=70),
//			논리연산자 : 비교연산자를 통한 결과 처리된 boolean값을 논리식은 and(&&)와 or(||)를 활용하여 논리값을
//					결과값으로 처리하는 연산자이다. ex) boolean isFreePass = age<5 || age>=65;
//		[1단계:기본]9. 연산자의 우선 순위를 기술하세요
//			() : 소괄호가 최우선 순위 ex) (4+5)*2 = 18
//			*,/가 우선이고, 그다음이 +,-이다  ex) 4+5*2= 14
//			그 다음은 순서이다.
//		[1단계:확인]10. 15~50까지 출력하되, 3의 배수는 @표시로 출력하세요.
/*
			for(int cnt = 15; cnt<=50;cnt++) {
				if(cnt%3==0) {
					System.out.print("@\t");
				}else {
					System.out.print(cnt+"\t");
				}
			}
			System.out.println();
*/
//		[1단계:기본]11. break문과 continue문의 차이를 기술하세요.
			// break는 반복문을 중단시켜준다.
			// continue는 해당 반복 단위만 일단 이후, 코드를 실행하지 않고, 다음 반복 단위를 수행 처리한다.
/*
			int grade = 5;
			for(int cnt =1; cnt<=9;cnt++) {
				if(cnt == 4) {
					continue; // 해당 반복 단위만 이후 내용 수행하지 않음
				}
				if(cnt == 8) {
					break; // 반복문 자체가 중단처리 된다.
				}
				System.out.println(grade + " X "+cnt+" = "+(grade*cnt));
			}
 * */			
//		[1단계:확인]12. 사원명, 사원번호, 직책을 배열 3개로 만들어 3명의 정보를 출력하세요.
			//  배열에 대한 선언과 할당.
/*
			String []enames = {"홍길동","김길동","신길동"}; 
			int []empnos = {7001,7002,7003}; 
			String []jobs = {"사원","대리","과장"};
			System.out.println("사원명\t사원번호\t직책");
			// * 반복문을 이용해서 배열을 효과적으로 처리.. : 배열명[index번호]
			// 1. 배열의 index의 시작 0 부터 처리한다..   int idx=0;
			// 2. 배열의 index번호는  배열의 길이보다 1 적다.  idx < enames.length
			//     	enames.length : 배열의 길이
			// 3. 배열의 index가 증가처리 한다. : idx++
			//   ex) 사원이름의 배열은 enames[0], enames[1],enames[2]
			//       까지 나타나고, 위 3개 배열은 index는 동일하다.
			for(int idx=0;idx<enames.length;idx++) {
				System.out.print(enames[idx]+"\t");
				System.out.print(empnos[idx]+"\t");
				System.out.print(jobs[idx]+"\n");
			} 
 */
//		[1단계:확인]13. 카드번호와 카드모양이 필드로 있는 클래스를 선언하고, 생성자를 선언/할당하고, show()를 통해서
//		            해당 카드번호와 모양을 출력하세요.
		//  카드모양  : ♠ ♣ ♥ ◈
		//  숫자   : A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
/*			
			String shapes[] = {"♠","♣", "♥","◈"};
			String numbers[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
			// Card 객체의 배열 52개 만들기 : ex) int [] numbers = new int[52];
			Card[] cards = new Card[52];
			// 모양을 반복해서 처리할 데이터..
			int cidx=0;
			for(int idx=0;idx<shapes.length;idx++) {
				//System.out.println(shapes[idx]);
				// 숫자를 반복해서 처리할 데이터.
				for(int jdx=0;jdx<numbers.length;jdx++) {
					System.out.print( cidx+")"+shapes[idx] + numbers[jdx]+",");
					// 배열 객체에 52의 객체가 할당이 된다.
					cards[cidx] = new Card(numbers[jdx], shapes[idx]);
					cidx++;
					
				}
				System.out.println();
			}
			System.out.println("#할당된 배열의 객체 확인#");
			for(int idx=0;idx<cards.length;idx++) {
				cards[idx].show();
			}
class Card{
	String number;
	String shape;
	Card(String number, String shape){
		this.number=number;
		this.shape = shape;
	}	
	void show() {
		System.out.print(shape+number+",");
	}
}
*/
//		[1단계:확인]14. House와 Person을 1:1로 객체의 관계를 만들어 필드와 메서드를 임의로 만들어 출력처리하세요.
//	
			House h1 = new House("서울 강남");
			h1.intoHouse(new Person("홍길동",25));
			h1.showHouse();
	}
}
class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	void info() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}
}
class House{
	String address;
	Person person;
	House(String address){
		this.address = address;
	}
	void intoHouse(Person person) {
		this.person = person;
	}
	void showHouse() {
		System.out.println("# 집의 정보 #");
		System.out.println("주소:"+address);
		if(person!=null) {
			person.info();
		}else {
			System.out.println("사람이 없습니다.");
		}
	}
}









