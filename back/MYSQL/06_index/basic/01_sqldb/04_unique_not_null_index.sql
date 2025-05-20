use sqldb;

create table tbl4(
    -- mysql의 innoDB 경우 테이블에 pk가 없을 경우
    -- "NOT NULL + UNIQUE" 제약 조건이 있는 첫번째 컬럼을 클러스터형 인덱스로 삼는다
    -- not null + unique 제약조건의 컬럼이 없는 경우 내부적으로 숨겨진 시스템 행 id를 사용
    a int unique not null , -- 클러스터 인덱스
    b int unique, -- b 유니크 키 -> UNIQUE 인덱스 생성 (중복 불가, null 허용)
    c int unique, -- c 유니크 키 -> UNIQUE 인덱스 생성 (중복 불가, null 허용)
    d int
);

-- tbl4이 가지고 있는 인덱스 조회
show index from tbl4;

