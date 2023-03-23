package day_8;

import java.sql.*;

public class InsertDisplayTable {
	public static void main(String args[]) {
		try {
			Connection con = JDBCUtility.getConnection();
			Statement statement = con.createStatement();
			String query1 = "insert into employee values (001,'sakre',23)";
			String query2 = "insert into employee values (001,'pradeep',223)";
			String query3 = "insert into employee values (001,'vivek',243)";
			int i1 = statement.executeUpdate(query1);
			int i2 = statement.executeUpdate(query2);
			int i3 = statement.executeUpdate(query3);
//			System.out.println(i1 + i2 + i3);
			ResultSet rs = statement.executeQuery("select * from employee");
			while (rs.next())
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
			JDBCUtility.closeConnection(null, null);
		} catch (SQLException e1) {
			JDBCUtility.closeConnection(e1, null);
			e1.printStackTrace();
		}
	}
}