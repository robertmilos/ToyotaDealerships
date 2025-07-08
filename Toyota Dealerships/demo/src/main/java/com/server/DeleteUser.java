package com.server;

import java.sql.*;

public class DeleteUser {
    public static void DeletefromDB(String u) {
        String user = u;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/utilizatori", "robertmilos",
                    "robita2004");
            String sql1 = "set SQL_SAFE_UPDATES = 0;";
            String sql2 = "delete from dateutilizatori where username ='" + user + "';";
            PreparedStatement pstmt;
            pstmt = conn.prepareStatement(sql1);
            pstmt.execute();
            pstmt = conn.prepareStatement(sql2);
            pstmt.execute();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
