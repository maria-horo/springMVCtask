package performingCRUD;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class UpdateWithJDBC {
	public static void main(String[] args) {
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection connection = DriverManager.getConnection( 
				"jdbc:mysql://localhost:3306/empdet", "root", 
				"root"); 
			System.out.println("Connection Established."); 
			Statement statement = connection.createStatement();
			statement.execute("create table empdet(empid int primary key, empname varchar(10) not null)");
			statement.execute("insert into empdet values(101,'");
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		}

	}
}
