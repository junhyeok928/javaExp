<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
 	# 요청값이 숫자형일 때, 처리
 	1. 기본적으로모든 요청값은 문자열형이다.
 	2. 그래서 숫자형 데이터를 요청값으로 받아서 처리해야할 경우에는 형변환이 필요하다.
 	3. 숫자형 문자열을 숫자로 변활할 때 필요한 기능 메서드.
 		Integer.parseInt("숫자형문자열") ==> 숫자
 		ex) int num05 = Integer.parseInt("25");
 		num04에 25라는 정수가 할당될 수 있다.
 	4. 요청값을 받아서 숫자형태로 변환..
 		String num05 = request.getParameter("age");
 		if(ageS!=null){	// 요청값을 입력했을 때만 처리..
 			int age = Integer.parseInt(agesS);
 		}
 		int age = Integer.parseInt(agesS);
 	 -->
	<form>
		구매할 물건 : <input type="text" name="pname"/><br>
		가격 : <input type="text" name="price"/><br>
		갯수 : <input type="text" name="cnt"/><br>
		<input type="submit" value="등록"/>
	</form>
	<%
		String pname = request.getParameter("pname");
		String priceS = request.getParameter("price");
		String cntS = request.getParameter("cnt");
		int price = 0;
		int cnt = 0;
		
		if(priceS != null){
			price = Integer.parseInt(priceS);
		}
		if(cntS != null){
			cnt = Integer.parseInt(cntS);
		}
	// 초기화면에 요청값이 없을 때, 즉 pname이 null일때를 제외하고 화면 출력
		if(pname!=null){//요청값이 있을 때만 처리
	
	%>
	<h2>물건명 : <%=pname %></h2>
	<h2>가격 : <%=price %></h2>
	<h2>갯수 : <%=cnt %></h2>
	<h2>총계 : <%=(price*cnt)%></h2>
	<%
		}
	%>
</body>
</html>