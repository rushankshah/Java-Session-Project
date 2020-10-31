package utils;
import java.sql.*;
public class DBConnection {
    public Connection createConnection(){
        try{
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Demo?user=root&password=root");
            return conn;
        } catch(SQLException e) {
            System.err.println(e);
            return null;
        }
    }
}
