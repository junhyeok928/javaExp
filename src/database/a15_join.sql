/*
# 조인
1. 하나의 SQL 명령문에 의해 여러 테이블에 저장된 데이터를 한번에 조회할 수
	있는 기능을 말한다
2. 관계형 데이터베이스 분야의 표준으로 자리잡고 있다.
3. 두개 이상의 테이블을 결합한다는 의미이다.
 */
-- 1. 조인이 필요하지 않는 경우,
--		사원 정보테이블에서 해당 관련 부서 정보를 가져와서
--		부서번호 정보를 통해서 부서정보를 출력할 때

-- ex) 연봉이 3000이상인 사원이 있는 부서번호를 가져오자.
SELECT DEPTNO 
FROM EMP e 
WHERE SAL >= 3000;
-- ex) 위에서 확인된 부서번호를 통해서 부서테이블의 상세 정보를 확인
SELECT *
FROM DEPT d 
WHERE DEPTNO  IN (10,20);
-- 2. 조인이 필요한경우
--   연봉이 3000이상인 사원의 정보와 부서 정보를 한꺼번에 확인할 때,
SELECT EMPNO , ENAME , SAL , e.DEPTNO , dname, loc
FROM EMP e, DEPT d
WHERE e.DEPTNO  = d.DEPTNO 
AND SAL >=3000;

-- SELECT 선택 컬럼 : 중복된 컬럼만 alias이름을 지정해도 된다. e.deptno
-- from 테이블명 별칭, 테이블명 별칭 : 조인할 테이블을 별칭과 함께 나열한다.
-- where 별칭.컬럼명 = 별칭.컬럼 : 두개 테이블에서 공통으로 연결한 컬럼명을
--			별칭과 함께 JOIN 해준다. inner join이라고 한다.
-- and 기타조건 : 그 외 조인한 내용의 데이터를 기준으로 조회 조건을 처리한다.

-- 1. 개별 테이블 확인
-- 		연봉이 4000이상인 테이블 확인
SELECT *
FROM EMP e
WHERE SAL >= 4000;
--		연봉이 4000이상인 사원정보의 부서번호를 확인하고, 해당 부서 정보를 출력
SELECT *
FROM DEPT d
WHERE DEPTNO  = 10;
-- join관계를 통해서 연봉4000이상인 사원과 연결되어있는 부서정보와 함께 출력.
SELECT e.*, d.*		-- 사원테이블의 모든 컬럼, 부서테이블의 모든 컬럼
FROM EMP e, DEPT d 	-- 두개테이블을 사용하되 alias 이름으로 e, d를 지정..
WHERE e.DEPTNO = d.DEPTNO  -- 연관관계에 있는 컬럼인 DEPTNO 를 조인 처리..
 AND SAL >=4000;	-- 조건인 4000이상을 설정..

/*
ex) 위 내용과 같이 단계별로 처리하세요
	직책이 manager인 
 */
SELECT *
FROM EMP e 
WHERE JOB = 'MANAGER';

SELECT *
FROM DEPT d 
WHERE DEPTNO IN (10, 20, 30);
 
SELECT e.*, d.*
FROM EMP e,DEPT d
WHERE e.DEPTNO = d.DEPTNO 
AND JOB  = 'MANAGER' ;
 
-- 조인 관계에 있는 특정한 컬럼을 출력하기..
-- 사원명, 직책명, 부서명, 부서위칙
SELECT ENAME , JOB , dname, loc 
FROM EMP e, DEPT d 
WHERE e.DEPTNO = d.DEPTNO 
AND JOB = 'MANAGER';
-- 출력할 컬럼을 지정하되 연관관계가 없는 경우는 그대로 컬럼명을 설정하고
-- 공통된 컬럼이 있을 때는 테이블명을 별칭으로 처리한다.

-- EX) 급여가 1000~3000사이의 부서명, 사원명, 급여를 출력하세요(JOIN 구문활용)
SELECT DNAME ,ENAME, SAL 
FROM EMP e, DEPT d
WHERE e.DEPTNO = d.DEPTNO 
AND SAL BETWEEN 1000 AND 3000;

-- 부서위치별 평균급여
SELECT loc "부서위치", TRUNC(avg(SAL)) "평균급여" 
FROM EMP e,DEPT d 
WHERE e.DEPTNO = d.DEPTNO 
GROUP BY loc;

-- ex) 부서명별로 최고급여와 최저급여를 출력
SELECT dname ,MAX(SAL), MIN(SAL)
FROM EMP e ,DEPT d 
WHERE e.DEPTNO = d.DEPTNO 
GROUP BY dname;

-- 날짜형 데이터의 함수 max는 최근 데이터, 최근에 날짜로 등록한 데이터, 최근에 입사한 사람
-- 						min은 가장먼저인 날짜, 최초로 등록한 데이터, 가장 먼저 입사한 날짜
SELECT dname, MIN(HIREDATE) "최초입사", MAX(HIREDATE) "최근입사" 
FROM EMP e , DEPT d 
WHERE e.DEPTNO = d.DEPTNO
GROUP BY dname;	-- 부서별로 가장 최초, 나중에 입사한 날짜 출력

-- ex) 부서위치별, 최초로 입사한 사람의 입사일 출력
SELECT loc, min(HIREDATE)
FROM  EMP e ,DEPT d 
WHERE e.DEPTNO = d.DEPTNO
GROUP BY loc;

-- 지금까지 함수, where 조건, 그룹함수, join을 활용한 여러가지 sql연습예제
SELECT dname, loc, ENAME ,TO_CHAR(HIREDATE,'Q')
FROM EMP e,DEPT d 
WHERE e.DEPTNO = d.DEPTNO 
AND TO_CHAR(HIREDATE,'Q') = '1' ;

SELECT ENAME ,dname
FROM  EMP e ,DEPT d 
WHERE e.DEPTNO = d.DEPTNO
AND dname = 'SALES' ;

SELECT ENAME ,
	CASE to_char(HIREDATE,'Q')
		WHEN '1' THEN '상반기'
		WHEN '2' THEN '상반기'
		ELSE  '하반기'
	END 구분, dname, loc
FROM  EMP e ,DEPT d 
WHERE e.DEPTNO = d.DEPTNO
AND to_char(HIREDATE,'Q') = '1' OR to_char(HIREDATE,'Q') = '2';
------------------------------
-- to_number(to_char(hiredate,'Q')) >=3
-- case when to to_number(to_char(hiredate,'Q')) >=3 then '상반기'
-- else '하반기'



