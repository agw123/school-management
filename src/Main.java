import java.text.SimpleDateFormat;
import java.util.HashMap;

import Librerie.ManageDb;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {

		ManageDb shool_DB = new ManageDb();
		//boolean dbConnected = shool_DB.Connect("localhost", 3306, "school_db", "school_server", "agata");
		
		ManageDb scuola_db = new ManageDb();
		boolean scuoladbConnection = scuola_db.Connect("localhost", 3306, "scuola", "school_server", "agata");
		System.out.println(scuoladbConnection);
		ResultSet allClerks = scuola_db.readInDb("SELECT * FROM allievo");
		System.out.println(allClerks);
		//boolean insertResult = scuola_db.writeInDB("INSERT INTO ");
		
		
	}
	
	

}