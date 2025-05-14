/*
DISTINCT
- 중복값을 제거하는데 사용
- null 도 하나의 종류로 인식
*/

-- 중복 제거한 몇가지 종류가 있는지 확인 가능
select distinct addr
from usertbl;

/*
LIMIT
- SELECT 문의 결과 집합에서 반환할 행의 수를 제한

SELECT
    컬렴명
FROM
    테이블명
LIMIT [offset],[rowCount];
- offset : 시작할 행의 번호
- row_count : 이후 행에서 반환할 행의 갯수
*/