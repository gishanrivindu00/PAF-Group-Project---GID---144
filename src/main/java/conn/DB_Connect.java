package conn;

import java.sql.*;

public class DB_Connect {
	
	private static Connection con;

	public static Connection getDB() throws ClassNotFoundException, SQLException {

		if (con == null || con.isClosed()) {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EG_System", "root", "");
		}
		
		return con;
	}

}
