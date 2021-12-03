/*
# 테이블 이름 변경
rename 기존테이블명 to변경할테이블명;
# 컬럼명 변경
alter table 테이블명
rename column 기존컬럼명 to 변경할 컬럼명;
 */
RENAME emp19 TO emp10_new;
SELECT * FROM emp10_new;
ALTER TABLE emp10_new
RENAME COLUMN empno TO NO;

/*
# 테이블 삭제
1. drop table 테이블명;
# 컬럼 삭제.
1. alter table 테이블명 drop column 컬럼명
 */
DROP TABLE emp10_new
SELECT * FROM emp9;
ALTER  TABLE emp9 
DROP COLUMN deptno;
-- ex) emp11_new 테이블를 복사테이블로 만들고,
-- 컬럼명 deptno ==> deptnumber
-- emp11로 테이블명 변경후,
-- 컬럼 hiredate 삭제, 테이블도 삭제..
CREATE TABLE emp11_new
AS SELECT * FROM emp;
ALTER TABLE emp11_new
RENAME COLUMN deptno TO deptnumber;
RENAME emp11_new TO emp11;
ALTER TABLE emp11
DROP COLUMN hiredate;
DROP TABLE emp11;

/*
# 제약조건(constraint)의 추가와 삭제
1. primary key
	1) 키의 추가
	alter table 테이블명 add primary key (컬럼명)
	2) 키의 삭제
	alter table 테이블명 drop primary key;
2. 그외의 제약 조건..
	alter table 테이블명 add unique (컬럼명)
	alter table 테이블명 add constraint 제약조건명 unique (컬럼명)
	alter table 테이블명 add foreign key (컬럼명)
		reference 참조테이블(컬럼명)
	alter table 테이블명 add constraint 제약조건명 foreign key 
		(컬럼명) reference 참조테이블(컬럼명)
		# 참조키관련 내용
			references 참조테이블명(참조컬럼명)
			ex) emp 테이블에 deptno는 dept에 deptno 참조
		# 데이터가 삭제 수정되었을 때, 처리내용
			on delete 옵션
			on update 옵션
		# 옵션 내용*oracle은 on delete에서만 적용)
			no action : 참조 테이블이 변화(삭제) 있어도 기본 테이블에 영향없음.
			cacade : 참조테이블의 변화(삭제)에 따라 기본 테이블도 수정/삭제
			set null : 참조테이블의 변화로 기본테이블 데이터 null
			set default : 참조 테이블의 변화로 기본테이블의 데이터 기본값으로 설정.
3. 제약조건 이름으로 삭제
	alter table 테이블명 drop constraint 제약조건명;
 * */
SELECT * FROM emp9;
ALTER TABLE emp9 ADD PRIMARY KEY (empno);
ALTER TABLE emp9 DROP PRIMARY KEY;

-- 이름 정한 primary key 할당
CREATE TABLE dept11
AS SELECT * FROM dept;
-- 복사할 땐 constraint는 복사가 되지않는다.
ALTER TABLE dept11
ADD CONSTRAINT dept11_deptno_pk PRIMARY KEY(deptno);
-- FOREIGN KEY
-- 	ON DELETE CASCADE 설정 참조되는 부모테이블 삭제시 자식테이블의 값 삭제.
CREATE TABLE EMP11
AS SELECT * FROM EMP;
ALTER TABLE EMP11
ADD CONSTRAINT EMP11_DEPTNO_FK FOREIGN KEY(DEPTNO)
REFERENCES DEPT11(DEPTNO) ON DELETE CASCADE;
SELECT * FROM EMP11;
SELECT * FROM DEPT11;
DELETE FROM DEPT11
WHERE DEPTNO =10;

-- EX) EMP12, DEPT12 DEPT12에 PRIMARY KEY 생성
--		ON DELETE 옵션을 NULL로 처리하여 수행결과 확인
CREATE TABLE EMP12
AS SELECT * FROM EMP;

CREATE TABLE DEPT12
AS SELECT * FROM DEPT;

ALTER TABLE DEPT12
ADD CONSTRAINT DEPT12_DEPTNO_PK PRIMARY KEY(DEPTNO);

ALTER TABLE EMP12
ADD CONSTRAINT EMP12_DEPTNO_FK FOREIGN KEY(DEPTNO)
REFERENCES DEPT12(DEPTNO) ON DELETE SET NULL;

SELECT * FROM EMP12;
SELECT * FROM DEPT12;
DELETE FROM DEPT12
WHERE DEPTNO = 20;

-- EX2) EMP13, DEPT13  DEPT13에 PRIMARY KEY 생성
-- ON UPDATE 옵션을 SET NULL시 변경하고 수행결과 확인
--	==>DEPT13번 테이블 수정시, 참조하는 EMP13테이블의 DEPTNO데이터 확인
CREATE TABLE EMP13
AS SELECT * FROM EMP;

CREATE TABLE DEPT13
AS SELECT * FROM DEPT;

ALTER TABLE DEPT13
ADD CONSTRAINT DEPT13_DEPTNO_PK PRIMARY KEY(DEPTNO);

ALTER TABLE EMP13
ADD CONSTRAINT EMP13_DEPTNO_FK FOREIGN KEY(DEPTNO)
REFERENCES DEPT13(DEPTNO) ON DELETE SET NULL;
-- ON DELETE : ORACLE 적용
-- ON UPDATE : MYSQL에서 적용, ORACLE ON UPDATE 옵션 지원하지 않음.
