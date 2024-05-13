import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;

import Librerie.ManageDb;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {

		ManageDb shool_DB = new ManageDb();
		// boolean dbConnected = shool_DB.Connect("localhost", 3306, "school_db",
		// "school_server", "agata");

		ManageDb scuola_db = new ManageDb();
		boolean scuoladbConnection = scuola_db.Connect("localhost", 3306, "scuola", "school_server", "agata");
		System.out.println(scuoladbConnection);
		ResultSet res;
		if (scuoladbConnection == true) {
			res = scuola_db.readInDb("SELECT * FROM allievo");
		if (res != null) {
			try {
				while (res.next()) {
					String nomeAllievo = res.getString("nome");
					String cognomeAllievo = res.getString("nome");
					String CF = res.getString("cf");
					LocalDate dDataNascita = res.getDate("Data_nascita").toLocalDate();
					/*String gender = res.getString("sesso");
					 * 	String luogoAllievo = res.getString("");
					Student a1 = new Student(sNomeAllievo, cognomeAllievo, sCFdDataNascita, gender)*/
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		scuola_db.Disconnect();

		System.out.println();
		// boolean insertResult = scuola_db.writeInDB("INSERT INTO ");

	}
  }
}