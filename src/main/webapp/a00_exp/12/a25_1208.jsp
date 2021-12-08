<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 2021-12-08
[1단계:개념] 1. 페이지호출과 요청값에 대한 처리 방식을 서버와 클라이언트 관점에서 구분하여 설명하세요.
1. client에서 호출하는 처리는 두가지가 있다
1) 페이지 호출 : ex) 경로/페이지명
2) 해당 페이지에 전달한 요청값
페이지명?요청키=요청값

서버에서는 backend인 java를 통해서 가능하다
jsp에서 내장된 객체인 request를 통해서 요청키/요청값을 처리한다
String 변수 = request.getParameter("요청키");
요청키에 의해 받은 요청값을 변수에 할당한다.
EL 코드 사용법으로는 
1) 요청값 : ${param.요청키}
http://localhost:7080/javaexp/a05_comp/a08_el_jstl.jsp?name=홍길동
2) 데이터처리 : ${session데이터}    
session.setAttribute("키","값");

[1단계:개념] 2. url 호출 요청값 처리와 form요소 하위객체의 요청값 처리를 비교하여 기술하세요-->
<%-- 페이지명?요청키=요청값  // http://localhost:7080/javaexp/a05_comp/a08_el_jstl.jsp?name=홍길동

<form action="전달할페이지">
        <input name="요청키" value="요청값"/>
        <select name="요청키"
            <option>선택한 요청값
            <option>선택한 요청값
            <option>선택한 요청값
        <textarea name="요청키">입력한 요청값
        <input type="submit"> ==> 이버튼을 클릭시.. action에 선언한
        페이지로 각 요소에 요청키에 해당하는 내용을 입력한 요청값으로 서버에 전달된다
<form>
    등록할 아이디:<input type="text" name="id" value="himan"/><br>
    <input type="submit" value="등록"/>
</form>
<%
    String id = request.getParameter("id");
%>
<h2 align="center">등록할 아이디:<%=id %></h2> --%>


<!-- [1단계:확인] 3. 로그인화면을 구성하고, form id/pass가 himan/7777일때, 인증 그외는 미인증으로 처리하세요.  -->
<form>
아이디 : <input type="text" name="id" value=""><br>
비밀번호 : <input type="password" name="pw" value=""><br>
<input type="submit" value="로그인">
</form>
<%
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String results= "";

    if(id!=null && pw!=null) {
        if(id.equals("himan") && pw.equals("7777")) {
%>
    <h2>인증!</h2>
<%
        }
    } else {
%>
    <h2>미인증!</h2>
<%
    }
%>
<!-- [2단계:확인] 4. 아래와 같은 여러 개의 물품 구매를 처리하여 총계를 처리하는 결과를 요청값에 의해 나타내세요.
            물건명   가격   갯수
            사과    [  ] [  ]
            바나나   [  ] [  ]
            딸기    [  ] [  ]
                  [총계] -->
<form>
        <table>
            <tr>
                <th>물건명</th><th>가격</th><th>갯수</th>
            </tr>
            <tr>
                <th>사과</th>
                <td><input type="text" name="price1" size="1"></td>
                <td><input type="text" name="cnt1" size="1"></td>
            </tr>
            <tr>
                <th>바나나</th>
                <td><input type="text" name="price2" size="1"></td>
                <td><input type="text" name="cnt2" size="1"></td>
            </tr>
            <tr>
                <th>딸기</th>
                <td><input type="text" name="price3" size="1"></td>
                <td><input type="text" name="cnt3" size="1"></td>
            </tr>
        </table>
        <input type="submit" value="총합확인">
    </form>
    <%
        String price1S = request.getParameter("price1");
        String price2S = request.getParameter("price2");
        String price3S = request.getParameter("price3");
        String cnt1S = request.getParameter("cnt1");
        String cnt2S = request.getParameter("cnt2");
        String cnt3S = request.getParameter("cnt3");
        if(price1S!=null && cnt1S!=null &&
                price2S!=null && cnt2S!=null &&
                price3S!=null && cnt3S!=null){
            int price1 = Integer.parseInt(price1S);
            int cnt1 = Integer.parseInt(cnt1S);
            int price2 = Integer.parseInt(price2S);
            int cnt2 = Integer.parseInt(cnt2S);
            int price3 = Integer.parseInt(price3S);
            int cnt3 = Integer.parseInt(cnt3S);
    %>
        <h3>총합<%=( (price1*cnt1)+(price2*cnt2)+(price3*cnt3) )%></h3>
    <%
    }
    %>
