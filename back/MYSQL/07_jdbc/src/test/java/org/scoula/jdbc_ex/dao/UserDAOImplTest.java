package org.scoula.jdbc_ex.dao;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.scoula.jdbc_ex.common.JDBCUtil;
import org.scoula.jdbc_ex.domain.UserVO;

import java.sql.Connection;
import java.sql.SQLException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserDAOImplTest {
    Connection conn = JDBCUtil.getConnection();
    private UserDAOImpl userDAO;

    @BeforeEach
    void setUp(){
        userDAO = new UserDAOImpl();
    }
    @AfterAll // 아래 메서드 다 호출하고 나서 한번만 실행
    static void tearDown() throws SQLException {
        JDBCUtil.close();
    }
    @Test
    void create() {
    }

    @Test
    void getList() {
    }

    @Test
    void get() {
    }

    @Test
    void update() throws SQLException {
        // given
        UserVO user = new UserVO("ice","pass123","Updated Name","ADMIN");
        // when
        int result = userDAO.update(user);
        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void delete() throws SQLException {
        // given
        String id = "ice";
        // when
        int result = userDAO.delete(id);

        //then
        assertThat(result).isEqualTo(1);
    }
}