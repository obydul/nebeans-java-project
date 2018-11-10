/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts;

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
public class DatabaseConnection {
    public String dbDriver = "oracle.jdbc.driver.OracleDriver";
    public String dbUrl = "jdbc:oracle:thin:@localhost:1521:ORCL";
    public String dbuser = "HR";
    public String dbpass = "HR";
    public Connection conn = null;
    public Statement  stm = null;

    public DatabaseConnection() {
        try {
            Class.forName(dbDriver);
            conn = DriverManager.getConnection(dbUrl, dbuser, dbpass);
            stm = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }    
    
    public String getDbDriver() {
        return dbDriver;
    }

    public void setDbDriver(String dbDriver) {
        this.dbDriver = dbDriver;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
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
