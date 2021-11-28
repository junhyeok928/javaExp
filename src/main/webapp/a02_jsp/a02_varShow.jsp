<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	td{text-align:center;}	
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name = "전준혁";
	int age = 24;
	String local = "천안";
%>
 	<table align="center" width="30%" border="2">
 		<col width="30%">	<!-- 컬럼의 비율을 지정 -->
 		<col width="70%">
 		<tr><th>이름</th><td><%=name%></td></tr>
 		<tr><th>나이</th><td><%=age%></td></tr>
 		<tr><th>지역</th><td><%=local%></td></tr>
 	</table>
</body>
</html>