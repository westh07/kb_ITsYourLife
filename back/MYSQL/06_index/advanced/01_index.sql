use sqldb;

-- usertbl의 내용 확인
select * from usertbl;

-- usertbl의 인덱스 목록 확인
show index from usertbl;
analyze table usertbl;

-- usertbl의 데이터 크기와 인덱스의 크기 확인
show table status like 'usertbl';

-- usertbl의 addr 컬럼에 대해 idx_usertbl_addr이름으로 인덱스를 만들고, 인덱스 목록을 확인하세요.
create index idx_usertbl_addr on usertbl(addr);
show index from usertbl;


-- usertbl의 상태를 출력하여 인덱스의 내용이 만들어졌는지 확인하고, 내용이 없다면 실제 적용되도록 한 후, 인덱스의 크기를 확인하세요.
show table status like 'usertbl'; -- index_length 0
analyze table usertbl; -- 생성된 인덱스 실제 적용
show table status like 'usertbl'; -- index length 16384

-- birthYear 컬럼에 대해 idx_usertbl_birthYear 이름의 인덱스를 만드세요.
-- 에러가 난다면 그 이유를 설명하세요.
create index idx_usertbl_birthYear on usertbl(birthYear); -- 에러 안생김
create unique index unique_idx_usertbl_birthYear on usertbl(birthYear); -- 🛑: 중복값이 있어서 인덱스 에러

-- name 컬럼에 대해 idx_usertbl_nam 이름의 인덱스를 만드세요
create unique index idx_usertbl_name on usertbl(name); -- 에러 안생김

show index from usertbl; -- unique_idx_usertbl_birthYear 없는 것 확인 가능

-- name 컬럼에 대한 보조 인덱스를 삭제하세요
drop index idx_usertbl_name on usertbl;
drop index idx_usertbl_birthYear on usertbl;

-- name과 birthYear 컬럼 조합으로 idx_usertbl_name_birthYear 이름의 인덱스를 생성하세요.
create unique index idx_usertbl_name_birthYear
on usertbl(name,birthYear);

-- 인덱스의 목록을 확인하세요
show index from usertbl; -- 2개로 나눠서 생성됨

-- usertbl에서 앞에서 만든 인덱스를 삭제하세요.
drop index idx_usertbl_name_birthYear on usertbl;
-- or
alter table usertbl drop index idx_usertbl_addr;

show index from usertbl;