/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author bts-2
 */
public class DBConnect {

    public static void main(String[] args) {

    Connection conn1 = null;
    String dbuser = null;
    String dbpass = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String dbURL1 = "jdbc:oracle:thin:@localhost:1521:ORCL";
            dbuser = "HR";
            dbpass = "HR";
            conn1 = DriverManager.getConnection(dbURL1,dbuser,dbpass);
            if (conn1 != null) {
                System.out.println("DB Connected properly ");
            } else {
                System.out.println("DB Connected not properly");
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn1 != null && !conn1.isClosed()) {
                    conn1.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
