<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String pname = request.getParameter("pname");
	%>
	<h2>요청 받은 값</h2>
	<h3>물건명: ${param.pname}</h3>
	<h3>가격: ${param.price}</h3>
	<h3>갯수: ${param.cnt}</h3>
	<h3>할인여부: ${param.discount}</h3>

</body>
</html>