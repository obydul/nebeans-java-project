/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author bts-2
 */
public class LoginAction extends Action {

    private static final String SUCCESS = "success";
    private static final String FAILURE = "failure";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LoginForm logform = (LoginForm) form;
        String usrnm = logform.getUsername();
        String usrpass = logform.getPassword();

        DatabaseConnection dbcon = new DatabaseConnection();
        PreparedStatement pstm = dbcon.getConn().prepareStatement("SELECT username, password FROM USER2 WHERE username=? AND password=?");
        pstm.setString(1, usrnm);
        pstm.setString(2, usrpass);
        
        ResultSet rs = pstm.executeQuery();
        
        if (rs.next()) {
            return mapping.findForward(SUCCESS);
        }
        
        return mapping.findForward(FAILURE);
    }
}
