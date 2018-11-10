/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bts-2
 */
public class DBConnectAnother {

    public String dburl = "jdbc:oracle:thin:@localhost:1521:ORCL";
    public String driverName = "oracle.jdbc.driver.OracleDriver";
    public String dbuser = "HR";
    public String dbpass = "HR";
    public Connection conn = null;
    public Statement stm = null;

    public DBConnectAnother() {
        try {
            Class.forName(driverName);
            conn = DriverManager.getConnection(dburl, dbuser, dbpass);
            stm = conn.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnectAnother.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException sql) {
        } 
    }

    public String getDburl() {
        return dburl;
    }

    public void setDburl(String dburl) {
        this.dburl = dburl;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDbuser() {
        return dbuser;
    }

    public void setDbuser(String dbuser) {
        this.dbuser = dbuser;
    }

    public String getDbpass() {
        return dbpass;
    }

    public void setDbpass(String dbpass) {
        this.dbpass = dbpass;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Statement getStm() {
        return stm;
    }

    public void setStm(Statement stm) {
        this.stm = stm;
    }
}
