/*
# 데이터 수정
1. update 명령문은 테이블에 저장된 데이터수정을 위한 조작어이다.
2. 기본형식
	update 테이블명
	set 컬럼1 = 변경할데이터,
		컬럼2 = 변경할데이터,
		컬럼3 = 변경할 데이터
	where 조건문
3. 주의 사항
	1) where 절을 생략하면 테이블의 모든 행이 수정된다.
	2) 조건문과 변경할 데이터부분을 subquery를 이용하여 처리할 수 있다.
 */
SELECT * FROM emp100;
-- 사원번호 7369인 사원테이블의 사원명을 홍길동으로 변경..
UPDATE EMP100 
 SET ENAME = '홍길동'
 WHERE EMPNO = 7369;
-- ex)  사원버호 7499의 데이터에 사원명을 김철수로 변경..
UPDATE  EMP100 
SET ENAME  = '김철수',
	JOB = '대리',
	mgr = 9999,
	HIREDATE = SYSDATE 
WHERE EMPNO = 7499;
SELECT *FROM emp100;

--ex) emp100 job이 MANAGER 인 경우 , 급여를 4000으로 변경하고, 부서를 20번으로 변경
UPDATE EMP100 
SET SAL = 4000,
	DEPTNO = 20
WHERE JOB ='MANAGER';
SELECT *FROM emp100;
UPDATE emp100
	SET Sal = SAL *1.3, -- 기존에 저장된 데이터에서 30%인상처리
		DEPTNO  = DEPTNO + 10 -- 기존에 저장된 데이터에 +10으로 처리
WHERE  JOB = 'MANAGER';

SELECT *
FROM EMP100
WHERE JOB = 'MANAGER';

--ex) 부서정보가 10인 사원에 급여 인상 보너스 100
UPDATE EMP100 
	SET sal = SAL * 1.5,
	COMM = 100
WHERE DEPTNO = 10;
SELECT *
FROM EMP100 e 
WHERE DEPTNO  = 10;


/*
# 데이터 삭제
1. 데이터는 조건에 의해서 행단위로 삭제된다.
cf) 열단위로 null을 처리하려면 update를 처리한다.
2. 형식
	delete	-- 행단위로 삭제되기 때문에 컬럼을 지정하지 않느다.
	from 테이블
	where 비교 조건
	
 */
SELECT * FROM emp100;
DELETE 
FROM EMP100 e 
WHERE ename = '홍길동';

--ex) 부서번호가 10번이고 급여가 1000 데이터를 \삭제 처리
DELETE FROM EMP100 e WHERE DEPTNO = 10 AND SAL < 1000;



