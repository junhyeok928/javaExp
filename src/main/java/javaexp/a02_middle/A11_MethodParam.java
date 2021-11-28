package javaexp.a02_middle;

public class A11_MethodParam {
	/*
	# 매개변수
	1. 메서드나 생성자에서 전달되어온 데이터를 받아서 처리할 때, 사용되는 소괄호() 안에 선언된
		변수를 매개변수라고 한다.
	2. 매개변수의 데이터 유형
		1)  선언된 데이터 유형에 맞게 데이터를 전달하여야 한다.
		// ex) 자판기에 지폐만 입력되게 처리했으면, 해당 입력가능한 지폐만 입력하여야 한다.
		       동전이나 다른 수단으로는 입력이 되지 않는다.
	*/
	static void callString(String str) {
		System.out.println("문자열 데이터 매개변수:"+str);
	}
	static void callInt(int num01) {
		System.out.println("입력한 숫자:"+num01);
	}
	// ex) 이름을 입력하여 출력하는 메서드, 나이(정수)입력하여 출력하는 메서드,
	//     몸무게를 입력하여 출력하는 메서드 3개는 선언하고 호출하세요..
	static void setName(String name) {
		System.out.println("이름:"+name);
	}
	static void setAge(int age) {
		System.out.println("나이:"+age);
	}
	static void setWeight(double weight) {
		System.out.println("몸무게:"+weight);
	}
	/*
	3. 매개변수의 갯수
		1) 매개변수를 호출할 때, 한번에 여러가지 데이터를 입력할 수 있다.
			이 때, "매개변수1, 매개변수2, 매개변수3" 형태로 데이터를 선언하고, 해당 갯수에
			맞게 데이터를 전달하면 된다.
		// ex) 자판기에 지폐를 입력하고, 번호를 선택하는 2가지 입력처리를 하는 경우가 있다.
		 	 	이렇게 1개 이상의 입력 정보를 처리할 때, 활용된다.
	*/	 	 	
	static void inputAutoMachine(int money, String menu) {
		System.out.println("# 자판기 입력 처리 #");
		System.out.println("입력한 금액:"+money);
		System.out.println("선택한 메뉴:"+menu);
	}
	// ex) 학생정보를 입력하는 메서드를 선언한다. 학생명, 국어, 영어, 수학 점수를 입력해서
	//     해당 내용을 출력하세요.
	static void inputRecord(String name, int kor, int eng, int math) {
		System.out.print(name+"\t");
		System.out.print(kor+"\t");
		System.out.print(eng+"\t");
		System.out.print(math+"\n");
	}
	/*
	4. 매개변수의 데이터유형에 따른 순서
	 	각 입력데이터를 유형의 순서에 맞게 입력을 하여야 한다.
	 * */
	static void buyProd(String pname, int price) {
		System.out.println("# 구매 정보 #");
		System.out.println("구매한 물건:"+pname);
		System.out.println("구매한 가격:"+price);
	}
	static void inputArray(String[] names) {
		System.out.println("# 매개변수로 배열을 입력 #");
		System.out.println("배열의 갯수:"+names.length);
		System.out.println("배열의 첫번째 데이터 :"+names[0]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []innames = {"홍길동","김길동","마길동"};
		inputArray(innames);
		
		
		buyProd("사과",3000);
//		buyProd(3000,"사과"); 선언된 순서에 맞게 데이터를 호출하여야 한다.
		
		
		inputRecord("홍길동",70,80,90);
		inputRecord("김길동",80,80,95);
		inputRecord("신길동",90,85,95);
		
		
		// 호출할 때, 데이터유형은 순서에 맞게 입력하여야 한다.
		inputAutoMachine(1000,"커피");
		inputAutoMachine(2000,"사이다");
		
		
		setName("이정아!");
		setAge(25);
		setWeight(55);
		
		
		callString("홍길동");
		callString("마길동");
//		callString(252); 에러발생 문자열만 가능하다.
		callInt(253);
//		callInt("홍길동");
	}

}
class Person01{
	
	String getName() {
		return "홍길동";
	}
	void call() {
		System.out.println("안녕");
	}
}

