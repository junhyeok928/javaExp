package javaexp.a02_middle;

public class A12_MethodProcess {
	/*
	# 메서드의 기능 프로세스 처리.
	1. 메서드는 입력값을 통해, 조건문이나 반복문을 이용하여,
		원하는 결과값을 프로세스로 처리하여,
		저장하거나, 출력, 리턴처리할 수 있다.
		ex) 자판기에 금액을 입력하고, 선택을 했을 때, 해당하는 물건이나오고,
		잔액도 처리하여 나오는 경우와 같이 메서드는 기능 프로세스를 중괄호({})에서
		처리한다.
	 * */
	// 김밥의 단가가 2500일때, 매개변수로 입력된 갯수를 받아서 총액을 리턴처리하는 메서드.
	static int calcuTot(int cnt) {
		System.out.println("주문한 김밥의 갯수:"+cnt);
		int price= 2500;
		System.out.println("김밥의 단가:"+price);
		return price*cnt;
	}
	// ex) 단가가 2000원이 사과가 있고, 매개변수로 주문 수량을 입력했을 때, 총액을 리턴받아서 출력하세요.
	static int appleTot(int cnt) {
		int applePrice = 2000;
		System.out.println("구매할 사과의 갯수:"+cnt);
		System.out.println("사과의 단가:"+applePrice);
		return applePrice*cnt;
	}
	static int productTot(String name, int price, int cnt) {
		System.out.print(name+"\t");
		System.out.print(price+"\t");
		System.out.print(cnt+"\t");
		System.out.print(price*cnt+"\n");
		return price*cnt;
	}
	// ex) 구구단의 시작단수와 곱한 내용을 입력 받아, @@ X @@ = @@ 형식으로 출력하고, 그 결과값을 
	//     리턴하고, 외부에서는 guguTot이라는 변수로 누적하여, 최종 결과를 출력하게 하세요(메서드 선언과 호출)..
	//     구구단 임의로 3개 정도 처리하세요.
	//     gugu(4,5) 형식의 메서드 처리..
	static int gugu(int num01, int num02) {
		System.out.println(num01+" X "+num02+" = "+(num01*num02));
		return num01*num02;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guguTot=0;
		guguTot += gugu(5,4);
		guguTot += gugu(7,3);
		guguTot += gugu(8,2);
		System.out.println("구구단의 총값:"+guguTot);
		
		
		int tot=0;
		System.out.println("# 물건 구매 내역 #");
		tot+=productTot("사과",3000,2); // 각 물건의 구매 비용을 메서드마다 리턴하여 가져올 수 있고, 이것을 외부에서 누적할 수 있다.
		tot+=productTot("바나나",4000,3); // 각 물건의 구매 비용을 메서드마다 리턴하여 가져올 수 있고, 이것을 외부에서 누적할 수 있다.
		tot+=productTot("오렌지",2000,5); // 각 물건의 구매 비용을 메서드마다 리턴하여 가져올 수 있고, 이것을 외부에서 누적할 수 있다.
		System.out.println("총비용:"+tot+"원");
		
		
		int totMoney = calcuTot(3); // 기능메서를 호출하여 메모리에 메서드의 결과값(7500)를 받아서 totMoney에 할당한다.
		System.out.println("총 비용:"+totMoney);
		System.out.println("구매한 사과의 총비용:"+appleTot(5));
		System.out.println("구매한 사과의 총비용:"+appleTot(3));
		
		
	}

}



