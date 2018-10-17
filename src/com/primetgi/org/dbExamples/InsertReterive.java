package com.primetgi.org.dbExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * This examples retrieves  
 * the last row inserted 
 */
/*
 * CREATE TABLE testInsertRetreive(
	TestId int IDENTITY(1,2) PRIMARY KEY,
	TestName nvarchar(250),
	TestLocation nvarchar(250)
)
 */
public class InsertReterive {

	public static void main(String[] args) {
		
		int id = 0;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionURL = "jdbc:sqlserver://user-229;databaseName=user229DB;user=sa;password=admin";
			Connection connection = DriverManager.getConnection(connectionURL);
			
			PreparedStatement  statement = connection.prepareStatement("INSERT INTO testInsertRetreive (TestName, TestLocation) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, "SampleTest");
			statement.setString(2, "Hyd");
			
			statement.executeUpdate();
			ResultSet set = statement.getGeneratedKeys();
			if(set.next()) {
				id = set.getInt(1);
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}	
		
		System.out.println("Test Id :"+id);

	}

}
