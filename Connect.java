package packages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	
	public static void Connect() {
		try {
			String URL = "jdbc:sqlite:C:\\Users\\Nikita.TRESKY\\SQLite\\Tresky.db";
			
            Connection conn = DriverManager.getConnection(URL);
            System.out.println("Connection to SQLite has been established."); 
            
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		Connect();
	}
	
	

}
