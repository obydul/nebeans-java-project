/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts;

import org.apache.struts.action.ActionForm;

/**
 *
 * @author bts-2
 */
public class LoginForm extends ActionForm {

    public String username;
    public String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginForm() {
        super();       
    }
}
