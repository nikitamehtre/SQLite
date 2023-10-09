package packages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	
	private Connection connection() {
		String URL = "jdbc:sqlite:C:\\Users\\Nikita.TRESKY\\SQLite\\NewSQLiteDB.db";
		Connection conn = null;
		try {
			// Connection for DB
			conn = DriverManager.getConnection(URL);
		}catch(SQLException e) {
			System.out.println(e.getMessage()+ "Error in connaction");
		}
		return conn;
	}
	
	public void insert(String first_name, String last_name, String email) {
		String sql = "INSERT INTO contacts(first_name,last_name,email) VALUES(?,?,?)";
		
		 try {
			 Connection conn = this.connection();
			 PreparedStatement psmt = conn.prepareStatement(sql);
			 psmt.setString(1, first_name);
			 psmt.setString(2, last_name);
			 psmt.setString(3, email);
			 psmt.executeUpdate();
			 }catch(SQLException e) {
	          System.out.println(e.getMessage() + "Error in inserting");
		 }
		 }


	public static void main(String[] args) {
		Insert app = new Insert();
		app.insert("Nikita", "Mehtre", "nm@tresky.de");
	}

}
