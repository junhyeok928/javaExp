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
		ex) student 테이블의 학년을 1,2,3,4만 데이터로 넣을수 있다.
		
무결성 제약 조건
not null : 열이 null을 포함할 수 없음
고유키(unique key) : 테이블의 모든행에서 고유한 값을 갖는 열또는 열조합을 지정합니다.
기본키(primary key) : 해당 컬럼 값은 반드시 존재해야하며 유일해야함
						unique, not null 제약조건을 결합한 형태
참조키(foreign key : 한열과 참조된 테이블의 열간에 외래 키 관계를 설정하고 시행합니다
check : 해당 칼럼에 저장가능한 데이터 값의 범위나 조건 지정	
 */
SELECT *
FROM SYS.ALL_CONSTRAINTS
WHERE TABLE_name LIKE 'EMP%';
-- 내장된 테이블로 현재 오라클 서버에 있는 모든 재약 조건을 볼 수 있다.
-- not null
-- 컬럼명 데이터유형 constraint 테이블명_컬럼명_nn not null
CREATE  TABLE student01(
	name varchar2(30) CONSTRAINT student01_name_nn NOT NULL
);
CREATE TABLE student02(
	name varchar2(30) NOT NULL
);

SELECT *
FROM SYS.ALL_CONSTRAINTS
WHERE TABLE_NAME LIKE 'STUDENT%';
INSERT  INTO STUDENT01(NAME) VALUES('himan');
SELECT * FROM student01;
-- name은 제약조건을 지정했기 때문에 에러가 발생한다.
INSERT INTO STUDENT01(NAME) VALUES (null);
-- 테이블명은 대문자로 저장되어 있음..
-- ex) student03로 테이블을 만들되 학생이름과,국어점수를 컬럼으로 지정하고,
-- 학생이름을 not null로 제약조건을 설정
CREATE  TABLE student03(
	name varchar2(30) CONSTRAINT student03_name_nn NOT NULL,
	kor number(3)
);
SELECT *
FROM SYS.ALL_CONSTRAINTS
WHERE TABLE_name LIKE 'STUDENT%';
-- ex) student03로 테이블을 만들되 학생이름과,국어점수를 컬럼으로 지정하고,
-- 학생이름을 not null로 제약조건을 설정한다. 제약조건 이름 설정하지 않음.
-- 데이터 입력 및 sys.ALL_CONSTRAINTS를 통해서 제약조건 확인
CREATE  TABLE student04(
	name varchar2(30) NOT NULL,
	kor number(3)
);
SELECT *
FROM SYS.ALL_CONSTRAINTS
WHERE TABLE_name LIKE 'STUDENT%';
INSERT INTO STUDENT03 VALUES ('홍길동',85);
INSERT INTO STUDENT03 VALUES (null,85);
INSERT INTO STUDENT03 (KOR) VALUES (85);
INSERT INTO STUDENT03 (NAME) VALUES ('김길동');

SELECT *FROM STUDENT03 ;



