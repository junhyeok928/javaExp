package javaexp.a02_middle;

public class A23_Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Com01 cm = new Com01("아이맥");
		cm.setMouse( new Mouse("노랑색") );
		cm.showInfo();
	}

}
//ex) Com01 클래스와 		Mouse클래스를 선언하고, 1:1관계로 설정하여,
//    속성:제조사     		속성:색상
//    메서드1:setMouse	메서드1:show() 마우스의 색상은 @@@	
//    메서드2:showInfo()
class Com01{
	String company;
	Mouse mouse;
	Com01(String company){
		this.company = company;
	}
	void setMouse(Mouse mouse) {
		this.mouse = mouse;
		System.out.println("마우스 장착!!");
	}
	void showInfo() {
		System.out.println("컴퓨터 제조사:"+company);
		if( mouse!=null) {
			mouse.show();
		}else {
			System.out.println("마우스가 장착되지 않았습니다.");
		}
	}
}
class Mouse{
	String color;
	Mouse(String color){
		this.color = color;
	}
	void show() {
		System.out.println("마우스의 색상:"+color);
	}
}
