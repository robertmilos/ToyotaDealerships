package com.server;

import java.sql.*;

public class GetUser {
    public static int GetFromDB(String u, String p) {
        int ok = 0;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/utilizatori", "robertmilos",
                    "robita2004");
            String sql = "select * from dateutilizatori";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String user = rs.getString("username");
                String pass = rs.getString("password");
                if (user.equals(u) && pass.equals(p)) {
                    ok = 1;
                    break;
                }
                if (user.equals(u) && !pass.equals(p)) {
                    ok = 2;
                    break;
                }
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        if (ok == 1)
            return 1;
        else if (ok == 2)
            return 2;
        return 0;
    }

}
