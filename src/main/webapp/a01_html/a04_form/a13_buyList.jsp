<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
#post 방식의 한글 요청값을 contentType을 설정하여야 정상적으로 처리된다.
 --%>
<%
	request.setCharacterEncoding("uft-8");
%>
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
	<h3>물건명:<%=request.getParameter("pname") %></h3>
	<h3>갯수:<%=request.getParameter("cnt") %></h3>
</body>
</html>