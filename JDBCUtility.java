package day_8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;

public class JDBCUtility {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static ThreadLocal<Connection> clockRoom = new ThreadLocal<>();

	public static Connection getConnection() {
		Connection connect = clockRoom.get();
		if (connect == null) {
			try {
				connect = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root", "Welcome@12345");
				connect.setAutoCommit(false);
				clockRoom.set(connect);
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		return connect;
	}

	public static void closeConnection(Exception e, Savepoint sp) {
		Connection connect = clockRoom.get();
		if (connect != null) {
			try {
				if (e != null) {
					if (sp == null) {
						System.out.println(e);
						connect.rollback();
					} else {
						connect.rollback(sp);
						connect.commit();
					}

				} else {
					connect.commit();
				}
				connect.close();
				clockRoom.remove();
			} catch (Exception ee) {
				ee.printStackTrace();
			}
		}
	}
}
