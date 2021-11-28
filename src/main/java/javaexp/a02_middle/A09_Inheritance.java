package javaexp.a02_middle;

public class A09_Inheritance {
	public static void main(String args[]) {
		Vehicle v1 = new Vehicle();
		System.out.println("탈것의 속도:"+v1.velocity+"km/h");
		Bus01 b1 = new Bus01();
		System.out.println("버스의 속도:"+b1.velocity+"km/h");
		System.out.println("버스의 승객수:"+b1.personCnt+"명");
		Truck t1 = new Truck();
		System.out.println("트럭의 속도:"+t1.velocity+"km/h");
		System.out.println("트럭의 싣은 물건 중량:"+t1.loadProd+"t");
	}
}
//    상위 클래스로 Vehicle(속도속성), 하위 클래스로 Bus01(승객인원수), Truck(운반짐무게속성)
//    상속관계로 설정하고, main()에서 호출 처리하세요..
class Vehicle{
	int velocity=100;
}
class Bus01 extends Vehicle{
	int personCnt=10;
}
class Truck extends Vehicle{
	double loadProd =1.5;
}
