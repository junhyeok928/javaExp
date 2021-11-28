/*
# data
1. admin 비밀번호 1111
2. 설치완료 후,
3. cmd 창에서 
	sqlplus
	명령을 치면 DB가 설치된지 여부가 나온다
# database client설치
1. help ==> eclipse market place
2. dbeaver 21.2.5 install
	debug 체크 후 confim
3. install anyway

# jdbc드라이버 설정
C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar
파일을 아래 경로에 복사.
webapp\WEB_INF\lib\ojdbc6.jar

# 기본 계정 만들기
C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\scott.sql
계정 폴드에 복사.
C:\Users\junhy
scott.sql

sqlplus
system
1111
@scott.sql
conn scott/tiger;
select * from emp;
 */
