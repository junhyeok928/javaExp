package javaexp.a02_middle;

public class A16_ClassExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("볼보",0,1);
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.loadPerson(2);
		c1.loadPerson(1);
		c1.loadPerson(1);
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.breakCar();
	}
}
// ex) Car클래스를 선언하고, 1. 필드로 차량 종류, 현재속도, 탑승자인원으로 선언하고,
//     2. 생성자로 초기화 처리
//     3. 속도올리는 메서드를 선언하고, 현재속도를 호출시 마다 10씩 더 올리게 구현하고, 출력만 처리.
//        speed+=10;  대입증가연산자 활용
//     4. 매개변수를 통해서 탑승입원을 입력받아서 누적할당 처리..
// ex) speedDown()를 통해서 한번에 5씩 속도가 감소되고 현재 속도을 출력..
//     breakCar()를 통해서 속도을 0로 만들어 차량이름과 현재 속도을 출력..
class Car{
	String kind;
	int speed;
	int loadCnt;
	Car(String kind, int speed, int loadCnt){
		this.kind = kind;
		this.speed = speed;
		this.loadCnt = loadCnt;
	}
	// 사용할 공통 메서드 선언..
	void currentSpeed() {
		System.out.println(kind+"의 현재 속도는 "+speed+"km/h");
	}
	void speedUp() {
		speed+=10;
		currentSpeed();
	}
	void speedDown() {
		speed-=5;
		System.out.println("# 속도 감소 #");
		currentSpeed();
	}
	void breakCar() {
		speed=0;
		System.out.println("# break car #");
		currentSpeed();
	}
	void loadPerson(int cnt) {
		loadCnt+=cnt; // 기존에 있는 인원에서 누적하여 할당 처리..
		System.out.println("방금 탑승한 인원:"+cnt);
		System.out.println("총 탑승 인원:"+loadCnt);
	}
	
}

