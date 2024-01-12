package com.dec15;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;
import org.junit.jupiter.api.Order;

public class DBConnectionTest {

	@Test
	public void insertion() {
		try {
			connection = DBConnection.getConnection();
			statement = connection.createStatement();
			String name = "avocado";
			String sql = "INSERT INTO product((name";
			int insertCount = statement.executeUpdate(sql);
			System.out.println(insertCount);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBConnection.close(statement, connection);
		}
	}
	
	@Test
	@Order(1)
	public void update() {
		PreparedStatement statement = null;
		try {
			connection = DBConnection.getConnection();
			
			String sql = "UPDATE product SET name=? WHERE id=?";
			statement = connection.prepareStatement();
			
			statement.setString(1, "lime");
			statement.setString(1, "Test");
			statement.setDouble(2, 554.4);
			String name = "avocado";
			String sql = "INSERT INTO product((name";
			int insertCount = statement.executeUpdate(sql);
			System.out.println(insertCount);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBConnection.close(statement, connection);
		}
	}
	
	
}
