/*
# 사용자 암호변경
1. 기본형식
alter user 사용자명 identified by패스워드;
 */
SELECT * FROM DBA_USERS;
ALTER USER USER01 IDENTIFIED BY 5555;
-- CMD 창에서 SQLPLUS로 접근환인..

-- ex) user02를 만들고, 계정겁근이 가능하게 권한을 부여하고, 
--		비밀번호를 바꾼후에 sqlplus를 통해서 접근해보세요
-- 각 조별로 완료가 된 조는 조장님만 손들어 주세요. 혹 의문사항이 있는 조는 조장님을 통해서 메시지 주세요
SELECT * FROM DBA_USERS;
CREATE USER user02 IDENTIFIED BY 1111;
GRANT CREATE SESSION TO user02;
ALTER USER USER02 IDENTIFIED BY 9999;

/*
# 계정이 lock 걸린 경우
1. 계정 정책에 의해 @@회 이상 암호를 잘못 입력한 경우
2. 계정 정책에 의해 계정만료기간 도래시
3. 처리할 sql
	alter user 사용자계정 identified by 패스워드 account unlock;
 */
ALTER USER USER02 IDENTIFIED BY 9999 ACCOUNT UNLOCK;

-- ex) system 계정에서 higirl 계정을 만들고, 비밀번호 변경과 계정 unlock처리를 하세요


