/*
# 여러가지 기능 조건문 처리.
1. between
	1) 특정한 데이터를 범위를 설정하여 검색할 때, 사용된다.
	2) 형식
		컬럼명 between 시작범위 and 마지막범위
		==> 컬럼명 >= 시작범위 and 컬럼명 <= 마지막범위
*/
-- 급여가 1000에서 2000사이의 데이터 출력
SELECT *
FROM EMP e 
WHERE SAL  BETWEEN  1000 AND  2000;

SELECT  *
FROM  EMP e 
WHERE EMPNO  BETWEEN 7600 AND  7900;
/*
# in 구문
1, 데이터는 논리연산자 or에 의해서, 여러가지 데이터의 합집합에
대한 처리를 할 수 있다.
2. or 처리형식은 컬럼명 = 데이터1 or 컬럼명 = 데이터2로 컬럼명과
데이터를 or로 계속 나열해야 한다.
3. in 구문을 효과적으로 활용하면 보다 간편하게 or 데이터를 처리할 수 있다.
4. 기본형식
	컬럼명 in (데이터1, 데이터2, ...)
	
 */
SELECT ENAME ,DEPTNO 
FROM EMP e 
WHERE DEPTNO = 10 OR DEPTNO = 20;

SELECT ENAME , DEPTNO 
FROM EMP e 
WHERE DEPTNO in(10,20);
--ex1) in 구문을 이용하여 , 사원 번호가 7499, 7566, 7369인것을 검색하세요
SELECT * 
FROM EMP e
WHERE EMPNO IN (7499, 7566, 7369);

SELECT *
FROM EMP e 
WHERE JOB IN ('SALESMAN','MANAGER');

/*
# IN 구문을 활용한 SUBQUERY
1. 데이터는 특정한 query의 결과를 통해서, 다시 결과내용을 처리할 때가 있다.
2. 이것을 subquery라고 한다.
3. 예를 들어 부서번호가 30인 사원번호를 먼저 데이터를 추출한 후, 이에서 도출한
	사원번호를 다시 조회 조건 정보에 검색하게 처리할 수 있다.
4. 이때, 부서번호가 30인 사원번호는 main query인 사원정보를 조건으로 하는
	데이터 호출에 subquery로 활용되는 것이다.
5. subquery의 사용내용을 in 구문에 활용하여 데이터를 or로 처리할 수 있다.
 */
SELECT EMPNO 
FROM EMP e 
WHERE DEPTNO = 30; -- 부서번호가 30번인 사원번호를 추출

SELECT *
FROM EMP e 
WHERE EMPNO  IN (
	SELECT EMPNO 
	FROM EMP e 
	WHERE DEPTNO = 30
);
-- ex) 연봉이 1000~3000사이의 직책을 뽑아내어, subquery로 활용
-- 		이 직책에 해당하는 사원정보를 출력하세요 
SELECT  *
FROM EMP e 
WHERE JOB IN (
	SELECT JOB 
	FROM EMP e2
	WHERE SAL BETWEEN 1000 AND 3000
);
SELECT *
FROM  EMP e 
ORDER BY DEPTNO ;
-- 전체 데이터 중에 부서번호가 30번인 데이터만 추출할때, 30번에 해당하는 사원정보를
-- 가져온다
SELECT EMPNO 
FROM EMP e 
WHERE DEPTNO =30;
-- 도출된 사원번호를 or 검색을 효과적으로 처리하는 in 구문을 이용해서 검색 처리한다.
SELECT  *
FROM EMP e 
WHERE EMPNO IN (
	SELECT EMPNO 
	FROM EMP e
	WHERE DEPTNO = 30
);
-- MRG 데이터 유형 숫자형..
-- 결과 JOB은 문자열 형으로 데이터유형이 일치하지 않기 때문에 에러가 발생..
SELECT *
FROM EMP e 
WHERE EMPNO IN (7499,7521,7654,7698,7844,7900);

/*
데이터를 1차로 검색내용을 기준으로
2차로 검색처리하는 것이라고 보면 된다.
1차로 우리반에 있는 학생들 중에 여성인 학생들을 먼저 데이터를 추출하고
 이 학생들의 뎅터 중에 생년을 추출하여 처리한 후,
2차로 위에 받은 생년과 같은 학생들을 검색하여 처리할 때 사용한다.
