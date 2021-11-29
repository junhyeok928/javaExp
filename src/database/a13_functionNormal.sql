/*
# 일반 기능 함수,
1. nvl()
2. nvl()2(데이터|컬럼명, null이 아닐때 처리할 데이터, null일때 처리할 데이터)
	comm이 null일때는 100으로 null이 아닐때 10%더 추가해서 결과값을 처리
*/
SELECT ENAME ,SAL ,COMM ,NVL2(COMM,COMM*1.1, 100) 보너스 
FROM EMP e ;

--ex)
SELECT  ENAME , SAL ,NVL2(COMM , COMM + SAL*0.05, SAL*0.15) 보너스
FROM EMP e;
/*
3. nullif(데이터1, 데이터2)
두개의 매개변수로 받는 데이터를 비교하여 동일하면 null로 반환하고, 동일하지 않으면
첫번째 데이터1를 반환처리하는 함수를 말한다.
 */
SELECT NULLIF ('a','a') show1,
	   NULLIF ('a','b') show2,
	   NVL(NULLIF('a','a'),'동일') show3,
	   NVL(NULLIF('a','b'),'동일') show4
FROM EMP e ;

-- ex) dual테이블을 이용하여 위 예제와 같이 처리하되 이번에는 숫자값을 비교하여
--  1000, 1000,
--  1000, 2000 의 내용을 비교하여 nullif함수를 활용하여 결과값을 처리하세요.

SELECT NULLIF (1000,1000) show1,
		NULLIF (1000,2000) show2,
		NVL(NULLIF(1000,1000),0) show3,
		-- nvl은 첫번째 데이터 유형에 맞게 데이터를 처리하여야 한다.
		NVL(NULLIF(1000,2000),0) show4 
FROM dual;

/*
# decode 함수
1. 프로그래밍 언어의 if문이나 case문으로 표현되는 내용을 하나의 함수로
	처리할 수 있게 해준다.
2. 기본형식
	decode(데이터, case1, case1에 해당할때 처리, 그외처리);
	decode(데이터, case1, case1에 해당할때 처리,
					case2, case2에 해당할때 처리,
					case3, case3에 해당할때 처리,
			위내용에 해당하지 않을때 처리할 데이터)
 */
SELECT ENAME ,DEPTNO,
	decode(DEPTNO,10,'인사과',
			20,'총무',
			30,'회계',
			'부서정하지않음') 부서명
FROM EMP e ;


-- ex) 사원번호를 기준으로 짝수이면 홍팀, 홀수이면 청팀으로 처리하여 출력하세요.
-- mod(empno,2) : empno를 2로 나눈 나머지 값이 처리된다.
-- empno 기준으로 0이든지 1이 출력된다.
-- decode( mod(empno,2),0,0일때 처리할데이터, 그외데이터)
SELECT ENAME ,EMPNO ,
	DECODE(MOD (EMPNO,2),1,'청팀','홍팀') 팀
FROM EMP e; 

SELECT ENAME ,HIREDATE ,TO_CHAR(HIREDATE,'Q') "분기" 
FROM EMP e ;

--ex)
SELECT ENAME , HIREDATE , TO_CHAR(HIREDATE,'Q') 분기,
	DECODE(TO_CHAR(HIREDATE,'Q'),1,'부산',
			2,'광주',
			3,'제주',
			'출장없음') 출장
FROM EMP e ;

/*
# 일반 함수 case
1. decode의 확장된 함수 형식을 표현식 또는 컬럼 값 "=" 비교를 통해
	조건의 일치하는 경우에만 다른 값으로 대치하지만, case 함수에서는
	산술 연산, 관계 연산, 논리 연산과 같은 다양한 비교가 가능하다.
2. 기본 형식
	1) 조건문 형태 활용
	case when 논리|산술|관계 then 처리할 데이터
		 when 논리|산술|관계 then 처리할 데이터
		 else 기타처리할 데이터
	end
	## 주의
	case when은 앞에서 선언 조건식을 제외한 조건을 처리한다.
 */
-- 부서번호에 따라 처리하는 데이터를 다르게 할 때.
SELECT ENAME ,DEPTNO ,
	CASE WHEN DEPTNO = 10 THEN SAL * 0.2
	-- 여러가지 비교와 논리연산자를 활용하여 결과값을 리턴할 수 있다.
		 WHEN DEPTNO = 20 THEN SAL * 0.5
	-- 이전에 선언한 내용을 제외하고를 포함하고 있음..
		 WHEN DEPTNO = 30 THEN SAL * 0.7
		 ELSE SAL *1.2
	END show
FROM EMP e ;

--ex) case when 구문을 이용해서 5000이상 'A' 등급
--								4000 ~ 5000 'B'
--								3000 ~ 4000 'C'
--								2000 ~ 3000 'D'
--								1000 ~ 2000 'E'
--								그외 등급분류불가
SELECT ENAME , SAL ,
	CASE WHEN SAL >=5000 THEN 'A'
	-- case when 앞에 있는 조건을 제외시킨다
	-- when sal>= 4000 and sal < 5000를 포함하고 있다
		 WHEN SAL >= 4000 THEN 'B'
		 WHEN SAL >= 3000 THEN 'C'
		 WHEN SAL >= 2000 THEN 'D'
		 WHEN SAL >= 1000 THEN 'E'
		 ELSE '등급분류불가'
	END show
FROM EMP e; 

SELECT ENAME , SAL ,DEPTNO ,
	CASE DEPTNO 	-- 특정한 컬럼 지정..
		WHEN 10 THEN SAL *0.2 -- 해당 DEPTNO 가 어떤 값일 때를 나타냄.(부서별로 보너스 지정)
		WHEN 20 THEN SAL *0.5
		WHEN 30 THEN SAL *0.7
		ELSE SAL * 1.2
	END show
FROM EMP e ;

--ex) 입사 분기별로 sal기준으로 보너스를 지정할려고 한다, 
--	  1/4분기일 때는 30%, 2/4분기일 때는 20%, 3/4분기 10% 4/4분기 5%
SELECT ENAME , HIREDATE , SAL ,
	CASE TO_CHAR(HIREDATE,'Q')
		WHEN '1' THEN SAL * 0.3
		WHEN '2' THEN SAL * 0.2
		WHEN '3' THEN SAL * 0.1
		WHEN '4' THEN SAL * 0.05
	END 보너스
FROM EMP e ;