use sqldb;

-- max min을 where을 통해 조건을 제시해야함
select name, height
from usertbl
where height = (select max(height) from usertbl) or
      height = (select min(height) from usertbl);

select count(*) as '휴대폰이 있는 사용자'
from usertbl
where mobile1 is Not null;