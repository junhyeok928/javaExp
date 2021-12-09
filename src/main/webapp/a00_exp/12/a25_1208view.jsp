<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	td{text-align:center;}
</style>
</head>
<body>
	<%--
	임의의 수학문제 4개를 내고 총점을 계산하여 100점만점 기준으로 출력처리
	 --%>
<%-- 	 <h2 align="center">수학문제</h2>
	 <form>
	 <table align="center" border>
	 	<tr><th>번호</th><th>문제</th><th>정답</th></tr>
	 	<tr><td>1</td>
	 		<% 
	 			int num01 = (int)(Math.random()*9+2);
	 			int num02 = (int)(Math.random()*9+1);
	 		%>
	 		<td>
	 			<input type="text" name = "num01" value="<%=num01 %>" size="1"/>
	 			<input type="text" name = "cal" value=" + " size="1"/>
	 			<input type="text" name = "num02" value="<%=num02 %>" size="1"/>
	 		</td>
	 		<td>
	 			<input type="text" name = "result" value="" size="1"/>
	 		</td>
	 	</tr>
	 	<tr><td colspan="3"><input type="submit" value="점수확인"/></td></tr>
	 	<%
	 		
	 	// ?num01=7&num02=4&result=11
	 		String num01S = request.getParameter("num01");
	 		String num02S = request.getParameter("num02");
	 		String resultS = request.getParameter("result");
	 	// num01S : "7"
	 	// num02S : "4"
	 	// result : "11"
	 		
	 		int point = 0;
	 		int num01R = 0;
	 		int num02R = 0;
	 		int result = 0;
	 	// num01R = Integer.parseInt(num01S);
	 	// if(num01S != null) : 로딩한 초기화면에서는 num01=7&num02=4&result=11
	 	// 식의 요청값이 없기 때문에 조건을 처리하지 않으면 바로 에러 발생
	 	// Integer.parseInt(null); java.lang.NumberFormatException: null
	 	// # 결국 요청값이 있을 때만 형변환 처리를 한다.
	 		if(num01S!=null) num01R = Integer.parseInt(num01S);
	 		if(num02S!=null) num02R = Integer.parseInt(num02S);
	 		if(resultS!=null) result = Integer.parseInt(resultS);
	 		// 임의로 할당된 num01, num02 의 정답을 변수로 할당.
	 		int corNum = num01R + num02R;
	 		if(corNum==result){	// + 연산결과가 정답일 떼, 처리될 내용..
	 			point+=25;
	 		}
	 		if(resultS!=null){	// 입력을 했을 때, 결과 점수를 출력..
	 		
	 	%>
	 	<tr><td colspan="3">결과점수:<%=point %></td></tr>
	 		<%} %>
	 </table>
	 </form> --%>
	 <h2 align="center">MVC패턴의 View단</h2>
	 <form align = "center">
	 국어 : <input type="text" name = "kor" size="1"/><br>
	 영어 : <input type="text" name = "eng" size="1"/><br>
	 수학 : <input type="text" name = "math" size="1"/><br>
	 <input type="submit" value="점수 입력"/>
	 </form>
	 <h3 align="center">국어:${kor}</h3>
	 <h3 align="center">영어:${eng}</h3>
	 <h3 align="center">수학:${math}</h3>
	 <h3 align="center">총계:${tot}</h3>
	 <h3 align="center">평균:${avg}</h3>
	 
</body>
</html>