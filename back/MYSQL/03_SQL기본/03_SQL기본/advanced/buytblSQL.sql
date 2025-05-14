use sqldb;

select userID as '사용자 아이디', sum(amount) as '총 구매 개수'
from buytbl
group by userID ;

-- 사용자별 총 구매액을 출력하세요.
select userID as '사용자 아이디', sum(amount * price) as '총 구매액' -- 행마다 곱한 것은 더한 것임
from buytbl
group by userID ;

select avg(amount) as '평균 구매 개수'
from buytbl;


select userID as '사용자 아이디', avg(amount) as '평균 구매 개수'
from buytbl
group by userID;


select userID, avg(amount) as '평균 구매 개수'
from buytbl
group by userID;



-- 총 구매액이 1,000이상인 사용자만 출력하세요.
select userID as '사용자 아이디', sum(amount * price) as '총 구매액'
from buytbl
group by userID
having  sum(amount * price) >= 1000 ;