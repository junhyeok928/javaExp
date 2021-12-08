<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = request.getParameter("oname");
	String price = request.getParameter("price");
	String cnt = request.getParameter("cnt");
	%>
	
	<h2>
		물건:<%=name%></h2>
	<h2>
		가격:<%=price%></h2>
	<h2>갯수:<%=cnt %></h2>
</body>
</html>