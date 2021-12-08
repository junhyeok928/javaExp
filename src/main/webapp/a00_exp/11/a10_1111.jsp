<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="javaexp.a04_vo.Season"
	import="java.util.ArrayList" import="java.util.Collections"%>
<!DOCTYPE html>
<html>
<head>
<style>
td {
	text-align: center;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	// api : 많이 활용하는 객체는 java 쪽에서 만들어 제공한다. 이것을 사용할 떄.
	//		지정된 패키지와 클래스를 선언해주면 된다.
	// 동적배열 중에 객체가 들어가 동적배열 처리..
	// ArrayList<객체유형>
	ArrayList<Season> slist = new ArrayList<Season>();
	// slist.add(new객체());
	slist.add(new Season("봄", "따뜻함","3~5월"));
	slist.add(new Season("여름", "더움","6~8월"));
	slist.add(new Season("가을", "시원함","9~11월"));
	slist.add(new Season("겨울", "추움","12~2월"));
	// [ new.Season(), new.Season(), new.Season(), new.Season()]
	// slist.get(0) : 첫번째 Season()객체를 지칭
	// slist.get(0).getsName() : 해당객체에 소속된 메서드를 호출
	
	// -----------------------------------------------
/* 	Season s1 = new Season("봄", "따뜻함", "3월~5월");
	Season s2 = new Season("여름", "더움", "6월 ~ 8월");
	Season s3 = new Season("가을", "시원함", "9월 ~ 11월");
	Season s4 = new Season("겨울", "추움", "12월 ~ 2월"); */

	int apple = 3000;
	int banana = 1500;
	int melon = 4000;
	int tot = apple + banana + melon;
	
	// -----------------------------------------------
	// 예제 8.
	ArrayList<Integer> ranList = new ArrayList<Integer>();
	for (int i = 0; i < 3; i++) {
		int ran = (int) (Math.random() * 10 + 1);
		ranList.add(ran);
	}
	Collections.sort(ranList);
	
	// 예제 8 다른 방법1
	int nums[] = new int[3];
	// 1번째 방법
	// 최대값/최소값 지정하고, 그 외 중간값을 처리하는 방법.
	int max = 1;
	int min = 100;
	for(int idx=0;idx<3;idx++){
		nums[idx]=(int)(Math.random()*100+1);
		if(min>nums[idx]){
			min=nums[idx];
		}
		if(max<nums[idx]){
			max=nums[idx];
		}
	}
	var mid = 0;
	for(int idx = 0;idx<3;idx++){
		// 최소값 보다 크고, 최대값 보다 작을때
		if(min>nums[idx]&&max<nums[idx]){
			mid = nums[idx];
		}
	}
	// 예제 8 다른 방법2
	// 특정 배열에 할당..
	// [25, 3, 27]
	// 반복문
	// 0 1단계 X
	// 1 2단계 3, 25를 비교해서 자리를 tmp를 통해 바꾸어줌.[3,25,27]
	// 2 3단계 (3,27),(25,27) 비교해서 크기에 따라 바꾸어줌. [3,25,27]
	
	for(int i = 0; i<3;i++){
		for(int j=0;j<i;j++){
			if(nums[i]<nums[j]){
				var tmp = nums[i];
				nums[i]=nums[j];
				nums[j]=tmp;
			}
		}
	}
	%>
	<h2 align="center">예제 4</h2>
	<%-- <table width="50%" align="center" border="2">
		<col width="33%">
		<col width="33%">
		<col width="33%">
		<thead>
			<tr>
				<th>계절명</th>
				<th>날씨</th>
				<th>기간</th>
			</tr>
		</thead>
		<tr>
			<td><%=s1.getSeason()%></td>
			<td><%=s1.getWeather()%></td>
			<td><%=s1.getDate()%></td>
		</tr>
		<tr>
			<td><%=s2.getSeason()%></td>
			<td><%=s2.getWeather()%></td>
			<td><%=s2.getDate()%></td>
		</tr>
		<tr>
			<td><%=s3.getSeason()%></td>
			<td><%=s3.getWeather()%></td>
			<td><%=s3.getDate()%></td>
		</tr>
		<tr>
			<td><%=s4.getSeason()%></td>
			<td><%=s4.getWeather()%></td>
			<td><%=s4.getDate()%></td>
		</tr>
	</table> --%>
	<table align = "center" border="1" width="90%">
		<tr><th>계절</th><th>날씨</th><th>기간</th></tr>
		<tr><td><%=slist.get(0).getSname() %></td>
			<td><%=slist.get(0).getWeather() %></td>
			<td><%=slist.get(0).getPriod() %></td></tr>
		<tr><td><%=slist.get(0).getSname() %></td>
			<td><%=slist.get(1).getWeather() %></td>
			<td><%=slist.get(2).getPriod() %></td></tr>
		<tr><td><%=slist.get(0).getSname() %></td>
			<td><%=slist.get(1).getWeather() %></td>
			<td><%=slist.get(2).getPriod() %></td></tr>	
	</table>
	
	
	<h2 align="center">예제 5</h2>
	<table align="center" width="30%" border="2">
		<col width="30%">
		<col width="70%">
		<tbody>
			<tr>
				<th>사과</th>
				<td><%=apple%></td>
			</tr>
			<tr>
				<th>바나나</th>
				<td><%=banana%></td>
			</tr>
			<tr>
				<th>멜론</th>
				<td><%=melon%></td>
			</tr>
		</tbody>
		<tfoot>
			<tr>
				<th>총가격</th>
				<td><%=tot%></td>
			</tr>
		</tfoot>
	</table>
	<h2 align="center">예제 8</h2>
	<p align="center">
		최소값 부터 차례로 출력
		<%=ranList.get(0)%>,
		<%=ranList.get(1)%>,
		<%=ranList.get(2)%></p>
</body>
</html>