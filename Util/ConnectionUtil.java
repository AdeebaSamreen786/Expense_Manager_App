package Util;

import com.mysql.cj.jdbc.Driver;
import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    @Getter
    private static Connection connection;
    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbc_servlet_integration";

            String username = "admin123";

            String password = "root";

            connection = DriverManager.getConnection(url , username, password);
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
