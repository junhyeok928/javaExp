<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import =  "javaexp.a04_vo.A02_Person"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function ex5(obj){
		if (obj.align=="center"){
			obj.align = "right";
		}else if (obj.align=="right"){
			obj.align = "left";
		}else {
			obj.align = "center";
		}
	}
	
	function ex6(obj){
		switch (obj.style.background){
			case "red":
				obj.style.background = "orange";
			break;
			case "orange":
				obj.style.background = "yellow";
			break;
			case "yellow":
				obj.style.background = "green";
			break;
			case "green":
				obj.style.background = "blue";
			break;
			case "blue":
				obj.style.background = "indigo";
			break;
			case "indigo":
				obj.style.background = "purple";
			break;
			case "purple":
				obj.style.background = "red";
			break;
	        default: 
	             obj.style.background = "red";
	        break;
		} 
	}
	function ex6_1(obj){
		var timee = setInterval(rainbow(obj),1000);
	}
	function rainbow(obj){
		switch (obj.style.background){
		case "red":
			obj.style.background = "orange";
		break;
		case "orange":
			obj.style.background = "yellow";
		break;
		case "yellow":
			obj.style.background = "green";
		break;
		case "green":
			obj.style.background = "blue";
		break;
		case "blue":
			obj.style.background = "indigo";
		break;
		case "indigo":
			obj.style.background = "purple";
		break;
		case "purple":
			obj.style.background = "red";
		break;
        default: 
             obj.style.background = "red";
        break;
	} 
	}
</script>
</head>
<body>
 
<!--[1단계:개념] 1. 웹프로그램에서 프런트단과 백앤드단을 나누는 기준은 무엇인가?
	요청에 의해서 실행되는 위치에 따라 프론트엔드, 백엔드단을 나눈다
	브라우저에서 실행이 된다면 프런트단 프로그램
	서버에서 실행이 된다면 백엔드단 프로그램이다.-->
	
<!--[1단계:개념] 2. 프런트단 html, css, javascript의 각각의 핵심 역할을 기술하세요-->
<!-- 	html : html 문서 파일을 웹 브라우저가 해석을 해서 구조를 통해 화면에 렌더링 해주게되고
      사용자는 View라는 스크린을 통해 접하게 된다
   	css :  html로 만들어진 문서의 텍스트 색상이나 크기, 이미지 크기나 위치, 표의 색상,
      배치방법 등 웹 문서의 디자인 요소를 담당한다.
   	javascript : 웹브라우저 위에서 html 웹 페이지를 동적처리를 담당한다. -->
   	
<!--[1단계:개념] 3. 백앤드단 java와 database의 역할을 기술하세요.-->
<!-- 	java: 백엔드단에서 필요로 하는 변수, 메모리설정, 객체처리, 조건/반복문 처리 등의 기능과
      내장된 객체를 이용해서 여러가지 프로그래밍적인 처리를 한다.
   	database: 여러 사람이 공유하여 사용할 목적으로 데이터를 체계화해 통합, 관리한다. -->
   	
<!--[1단계:개념] 4. jsp 프로그램의 처리되는 과정을 기술하세요.
  	1) 웹 브라우저에서 웹 서버로 요청을 전송한다.
   	2) 웹 서버는 동적 컨턴츠를 위해서 웹 컨테이너에게 요청을 다시 전달한다.
   	3) 웹 컨테이너에서 요청받은 jsp파일을 Servlet으로 변환한다. (.java 파일로 변환)
   	4) .java파일을 컴파일 해서 .class 생성한다.
   	5) 결과를 웹 컨테이너로 전달한다.
   	6) 그 결과를 웹 컨테이너는 웹 서버로 반환하고, 웹 서버는 웹 브라우저에게 응답한다.
   	7) .class 파일은 jsp파일이 처음 컴파일 이후로 변경되지 않는 이상은 기존의 .class 파일을 이용해서 서비스한다.
-->
<!-- [2단계:확인] 5. javascript의 이벤트와 이벤트핸들러를 통해서, h1 클릭시마다 정렬이 연속적으로 변경되게 하세요. -->
	<h1 onclick ="ex5(this)">예제5번</h1>
	
<!-- [2단계:확인] 6. javascript의 이벤트와 이벤트핸들러를 통해서, h2 클릭시마다 배경 색상이 연속적으로 무지개색상으로 변경되게 하세요. -->
	<h2 onclick ="ex6_1(this)">예제6번</h2>
	
<!-- [1단계:개념] 7. jsp의 코드가 들어가는 부분과 출력이 처리되는 부분을 구분하여 처리하세요 -->
<%
   String name = "홍길동";
   int age = 25;
   String sex = "남자";
%>
   <h3>이름 : <%=name %></h3>
   <h3>나이 : <%=age %></h3>
   <h3>성별 : <%=sex %></h3>
   
<!-- [2단계:개념] 8. jsp에서 변수, 객체, 배열을 선언하여 화면에 출력하세요. -->
<% 
   String pname="햄버거";
   int price = 6900;
   int pcnt = 3;
   // 객체
   //	1) 사용하게 될 객체 선언.
   //	2) import 처리..
   //	3) 객체 생성..
   A02_Person p01 = new A02_Person("홍길동", 25, "서울신림");
   String str[] = {"사과", "6900", "3"};
%>
   <h2 align="center">물건명 : <%=pname %></h2>
   <h2 align="center">가격 : <%=price %></h2>
   <h2 align="center">갯수 : <%=pcnt %></h2>
   <h2 align="center">가격 : <%=str[1] %></h2>
   <h2 align="center">이름 : <%=p01.getName()%></h2>
   <h2 align="center">나이 : <%=p01.getAge()%></h2>
   <h2 align="center">주소 : <%=p01.getLoc()%></h2>
   

</body>
</html>