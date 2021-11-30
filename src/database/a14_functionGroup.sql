/*
# 그룹함수란?
1. 테이블의 전체 행을 하나 이상의 컬럼을 기준으로 그룹화하여
	그룹별로 결과를 출력하는 함수
	2. 그룹함수는 통계적인 결과를 출력하는 데 자주 사용된다.
	3. 기본 형식
		select 컬럼명, 그룸함수1, 그룹함수2...
		from 테이블명
		where 저건
		group by 그룹할 컬럼
		having 그룹함수의 조건;
		특정 컬럼의 데이터를 그룹별로 함수에 의해 처리하는 것을 말한다.
		부서별로 사원의 최대 급여, depno(부서), 최대급여 max(sal)
		그룹할 컬럼은 부서이고, 부서별로 급여를 확인하여 최대급여를
		뽑아내는 것을 말한다.
		cf) 그룹을 2개 컬럼이상을 할 때는 group by 컬럼1, 컬럼2
		하고, select 컬럼1, 컬럼2, 그룹함수 @@@
		로 데이터 그룹을 두개 이상을 컬럼으로 지정할 때 사용된다.
		예를 들어 학년별로 평균을 내가다, 학년과 반별로 평균을 낼때,
		추가할 컬럼으로 처리하면 된다.
		ex) select deptno, max(sal)
		from emp
		group by deptno;
	4. 그룹함수의 종류
		count(): 행의 갯수 cf) count(*) : 전체 행을 대상으로 행의 갯수처리 처리
			count(컬럼명) : 특정한 컬럼을 대상으로 행의 갯수를 처리하되, null을 제외가 된다.
		max()  : null을 제외한 모든 행의 최대값
		min()  : null을 제외한 모든 행의 최소값
		sum()  : null을 제외한 모든 행의 합
		avg()  : null을 제외한 모든 행의 평균값
		stddev(): null을 제외한 모든 행의 표준편차
		variance() : null을 제외한 모든 행의 분산
		1) 테이블 단위로 해당 컬럼의 전체 데이터를 그룹처리할 때
		는 group by 없이 그룹함수를 사용한다.
		ex) 사원 테이블의 최대연봉, 사원데이터 건수
		select count(*), max(sal)
		from emp; 
 */
SELECT COUNT(*), MAX(SAL), MIN(SAL), SUM(SAL),AVG(SAL) 
FROM EMP e;
-- 전체 데이터의 대한 함수 처리..
SELECT DEPTNO ,SAL 
FROM EMP e
ORDER BY DEPTNO ;

SELECT DEPTNO ,COUNT(*), MAX(SAL), MIN(SAL), SUM(SAL),AVG(SAL)
FROM EMP e 
GROUP BY DEPTNO ;

-- 부서별로 통계치를 처리해주는 것을 볼 수 있다.
-- group by deptno에 선언된 기준 컬럼을 지정해서,
-- select deptno, 통계함수를 지정해준다.
-- ex1) 사원 정보의 전체 관리자의 수를 처리하고,
SELECT COUNT(MGR) 관리자 -- null이있는 데이터를 제이하고 관리자의 전체 수를 나타낸다.
FROM EMP e ;
-- ex2) 관리자별(mgr) 사원정보의 수(count)를 처리하자
SELECT mgr,COUNT(*),COUNT(MGR) 
FROM  EMP e
GROUP BY MGR ;

-- 그룹할 내용을 함수의 의해서 만들어 처리된 경우
-- 입사분기별로 인원수를 처리.
SELECT TO_CHAR(HIREDATE,'Q')
FROM EMP e ;

SELECT TO_CHAR(HIREDATE,'Q'),count(*)
FROM EMP e 
GROUP BY TO_CHAR(HIREDATE,'Q')
ORDER BY TO_CHAR(HIREDATE,'Q'); 
-- ex) 입사한 월별 인원수
SELECT TO_CHAR(HIREDATE,'MM'), count(*)
FROM EMP e 
GROUP BY TO_CHAR(HIREDATE,'MM')
ORDER BY TO_CHAR(HIREDATE,'MM'); 

--ex) 입사한 분기별 최대급여
SELECT TO_CHAR(HIREDATE,'Q'),  MAX(SAL)
FROM EMP e 
group BY TO_CHAR(HIREDATE,'Q');

/*
# 그룹함수 처리 순서
1. 처리할 데이터를 select로 선언..
	select to_char(hiredate, 'Q'),sal
2. group할 기준데이터의 컬럼을 지정한다.
	입사분기별로 그룹데이터 처리 - group by to_char(hiredate, 'Q')
3. 적용할 group함수를 선택
	최소, 최대, 평균, 건수...
	최대급여 max(sal)
4. 정렬이 필요하면 order by 정렬기준컬럼.
5. sql 정리
select to_char(hiredate,'Q'),sal
from emp
group by to_char(hiredate,'Q')
order by to_char(hiredate,'Q');

-- 사원번호의 짝/홀수를 기준으로 최대 급여 처리..
 */
SELECT MOD (EMPNO,2),MAX(SAL)
FROM EMP e
GROUP BY MOD (EMPNO, 2)
ORDER BY MOD (EMPNO, 2);

SELECT JOB ,MAX(SAL)
FROM EMP e 
GROUP BY JOB ;

SELECT DECODE(MOD(MGR, 2),0,'짝수',1,'홀수','분류안됨') 홀짝, AVG(SAL) 
FROM EMP e
GROUP BY mod(MGR,2);
-- nvl (mgr,0) : null 일때는 0으로처리
-- mod(nvl(mgr,0), 2) : 0,1로 처리

/*
# having

 */

SELECT DEPTNO , max(SAL)
FROM EMP e 
GROUP BY DEPTNO ;
-- 부서별 최대급여 출력하는데, 최대급여가 3000이상인 경우에 출력할 때는
-- where 조건문이 아닌 HAVING을 활용하여 조건을 처리하여야 한다
-- 주의) 그룹함수가 적용된 데이터는 where 조건문으로 처리가 안되고 having 조건에 넣어야한다.
SELECT DEPTNO ,MAX(SAL) 
FROM EMP e 
GROUP BY DEPTNO 
HAVING MAX(SAL)>=3000; 
--ex)
SELECT JOB , MIN(SAL) 
FROM EMP e 
GROUP BY JOB 
HAVING MIN(SAL)<=2000; 