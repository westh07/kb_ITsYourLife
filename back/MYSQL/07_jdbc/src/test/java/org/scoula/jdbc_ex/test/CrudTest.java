package org.scoula.jdbc_ex.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.scoula.jdbc_ex.common.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudTest {
    // 1️⃣2️⃣ 단계
    Connection conn = JDBCUtil.getConnection();

    @AfterAll // 아래 메서드 다 호출하고 나서 한번만 실행
    static void tearDown() throws SQLException{
        JDBCUtil.close(); // 메서드 끝나면 항상 닫아줌
    }

    @Test
    @DisplayName("회원가입 테스트")
    public void insertUser() throws SQLException{
        // 3️⃣ 3단계 - sql 문 객체 생성
        String sql = "insert into users(id, password, name, role) values(?, ?, ?, ?)"; // 1,2,3,4 순서
        /*
        * ? 연산자
        * 어떤 데이터를 넣을 지 모르기 때문에 그 자리에 ?로 설정함
        * - ?는 번호가 있음 1번부터 순서 시작
        * */

        /*
        * http://www.naver.com -> 사람은 url로 인식 java는 string으로 인식
        * URL url = new URL("http://www.naver.com"); - > java url로 인식
        * sql도 url 처럼 해당하는 부품이 있음
        * - sql --> Statement(문장), PreparedStatement(준비된 문장)
        *
        * preparedStatement
        * - ?에 값을 넣어줌
        * */
        PreparedStatement pstmt = conn.prepareStatement(sql);
        System.out.println("3단계 : sql 문 객체로 만들기 성공");

        //varChar - String
        pstmt.setString(1,"id_p"); // id 넣음
        pstmt.setString(2,"pw_p"); // pw 넣음
        pstmt.setString(3,"name_p"); // name 넣음
        pstmt.setString(4,"role_p"); // role 넣음

        // ️ 4️⃣ 4단계 - sql 문 db 서버로 전송하고 뒷처리
        int count = pstmt.executeUpdate(); // insert 문 결과는 실행된 row 수
        System.out.println("실행될 row수 : " + count);
        Assertions.assertEquals(0,count);
        pstmt.close(); // 자원 해제


    }
}
