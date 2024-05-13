import java.util.ArrayList;

public class School {

	private String name;
	private ArrayList<Clerk> clerksList;
	private ArrayList<Teacher> teachersList;
	private ArrayList<Student> studenstList;
	
	public School(String name, ArrayList<Clerk> clerksList, ArrayList<Teacher> teachersList,
			ArrayList<Student> studenstList) {
		super();
		this.name = name;
		this.clerksList = clerksList;
		this.teachersList = teachersList;
		this.studenstList = studenstList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Clerk> getClerksList() {
		return clerksList;
	}

	public void setClerksList(ArrayList<Clerk> clerksList) {
		this.clerksList = clerksList;
	}

	public ArrayList<Teacher> getTeachersList() {
		return teachersList;
	}

	public void setTeachersList(ArrayList<Teacher> teachersList) {
		this.teachersList = teachersList;
	}

	public ArrayList<Student> getstudenstList() {
		return studenstList;
	}

	public void setstudenstList(ArrayList<Student> studenstList) {
		this.studenstList = studenstList;
	}
	
	public void addStudent(Student s) {
		studenstList.add(s);
		
		//collegati al db
		
		//invia la query di insert al database
		
		//Chiudi la connesiione
		
		//StampaFileStuends()
		
	}
	
	
	// qui i vincoli per ogni metodo, esempio numero massimo di allievo nell'addStudent 
	// bisogna implementare se il numero di max di allievi non superato
	// i vincoli della scuola, dettate dall'esperto della scuola
	// gestioneScuola = main
	// ConsoleInterface.java dammiInt dammiString - libreria che gestisce la console invece di scanner
	// manageMenu domande?
}
