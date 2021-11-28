package javaexp.a00_exp;

import java.util.ArrayList;

public class A09_1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
[1단계:기본]1. html에 있어서 p, hr, br, a의 의미를 기술하세요.
	p : 문단을 의미하여 화면에서 문단을 처리할 때, 사용된다.
		align 속성을 지원하여 문단의 왼쪽, 오른쪽, 중앙 정렬을 처리할 수 있다.
	hr : 수평선을 처리하는 역할을 한다. 화면단위로 수평선의 경계를 처리하고 구분되는 내용을 확인할 수 있다.
	br : 기본적으로 태그 없이는 공백(2칸이상)이나 줄바꿈을 웹화면에서 지원하지 않는다.
	  	br태그를 통해서 명시적으로 줄바꿈 처리를 할 수 있다.
	a :  anchor로 하이퍼 링크로 특정한 페이지를 호출할 수 있게 한다.
		외부 사이트, 내부 사이트 (상대경로/상대경로)를 통해서 하이퍼 텍스트를 호출 할 수 있다.
[1단계:기본]2. h2와 p, hr과 속성 align, hr를 이용해서 위키백과사전을 검색해서, java, jsp, spring를 출력하세요.
[1단계:기본]3. a의 기본 속성과 사용방법을 기술하세요.
	형식  : <a href="이동할페이지">화면에 표시된 내용</a>
	속성 :  href : 이동페이지를 지정한 속성

[1단계:기본]4. hyperlink란 무엇을 의미하는지 기술하고, 오늘 연습한 상대적 주소과 절대적 주소의 의미를 각각 1개씩 
            예제를 통해서 설명하세요.
    하이퍼 텍스트 : 특정한 문서가 다른 문서로 이동되어서 확인 가능한 형식의 문서를 말한다.
    하이퍼 링크 : 하이퍼 텍스트가 이동할 때, 연결된 내용을 전달할 수 있게 된 것을 말한다.
    # 상대 경로 : 현재 로딩되는 페이지를 기준으로 경로를 설정
            <a href="call.html">현재 폴드에 파일이 있을 때</a>
    # 절대 경로 : 서버의 특정 위치를 경로의 기준으로 설정하는 것을 말한다.
    	웹 서버의 경우 root 경로 즉, 프로젝트 기준으로javaexp\src\main\webapp
    	를 말하는데, 이는 서버가 기동되었을 때, http://localhost:7080/javaexp/
    	의 경로를 말한다.
    		 http://localhost:7080는 생략이 가능하다.
    		<a href="/javaexp/index.html">서버의 최상위 경로에 index.html</a>
[1단계:기본]5. 절대적 주소호출 패턴 3가지를 예제를 통해서 만드세요
	   http://locahost:7080/javaexp/ 
	   javaexp\src\main\webapp\sample\index.html
	   javaexp\src\main\webapp\index.html
	   javaexp\src\main\webapp\others\index.html
       <a href="/javaexp/sample/index.html">
       <a href="/javaexp/index.html">
       <a href="/javaexp/others/index.html">	

[1단계:기본]6. 상대적 주소호출 패턴 5가지를 예제를 통해서 만드세요
       <a href="./index.html"> -> 현재 폴더의 index.html로 이동
       <a href="./sample/index.html"> -> 현재 폴더의 sample 폴더의 index.html 이동
       <a href="../sample/index.html"> -> 상위 폴더의 sample 폴더의 index.html 이동
       <a href="../../index.html"> -> 상위의 상위 폴더의 index.html 이동
       <a href="../index2.html"> -> 상위 폴더의 index2.html 이동	

[1단계:기본]7. 목록 태그를 이용하여, front end 과목과 back end 과목을 리스트하여 출력하세요.
        <h2>Front-End</h2>
        <ul> : 순서없이 기본적을 disc 형태로 화면에 출력 되는 것을 말한다. 
        		type="cirle|disc|square" 등이 있다.
           <li>HTML5</li>
           <li>CSS3</li>
           <li>JS</li>
        <ul>
        
        <h2>Back-End</h2>
        <ol> : 순서가 있는 내용을 아라비아 숫자가 기본으로 출력된다. 
        		type="1|a|A|I|i" 등 순서가 설정되어 표기 된다.
           <li>Java</li>
           <li>JSP</li>
           <li>Spring</li>
        <ol>

[2단계:알고리즘] 8. 10개 정수형 데이터가 들어가는 배열을 만들고, 임의로 데이터값(1~100)을 할당하고, 이 배열 데이터 중,
            가장 큰 데이터와 가장 작은 데이터를 출력하세요.
*/
		ArrayList<Integer> ranList = new ArrayList<Integer>();
		for(int cnt = 1; cnt<=10 ;cnt++) {
			int ran = (int)(Math.random()*100+1); // 100개의 경우수, 1부터 시작.
			ranList.add(ran);
			System.out.print(ran+"\t");
		}
		System.out.println();
		int max = 0; //나올 수 있는 경우의 최소값 설정(default)
		int min = 100; // 나올 수 있는 경우의 최대값 설정(default)
		for(int idx=0;idx<ranList.size();idx++) {
			int data = ranList.get(idx);
			if(data > max) {
				max = data;
			}
			if(data < min) {
				min = data;
			}
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
	}

}
