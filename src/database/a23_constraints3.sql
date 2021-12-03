/*
# foreign key 설정 
# 외래키 설정 관계 (foreign key)
1. 연관관계에 있는 두테이블에 대하여, 한쪽 테이블에 있는 데이터 기준으로 다른쪽 테이블의
데ㅣ터를 입력할 수 있게 하는 것을 말한다.
	기준이 되는 테이블에 데이터가 없으면, 연관계있는 테이블에 다른 데이터를 입력할 때,
	에러가 발생한다.
	ex) emp테이블의 deptno입력은 반드시 dept테이브렝 deptno가 입력되어 있을 때, 가능하다.
2. 기본 형식
	컬럼명 데이터유형 constraint 테이블명_컬럼명_fk references 테이블명(컬럼명)
*/
-- 교수 테이블 생성..
CREATE TABLE teacher01 (
	tno NUMBER PRIMARY KEY 	
);
INSERT INTO teacher01 values(10);
INSERT INTO teacher01 values(11);
INSERT INTO teacher01 values(12);
SELECT * FROM teacher01;
CREATE TABLE student13(
	name varchar2(50),
	tno NUMBER CONSTRAINT STUDEN08_tno_fk REFERENCES teacher01(tno)
);
INSERT INTO student13 values('홍길동',10);
INSERT INTO student13 values('신길동',11);
INSERT INTO student13 values('마길동',13);

--ex) 물건테이블(물건번호, 물건명, 가격, 재고량)
--	구매테이블(구매번호, 구매수량,불건번호-외래키설정)

CREATE TABLE product (
	pno NUMBER(3),
	pname varchar2(20) unique,
	price number(5),
	tot NUMBER(3)
);

-- pbuy테이블의 pno은 product테이블에 pno가 있을때ㅡ 입력이 가능하지만
-- 현재 pno는 1~3까지만 등록이 되어있고 4번은 등록이 되어있지 않기 때뭉네 에러발생
CREATE TABLE pbuy (
	sno NUMBER(3),
	sto NUMBER(3),
	pname varchar2(20) REFERENCES product(pname)
);

/* 연산관계로 기본테이블의 컬럼으로 저장되는 데이터는 따로 컬럼을 만들어 저장하지 않는다.*/

