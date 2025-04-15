package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.*;


public class UserInsert extends HttpServlet {
  private static final long serialVersionUID = 1L;
       
    
    public UserInsert() {
        super();
        
    }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    response.setContentType("text/html");
    
    
         String username = request.getParameter("username");
         String email = request.getParameter("email");
         String password = request.getParameter("password");
         

          UserInsertModel uim = new UserInsertModel();
          uim.setUsername(username);
          uim.setEmail(email);
          uim.setPassword(password);
          
          try {
        	    uim.execute();
        	    response.sendRedirect("home.jsp?username=" + username);
        	} catch (Exception e) {
        	    // TODO Auto-generated catch block
        	    e.printStackTrace();
        	}

          
          }
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
  }

}
