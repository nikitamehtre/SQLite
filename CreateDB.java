package packages;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDB {
	public static void CreateNewDB(String fileName) {
		
		// Path of JAR file
		String URL = "jdbc:sqlite:C:\\Users\\Nikita.TRESKY\\SQLite\\" + fileName;
		try {
			// Connection for DB
			Connection con = DriverManager.getConnection(URL);
			
			if(con != null) {
				DatabaseMetaData meta = con.getMetaData();
				 System.out.println("The driver name is " + meta.getDriverName());  
	             System.out.println("A new database has been created.");  
			}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	 public static void main(String[] args) {  
		 CreateNewDB("NewSQLiteDB.db");  // Creating New DB File
	    }  

}
