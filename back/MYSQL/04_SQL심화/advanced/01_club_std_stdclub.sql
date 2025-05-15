USE sqldb;
CREATE TABLE stdtbl (
                        stdName VARCHAR(10) NOT NULL PRIMARY KEY,
                        addr CHAR(4) NOT NULL
);

CREATE TABLE clubtbl (
                         clubName VARCHAR(10) NOT NULL PRIMARY KEY,
                         roomNo CHAR(4) NOT NULL
);

CREATE TABLE stdclubtbl(
                           num int AUTO_INCREMENT NOT NULL PRIMARY KEY,
                           stdName VARCHAR(10) NOT NULL,
                           clubName VARCHAR(10) NOT NULL,
                           FOREIGN KEY(stdName) REFERENCES stdtbl(stdName),
                           FOREIGN KEY(clubName) REFERENCES clubtbl(clubName)
);
INSERT INTO stdtbl VALUES ('김범수','경남'), ('성시경','서울'), ('조용필','경기'), ('은지원','경북'),('바비킴','서울');
INSERT INTO clubtbl VALUES ('수영','101호'), ('바둑','102호'), ('축구','103호'), ('봉사','104호');
INSERT INTO stdclubtbl
VALUES (NULL, '김범수','바둑'), (NULL,'김범수','축구'), (NULL,'조용필','축구'),
       (NULL,'은지원','축구'), (NULL,'은지원','봉사'), (NULL,'바비킴','봉사');

/*
- 학생 테이블, 동아리 테이블, 학생 동아리 테이블을 이용해서
- 학생을 기준으로 학생 이름/지역/가입한 동아리/동아리방을 출력하세요.

- 세 개 이상 테이블 조인
- 각 테이블은 관계가 있어야함, 조인 조건을 명확히 설정해야함

작동순서
1. 첫번째 테이블과 두번째 테이블 먼저 조인
2. 1번의 결과 테이블과 세번째 테이블이 조인
- 각 조인마다 on으로 조건을 지정해야함
*/
select s.stdName as 학생이름, s.addr as 학생지역, sc.clubName as 동아리명, c.roomNo as 동아리위치
from stdtbl s
    join stdclubtbl sc
        on s.stdName = sc.stdName
    join clubtbl c
        on sc.clubName = c.clubName
order by sc.stdName;

select c.clubName as 동아리명, c.roomNo as 동아리위치, s.stdName as 학생이름, s.addr as 학생주소
from stdtbl s
    join stdclubtbl sc on s.stdName = sc.stdName
    join clubtbl c on sc.clubName = c.clubName
order by sc.clubName;



