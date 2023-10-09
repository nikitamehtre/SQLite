package packages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddTable {
	public static void createTable() {
		String URL = "jdbc:sqlite:C:\\Users\\Nikita.TRESKY\\SQLite\\NewSQLiteDB.db";
		
		String sql = "CREATE TABLE contacts IF NOT EXIST(\r\n"
				+ "	contact_id INTEGER PRIMARY KEY,\r\n"
				+ "	first_name TEXT NOT NULL,\r\n"
				+ "	last_name TEXT NOT NULL,\r\n"
				+ "	email TEXT NOT NULL UNIQUE\r\n"
				+ ");";  
		try {
			// Connection for DB
			Connection con = DriverManager.getConnection(URL);
			Statement smt = con.createStatement();
			smt.execute(sql);
		}catch(SQLException e) {
			System.out.println(e.getMessage());

		}
	}
	
	public static void main(String[] args) {
		createTable();
	}

}
