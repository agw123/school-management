import java.sql.ResultSet;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import Librariers.*;

public class SchoolManager {

	public static void main(String[] args) throws SQLException {
		
		School school = new School("The Cool School");

		ConsoleManager consoleManager = new ConsoleManager();

		boolean start = true;
		while (start) {
			int[] consoleChoice = consoleManager.giveInt(
					"What would you like to do: \n1. View all students \n2. Add student \n3. Esci",
					"wrong value, try again", "error, try again", 3);

			if (consoleChoice[1] != 0) {
				switch (consoleChoice[1]) {
				case 1:
					readAllStudentsFromDb(school);
					break;

				case 2:
					Student student = new Student();
					
					String[] nameTyped = consoleManager.giveString("Student name", "The data type incorrect, try agian",
							"Error", 3);

					if (nameTyped[1] != null) {
						student.setName(nameTyped[1]);
					}

					String[] surnameTyped = consoleManager.giveString("Student surname",
							"The data type incorrect, try agian", "Error", 3);
					if (surnameTyped[1] != null) {
						student.setSurname(surnameTyped[1]);
					}

					LocalDate[] bDateTyped = consoleManager.giveDate("Student birth date",
							"The data type incorrect, try agian", "Error", 3);
					if (bDateTyped[1] != null) {
						student.setBirthDate(bDateTyped[1]);
					}

					String[] bPlaceTyped = consoleManager.giveString("Student birth place",
							"The data type incorrect, try agian", "Error", 3);
					if (bPlaceTyped[1] != null) {
						student.setBirthPlace(bPlaceTyped[1]);
					}

					String[] genderTyped = consoleManager.giveString("Student gender (M or F)",
							"The data type incorrect, try agian", "Error", 3);
					if (genderTyped[1] != null) {
						student.setGender(genderTyped[1]);
					}

					String[] addressTyped = consoleManager.giveString("Student address (es. Via Roma 23, Firenze",
							"The data type incorrect, try agian", "Error", 3);
					if (addressTyped[1] != null) {
						student.setAddress(addressTyped[1]);
					}

					String[] cfTyped = consoleManager.giveCf("Student codice fiscale",
							"The data type incorrect, try agian should have 16 characters", "Error", 3);
					if (cfTyped[1] != null) {
						student.setCodiceFiscale(cfTyped[1]);
					}

					// student = new Student(nameString, surnameString, bPlaceString, bDateString,
					// genderString, cfString, addressString);

					System.out.println(student);
					insertStudentToDb(school, student);
					
					// insertStudentToDb(school);
					break;
				case 3:
					start = false;
					break;
				}

			}

		}

	}

	public static void readAllStudentsFromDb(School school) throws SQLException {
		ManageDb school_db = new ManageDb();
		boolean scuoladbConnection = school_db.connectToDB("localhost", "3306", "school_db", "agata_school", "agata");
		ResultSet res;

		if (scuoladbConnection == true) {
			res = school_db.readInDb("SELECT * FROM student");
			if (res != null) {
				try {
					while (res.next()) {
						String name = res.getString("name");
						String surname = res.getString("surname");
						String codice_fiscale = res.getString("codiceFiscale");
						LocalDate birthDate = res.getDate("brthDate").toLocalDate();
						String birthPlace = res.getString("brthPlace");
						String gender = res.getString("gender");
						String address = res.getString("address");

						Student a1 = new Student(name, surname, codice_fiscale, birthDate, birthPlace, gender, address);
						ArrayList<Student> allStudents = new ArrayList<Student>();
						allStudents.add(a1);
						school.setstudenstList(allStudents);
						System.out.println(school.getAllStudents());
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			school_db.Disconnect();

			System.out.println();
			// boolean insertResult = scuola_db.writeInDB("INSERT INTO ");

		}
	}

	public static void insertStudentToDb(School school, Student student) {
		ManageDb school_db = new ManageDb();
		boolean scuoladbConnection = school_db.connectToDB("localhost", "3306", "school_db", "agata_school", "agata");
		boolean res;

		if (scuoladbConnection == true) {
			res = school_db.writeInDB(
					"INSERT INTO student(CodiceFiscale, Name, Surname, BrthDate, BrthPlace, Address, gender) " +
							"VALUES ('" + student.getCodiceFiscale() + "', '" + student.getName() + "', '" + student.getSurname() + "', '" + 
							student.getBirthDate() + "', '" + student.getBirthPlace() + "', '" + student.getAddress() + "', '" + 
							student.getGender() + "');");

			System.out.println("You insertet student: "+res);
			school_db.Disconnect();
		}
	}
}
