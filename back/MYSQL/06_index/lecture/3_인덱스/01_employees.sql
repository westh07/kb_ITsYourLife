use employees;

/*
인덱스

클러스터형 인덱스
- 테이블 당 하나만 가능

보조 인덱스
*/

show index from employees;
select * from employees where last_name = '구'; -- 478ms 걸림

-- 인덱스 생성
create index index_lastname on employees(last_name);

-- exlain -> 실행계획 확인
/*
EXPLAIN
-> 실행 계획 확인
⭐ type, key, row

type (접근 방식):
- ALL : 전체 테이블을 다 읽음 (Full Table Scan) → 느림
- index : 인덱스를 전부 읽음 (데이터는 안 읽음)
- range : 범위 조건 (ex. WHERE age > 30) → 인덱스 일부 탐색
- ref : 인덱스를 통해 특정 값 탐색 (ex. WHERE name = '홍길동') → 빠름
- const : 기본키나 유일값으로 딱 한 줄만 찾는 경우 → 매우 빠름

key (사용된 인덱스):
- 이 쿼리에서 실제로 사용된 인덱스의 이름
- NULL이면 인덱스를 사용하지 않았다는 뜻

rows (예상 읽을 행 수):
- MySQL이 이 쿼리를 처리할 때 몇 개의 행을 읽을지 예측한 값
- 이 값이 작을수록 성능이 좋음
*/

-- select 쿼리를 실행하기전에, mysql이 내부적으로 어떤 방법으로 데이터를 가져올지 보여줌
explain select * from employees where last_name = '구';

-- 데이터베이스 통계 정보 갱신
analyze table employees;

select * from employees where last_name = '구'; -- 315ms 걸림

drop index  index_lastname on employees;