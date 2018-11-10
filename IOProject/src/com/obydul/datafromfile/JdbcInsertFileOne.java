package com.obydul.datafromfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertFileOne {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sph_login";
        String user = "root";
        String pass = "root";

        String filePath = "C://share/test.txt";
        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            String sql = "insert into person (first_name, last_name) values (?,?)";
            PreparedStatement stm = conn.prepareStatement(sql);
            InputStream input1 = new FileInputStream(new File(filePath));
            InputStream input2 = new FileInputStream(new File(filePath));
            stm.setAsciiStream(1, input1);
            stm.setAsciiStream(2, input2);
            stm.executeUpdate();
            //conn.commit();
            stm.close();
            conn.close();
            input1.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
