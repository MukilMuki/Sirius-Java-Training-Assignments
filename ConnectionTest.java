package day_8;

import java.sql.*;

public class ConnectionTest {
	public static void main(String args[]) {
		Connection con;
		Statement stmt;
		ResultSet rs;
		try {
			con = JDBCUtility.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee");
			while (rs.next())
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			JDBCUtility.closeConnection(null, null);
		} catch (Exception e) {
			JDBCUtility.closeConnection(e, null);
			e.printStackTrace();
		}
	}
}