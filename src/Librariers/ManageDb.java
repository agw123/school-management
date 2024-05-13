package Librariers;

import java.sql.Statement;
import java.security.KeyStore.TrustedCertificateEntry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManageDb {

	String user;
	String psw;
	String port;
	String ipAddress;
	String dbName;
	Connection connection;
	
	
	public boolean connectToDB(String ipAddress, String port, String dbName, String user, String psw) {
		String urlConnection = "jdbc:mysql://" + ipAddress + ":" + port + "/" + dbName + "?user=" + user + "&password="+ psw;
		try {
			connection = DriverManager.getConnection(urlConnection);
			System.out.println("DB is up..");
			return true;
		} catch (SQLException e){
			e.printStackTrace();
			return false;
		}
	}


	public boolean writeInDB(String sSqlQuery) {
		try {
			Statement stm = connection.createStatement();
			stm.execute(sSqlQuery);
			return true;
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
