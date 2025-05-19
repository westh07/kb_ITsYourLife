drop database if exists tabledb;
create database tabledb;

use tabledb;
drop table if exists usertbl;
create table usertbl(
    userID char(8) not null primary key,
    name varchar(10) not null,
    birthyear int not null
    );
drop table if exists buyTBL;
create table buyTBL(
    num int not null primary key auto_increment,
    userID char(8) not null,
    prodName char(6) not null
);
-- FK를 alter를 이용
alter table buytbl
    add constraint FK_usertbl_buytbl
    foreign key (userID)
    references usertbl(userID);