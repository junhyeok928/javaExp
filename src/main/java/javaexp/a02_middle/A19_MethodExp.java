package javaexp.a02_middle;

public class A19_MethodExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Screen sc = new Screen("재미있는 영화",7000);
		int totPay = sc.buy(4);
		System.out.println("총비용:"+totPay);
	}
}
// ex) Screen  필드 영화제목/입장료/입장관객수
//             생성자 영화제목, 입장료
//             메서드(buy) 입장관객수입력받아 할당하고 최종 금액을 리턴
//                        입장료*입장관객수
//     main()에서 최종 금액을 출력 처리.
class Screen{
	String title;
	int pay;
	int cnt;
	Screen(String title, int pay){
		this.title = title;
		this.pay = pay;
	}
	int buy(int cnt) {
		this.cnt = cnt; // 외부에서 입력받은 내용을 필드로 할당.
		 System.out.println("# 영화구매 #");
		 System.out.println("영화명:"+title);
		 System.out.println("입장료:"+pay);
		 System.out.println("입장관갯수:"+cnt);		
		return pay*cnt;
	}
	
}
