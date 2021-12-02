/*
# subquery
1. 개요
하나의 SQL 명령문의 결과를 다른 SQL 명령문에 전달하기 위해 두 개 이상의
SQL 명령문을 하나의 SQL 명령문으로 연결하여 처리하는 방법
서브쿼리의 필요성
예 : 교수 테이블에서 '전은지' 교수와 직급이 동일한 모든 교수의 이름 검색
ex) ALLEN 과 동일한 부서에 있는 사원들을 출력하세요..
2. 처리방식
	1) 교수 테이블에서 '전은지' 교수의 직급 검색 SQL 명령문 실행
	2) 교수 테이블의 직급 칼럼에서 1 에서 얻은 결과 값과 동일한 직급을 가진 교수
		검색 명령문 실행
		1, 2SQL 명령문 처리과정을 통합하여 하나의 SQL 명령문으로 처리
3. 실행순서
	1) main query에 최하단에 있는 부분부터 실행해서
		결과를 가지고 상위에 있는 query에 전달한다.
 */
-- 사원테이블에서 최고 급여자의 정보를 출력
SELECT *
FROM EMP e 
WHERE SAL = (
	SELECT MAX(SAL)
	FROM EMP e2 
);
-- 부서번호(deptno)별로 최고급여자(sal) 정보(기타 사원번호,사원명,입사일,보너스)를 출력..
-- 이때, 필요한 것이 다중행 subquery이다.
SELECT DEPTNO , MAX(SAL)
FROM EMP
GROUP BY DEPTNO ;

SELECT *
FROM EMP e 
WHERE DEPTNO = 30
AND SAL  = 2850;
-- 보단 간편하게 처리할 수 있게 만든것이 다중행 subquery
SELECT *
FROM EMP e 
WHERE (DEPTNO, SAL) = (
	SELECT deptno, SAL 
	FROM EMP e2 
	WHERE DEPTNO = 30
	AND SAL = 2850
);
-- 자주쓰는 in형태
SELECT *
FROM EMP e 
WHERE (DEPTNO, SAL) IN (
	SELECT DEPTNO , MAX(SAL)  
	FROM EMP e2
	GROUP BY DEPTNO 
);


-- 입사 분기별로 최고 급여자의 전체
-- 1. 입사분기별 최고급여
SELECT TO_CHAR(HIREDATE ,'Q'), MAX(sal)
FROM EMP e 
GROUP BY TO_CHAR(HIREDATE ,'Q');
-- 2. 다중욜 SUBQUERY 설정
SELECT TO_CHAR(HIREDATE,'Q'), e.*  
FROM EMP e
WHERE (TO_CHAR(HIREDATE,'Q'), sal) IN (
	SELECT TO_CHAR(HIREDATE, 'Q'), MAX(SAL)
	FROM EMP e2
	GROUP BY TO_CHAR(HIREDATE ,'Q')
)
ORDER BY TO_CHAR(HIREDATE,'Q'); 

-- ex) 직책별로 최고 급여자의 emp전체 정보를 처리하세요.
--	1) 직책별 최고급여
--  2) 다중열 처리 조건으로 사원정보 출력
SELECT job, MAX(SAL) 
FROM EMP e 
GROUP BY JOB ;

SELECT * 
FROM EMP e 
WHERE (JOB ,SAL) IN (
	SELECT JOB , MAX(SAL)
	FROM EMP e2 
	GROUP BY JOB 
);

/*
 * # inline 뷰 처리(subquery)
 * 0. 뷰(view) : 실제물리적으로 만든 테이블이 아닌 프로그램(sql)상 만든 가상의 테이블을 말한다.
 * 		==> 사원정보, 부서정보인 가상의 뷰로 필요로 하는 컬럼만 선택해서
 * 		하나의 테이블로 만들어 사용한다
 * 		select dname, ename
 * 		from emp_dept;
 * 1. 조인할 테이블을 ()로 만들어 데이터를 일단, 먼저 처리한 후에
 * 		그 이후에 다른 테이블과 조인 관계를 처리할 때 사용된다. 
 */
-- 부서별 최고 급여자 정보를 출력
SELECT *
FROM (
	SELECT DEPTNO, MAX(SAL) msal
	FROM EMP e 
	GROUP BY DEPTNO 
	) a, emp e
WHERE a.deptno = e.deptno -- inline VIEW로 된 부서번화와 emp의 부서번호를 조인
AND a.msal = e.sal;

SELECT * 
FROM EMP e 
WHERE (JOB,SAL) = 
	(SELECT JOB, SAL
			FROM EMP e2 
		WHERE sal =800);
-- where (JOB, SAL) = (단일 데이터 SUBQUERY)
-- WHERE (JOB, sal) - IN (한개이상 데이터 subquery)
	
-- INline view라고 사용자 정의 query를 가상의 테이블 뷰로 만들어
-- 연관관계 있는 테이블과 조인해서 데이터를 처리하는것을 말한다.

--ex)
SELECT * 
FROM (
	SELECT *
	FROM EMP e 
	WHERE DEPTH = 10
	) a, emp b
WHERE a.sal = b.sal);

/*
 * inline view 처리하기
 * 1. inline들어갈 query를 만들고 
 * 2. join 테이블 alias명을 지정한다
 * 3. 두 테이블의 join 조건을 where 조건으로 처리한다.
 */

--ex) 부서별 최근 입사자의 사원 정보
-- 1) 부서번호별 최근 입사일a
-- 2) emp b
-- 3) where a.hiredate = b.hiredate and a.deptno = b.deptno
SELECT *
FROM (
	SELECT DEPTNO, MAX(hiredate) HIREDATE
	FROM EMP e
	GROUP BY DEPTNO
	) a, emp b
where a.hiredate = b.hiredate and a.deptno = b.deptno;