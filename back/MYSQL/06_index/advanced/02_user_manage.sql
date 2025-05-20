create database scoula_db;
/*
사용자 관리
- root(관리자)에서 실행해야함

사용자 추가
CREATE USER '사용자명'@'호스트명' IDENTIFIED BY '비밀번호';
- 호스트명 - % : 사용자의 접속 호스트 제한 풀기

사용자 삭제
DROP USER '사용자명'@'호스트명';
*/

-- 다음과 같이 실습 데이터베이스 및 사용자를 생성하고, 해당 데이터베이스에 대해 모든 권한을 부여하세요.
-- 데이터베이스 명 : scoula_db
-- 사용자 명: scoula
-- 비밀번호: 1234
-- 접속 호스트: 제한 없음
create user 'scoula'@'%' identified by '1234';

/*
권한 관리
GRANT ALL PRIVILEGES ON 데이터베이스명.객체 TO '사용자명'@'호스트명';

권한 설정 적용하기
FLUSH PRIVILEGES;
*/
grant all privileges on scoula_db.* to 'scoula'@'%';
flush privileges;