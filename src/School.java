import java.util.ArrayList;

import javax.swing.Renderer;

import Librariers.ManageDb;

public class School {

	private String name;
	private ArrayList<Clerk> clerksList;
	private ArrayList<Teacher> teachersList;
	private ArrayList<Student> studenstList;
	private ArrayList<Exam> examsList;
	private ArrayList<GradeClass> classesList;

	public School(String name, ArrayList<Clerk> clerksList, ArrayList<Teacher> teachersList,
			ArrayList<Student> studenstList) {
		this.name = name;
		this.clerksList = clerksList;
		this.teachersList = teachersList;
		this.studenstList = studenstList;
	}

	public School(String name) {
		this.name = name;
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

	public void setstudenstList(ArrayList<Student> studenstList) {
		this.studenstList = studenstList;
	}

	public ArrayList<Student> addStudent(Student s) {

		//studenstList.add(s);
		for (Student student : studenstList) {
			if (!student.getCodiceFiscale().equals(s.getCodiceFiscale())) {
				studenstList.add(student);
			} else {
				System.out.println("Student with codcie fiscale"+ s.getCodiceFiscale() + "already present in DB");
			}
		}
		// collegati al db

		// invia la query di insert al database

		// Chiudi la connesiione

		// StampaFileStuends()
		return studenstList;
	}

	public void updateStudent(Student s) {

	}

	public void viewStudent(Student s) {

	}

	public ArrayList<Student> getAllStudents() {
		return studenstList;
	}

	public double getAvaregeVote(Student student) {
		ArrayList<Exam> exams = null;
		double sum = 0;
		for (Exam e : exams) {
			sum += e.getVote();
		}
		return sum / exams.size();
	}

	public double getSubjectAvaregeVote(String subject) {
		ArrayList<Exam> exams = null;
		double sum = 0;
		int iNumVotes = 0;
		for (Exam e : exams) {
			if (e.getSubject().equals(subject)) {
				sum += e.getVote();
				iNumVotes++;
			}
		}
		if (iNumVotes == 0) {
			return -1;
		}
		return sum / iNumVotes;
	}

	// qui i vincoli per ogni metodo, esempio numero massimo di allievo
	// nell'addStudent
	// bisogna implementare se il numero di max di allievi non superato
	// i vincoli della scuola, dettate dall'esperto della scuola
	// gestioneScuola = main
	// ConsoleInterface.java dammiInt dammiString - libreria che gestisce la console
	// invece di scanner
	// manageMenu domande?
}
