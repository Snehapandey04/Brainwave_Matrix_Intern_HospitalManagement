package com.example;
/**
 *
 * @author Admin
 */
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
  
// This class can be used to initialize the database connection 
public class DatabaseConnection { 
    public static Connection initializeDatabase() 
        throws SQLException 
    { 
        // Initialize all the information regarding 
        // Database Connection 
       // String dbDriver = "com.mysql.jdbc.Driver";
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        // Database name to access 
        String dbName = "hospital_management"; 
        String dbUsername = "root"; 
        String dbPassword = "Sneha"; 
  
        //Class.forName(dbDriver); 
        
       Connection con = DriverManager.getConnection(dbURL+dbName,dbUsername,dbPassword);

       if(con == null){
           System.out.println("connected successfully");
       }
       
       return con; 
    } 
} 

