package javaexp.a04_vo;

public class A01_ValueObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# VO (value object>
		1. java에서 객체의 속성값이 있는 객체를 입력과 호출을 할 수 있게 처리하는 것을 말한다.
			주로 객체의 필드값을 read할 때, 사용되는 개념이나, 혼용해서 입력/수정/삭제/호출 등
			여러가지 개념으로 활용될 때가 많다.
			cf) DTO( data transfer object )
		2. 기본적은 접근 제어 구조.
			1) 필드는 private로 설정.
				직접적인 외부 호출을 방지한다.
			2) 생성자와 메서드는 public으로 설정한다.
				생성자를 통해서 필드값을 초기화 처리.
				getXXX() : 호출하는 메서드를 통해서 필드값을 호출
				setXXX() : 저장하는 메서드를 통해서 필드값을 저장.
			3) 읽기와 쓰기가 분리된 메서드를 통해서 필드값을 변경하여, 데이터를
				접근 제어을 통해 효과적인 처리를 한다.
		 * */
		A02_Person p01 = new A02_Person("홍길동",25,"서울 금천");
		p01.setAge(29);
		System.out.println("이름:"+p01.getName());
		System.out.println("사는곳:"+p01.getLoc());
		System.out.println("나이:"+p01.getAge());
		// ex) A03_Hobby.java  취미명, 비용, 주로하는시간 : 필드로 설정하여 VO객체를 만들고, 
		//   해당 객체를 호출하여 출력하세요. 
		A03_Hobby h1 = new A03_Hobby("등산",2000,"주말 오후");
		System.out.println("취미명:"+h1.getName());
		System.out.println("비용:"+h1.getPay());
		System.out.println("시간:"+h1.getTime());
		// ex) A04_Screen.java 영화제목, 관람료, 관객수
		A04_Screen s1 = new A04_Screen("타이타닉",10000,10000000);
		System.out.println("영화제목:"+s1.getTitle());
		System.out.println("관람료:"+s1.getPay());
		System.out.println("관객수:"+s1.getCnt());
		
		
		
	}

	
}
