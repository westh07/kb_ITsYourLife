/*
SELECT
- 특정 테이블에서 원하는 데이터를 조회 할 수 있다.
*/

select -- 조회해줘
    * -- 모든 컬럼을
from buytbl; -- buytbl에서

select userID, groupName
from buytbl;

select (5+5); -- 단순 연산 출력

select now(); -- 현재 시간 출력

-- 컬럼에 별칭 사용 AS
select concat('bear','안녕','kb') as 인사; -- 합치기

-- usertbl의 name, mobile, mobile2를 조회 이때 mobile1, mobile2를 붙여서 전화번호라는 컬럼으로 조회
select name, concat(mobile1,')',mobile2) as 전화번호
from usertbl;

