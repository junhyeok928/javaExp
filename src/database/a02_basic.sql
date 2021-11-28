/*
# 기본적인 sql 질의어 구조
select 출력할 컬럼명 - 열단위 선택
from 테이블 - 대상 테이블
where 컬럼 = 데이터 - 행단위 filtering처리 (비교, 논리연산자)
group by 그룹 할 컬럼 - 특정 컬럼 단위 그룹함수(합산, 갯수, 최소/최대값) 통계치 처리.
	having 컬럼 - 그룹함수의 조건을 지정할 때, 사용
order by 정렬할 컬럼1, 컬럼2 - 정렬할 컬럼을 지정.

 */
select empno, ename -- 열단위로 지정
from emp;
SELECT *
FROM emp
WHERE sal >= 3000; -- 행단위로 지정 filtering
SELECT *
FROM emp;

SELECT empno, ename, job, sal
FROM EMP
WHERE sal < 3000;

-- # group by 특정데이터를 그룹으로 데이터를 처리하는 것을 말한다.
SELECT deptno, sal
from emp
ORDER BY deptno;
-- 함수라는 이름으로 테이블 기준으로 처리를 할 수 있다.
SELECT sum(sal) "전체 총계", avg(sal) "평균값", max(sal) "최대값", min(sal) "최소값"
FROM emp;

--group by라는 함수를 쓰면 해당 그룹별로 나누어서 처리한다
SELECT deptno, sum(sal) "전체 총계", avg(sal) "평균값", max(sal) "최대값", min(sal) "최소값"
FROM EMP
GROUP BY deptno;