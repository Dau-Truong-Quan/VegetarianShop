package com.QuanWebDeveloper.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.QuanWebDeveloper.Dao.ConnectionDAO;
import com.QuanWebDeveloper.Entity.Product;
import com.QuanWebDeveloper.reposirotyImpl.ProductRepositoryImpl;

@Repository
public class ProductRepository implements ProductRepositoryImpl{

	
	
	

		
	

	public void updateProductEntity(Product p) {
		// TODO Auto-generated method stub
		
	}

	public List<Product> listProductEntity() {
		 List<Product> list = new ArrayList<Product>();
	        String query = "select * from product";
	        try {
	        	Connection conn = new ConnectionDAO().getConnection();
	        	PreparedStatement ps = conn.prepareStatement(query);
	        	ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	                list.add(new Product(
	                		 rs.getInt(1)
	                		,rs.getString(2)
	                		,rs.getInt(3)
	                		,rs.getString(4)
	                		,rs.getString(5)
	                		,rs.getString(6)
	                		,rs.getString(7)
	                		,rs.getInt(8)  ));
	            	
	            }
	            
	        } catch (Exception e) {
	        }
	        return list;
		
	}

	

	public void removeProduct(int id) {
		String query = "DELETE   FROM product\r\n"
				+ "where id = ?";
	        try {
	        	Connection conn = new ConnectionDAO().getConnection();
	        	PreparedStatement ps = conn.prepareStatement(query);
	        	ps.setInt(1, id);
	        	
	        	ps.executeUpdate();
	          
	            	
	            
	            
	        } catch (Exception e) {
	        }
		
	}

	public Product getLast() {
		 String query = "select top 1 * from product\r\n"
		 		+ "order by id desc";
	        try {
	        	Connection conn = new ConnectionDAO().getConnection();
	        	PreparedStatement ps = conn.prepareStatement(query);
	        	ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	            	return new Product(rs.getInt(1)
	            			,rs.getString(2)
	                		,rs.getInt(3)
	                		,rs.getString(4)
	                		,rs.getString(5)
	                		,rs.getString(6)
	                		,rs.getString(7)
	                		,rs.getInt(8)  );
	            	
	            }
	            
	        } catch (Exception e) {
	        }
	       
		return null;
	}

	public Product getProductById(int id) {
		String query = "select * from product\r\n"
				+ "where id = ?";
	        try {
	        	Connection conn = new ConnectionDAO().getConnection();
	        	PreparedStatement ps = conn.prepareStatement(query);
	        	ps.setInt(1, id);
	        	ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	            	return new Product(rs.getInt(1)
	            			,rs.getString(2)
	                		,rs.getInt(3)
	                		,rs.getString(4)
	                		,rs.getString(5)
	                		,rs.getString(6)
	                		,rs.getString(7)
	                		,rs.getInt(8)  );

	            	
	            }
	            
	        } catch (Exception e) {
	        }
	       
		return null;
	}

	public List<Product> getListProductByCategory(int cate_id) {
		List<Product> list = new ArrayList<Product>();
        String query = "select * from product \r\n"
        		+ "where cate_id = ?";
        try {
        	Connection conn = new ConnectionDAO().getConnection();
        	PreparedStatement ps = conn.prepareStatement(query);
        	ps.setInt(1, cate_id);
        	ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1)
                		,rs.getString(2)
                		,rs.getInt(3)
                		,rs.getString(4)
                		,rs.getString(5)
                		,rs.getString(6)
                		,rs.getString(7)
                		,rs.getInt(8)  ));
            	
            }
            
        } catch (Exception e) {
        }
        return list;
	}

	public List<Product> getListProductByName(String txtSearch) {
		List<Product> list = new ArrayList<Product>();
        String query = "select * from product\n"
        		+ "where [name] like ? ";
        try {
        	Connection conn = new ConnectionDAO().getConnection();
        	PreparedStatement ps = conn.prepareStatement(query);
        	ps.setString(1, "%"+txtSearch+"%");
        	ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1)
                		,rs.getString(2)
                		,rs.getInt(3)
                		,rs.getString(4)
                		,rs.getString(5)
                		,rs.getString(6)
                		,rs.getString(7)
                		,rs.getInt(8)  ));
            	
            }
            
        } catch (Exception e) {
        }
        return list;
	}

	public void addProductEntity(Product p) {
		// TODO Auto-generated method stub
		
	}

	public void addProductEntity(String name, int price, String image, String description, int quantity, int cate_id) {
		 String query = "INSERT INTO product (name, price, img , description, quantity, cate_id )\r\n"
		 		+ "VALUES (?, ? , ? , ? , ? , ? );";
	        try {
	        	Connection conn = new ConnectionDAO().getConnection();
	        	PreparedStatement ps = conn.prepareStatement(query);
	        	ps.setString(1, name);
	        	ps.setInt(2, price);
	        	ps.setString(3, image);
	        	ps.setString(4, description);
	        	ps.setInt(5, quantity);
	        	ps.setInt(6, cate_id);
	        	int i = ps.executeUpdate();
	        	System.out.println(i);
	          
	            	
	            
	            
	        } catch (Exception e) {
	        }
		
	}


	
	
	public static void main(String[] args){

		new ProductRepository().addProductEntity("ca ", 2, "ss", "d", 2, 2);
		
	}
}
