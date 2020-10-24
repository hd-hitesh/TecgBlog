package com.tech.blog.helper;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class ConnectionProvider {

    private static Connection con;

    public static Connection getConnection() {
        try {
            if (con == null) {
            Class.forName("com.mysql.jdbc.Driver");
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Register", "root", "");
            System.out.println(con);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
