<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="javaexp.a04_vo.Player"%>
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
	Player p1 = new Player("양현종", "투수", "텍사스", 5.4);
	Player p2 = new Player("박정현", "투수", "삼성", 2.63);
	%>
	<h2 align="center">팀 성적</h2>
	<table width="50%" align="center" border="2">
		<col width="25%">
		<col width="25%">
		<col width="25%">
		<col width="25%">
		<thead>
			<tr>
				<th>이름</th>
				<th>분야</th>
				<th>소속팀</th>
				<th>성적</th>
			</tr>
		</thead>
		<%-- t1.을 입력하고 ctrl+space를 하면 선언할 수 있는 메서드가 자동으로 나온다 --%>
		<tr>
			<td><%=p1.getName()%></td>
			<td><%=p1.getPart()%></td>
			<td><%=p1.getTeam()%></td>
			<td><%=p1.getRecord()%></td>
		</tr>
		<tr>
			<td><%=p2.getName()%></td>
			<td><%=p2.getPart()%></td>
			<td><%=p2.getTeam()%></td>
			<td><%=p2.getRecord()%></td>
		</tr>
	</table>
</body>
</html>