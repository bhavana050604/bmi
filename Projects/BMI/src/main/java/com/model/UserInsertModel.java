package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertModel extends User {
	@SuppressWarnings("unused")
	private String username;
	@SuppressWarnings("unused")
	private String email;
	@SuppressWarnings("unused")
	private String password;
	
	
	public void execute() throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");

            ps = con.prepareStatement("INSERT INTO users (username,email,password) VALUES (?, ?, ?)");

            ps.setString(1,getUsername());
            ps.setString(2, getEmail());
            ps.setString(3, getPassword());
            
            ps.executeUpdate();

           
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }
     
}
}
