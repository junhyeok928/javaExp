<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
# 숫자형 요청값의 처리 예제
ex) 
 --%>
	<%
	int grade = (int) (Math.random() * 8 + 2); // 2~ 9까지 임의의 수 발생
	int cnt = (int) (Math.random() * 9 + 1); // 1~9까지 임의의 수 발생
	%>
	<h2>구구단 학습게임</h2>
	<form>
		<input type="text" name="num01" size="2" value="<%=grade%>"> X 
		<input type="text" name="num02" size="2" value="<%=cnt%>"> = 
		<input type="text" name="result" size="2"><br> 
		<input type="submit" value="계산">

	</form>
	<%
	//	1. 요청값을 받는 처리
	String num01s = request.getParameter("num01");
	String num02s = request.getParameter("num02");
	String results = request.getParameter("result");
	int num01 = 0;
	int num02 = 0;
	int result = 0;
	// 2. 요청값이 초기화면이 아닐 때, 화면 출력하게 처리
	if (num01s != null && num02s != null) {
		num01 = Integer.parseInt(num01s);
		num02 = Integer.parseInt(num02s);
		result = Integer.parseInt(results);
	}
	%>
	<h2>
		해답 :
		<%=num01%>
		X
		<%=num02%>
		=
		<%=(num01 * num02)%></h2>
	<h2>
		입력한 결과 :
		<%=result%></h2>
	<h2>
		정답 여부 :
		<%=(num01 * num02) == result ? "정답" : "오답"%></h2>


</body>
</html>