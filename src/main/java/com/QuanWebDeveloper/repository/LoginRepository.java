package com.QuanWebDeveloper.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.QuanWebDeveloper.Dao.ConnectionDAO;
import com.QuanWebDeveloper.Entity.User;
import com.QuanWebDeveloper.reposirotyImpl.LoginRepositoryImpl;

@Repository
public class LoginRepository implements LoginRepositoryImpl{

	public User check(String email, String password) {
		String query = "select * from account\r\n"
				+ "where email = ?\r\n"
				+ "and password = ?";
	        try {
	        	Connection conn = new ConnectionDAO().getConnection();
	        	PreparedStatement ps = conn.prepareStatement(query);
	        	ps.setString(1, email);
	        	ps.setString(2, password);
	        	ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	            	return new User(rs.getInt(1)
	            			,rs.getString(2)
	                		,rs.getString(3)
	                		,rs.getString(4)
	                		,rs.getString(5)
	                		,rs.getBoolean(6)
	                		  );
	            

	            }
	            
	        } catch (Exception e) {
	        }
	       
		return null;
		
	}
	
//	public static void main(String[] args){
//
//		System.out.println(new LoginRepository().check("sitien", "123"));
//		
//	}

}
