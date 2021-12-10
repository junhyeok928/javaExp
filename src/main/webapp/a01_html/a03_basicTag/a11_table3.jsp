<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="javaexp.a04_vo.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
h2 {
	align: center;
}

,
h3 {
	align: center;
}

table, th, td {
	border-collapse: collapse;
	border: 1px solid black;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<%--
    # jsp의 반복문과 테이블 처리
    1. col단위 반복문 수행으로 테이블 출력 처리
        jsp
        <%
        for(초기값;반복조건;증감연산){
        %>
        처리한 태그(반복출력할내용)
        <%}%>
    2. 배열값 
        for(단위 데이터:배열){
            단위데이터..
        }
     --%>
	<table>
		<tr>
			<%
			for (int i = 1; i <= 5; i++) {
			%>
			<td><%=i%>
				번 열
			</td>
			<%
			}
			%>
		</tr>
	</table>
	<%
	String fruits[] = { "사과", "바나나", "딸기" };
	%>
	<table>
		<tr>
			<%
			for (String fruit : fruits) {
			%>
			<td><%=fruit%></td>
			<%
			}
			%>
		</tr>
	</table>
	<table>
		<tr>
			<%
			for (int i = 5; i <= 10; i++) {
			%>
			<td><%=i%></td>
			<%
			}
			%>
		</tr>
	</table>
	<%
	int numbers[] = { 1000, 2000, 3000 };
	/*
	배열의 반복문 index 처리

	for(int i=1; i<prices.length;idx++){
		i : 0부터 시작해서 .length보다 1작은 때 까지 반복 수행..
		prices[i] : 배열의 값을 가져올 수 있다.
		
	}
	*/
	%>
	<table>
		<%
		for (int number : numbers) {
		%>
		<tr>
			<td><%=number%></td>
		</tr>
		<%
		}
		%>

	</table>
	<%
	String product[] = { "컴퓨터", "냉장고", "세탁기" };
	%>
	<table border>
		<tr>
			<th>번호</th>
			<th>전자제품</th>
		</tr>
		<%
		for (int i = 0; i < product.length; i++) {
		%>
		<tr>
			<td><%=(i + 1)%></td>
			<td><%=product[i]%></td>
		</tr>
		<%
		}
		%>
	</table>
	<%--
	ex) 도서명을 배열로 3개 선언하고, 번호와 함께 출력하세요.
	
	 --%>
	<%
	String books[] = { "홍", "길", "동" };
	int[] pays = { 28000, 30000, 32000 };
	%>
	<table border>
		<tr style="background: yellow;">
			<th>이름</th>
			<th>가격</th>
		</tr>
		<%
		for (int i = 0; i < books.length; i++) {
		%>
		<tr>
			<td><%=books[i]%></td>
			<td><%=pays[i]%></td>
		</tr>
		<%
		}
		%>
	</table>
	<%
	/*
	# VO객체를 활용하여 ArrayList에담고, 해당 내용을 반복문을 통해서 출력 처리하기..
	1. VO객체 만들기 물건명, 가격, 갯수
	2. jsp : import하기.. VO 및 ArrayList
	3. ArrayList<Prodict> 선언 및 객체 담기..
		list.add(new Product("오렌지",3000,5))
	4. for(int i=0; i<list.size();i++){
			Product prod = ;ist.get(i);
			prod.getName()
			prod.getPrice()
			prod.getCnt()
		}
	*/
	%>
	
	<%--
	ex) table 중앙정렬, 타이틀 부분을 배경색 노랑색, 1line으로 만들어,
	마트에서 구매할 물건명 가격 갯수로 3개 물품을 출력하세요..
	 --%>
	<%
	String products[] = { "사과", "배", "수박" };
	int[] pays1 = { 28000, 30000, 32000 };
	int[] cnt = { 2, 3, 4 };
	%>
	<table border="1">
		<tr style="background: yellow;">
			<th>번호</th>
			<th>이름</th>
			<th>가격</th>
		</tr>
		<%
		for (int i = 0; i < products.length; i++) {
		%>
		<tr>
			<td><%=cnt[i]%></td>
			<td><%=products[i]%></td>
			<td><%=pays1[i]%></td>
		</tr>
		<%
		}
		%>
	</table>

</body>
</html>