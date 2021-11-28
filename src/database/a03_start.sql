SELECT * FROM emp;
/*
 # 데이터 조회하기
 데이터는 select 구문을 이용하여 저장된 데이터를 호출 할 수 있다.
 	1. 기본형식
 		select * ||컬럼명, 컬럼명2
 		from 테이블명
 		where 조건
 */
SELECT * FROM emp;
SELECT empno, ename, job
FROM emp;
SELECT deptno, dname FROM DEPT;
/*
2. 컬럼명 별칭처리하기
SELECT 컬럼명 AS 별칭명, 컬럼명 별치명
FROM 테이블
해당 테이블 구조 안에 있는 컬럼명이 as나 한칸 띄움으로 별칭으로 호출할 수 있다.
*/
SELECT empno AS NO, ename AS name, DEPTNO dno
FROM emp;
SELECT  empno AS "번 호", ename AS "이 름", job AS "직 업", hiredate AS "고용일" FROM emp;
-- 별칭을 한글로 나타낼 수도 있는데, 추가하여 공백을 타이틀로 보이거나, 특수문자를 타이틀로 하고 싶으면 " " 사이에
-- 입력하면 된다.

/*
 # 데이터의 산술 연산 처리와 concatnate(문자열 |컬럼의 연결)
 1. 숫자형 컬럼을 사직 연산 처리가 가능하다 + - * /
 2. 문자열과 컬럼 간의 연결 처리는 '문자열' || 컬럼명
*/
SELECT ename, MGR , MGR + 10 "10을 더해서", MGR-5 "5를 빼서", MGR-5, MGR *10,
		'직책은' || JOB "show"
FROM emp;

SELECT ename || '님' AS NAME , sal+10 AS ss FROM EMP; 
/*
# 컬럼간의 연결
SELECT 컬럼1 || 컬럼2 || '문자열' || 컬럼3 "출력타이틀"
FROM 테이블명
*/
-- 부서번호 @@의 @@ 사원의 직책은 @@@이고, 급여는 @@@입니다.
SELECT '부서번호'||DEPTno ||'인'||ename||'사원의 직책은 '||job||'이고, 급여는 '||sal||'입니다' show
FROM emp;
SELECT '급여가'||SAL ||'만원인 사원'||ENAME ||'는 직책이 '||job||'입니다' show
FROM emp;
SELECT ename || '님의 보너스는 급여의 300%'||sal*3||'만원이어서 이번달 총 급여는'||
	(sal + (sal*3))||'만원입니다' show
FROM EMP;