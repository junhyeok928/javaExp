package javaexp.a02_middle;

public class A02_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열의 선언. 
		// 	ex) 데이터가 같은 이름으로 나열되어 저장하는 구조..
		//      기차 1호, 2호, ..3
		//      ktx에 1호차 2호차 3호차.. ktx1호
		//      배열은 배열명을 지정하면 0부터 시작해서 이름을 지정할 수 있다.
		//      array
		//      ex) int[] 정수형 배열 데이터 유형
		//          이름을 array라고 선언.
		int[] array;
		// 배열의 객체 생성 : 정수형 3개가 데이터로 할당 수 있는 배열 객체 생성..
		array= new int[3];
		//   [@@@,@@,@@]
		
		
		// 0부터 시작하는 index별로 배열의 데이터 할당.
		// 배열의 첫번째에 데이터를 25를 할당
		// array[0] : 배열명[index번호]
		array[0] = 25;
		array[1] = 30;
		array[2] = 40;
		System.out.println("배열에 할당한 데이터 배열의 첫번째 데이터 :"+array[0]);
		System.out.println("배열에 할당한 데이터 배열의 두번째 데이터  :"+array[1]);
		System.out.println("배열에 할당한 데이터 배열의 세번째 데이터  :"+array[2]);
		// ex) points 배열로 국어 영어 수학 점수를 할당하고, 출력 처리하세요.
		int[] points;
		points = new int[3];
		points[0] = 80;
		points[1] = 70;
		points[2] = 90;
		System.out.println("첫번째 points에 들어간 국어 점수:"+points[0]);
		System.out.println("두번째 points에 들어간 영어 점수:"+points[1]);
		System.out.println("세번째 points에 들어간 수학 점수:"+points[2]);
	}

}
