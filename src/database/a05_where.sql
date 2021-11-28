/*
# WHERE 조건문
1. 질의에서 필요한 관계대수(=,>=,<=,<)로 SELECT된 컬럼의 데이터에
대하여 ROW 단위로 데이터를 filtering 하는 작업을 수행하게 해준다.
2. 관계대수를 놀리식으로 연결하는 AND, OR, SUBQUERY를 추가적으로
지원하고 있다.

*/
-- 급여가 2000이상인 데이터를 출력하세요..
SELECT *
FROM  EMP e 
WHERE  sal >= 2000;

/*
# 비교 연산자
1. != : 같지 않을때 조건문에서 검색해준다.
2. NOT (조건문) : 해당 조건문이 아닐 때, 검색해준다.
3. 컬럼명 IS NOT NULL : null이 아닌 데이터를 검색해준다.
	주의) 컬럼 = null(x) ==> 컬럼명 IS NULL
		컬럼명 != null(x) ==> 컬럼명 IS NOT NULL
*/
SELECT  *
FROM EMP e 
WHERE  DEPTNO  != 20; -- 숫자형 데이터를 통해서 부서가 20이 아닐떄..

SELECT *
FROM EMP e 
WHERE NOT (DEPTNO = 20);

SELECT * 
FROM EMP e ;

SELECT *
FROM EMP e 
WHERE SAL != 1600;

SELECT *
FROM EMP e 
WHERE NOT  (SAL = 1600);

-- 부서번호가 20이고 급여가 3000이상인때와
--	검색조건이 아닌 데이터를 비교연산자에 의해 출력하세요.
SELECT *
FROM EMP e 
WHERE DEPTNO =20 AND SAL >= 3000;
-- 위 경우의 그 반대 값은 논리식에 의해 deptno != 20 or sal < 3000

SELECT *
FROM EMP e 
WHERE  NOT (DEPTNO = 20 AND sal>=3000);

-- null에 대한 검색
SELECT ENAME ,COMM 
FROM EMP e 
WHERE COMM  = NULL; -- null은 = 비교를 통해서 처리되지 않는다.

SELECT ENAME ,COMM 
FROM EMP e 
WHERE COMM IS NULL ;

-- null값이 아닐때
SELECT ENAME , COMM 
FROM EMP e 
WHERE COMM IS NOT NULL ;

-- cf) 데이터 유형이 숫자인 경우, database에서는 0인 경우와 null인 경우가
-- 구분되지만, 이 내용을 객체로 처리된 경우에는 동일하게 처리 된다.
--  참고로 문자열인 경우에는 프로그램이나 DB나 둘다 null일 경우와 ""인 경우를
--  구분할 수 있다.
SELECT * FROM EMP e ;
-- ex1) 사원정보를 급여와 보너스를 합산을 이름, 급여, 보너스, 합산으로 처리하되,
--		보너스가 null이 아닌경우에 처리하세요
SELECT ENAME , SAL , COMM ,SAL+COMM "합산"
FROM EMP e 
WHERE COMM IS NOT NULL ;
-- comm이 null일 경우에 합산을 하면 null로 처리가 된다.
-- ex2) 관리자번호가 null인 경우 사원명과 직책 관리자 번호 출력
SELECT ENAME , JOB , MGR 
FROM EMP e 
WHERE MGR IS NULL 

/*
# null인 데이터의 함수 처리..
1. 위의 예제와 같이 데이터가 null인 경우에 연산처리가 불가능해진다.
2. 이를 경우, 특정한 null 인경우에 default 데이터를 설정함으로 효과적인
데이터 처리할 수 있는데,
3. 이것이 함수를 통한 null의 기본값 설정이라고 한다.
4. 위 내용을 지원하는 함수가 nvl(데이터, null일때 초기값)이다.
5. 기본 형식
	숫자형 nvl(comm, 0) : 기본 데이터를 숫자 0으로 설정
	문자열형 nvl(ename, '') : 기본 데이터를 문자 ''로 설정할 수있는데
6. 위와 같이 nvl은 기본 데이터를 설정할 수 있는데, 주의할 점은
	반드시, 해당 데이터 유형을 default 데이터를 설정하여야 한다.
	nvl(comm,0) : comm이 숫자형이기에 default로 숫자형인 0이 설정가능하다.
	nvl(ename, '') : ename이 문자형이기에 default로 문자열형인 ''이 설정가능하다.
7. select뿐만 아니라 조건문에도 활용하여 효과적으로 프로그램을 처리할 수 있다.
*/
SELECT ENAME , SAL , NVL(COMM,0) 보너스초기처리, SAL + NVL(COMM, 0) "합산"
FROM EMP e ;

SELECT ENAME ,MGR ,COMM 
FROM EMP e 
WHERE MGR IS NULL 
OR NVL(COMM,0) = 0;
-- NVL(COMM,0) = 0을 통해서 0이거나 null 검색해줄수 있다.

