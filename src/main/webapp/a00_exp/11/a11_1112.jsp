<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="javaexp.a00_exp.Computer02"%>
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
	Computer02 com = new Computer02("삼성", "3.4GHz", 16, 500);
	// 객체 생성과 초기값 할당.
	%>
	<h2 align="center">구매할 컴퓨터 부품 목록</h2>
	<table align="center" border="1" width="50%">
		<col width="30%">
		<col width="70%">
		<tr>
			<th>제조사</th>
			<td><%=com.getCompany()%></td>
		</tr>
		<tr>
			<th>CPU</th>
			<td><%=com.getCpu()%></td>
		</tr>
		<tr>
			<th>RAM(GB)</th>
			<td><%=com.getRam()%></td>
		</tr>
		<tr>
			<th>HDD(GB)</th>
			<td><%=com.getHdd()%></td>
		</tr>
	</table>
</body>
</html>