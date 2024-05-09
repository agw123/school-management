package Librerie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class ManageDb {
	private Connection connection;
	String sDbName;
	String sServerIp;
	String iTcpPort;
	String username;
	String password;
	String sConnectString;

	public boolean Connect(String ipServer, int port, String dbName, String username, String password) {
		try {
			sConnectString = "jdbc:mysql://" + ipServer + ":" + port + "/" + dbName + "?user=" + username + "&password=" + password;
			connection = DriverManager.getConnection(sConnectString);
			System.out.println("DB connected...");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean writeInDB(String sSqlQuery) {
		try {
			Statement stm = connection.createStatement();
			return stm.execute(sSqlQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public ResultSet readInDb(String sSqlQuery) throws SQLException {
		try {
			Statement stm = connection.createStatement();
			ResultSet rs = stm.executeQuery(sSqlQuery);
			/*while(rs.next()) {
				int i = rs.getInt("first_column_name");
				String str1 = rs.getString("second_column_name");
			}*/
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean Disconnect() {
		try {
			connection.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
