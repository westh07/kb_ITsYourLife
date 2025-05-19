use tabledb;

drop table if exists usertbl;

-- check 제약조건
-- 입력되는 데이터를 점검하는 기능
create table usertbl(
    userID char(8) not null primary key,
    name varchar(10),
    birthYear int check ( birthYear >= 1900 and birthYear <= 2023 ),
    mobile char(3) not null
);