package day_8;

import java.sql.*;

public class TableCreation {
	public static void main(String args[]) {
		Connection con = JDBCUtility.getConnection();
		Statement statement;
		try {
			statement = con.createStatement();
			int i=statement.executeUpdate("create table employee(employeeNo integer,employeeName varchar(20),departmentNumber integer)");
			JDBCUtility.closeConnection(null, null);
		} catch (Exception e) {
			JDBCUtility.closeConnection(e, null);
			e.printStackTrace();
		}
	}
}