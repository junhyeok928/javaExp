<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>예제 4,5</h1>
 	<form action="a12_1115_ex4.jsp">
 		물건명:<input type ="text" name="oname" value=""/><br>
 		가격:<input type ="text" name="price" value=""/><br>
 		갯수:<input type ="text" name="cnt" value=""/><br>
 		<input type ="button" value="등록" onclick="enrollment()"/><br>
 	</form>
 <script type="text/javascript">
	function enrollment(){
 		var nameObj = document.querySelector("[name=oname]");
		var priceObj = document.querySelector("[name=price]");
		var cntObj = document.querySelector("[name=cnt]");
		console.log("입력한 아이디  :" + nameObj.value);
		if(nameObj.value==""){
			alert("물건명을 입력하세요");
			return;	
		}
		if(priceObj.value==""){
			alert("가격을 입력하세요");
			return;
		}
		if(cntObj.value==""){
			alert("갯수를 입력하세요");
			return;
		}
		var frmObj = document.querySelector("form");
		frmObj.submit();
	}
 </script>
</body>
</html>