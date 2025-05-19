use tabledb;
drop table if exists buytbl;
drop table if exists usertbl;

-- unique
-- ‘중복되지 않는 유일한 값’을 입력해야 하는 조건
create table usertbl(
    userID char(8) not null primary key,
    name varchar(10) not null,
    birthyear int not null,
    email char(30) null unique
);