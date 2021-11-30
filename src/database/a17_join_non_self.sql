/*
# non equl join
1, 조인하는 두개의 데이터값이 동일하지 않고, 범위로 조인하는 경우를 말한다.
2. select 컬럼1, 대상컬럼, 등급..
   from 테이블1, 테이블2
   where 대상컬럼 between 범위1 and 범위2
 */
SELECT ENAME , SAL 
FROM EMP e 
ORDER BY SAL ;
SELECT *
FROM SALGRADE s ;

SELECT ENAME , SAL ,grade, losal, hisal
FROM EMP e , SALGRADE s 
WHERE SAL BETWEEN losal AND hisal;

SELECT grade,e.*
FROM EMP e , SALGRADE s 
WHERE SAL BETWEEN losal AND hisal
AND grade = 4;

-- ex)
SELECT SAL ,grade,JOB 
FROM EMP e , SALGRADE s 
WHERE SAL BETWEEN losal AND hisal
AND JOB = 'SALESMAN'


/*
# outer join
1. EQUI JJOIN의 조인 조건에서 양측 칼럼 값중, 어느 하나라도 NULL이며ㅑㄴ
'=' 비교 결과가 거짓이 되어 NULL 값을 가진 행은 조인 결과로 출력 불가
NUMM 에 대해서 어떠한 연산을 적용하더라도 연산 결과는 NULL
	일반적인 EQUI JOIN 의 예 :
	학생 테이블의 학괍너호 칼럼과 부서 태이블의 부서번호 칼럼에 대한
	EQUI JOIN ( STUDENT.DEPTNO = DEPARTMENT.DEPTNO) 한 경우
	학생 테이블의 DEPTNO 칼럼이 NULL 인 경우 해당 학생은 결과로 
	출력되지 못함
2. EQUI JOIN에서 양측 칼럼 값중의 하나가 NULL 이지만 조인 결과로
	출력할 필요가 있는 경우 OUTER JOIN 사용
	OUTER JOIN의 예 :
	학생 테이블의 교수 테이블을 EQUI JOIN 하여 학생의 지도 교수 이름 출력
	조건 : 지도 학생을 한 명도 배정받지 못한 교수 이름도 반드시 함께 출력
3. (+) 기호를 사용한 OUTER JOUN
WHERE 절의 조인 조건에서 OUTER JOIN 연산자인 '(+)' 기호 사용
조인 조건문에서 **NULL이 출력되는 테이블의 칼럼에(+) 기호 추가
4. 기본구문
SELECT	TABLE.COLUMN, TABLE2.COLUMN
FROM	TABLE1, TABLE2
WHERE	TABLE1.COLUMN(+) = TABLE2.COLUMN
또는 ; 	TABLE1.COLUMN = TABLE2.COLUMN(+)
 */
SELECT DISTINCT DEPTNO -- DISTINCT : 중복데이터 제거
FROM EMP e ;
SELECT *
FROM DEPT d ;

SELECT e.ENAME , e.DEPTNO ,d.DEPTNO ,dname
FROM EMP e ,DEPT d 
WHERE e.DEPTNO (+) = d.DEPTNO ;

--ex) 
SELECT dname 부서명,NVL(ENAME,'할당인원없음') 사원명, SAL 급여
FROM EMP e ,DEPT d 
WHERE e.DEPTNO (+) = d.DEPTNO
AND sal >= 3000;

--ex)
SELECT loc , NVL(ENAME,'없음') 
FROM EMP e , DEPT d 
WHERE e.DEPTNO(+) = d.DEPTNO;
