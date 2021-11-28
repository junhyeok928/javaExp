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
	// id=himan&pass=7777
	// 요청값으로 client로 부터 넘겨온 데이터를 페이지 호출과 함께
	// 아래형식으로 server에서 데이터를 받게 된다.
	
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	String result = "";
	if(id.equals("himan")&&pass.equals("7777")){
		result="인증성공";
	}else{
		result="인증실패";
	}
	// 다시 client에 아래와 같이 받은 데이터와 html코드와 함께 전송한다.
	// 브라우저 화면에서 입력한 내용을 확인할 수 있다.
	%>
	<h2>
		입력한 아이디:<%=id%></h2>
	<h2>
		입력한 아이디:<%=pass%></h2>
	<h2>결과:<%=result %></h2>
	<script>
		// java ==> javascript
		var result = "<%=result%>";
		if(result=="인증실패"){
			alert("인증실패\n로그인 다시 하겠습니다.");
			// a href 작용을 하는 자바스크립트 코드.. 페이지가 이동된다.
			location.href="a04_webProgProcess.jsp";
		}
	</script>
</body>
</html>