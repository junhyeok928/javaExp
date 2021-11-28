/*
# 날짜 함수
1. 날짜형 데이터 타입에 사용하는 함수
	1970/1/1
	1/1000초 ==> 1초 ==> (60)1분 ==> (60)1시간
	==> (24)1일(*) ==> calendar 규칙에 의해 ..28/30/31
	1(월) ==> (12)1년 ...
2. 기본 연산
	기본 +1은 1일을 기준으로 처리 된다
	1) 날짜 +/- 숫자 : 해당 일자의 일수를 가산(감산)하여 처리
	2) 날짜 +/- 1/24 : 시간단위 연산 처리
	1일이 24시간이기 때문에 5시간 이후인 경우, 날짜 5/24를 처리한다.
cf) sysdate는 현재날짜 시간을 나타낸다.
 */
SELECT SYSDATE "현재날짜/시간",
	SYSDATE + 1 "내일 24시간 이후",
	SYSDATE - 1 "전날 24시간 이전",
	SYSDATE +(8/24) "현재로부터 8시간이후",
	SYSDATE +(30/60/24) "현재로부터 30분이후"
FROM dual;
-- 1일은 24시간
-- 24/24 1일
-- 8/24 8시간을 계산해서 처리.
-- 10/60/24 10분을 계산해서 처리.
-- ex) 1시간 30분 이후.
-- sysdate + (1/24) + (30/60/24)

-- ex) 현재일자를 기준으로, 3일후, 100일후, 5시간전, 3시간전, 50분후
SELECT SYSDATE + 3 "3일후",
	SYSDATE + 100 "100일후",
	SYSDATE - (5/24) "5시간전",
	SYSDATE - (3/24) "3시간전",
	SYSDATE + (50/60/24) "50분후"
FROM dual;

SELECT ENAME , HIREDATE ,HIREDATE + 1 "1일 이후",
	HIREDATE -100 "입사100일전"
FROM EMP e ;

-- ex1) 
SELECT ENAME , HIREDATE, HIREDATE + 120, HIREDATE - (8/24), FLOOR(SYSDATE - HIREDATE) ||'일' 
FROM EMP e ;
/*
# 날짜 함수
1. sysdate : 오라클에서 서버시스템의 현재 날짜와 시간
2. months_between(날짜1, 날짜2) :
	날짜 사이의 개월을 월단위로 계산
	기준 단위가 1 ==> 1월
	1개월 => 1, 15일 => 0.5 1월을 기준, 일/시/분/초 단위 등으로 
		소숫점으로 계산이 된다,
3. 소숫점이하에 대한 처리는 frunc, floor를 이용해서 절삭 처리를 해준다.
	1.5개월을 개월차로 ceil, 개월수는 trunc, floor
4. add_months(날짜형데이터, 추가할개월수) :
	해당 날짜에 개월을 더한 날짜 계산
5. next_day(날짜, '요일'): 해당 날짜 기준으로 다름 요일의 날짜를 가져온다.
6. last_day(날짜) : 해당 날짜 기준으로 그 달의 마지막 날짜를 가져온다.
*/
SELECT ENAME , HIREDATE , SYSDATE ,
	MONTHS_BETWEEN(SYSDATE,HIREDATE) "근무개월수",
	FLOOR(MONTHS_BETWEEN(SYSDATE, HIREDATE)) "근무개월수2",
	FLOOR(MONTHS_BETWEEN(SYSDATE, HIREDATE)/12) "근무연한"  
FROM EMP e ;

-- ex1) 
SELECT ADD_MONTHS(SYSDATE, 10)
FROM dual;

-- ex2)
-- 15개월인 경우 trunc (15/12) 1년이 처리되고, mod(15,12) 나눈 나머지값을 가져와서 3개월 처리 가능
SELECT TRUNC(MONTHS_BETWEEN(SYSDATE + 1000, SYSDATE)) "1000일후, 개월수",
	TRUNC(MONTHS_BETWEEN(SYSDATE + 1000, SYSDATE)/12) "1000일후, 연한",
	MOD (TRUNC(MONTHS_BETWEEN(SYSDATE + 1000, SYSDATE)), 12) "개월 나머지",
	TRUNC(MONTHS_BETWEEN(SYSDATE + 1000, SYSDATE)/12)
	|| '년' || MOD (TRUNC(MONTHS_BETWEEN(SYSDATE + 1000, SYSDATE)), 12)
	||'개월' "1000일후"
FROM dual;

SELECT SYSDATE , ADD_MONTHS(SYSDATE,4) "오늘로부터 4개월 후"
FROM dual;

--ex1) 사원정보 이용해서 입사후 1년, 6개월후 처리
SELECT ADD_MONTHS(HIREDATE,12*1) "입사후 1년", ADD_MONTHS(HIREDATE,6) "입사후 6개월" 
FROM EMP e ;

--ex2) 사원정보 부서별로 인턴기간을 다르게 처리한다고,
--		10 ==> 1개월, 20 ==> 2개월, 30 ==> 3개월
--	사원명 부서번호 인턴기간(@@개월) 입사일 인턴만료일
SELECT ENAME "사원명", DEPTNO "부서번호", DEPTNO/10 "인턴기간", HIREDATE "입사일", ADD_MONTHS(HIREDATE,DEPTNO/10) "인턴만료일"
FROM EMP e ;

/*
5. next_day(날짜,'요일'): 대상 날짜로부터 다가오는 첫번째 요일에
	해당하는 날짜.
6. last_day(날짜) : 대상날짜의 월의 마지막 날짜.

 */

SELECT SYSDATE ,NEXT_DAY(SYSDATE,'금'),
	NEXT_DAY((NEXT_DAY(SYSDATE,'금'),'금'),
	LAST_DAY(SYSDATE),
	LAST_DAY(SYSDATE)+1
FROM dual;