<!-- [3단계:확인] 5. 임의의 수학문제 10개(연산자도 임의 숫자도 임의)를 내고 총점을 계산하여 100점만점 기준으로 출력처리하세요
            번호    문제       정답
            1   [ ][X][  ] [  ]
            2   [ ][+][  ] [  ]
            3   [ ][-][  ] [  ]
            4   [ ][X][  ] [  ]
            ..
                  [점수확인] -->
<h2>번호   문제   정답</h2>
<%
   int num1 = 0;
   int num2 = 0;
   String[] gu = {"X", "+", "-", "/"};
   int bun = 0;
   for(int i=0; i<10; i++) {
      num1 = (int)(Math.random()*9+1);
      num2 = (int)(Math.random()*9+1);
      bun = (int)(Math.random()*4);
      
   
%>
<form>
   <%=i+1%>
   <input type="text" name="num1" size="2" value=<%=num1%>>
   <input type="text" name="gu" size="2" value=<%=gu[bun]%>>
   <input type="text" name="num2" size="2" value=<%=num2%>> =
   <input type="text" name="result" size="2"><br>
<%
   }
%>
   <input type="submit" value="점수확인">
   </form>
   
<%
   int cnt = 0;
   String[] num1S = request.getParameterValues("num1");
   String[] num2S = request.getParameterValues("num2");
   String[] resultS = request.getParameterValues("result");
   String[] gu1 = request.getParameterValues("gu");
   if(num1S!=null && num2S!=null && resultS!=null && gu1!=null) {
   for(int i=0; i<10; i++) {
         int num11 = Integer.parseInt(num1S[i]);
         int num21 = Integer.parseInt(num2S[i]);
         int result1 = Integer.parseInt(resultS[i]);
         String gu2 = gu1[i];
         if(gu2.equals("X")) {
            if((num11*num21)==result1) {
               cnt+=10;
            }
         }else if(gu2.equals("+")) {
            if((num11+num21)==result1) {
               cnt+=10;
            }
         }else if(gu2.equals("-")) {
            if((num11-num21)==result1) {
               cnt+=10;
            }
         }else if(gu2.equals("/")) {
            if((num11/num21)==result1) {
               cnt+=10;
            }
         }
      }
%>
   <h3>점수확인 : <%=cnt %></h3>
<%
   }
%>                
                  
<!-- [1단계:확인] 6. jsp의 MVC 개발패턴에 대하여 기술하세요 -->
<!--     
	1) Controller : 중재자 역할
        - 요청값을 받아서, 모델데이터 처리에 필요한 정보를 넘겨주고, 최종 화면을 처리할 view를 호출
    2) Model : 처리할 핵심 데이터
        - 보통 DB에서 가져온 데이터와 로직에 의해 최종으로 view단에 전달할 데이터를 말한다.
    3) View : controller/model을 통해서 최종적으로 화면에 나타날 코드 
        - 주로 jsp나 html을 지칭한다. 
        - controller에 의해 호출이 되고, 전달해온 model 데이터를 형식에 맞게 웹 화면에 출력한다. -->
<!-- [3단계:확인] 7. MVC패턴으로 controller/view을 만들어서 호출하되 모델 데이터로 국어,영어,수학점수 설정하고, view단에서
            해단 점수와 합산/평균을 처리하세요 -->



</body>
</html>