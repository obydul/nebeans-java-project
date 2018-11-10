package com.obydul.datafromfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTextFileToMySQL {

    public static Connection getConnection() throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sph_login";
        Connection conn = DriverManager.getConnection(url, "root", "root");
        return conn;
    }

    public static void main(String[] args) {
    }

}
