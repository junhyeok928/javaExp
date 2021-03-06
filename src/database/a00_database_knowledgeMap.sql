 /*
 # database 학습 kenledge map
1. 데이터베이스 개론
 	1) 데이터베이스 개념, 특징, 웹프로그램에서 역할
 	2) 설치
 		데이터베이스 서버 설치
 			oracle xe 11g : 관리자 계정 system/1111 설정
 			계정생성과 샘플데이터 생성 : scott.sql
 		데이터베이스 클라이언트 설치
 			sqlplus
 			jdbc 드라이버 설정
 			dbeaver 설치
 	3) 웹프로그램에서 처리
 
2. 기본 sql 작성하기(DQL)
 	1) select
 	2) where
 	3) 함수
 	4) 조인 구문
 	5) 계층적 sql

3. 테이블 구조 확인하기
 	1) 테이블 생성
 	2) 테이블의 구성요소 확인하기
 	3) 테이블의 구조 변경하기
 	 	
4. 데이터의 등록, 수정, 삭제(DML)
	1) insert
	2) update
	3) delete
	4) merge
	
5. 테이블의 구조의 변경(DDL)

6. 사용자의 권한 부여 및 회수

7. DB 설계

 */



/*
 * 
 * 데이터 : 관찰의 결과로 나타난 정량적 혹은 정성적인 실제 값
 * 정보 : 데이터에 의미를 부여한 것
 * 지식 : 사물이나 현상에 대한 이해
 * 
 * 데이터베이스란 조직에 필요한 정보를 얻기 위해 논리적으로 
 * 	연관된 데이터를 모아 구조적으로 통합해 놓은 것
 * 
 * 데이터베이스 시스템은 데이터의 검색과 변경 작업을 주로 수행함
 * 변경이란 시간에 따라 변하는 데이터 값을 데이터베이스에 반영하기 위해 수행하는
 * 	삽입, 삭제, 수정 등의 작업을 말함
 * 
 * 통합된 데이터 : 데이터를 통합하는 개념으로, 각자 사용하던 데이터의 중복을 
 * 	최소화하여 중복으로 인한 데이터 불일치 현상을 제거
 * 저장된 데이터 : 문서로 보관된 데이터가 아니라 디스크, 테이프 같은 컴퓨터
 *  저장장치에 저장된 데이터를 의미
 * 운영 데이터 : 조직의 목적을 위해 사용되는 데이터를 의미한다.
 * 	즉 업무를 위한 검색을 할 목적으로 저장된 데이터
 * 공용 데이터 : 한 사람 또는 한 업무를 위해 사용되는 데이타가 아니라
 * 	공동으로 사용되는 데이터를 의미
 * 
 * 데이터베이스의 특징
 * 	실시간 접근성
 * 		데이터베이스는 실시간으로 서비스된다. 사용자가 데이터를 
 * 		요청하면 몇 시간이나 몇 일뒤에 결과를 전송하는 것이 아니라 
 * 		수 초내에 결과를 서비스 한다.
 *  계속적인 변화
 * 		데이터베이스에 저장된 내용은 어느 한 순간의 상태를 나타내지만,
 * 		데이터 값은 시간에 따라 항상 바뀐다. 데이터베이스는
 * 		삽입 삭제 수정등의 작업을 통하여 바뀐 데이터값을 저장한다.
 * 	동시 공유
 * 		데이터베이스는 서로 다른 업무 또는 여러 사용자에게 동시에 공유된다.
 * 		동시는 병행이라고도 하며, 데이터베이스에 접근하는 프로그램이 여러개있다.
 * 	내용에 따른 참조
 * 		데이터베이스에 저장된 데이터는 데이터의 물리적인 위치가 아니라 데이터
 * 		값에 따라 참조된다.
 * 
 * 데이터베이스 시스템
 * 	- 1단계 마당서점
 *  - 2단계 초기전산화
 * 	- 3단계 데이터베이스
 * 	- 4단계 홈페이지 구축
 * 	- 5단계 인터넷 쇼핑몰
 * 
 * SW 개발의 목적
 * 	- 개발된 소프트웨어의 고객 만족
 * 
 * 고객 만족을 위한 특성
 * 	- 적시성 : 빠른 출시를 통한 시장의 점유
 * 	- 유연성 : 다양한 환경에서의 적응성
 * 	- 통합 : 기존 시스템과의 쉬운 통합
 * 
 * 고객 만족의 개발조건
 * 	- 고품질의 제품 개발
 * 	- 정해진 기간내의 개발
 * 	- 주어진 예산내의 개발
 * 
 * 요구사항
 * 	- 이용자가 어떤 문제를 풀거나 목표를 달성하기 위해 필요한 조건이나 능력(사전적 의미)
 *  - 사용자와 개발자간에 합의한 개발 범위에서 시스템이 제공해야 하는 기능(SW개발 의미)
 * 
 * 요구 분석 명세서
 *  - 개발 초기에 사용자의 요구 사항(비기능 요구 사항 포함) 을 추출하여 정리한 문서
 *  - what에만 초점, how는 고려치 않음
 * 
 * 요구 분석 과정
 * 	사용자 요구파악 ==> SW 목표 수립 ==> 모델링 ==> 요구 분석 명세서
 * 
 * 요구 분석
 *  - 소프트웨어 요구 사항 정의를 위해 사용자의 요구 사항을 조사하고 확인하는 과정
 *  - 소프트웨어 개발 생명주기의 첫 단계
 * 	- 소프트웨어 개발 성패의 열쇠
 * 		현 상태 파악 ==> 사용자 요구 파악 ==> 사용자 요구 결정
 * 
 * 의사 소통의 문제
 * 	- 견본이 없어 요구 사항 설명이 어려움
 *  - 사용자가 요구 사항에 대한 설명 방법을 모름
 * 
 * 계속 변하는 요구 사항
 * 	- 초기의 요구 사항은 단순
 *  - 개발될 SW에 대해 이해의 폭이 넓어짐에 따라 새로운 요구 사항 발생 및 증가
 *  - 관련 지식의 증가로 인한 요구 사항 변경 발생
 * 
 * 변경 요구에 대한 대처 방안
 *  - 변경 사항에 대한 날짜별, 기간별 기록
 *  - 변경이 미치는 영향에 대해 사전 분석 필요
 * 
 * 애매모호한 요구사항
 *  - 해석을 달리할 수 있는 애매한 표현의 요구
 *  - 사용자의 일관성 없는 요구
 *  - 부서간의 상충된 요구
 *  - 경영진과 실무자간의 상반된 요구
 * 
 * 분석가의 역할
 * 	- 수집된 요구들을 반영하기 전에 이해 당사자들 간의 주장을 조율할 수 있어야함
 * 
 * 사용자와 개발자의 마찰
 *  - 최적의 분석명세서에 대한 사용자의 다른 해석으로 인한 마찰
 * 
 * 필수기재 사항
 * 	- ID : 내부 규칙에 따라 식별자를 부여한다. 하나의 요구사항에 하나의 식별자이다.
 *  - 화면명 : 어느 화면에서 구현할 기능인지 기대한다. 화면에 속하지 않는 요구사항도 있을 수 있다.
 *  - 요구사항명 : 요구사항의 설명을 요약하여 기재한다.
 *  - 내용 : 요구사항의 상세한 내용을 기재한다.
 *  - 중요도 : 상중하, 1 ~ 5 등 내부 규칙에 따라 부여한다,
 *  - 부서/작성자 : 요구사항을 기재한 담당자를 기재한다. 부서가 없는 경우는 생략해도 무방하다.
 *  - 날짜 : 요구사항을 기재한 날짜를 명시한다.
 *  - 진행사항(구현여부): 검토 예정, 진행 확정, 추후 진행등 내부에서 결정된 사항을 기재한다. 진행 불가이거나 추후 진행일
 * 경우 이유를 같이  적는 것이 좋다
 *  - 버전명 : 요구사항이 변경될 수 있으므로 버전(혹은 다른 방식)으로 푝하여 타인이 알 수 있게 해야한다.
 *  - 그외 : 유형(기능, 비기능, 제약사항, 인터페이스, 기타 등), 출처(관리자 이름, 11/15 회의, 사업계획서등)
 * 
 *  요구사항 작성 지침
 * 	- 요구사항 명세서를 읽는 작업자(개발자, 디자이너 등)가 이해하기 쉬워야 한다.
 *  - 무엇을 어떻게 구현되어야 하는지 명확하게 작성한다.
 *  - 하나의 요구사항에 여러가지(복수) 요구사항을 작성하지 않는다
 *  - 다른 요구사항 모순 또는 중복되지 않게 한다.
 *  - 애매한 단어를 사용하지 않고 명확하게 기재한다. 오해하지 말아야 할 것이 명령하는 것이 아니고 의견을 모호하게 하지
 * 말고 명확하게 표현하라는 의미 이다.
 
 */
 
