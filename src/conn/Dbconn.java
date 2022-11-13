package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconn {

public static Connection config() throws SQLException, ClassNotFoundException{
		
		Class.forName("com.mysql.jdbc.Driver");
		  Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/backup","root","root");
		 return con; 		
	}

}
