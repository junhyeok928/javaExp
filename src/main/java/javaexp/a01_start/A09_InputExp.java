package javaexp.a01_start;

import java.util.Scanner;

public class A09_InputExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("좋아하는 과일명입력하세요.");
		String fruit = sc.nextLine();
		System.out.println("입력된 과일명:"+fruit);
		System.out.print("가격을 입력하세요:");
		int price = sc.nextInt();
		System.out.println("입력된 가격:"+price);
		System.out.print("갯수를 입력하세요:");
		int cnt = sc.nextInt();
		System.out.println("입력된 갯수:"+cnt);
		System.out.println("총비용:"+(price*cnt));
		
		
	}

}
