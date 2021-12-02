-- unique : 다른 데이터와 식별되게 입력하지 않으면 에러 발생
CREATE TABLE student06(
	sno NUMBER(4) CONSTRAINT student06_sno_uq unique
);
SELECT *
FROM sys.ALL_CONSTRAINTS
WHERE TABLE_NAME = 'STUDENT06';
INSERT INTO STUDENT06 values(10); -- 같은 데이터는 입력 불가
INSERT INTO STUDENT06 values(null);
SELECT * FROM STUDENT06 ; -- unique는 null을 중복을 허용

-- ex) student07 (학번,이름,국어) - 학번을 unique로 설정하고 입력과
-- 	입력과 SYS.ALL_CONSTRAINTS를 확인하세요.
CREATE TABLE student07(
	sno NUMBER(4) CONSTRAINT student07_sno_uq UNIQUE,
	name varchar(20) CONSTRAINT STUDENT07_name_nn NOT NULL,
	kor NUMBER(3)
);
INSERT INTO STUDENT07 values(0218,'전준혁',100); -- 같은 데이터는 입력 불가
SELECT *
FROM sys.ALL_CONSTRAINTS
WHERE TABLE_NAME = 'STUDENT07';

-- PRIMARY KEY : 데이터를 입력시 중복도 허용하지 않고, NULL도 허용되지 않는
--  제약조건을 설정할 때, 사용된다.

CREATE TABLE student08(
	sno number(3) CONSTRAINT student08_sno_pk PRIMARY KEY
);
SELECT * 
FROM SYS.ALL_CONSTRAINTS
WHERE table_name = 'STUDENT08';
INSERT INTO STUDENT08 values(10);
INSERT INTO STUDENT08 values(10); -- 중복데이터 입력도
INSERT INTO STUDENT08 values(NULL); -- NULL 입력도 허용되지 않는다

CREATE TABLE student09(
	sno NUMBER(4) CONSTRAINT student09_sno_uq PRIMARY KEY,
	name varchar(20) CONSTRAINT STUDENT09_name_nn NOT NULL,
	kor NUMBER(3),
	eng NUMBER(3),
	math NUMBER(3)
);
SELECT *
FROM sys.ALL_CONSTRAINTS
WHERE TABLE_NAME = 'STUDENT09';

INSERT INTO STUDENT09 values(1,'홍길동',90,90,80);
INSERT INTO STUDENT09 values(2,'김길동',90,90,80);
INSERT INTO STUDENT09 values(3,null,90,90,80);

/*
 * # check
 * 1. 특정한 데이터를 조건이나 범위를 지정해서, 해당 범위에 데이터만 입력되도록 처리하는 것을 말한다.
 * 2. 형식 
 * 			컬럼명 데이터유형 constraint 제약명 check (조건문-where에 들어가는 sql문장)
 * 			컬럼명 데이터유형 check (조건문-where에 들어가는 sql 문장
 * 
 */
CREATE TABLE student10(
	gender varchar2(1) CHECK (gender IN ('F', 'M'))
);
INSERT INTO student10 values('F');
INSERT INTO student10 values('M');
INSERT INTO student10 values('K');

CREATE TABLE student11(
	kor number(3) CHECK (kor BETWEEN 0 AND 100)
);
INSERT INTO STUDENT11 values(99);
INSERT INTO STUDENT11 values(101);
-- ex) 
CREATE TABLE student12(
	sno NUMBER(4) CONSTRAINT student12_sno_uq PRIMARY KEY,
	grade NUMBER(1) CHECK (grade BETWEEN 1 AND 4),
	name varchar(20) CONSTRAINT STUDENT12_name_nn NOT NULL,
	kor NUMBER(3) CHECK (kor BETWEEN 0 AND 100),
	eng NUMBER(3) CHECK (eng BETWEEN 0 AND 100),
	math NUMBER(3) CHECK (math BETWEEN 0 AND 100)
);

