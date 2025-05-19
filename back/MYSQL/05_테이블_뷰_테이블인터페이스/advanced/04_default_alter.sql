use tabledb;

drop table if exists usertbl;

-- default
-- 값 입력하지 않았을 때 자동으로 입력되는 기본 값 정의하는 방법
create table usertbl(
    userID char(8) not null primary key ,
    name varchar(10) not null,
    birthYear int not null default -1,
    addr char(2) not null default '서울',
    mobile1 char(3),
    mobile2 char(8),
    height smallint default 170,
    mDate DATE
    );
insert into usertbl(userID,name)
values (1,'이름');
-- 1 이름 -1 서울 null null 170 null
select * from usertbl;

/*
DML 열 삭제
alter table 테이블명
drop column 열이름
*/
alter table usertbl
drop column mobile1;

/*
DML 컬럼명 변경
alter table 테이블명
change column 현재이름 봐꿀이름 자료형
*/
alter table usertbl
change column name uName varchar(10);

/*
열의 제약조건 추가 삭제
- 키본키 삭제
*/
alter table usertbl
drop primary key;