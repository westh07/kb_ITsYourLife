package org.scoula.jdbc_ex.common;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class JDBCUtil {
    // 1. 드라이버 설정
    // 2. db 연결이용해서 연결하는 것 까지
    // -> Connextion con; <-- con을 리턴
    static Connection conn = null;
    public static Connection getConnection() {
        if(conn != null) return conn;
        try {
            Properties properties = new Properties();
            properties.load(JDBCUtil.class.getResourceAsStream("/application.properties"));

            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");
            String id = properties.getProperty("id");
            String password = properties.getProperty("password");

            Class.forName(driver);

            // 🔍 DriverManager 가 connection
            conn = DriverManager.getConnection(url, id, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void close() {
        try {
            if (conn != null) {
                conn.close();
                conn = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}