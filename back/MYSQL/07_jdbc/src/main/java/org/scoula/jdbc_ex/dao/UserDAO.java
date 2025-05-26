package org.scoula.jdbc_ex.dao;
import org.scoula.jdbc_ex.domain.UserVO;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

/*

* */
public interface UserDAO {
    // Exception은 모든 에러 SQLException은 sql 관련된 에러
    // 메서드 단위로 던저야함

    // 회원 등록
    // 회원 목록 조회
    int create(UserVO user) throws SQLException; // throws 던짐 호출한 곳에서 처리함
    List<UserVO> getList() throws SQLException;
    // 회원 정보 조회
    UserVO get(String id) throws SQLException;
    // 회원 수정
    int update(UserVO user) throws SQLException;
    // 회원 삭제
    int delete(String id) throws SQLException;
}





