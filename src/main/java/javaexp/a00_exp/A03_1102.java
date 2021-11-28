package javaexp.a00_exp;

public class A03_1102 {
/*
 gugu2(2) 
             
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

/*
[1단계:개념]1. 메서드의 void는 어떠한 경우에 쓰이는지 기술하고, 각각의 경우의 예제를 간단하게 만드세요.
				void : 메서드를 호출할 때, 리턴값이 없는 경우
				1. 콘솔창에 출력만 하고자 할 때.. System.out.println()
					void greeting(){
						System.out.println("안녕하세요!!");
					}
				2. 매개변수를 통해서 객체에 데이터를 저장하고자 할 때..
					ex) 사람의 귀는 음성정보를 받아서 뇌에 전달한다. 
						객체도 외부의 데이터를 받아서 필드에 전달할 때, 주로 리턴값이 필요없다.
						void setName(String name){
							this.name = name;
						}	
				3. 기능 프로세스만 처리할 때, 리턴값이 없는 경우가 있다.
					ex) 사람이 어떤 계획을 하거나 생각을 할 때는 외부에 입력도, 리턴도 하지 않지만
						추후에 행동에 영향을 미칠 판단을 하게 된다. 
						void setCalculator(){
							// 필드에 있는 데이터를 연산처리하여 필드에 데이터를 할당처리.
							sum = num01+num02;
						}										
							 외부 메인메서드, 다른 객체
				()-객체    <-- 데이터
				 메서드      --> 결과값..(리턴값)
				
[1단계:개념]2. 메서드의 매개변수에 따른 데이터를 처리를 한다. 매개변수를 처리하는 3가지 유형를 기술하세요.
			1) 데이터가 외부에서 입력되는 형태를 말하고, 외부에서도 이에 맞게 입력하여야 한다.
			2) 메서드를 통해서 데이터의 입력이 없을 때.
				void call(){}
			3) 데이터의 입력이 하나만 있을 때, 해당 타입에 따라서 호출이 가능하다.
				void setName(String name){}   setName("홍길동");
				void setAge(int age){}        setAge(25);
			4) 데이터가 여러개인 경우 해당 유형과 갯수와 타입이 순서에 맞게 선언하여야 한다.
				void setPerson(String name, int age, String loc){}
					setPerson("홍길동", 25, "서울 강남");	

[1단계:응용]3. 회원등록, 아이디, 패스워드, 이름, 포인트의 매개변수를 선언하고, 저장된 내용을 출력처리하는 메서드를 기술하세요.
		//  회원등록, 아이디, 패스워드, 이름, 포인트
		static void memberRegister(String id, String pass, String name, int point) {
			System.out.println("# 회원등록 내역 #");
			System.out.println("아이디:"+id);
			System.out.println("패스워드:"+pass);
			System.out.println("이름:"+name);
			System.out.println("포인트:"+point);
		}
		
		memberRegister("himan","7777","홍길동",7000);
		memberRegister("higirl","8888","홍리나",10000);
*/
		
/*
[1단계:응용]4. 기능 메서드로 학생의 이름과 국어,영어,수학 점수를 매개변수로 입력받아, 아래의 형식으로 출력하고, 
             이름  국어 영어 수학 총점 평균
             김미나 90  80  70 ### ##
[2단계:응용]5. 평균값을 실수로 리턴해 주어, 학생 3명의 전체 총계과 평균을 처리하는 프로그램을 만드세요.
             신영희 90 90 75 ### ##
             오윤석 90 85 75 ### ##
             전체 총점 : @@@
             전체 평균 : @@@
	static double inputRecord(String name, int kor, int eng, int math) {
		System.out.print(name+"\t");
		System.out.print(kor+"\t");
		System.out.print(eng+"\t");
		System.out.print(math+"\t");
		int tot = kor + eng + math;
		System.out.print(tot+"\t");
		System.out.print(tot/3.0+"\n");
		return tot/3.0;
	}
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		double ret = 0;						  	// 받을 각 학생의 평균을 총계에 누적시킬 변수.
		ret += inputRecord("홍길동",80,90,100); 	// += : 총계에 누적
		ret += inputRecord("김길동",90,90,90); 	// += : 총계에 누적
		ret += inputRecord("신길동",70,80,90); 	// += : 총계에 누적
		// 해당 메서드를 통해서 마지막에 "리턴 문자열"이 리턴되어 있음으로 데이터를 리턴하였다.
		System.out.println("총계:"+ret);
		System.out.println("학생의 전체 평균:"+(int)(ret/3)); //  전체 평균을 정수형으로 캐스팅 처리	             
             
[2단계:응용]6. 반복문 기본형식을 이용해서 입력받은 매개변수의 구구단의 단수를 출력하는 기능 메서드 선언하고 호출 처리하세요
			ex) gugu2(2) ==> 2단
				2 X 1 = 2
				2 X 2 = 4
				...
	static void gugu(int grade) {
		
		// 1~9까지 곱할 데이터를 반복하여 처리가 필요..
		for(int cnt=1;cnt<=9;cnt++) {
			//System.out.println(cnt);
			System.out.println(grade+" X "+ cnt +" = "+ (grade*cnt));
		}
		
	}
	gugu(9);
					
[1단계:기본]7. 아래의 랜덤 범위를 처리하세요.
            1) 1~8, 2) 5~10, 3) 0~100 4) 1~12
   0.0 <= Math.random() < 1.0  실수로 임의로 나올 수 있는 범위
   0.0*10 <= Math.random()*10 < 1.0*10  실수로 임의로 나올 수 있는 범위
   0 <= (int)(Math.random()*10) < 10  실수로 임의로 나올 수 있는 범위
   1 <= (int)(Math.random()*10+1) < 11  실수로 임의로 나올 수 있는 범위
   
		double ran = Math.random();
		System.out.println(ran);
		// 1~10 범위에 임의 정수 처리하기..
		System.out.println(ran*10);
		System.out.println((int)(ran*10));
		System.out.println((int)(ran*10+1));
		// (int)(Math.random()*경우의수 + 시작수);
		System.out.println("# 문제 #");
		System.out.println("1~8:"+(int)(ran*8+1));
		System.out.println("5~10:"+(int)(ran*6+5));
		System.out.println("0~100:"+(int)(ran*101));// 1~100 :100가지 경우, 0~100:101가지
		System.out.println("1~12:"+(int)(ran*12+1));   
*/   

            
/*            
[1단계:응용]8. 학생 3명의 국어점수를 임의로 출력하게 하세요
            학생1 : @@, 학생2:@@, 학생3:@@
	 int stud1 = (int)(Math.random()*101);  // 0~100까지 임의의 수	
	 int stud2 = (int)(Math.random()*101);  // 0~100까지 임의의 수	
	 int stud3 = (int)(Math.random()*101);  // 0~100까지 임의의 수
	 System.out.print("학생1:"+stud1+", ");
	 System.out.print("학생2:"+stud2+", ");
	 System.out.print("학생3:"+stud3+"\n");            
*/
/*
[2단계:응용]9. 모두의 마블과 같이 두 친구가 게임을 했을 때, 주사위 두개를 던져 이긴 팀을 출력하세요.
		friend1  주사위 두개 임의의 수1(1~6), 임의의수2(1~6) ==> 합의 범위(2~12)  경우의 수는 11가지 시작수는 2 
		int friend1 = (int)(Math.random()*11+2);
		int friend2 = (int)(Math.random()*11+2);
		System.out.println("친구1\t친구2");
		System.out.print(friend1+"\t");
		System.out.print(friend2+"\n");
		if(friend1>friend2) {
			System.out.println("친구1의 승");
		}else if(friend1<friend2) {
			System.out.println("친구2의 승");
		}else {
			System.out.println("무승부");
		}
*/

/*
[3단계:응용]10. 위 모두의 마블을 반복문을 이용해서 10회 했을 때, 최종 우승자를 출력하세요.


 * */
		System.out.println("모두의 마블 10회");
		System.out.println("회차\t친구1\t친구2");
		int fri1Tot = 0;
		int fri2Tot = 0;
		for(int cnt=1;cnt<=10;cnt++) {
			int friend1 = (int)(Math.random()*11+2);
			int friend2 = (int)(Math.random()*11+2);
			System.out.print(cnt+"\t");
			System.out.print(friend1+"\t");
			System.out.print(friend2+"\n");
			fri1Tot+=friend1;
			fri2Tot+=friend2;
		}
		System.out.println("# 현재 총점 #");
		System.out.print("친구1:"+fri1Tot+"\t");
		System.out.print("친구2:"+fri2Tot+"\n");	
		
		if(fri1Tot>fri2Tot) {
			System.out.println("친구1의 승");
		}else if(fri1Tot<fri2Tot) {
			System.out.println("친구2의 승");
		}else {
			System.out.println("무승부");
		}
		
	}

}
