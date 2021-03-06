/*
# 숫자 함수
1. 숫자 데이터를 처리하기 위한 함수.
2. 종류 
	1) round : 지정한 소숫점 자리로 반올림 처리.
		round(데이터, 잘릿수)
백자리 십자리 1자리 	0 소숫점이하자리수 지정
	-4 -3 -2 -1 | 1 2 3 .....	
		자릿수가 +값은 소숫점 이하 자릿수
		자릿수가 -값 10단위 이상의 자릿수 처리
	2) trunc : 지정한 소숫점 자리까지 남기고 절ㄹ삭 처리
		trunc(데이터, 자릿수)
	3) mod : 데이터베이스에서는 % 없기 때문에, 함술로 나머지처리.
		mod(데이터m,n) : 데이터를 m을 n으로 나눈 나머지
		ex) mod(10,3) ==> 1
	4) ceil : 지정한 값보다 큰 수 중에서 가장 작은 정수.
		소숫점이하의 내용에 대하여 올ㄹ림처리 정수.
		ex) ceil(123.17) ==> 124
	5) floor : 지정한 값보다 작은 수 중에서 가장 큰 정수
		ex) floor(123.9) ==> 123
 */
SELECT  ROUND(2433.2433,1) "소숫점한자리",
		ROUND(2433.2433,2wlqj gk) "소숫점두자리",
		ROUND(2453.2433,-1) "십의자리",
		ROUND(2533.2433,-2) "백의자리"
FROM dual;
SELECT  TRUNC(2433.2433,1) "소숫점한자리",
		TRUNC(2433.2433,2) "소숫점두자리",
		TRUNC(2453.2433,-1) "십의자리",
		TRUNC(2533.2433,-2) "백의자리"
FROM dual;
SELECT MOD (5,2) "2나머지", MOD(11,3) "3나머지"
FROM dual;
-- sal와 nvl이 적용된 comm의 합산을 사원명, 급여1(소숫점1자리), 급여2(백의자리) 형식으로 반올림 출력
SELECT ROUND(SAL+nvl(COMM,0),1),
		ROUND(SAL+nvl(COMM,0),-2)
FROM EMP e;
-- 사원번호와 이름을 출력하되, 청백팀으로 나눌려고 한다.
-- 사원번호가 홀수인 사람은 청팀, 짝수인 사람은 백팀으로 할 때, 각각 청팀/백팀을 조회해보세요.
SELECT ENAME "백팀"
FROM EMP e 
WHERE MOD (EMPNO,2) = 0;

SELECT ENAME "청팀"
FROM EMP e 
WHERE MOD (EMPNO,2) = 1;