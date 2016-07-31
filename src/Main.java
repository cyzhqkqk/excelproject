import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.DBconnect;

public class Main {

	public static void main(String[] args) {
		 ResultSet rs = null;
		 Statement stmt = null;
		 String query  = "SELECT * FROM ABC";
		DBconnect db = new DBconnect();
		db.init();
		stmt = db.connect();
		try {
			stmt.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
