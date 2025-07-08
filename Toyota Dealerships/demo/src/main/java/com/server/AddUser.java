package com.server;

import java.sql.*;

public class AddUser {
    public static void AddtoDB(String u, String p) {
        String user = u;
        String pass = p;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/utilizatori", "robertmilos",
                    "robita2004");
            String sql = "insert into dateutilizatori(username,password)" + "values(?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user);
            pstmt.setString(2, pass);
            pstmt.execute();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
