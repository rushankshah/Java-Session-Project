/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rushank Shah
 */
public class Testing {

    public static void main(String[] args) {
        try {
            DBConnection connect = new DBConnection();
            Connection conn = connect.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Employee");
            while(rs.next()){
                System.out.println(rs.getString(1) + " " + rs.getString(2));
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
