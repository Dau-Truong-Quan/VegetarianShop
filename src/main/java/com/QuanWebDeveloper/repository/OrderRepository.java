package com.QuanWebDeveloper.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.QuanWebDeveloper.Dao.ConnectionDAO;
import com.QuanWebDeveloper.Dto.ItemDto;
import com.QuanWebDeveloper.Dto.OrderDto;
import com.QuanWebDeveloper.Entity.Product;
import com.QuanWebDeveloper.reposirotyImpl.OrderRepositoryImpl;

@Repository
public class OrderRepository implements OrderRepositoryImpl{

	public int AddOrder(OrderDto orderDto) {
		String query = "INSERT INTO dbo.[order](status , shipper_id , user_id , address)\r\n"
				+ "VALUES  (?,?,?,?);";
		int i = 0;
		try {
        	Connection conn = new ConnectionDAO().getConnection();
        	PreparedStatement ps = conn.prepareStatement(query);
        	ps.setInt(1, orderDto.getStatusId());
        	ps.setInt(2, orderDto.getShipperId());
        	ps.setInt(3, orderDto.getUserId());
        	ps.setString(4, orderDto.getAddress());
        	
        	i = ps.executeUpdate();
      
        } catch (Exception e) {
        }
		return i;
	}

	public int GetIdLastOrder() {
		String query = "SELECT MAX(id) from dbo.[order];";
		 try {
	        	Connection conn = new ConnectionDAO().getConnection();
	        	PreparedStatement ps = conn.prepareStatement(query);
	        	
	        	ResultSet rs = ps.executeQuery();
	            
	            while (rs.next()) {
	            	return rs.getInt(1);
	            	
	            }
	            
	        } catch (Exception e) {
	        }
	       return 0;
	}

	public int AddOrdersDetail(ItemDto itemDto) {
		String query = "INSERT INTO dbo.[item](quantity , price , product_id , id_oder)\r\n"
				+ "VALUES  (?,?,?,?);";
		int i = 0;
		try {
        	Connection conn = new ConnectionDAO().getConnection();
        	PreparedStatement ps = conn.prepareStatement(query);
        	ps.setInt(1, itemDto.getQuantity());
        	ps.setFloat(2,itemDto.getPrice());
        	ps.setInt(3, itemDto.getProductId());
        	ps.setInt(4, itemDto.getOrderId());
        	
        	i = ps.executeUpdate();
      
        } catch (Exception e) {
        }
		return i;
	}
	
	
}
