package com.QuanWebDeveloper.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.QuanWebDeveloper.Dao.ConnectionDAO;
import com.QuanWebDeveloper.Entity.Category;
import com.QuanWebDeveloper.reposirotyImpl.CategoryRespositoryImpl;

@Repository
public class CategoryRepository implements CategoryRespositoryImpl{

	public List<Category> getAll() {
		 List<Category> list = new ArrayList<Category>();
	        String query = "select * from category";
	        try {
	        	Connection conn = new ConnectionDAO().getConnection();
	        	PreparedStatement ps = conn.prepareStatement(query);
	        	ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
                list.add(new Category( rs.getInt(1)
                		,rs.getString(2)
                		,rs.getString(3)
	                		  ));               
	            }
	            
	        } catch (Exception e) {
	        }
	        return list;
		
	}
	


}
