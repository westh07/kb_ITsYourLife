package org.scoula.jdbc_ex.service;

import org.scoula.jdbc_ex.dao.UserDAO;
import org.scoula.jdbc_ex.dao.UserDAOImpl;
import org.scoula.jdbc_ex.domain.UserVO;

import java.sql.SQLException;

public class LoginUser {

    private  final UserDAO userDAO = new UserDAOImpl();
    public UserVO login(String id, String pass) throws SQLException {
        // 1. id 회원 조회
        UserVO user =userDAO.get(id);

        if(user == null){
            throw new IllegalArgumentException("존재하지 않은 아이디입니다");
        }
        // 2. 데이터베이스에 저장된 회원 비밀번호랑 입력 받는 pw가 같은지 확인
        if(!user.getPassword().equals(pass)){
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다");
        }

        // 일치하면 -> 로그인
        // 아니면 -> 실패 안내
        return user;
    }
}
