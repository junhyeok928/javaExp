/*
# group by와 having
1. 집합 함수를 처리할 때, group by 절을 활용한다.
	select 그룹할컬럼, 그룹함수(sum, avg, max, min)
	group by 그룹할 대상 컬럼
	having 그룹함수의 조건
*/
SELECT DEPTNO , MAX(SAL) 최대급여 
FROM EMP
GROUP BY DEPTNO 
HAVING MAX(SAL) >= 3000; -- 부서번호별 최대급여, 최대급여가 3000이상인 경우만 검색 
-- 한줄 주석
/*
다중행 주석

# 정렬 처리
1. 정렬은 데이터의 컬럼별로 정렬 기준을 설정하여, 해당 컬럼의 데이터를
기준으로 내림차순, 오름차순으로 처리할 수 있다.
2. 기본형식
	order by 컬럼명 asc|desc; // 오름차순/내림차순 정렬
 */
SELECT DEPTNO ,EMPNO, ENAME 
FROM EMP e 
ORDER BY DEPTNO ASC, EMPNO  ASC ;
-- 1차로 부서번호를 기준으로 정렬하고, 부서번호가 같으면 사원번호를 기준으로 오름차순 정렬

SELECT SAL , ENAME ,DEPTNO 
FROM EMP e 
ORDER BY SAL deSC ;

SELECT MGR , EMPNO , ENAME 
FROM EMP e 
ORDER BY MGR ASC , EMPNO DESC ;	-- ASC 생략 가능

