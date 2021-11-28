package javaexp.a00_exp;

public class A10_1111 {

	public static void main(String[] args) {
//		[1단계:기본]1. 테이블의 기본속성과 하위 요소객체들의 특성을 기술하세요.
/*			table 속성="속성값"
 * 			1. 속성
 * 				border : 테두리 굵기
  				align : 포함하고 있는 요소객체 대비 정렬
  				width/height : 높이와 넓이
  				style : 개별적인 css 속성을 지정할 때, 활용한다.
  				cf) style 속성은 모든 요소객체(태그)에서 해당 태그만 css 속성을 지정할 때,
  				사용된다.
  			2. 하위 요소객체
  				1) 차상위
  				col : 각 컬럼별로 폭을 지정할 때 사용된다 <col width="20%">
  				thead
  				tbody
  				tfoot
  				2) 행단위 처리
  					tr
  				3) 열단위 처리
  					th : 테이블 상단위 컬럼을 지정할 때..
  					td : 테이블의 셀에 열단위로 데이터를 입력처리할 때.
  				
  				
  				
			
 * */		
		
//		[1단계:확인]2. 다음과 같은 테이블의 구조를 만들되, row병합, col병합을 포함하여 만드세요.(1X2-병합제외,2X3,2X4,2X5,4X3)
/*
 			rowspan : 행단위로 병합, 아래의 td를 삭제해준다.
 			colspan : 열단위로 병행, 옆의 td를 삭제해준다.
		   <!-- 1*2 테이블 --!>
		   <table border="1">
		      <tr><td colspan="2">열 방향 병합</td></tr>
		   </table>
		   
		   <!-- 2*3 테이블 --!>
		   <table border="1">
		      <tr><td>1</td><td rowspan="2">2</td><td>3</td></tr>
		      <tr><td>4</td><td>5</td></tr>
		   </table>
		   
		   <!-- 2*4 테이블 --!>
		   <table>
		      <tr><td>1</td><td colspan="2">2</td><td>3</td></tr>
		      <tr><td colspan="3">4</td><td>5</td></tr>
		   </table>
		   
		   <!-- 2*5 테이블 --!>
		   <table>
		      <tr><td rowspan="2">1</td><td>2</td><td rowspan="2">3</td><td>4</td><td rowspan="2">5</td></tr>
		      <tr><td>6</td><td>7</td></tr>
		   </table>
		   
		   <!-- 4*3 테이블 --!>
		   <table>
		      <tr><td colspan="3">1</td></tr>
		      <tr><td>2</td><td rowspan="3">3</td><td rowspan="2">4</td></tr>
		      <tr><td>5</td></tr>
		      <tr><td>6</td><td>7</td></tr>
		   </table>		
		
*/		
//		[1단계:기본]3. jsp가 처리되는 최종 화면을 출력되는 과정을 기술하세요. 
/*			1. [서버]서버단에서 jsp를 작성시, 작성 후, 저장하는 순간
 				@@@.jsp ==> @@@.java ==> @@@.class
 			2. [서버]tomcat을 실행하는 순간 @@@.class가 컨테이너 메모리에 로딩되어 객체가 생성이 된다.
 				2번,3번 항목은 프레임워을 쓸때와 쓰지 않을 때와 차이가 있다.
 				호출시, 실제 객체가 생성되는 경우가 많다.
 			
 			3. [클라이언트(브라우저) ==> 서버 요청]사용자가 url주소로 해당 jsp를 호출하는 순간.
 				@@@.class의 내용이 실행이 되어, java+html 코드의 최종 결과 html을 만들어서
 				스트림방식(Stream이라는 자바의 객체)으로  html코드를 client에 전달한다.
 				cf) Stream 자바또는 어플리케이션의 api객체로 network/파일로 데이터를 전송해주는 역할을 하는 객체
 			4. [클라이언트(브라우저)] 
 				받은 html을 문자(태그와 문자,javascript등)을 받아 태그와 css는 해당 내용을 랜더링하고,
 				javascript는 브라우저내의 컴파일러에 의해 해석해서 메모리에 로딩 시켜 실행을 한다.
 				cf) node 계열 프로그램에서는 javascript를 서버에서 컴파일 시켜 보낸다.
 				
 			5. [클라이언트(브라우저)]
 				원하는 웹화면과 javascript 실행 결과를 볼 수 있다.
			
 * */		
//		[1단계:기본]4. [jsp] Season이라는 클래스에 계절명, 날씨, 기간 속성을 넣고 테이블 화면에 출력하세요.(4계절처리- 객체 4개 생성)
		/*
		<%	// api : 많이 활용하는 객체는 java 쪽에서 만들어 제공한다. 이것을 사용할 때.
			//      지정된 패키지와 클래스를 선언해주면 된다.
			// 동적배열 중에 객체가 들어가 동적배열 처리..
			// ArrayList<객체유형>
			ArrayList<Season> slist = new ArrayList<Season>();
			// slist.add(new 객체()); 
			// Season(String sname, String weather, String priod)
			slist.add(new Season("봄","꽃샘추위/따뜻함","3월~5월"));
			slist.add(new Season("여름","무더위","6월~8월"));
			slist.add(new Season("가을","서늘함","9월~10월"));
			slist.add(new Season("겨울","눈/추위","11월~2월"));
			// [ new Season(), new Season(),new Season(),new Season(), ]
			// slist.get(0) : 첫번째 Season()객체를 치칭
			// slist.get(0).getSname() : 해당 객체에 소속된 메서드를 호출
		%>
			<h2 align="center">계절과 날씨</h2>
			<table align="center" border="1" width="90%">
		    	<tr><th>계절</th><th>날씨</th><th>기간</th></tr>
		    	<tr><td><%=slist.get(0).getSname()%></td>
		    		<td><%=slist.get(0).getWeather()%></td>
		    		<td><%=slist.get(0).getPriod()%></td></tr>
		    	<tr><td><%=slist.get(1).getSname()%></td>
		    		<td><%=slist.get(1).getWeather()%></td>
		    		<td><%=slist.get(1).getPriod()%></td></tr>
		    	<tr><td><%=slist.get(2).getSname()%></td>
		    		<td><%=slist.get(2).getWeather()%></td>
		    		<td><%=slist.get(2).getPriod()%></td></tr>
		    		
		    </table> 
		 * */		
//		[2단계:응용]5. [jsp]java와 테이블 태그를 이용해서 구매한 물건정보 3개를 출력하고, 최하단에 총계 정보를 처리하여 출력하세요.
//		            단위 계와, 총계는 프로그램으로 처리하여 출력하세요.
/*
		Product p1 = new Product("사과",2000,2);
		Product p2 = new Product("바나나",4000,3);
		Product p3 = new Product("딸기",12000,3);
		int tot = p1.getPrice()*p1.getCnt()+p2.getPrice()*p2.getCnt()+p3.getPrice()*p3.getCnt();
	%>
		<table border>
			<tr><th>물건명</th><th>가격</th><th>갯수</th><th>계</th></tr>
			<tr><td><%=p1.getName()%></td>
				<td><%=p1.getPrice()%></td>
				<td><%=p1.getCnt()%></td>
				<td><%=p1.getPrice()*p1.getCnt()%></td></tr>
			<tr><td><%=p2.getName()%></td>
				<td><%=p2.getPrice()%></td>
				<td><%=p2.getCnt()%></td>
				<td><%=p2.getPrice()*p2.getCnt()%></td></tr>
			<tr><td><%=p3.getName()%></td>
				<td><%=p3.getPrice()%></td>
				<td><%=p3.getCnt()%></td>
				<td><%=p3.getPrice()*p3.getCnt()%></td></tr>
			<tr><td colspan="3">총계</td><td><%=tot%></td></tr>	
		
		</table>	
*/			
//		[1단계:기본]6. img 태그의 기본태그의 속성과 속성값을 기술하고, 상대적 경로로 이미지를 호출하여 출력하세요.
/*			<img src="경로및파일명" 속성="속성값"/>
 * 			1. 속성
 * 				src : 이미지 파일의 절대/상대 경로
 * 				width/height : 이미지의 폭과 높이
 * 				alt : 이미지가 존재하지 않을 경우 출력할 문자열
 * 			2. 상대적 경로 처리
 * 				현재 파일을 기준으로 같은 폴드 파일이 있을 때 src="파일명"
 * 				상위 폴드에 파일이 있을 때 src="../파일명"
 * 				하위 폴드에 파일이 있을 때 src="./폴드명/파일명"
 * 
 * */		
//		[2단계:응용]7. table과 이미지 태그를 조합하여, 온라인의 쇼핑몰과 같이 이미지, 물건정보, 가격을 표시하여 리스트 출력하세요.
				
/*				1. 상대내지절대 경로에 필요로 하는 이미지 저장
 * 					절대 경로 : /javaexp/z01_img/prod1.jpg
 * 					절대 경로 : /javaexp/z01_img/prod2.jpg
 * 					상대 경로 : 현재 파일이 webapp\a01_html\a03_basicTag
 * 								이미지를 해당 폴드에 위치시킨 후
 * 									prod3.jpg
 * 				2. 테이블 안에 img 태그 src로 상대/절대 경로 이미지 호출.
 * 				3. 효과적인 td 안에 img 태그 처리.
 * 				<table>
 * 					<tr><th>물건이미지</th><th>물건정보</th><th>가격</th>
 * 				    <tr><td><img src="/javaexp/z01_img/prod1.jpg" width="100px" height="100px"/></td>
 * 						<td>물건1 정보</td><td>30000</td></tr>
 * 				    <tr><td><img src="/javaexp/z01_img/prod2.jpg" width="100px" height="100px"/></td>
 * 						<td>물건2 정보</td><td>20000</td></tr>
 * 				    <tr><td><img src="prod3.jpg" width="100px" height="100px"/></td>
 * 						<td>물건2 정보</td><td>40000</td></tr>
 * 
 *              </table>
 * 
 * */		
		
//		[2단계:알고리즘]8. [jsp] 3개의 난수를 발생하여, 정수형 배열3개를 선언하고, 낮은 데이터부터 높은 데이터 순으로 할당하여,
//		                출력하세요.
		int nums[] = new int[3];
		// 1번째 방법
		// 최대값/최소값 지정하고, 그 외 중간값을 처리하는 방법.
		int max=1;
		int min=100;
		for(int idx=0;idx<3;idx++) {
			nums[idx]=(int)(Math.random()*100+1);
			if(min>nums[idx]) {
				min=nums[idx];
			}
			if(max<nums[idx]) {
				max=nums[idx];
			}
			System.out.print(nums[idx]+",");
		}
		var mid=0; // 중간값  : 한계 - 최대/최소값이 중간값이 동일한 때, 중간값을 0으로 처리..
		for(int idx=0;idx<3;idx++) {
			// 최소값보다 크고, 최대값 보다 작을 때
			if(min<nums[idx]&&max>nums[idx]) {
				mid = nums[idx];
			}
		}
		
		System.out.println();
		System.out.println("최대:"+max);
		System.out.println("최소:"+min);
		System.out.println("중간:"+mid);
		// 특정 배열에 할당..
		// [25,3,27]
		// 반복문
		// 0  1단계 X
		// 1  2단계 (3, 25)를 비교해서 자리를 tmp를 통해 바꾸어 줌. [3,25,27]
		// 2  3단계 (3,27),(25,27) 비교해서 크기에 따라 바꾸어 줌. [3,25,27]	
		for(int idx=0;idx<3;idx++) {
			for(int jdx=0;jdx<idx;jdx++) {
				if(nums[idx]<nums[jdx]) {
					var tmp = nums[idx];
					nums[idx] = nums[jdx];
					nums[jdx] = tmp;
				}
			}
		}
		for(int idx=0;idx<3;idx++) {
			System.out.print(nums[idx]+",");
		}
		
		
	}

}
