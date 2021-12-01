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


/*
# 데이터 무결성 제약조건의 개념
1. 데이터의 정확성과 일관성을 보장.
2. 데이터의 정확성을 유지하여 다양한 종류의 업무규칙을 고려함.
	1) student 테이블에서 학년 데이터는 1,2,3,4 중의 하나만
		입력.
	2) 모든 학번은 유일하게 처리.
	3) student 테이블의 지도교수 번호는 professor 테이블의
		교수번호 중의 하나와 반드시 일치.
3. 데이터 무결성 제약조건의 장점
	1) 테이블 생성시 무결성 제약조건을 정의 가능.
		- 생성후 제약조건 설정도 가능.
	3) 테이블에 대해 정의, 데이터 딕션너리에 저장되므로
		응용프로그램에서 입력된 모든 데이터에 대해 동일하게 적용
	3) 제약조건을 활성화, 비활성화 할수 있는 융통성이잇다.
4. 무결성 제약조건의 종류
	1) not null : 열이 null을 포함할 수 없음..
	2) unique key : 테이블의 모든 행에서 고유한 값을 갖는 열 또는 열조합
		을 지정해야 한다. ex) 학번, 주민번호, 사원번호를 중복되지 않아야한다.
		ps) null은 입력이 가능하고, 여러가지 null은 중복이가능..
	3) primary key : 해당 컬럼값은 반드시 존재해야 하며 유일해야한다.
		not null과 unique가 겨합된 형태
		주로 테이블에서 식별해야할 컬럼 즉 키를 설정할 떼, 사용된다.
		ex) emp테이블의 empno, dept테이블의 deptno
	4) foreign key : 한열과 참ㅈ된 테이블의 열간에 외래 키 관계를 설정ㅎㅏ고 시행
	ex) 사원의 테이블의 부서번호는 반드시 부서테이블에 있는 부서번호여야 한다.
	5) check : 해당 컬럼에 저장 가능한 데이터 값의 범위나 조건을 지정처리.
		ex) student 테이블의 학년을 1,2,3,4만 데이터로 넣을수 이싿.
		
 */

