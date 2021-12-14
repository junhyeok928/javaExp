<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	h2{align:center;},
	h3{align:center;}
</style>
<title>Insert title here</title>
</head>
<body>
	<h2>전송되어온 데이터</h2>
	<!-- a11_rev.jsp?id=himan&pass=7777 -->
	<h3>아이디:<%=request.getParameter("id") %></h3>
	<h3>패스워드:<%=request.getParameter("pass") %></h3>
</body>
</html>