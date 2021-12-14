<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
h2 {
	text-align: center;
}

h3 {
	text-align: center;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<h2>학생 정보</h2>
	<h3>${paramValues.student[0]}</h3>
	<h3>${paramValues.grade[0]}</h3>
	<h3>${paramValues.gender[0]}</h3>
</body>
</html>