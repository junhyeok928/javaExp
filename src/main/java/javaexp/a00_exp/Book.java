package javaexp.a00_exp;

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
