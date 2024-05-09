import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Student extends Person {

	private int iClass;
	private char section;
	private ArrayList<Exam> exams;
	
	public Student(){};

	public Student(String name, String surname, String codiceFiscale) {
		super(name, surname, codiceFiscale);
	}

	public Student(String name, String surname, String codiceFiscale, int iClass, char section, ArrayList<Exam> exams) {
		super(name, surname, codiceFiscale);
		this.iClass = iClass;
		this.section = section;
		this.exams = exams;
	}

	public int getiClass() {
		return iClass;
	}

	public void setiClass(int iClass) {
		this.iClass = iClass;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

	public double getAvaregeVote() {
		double sum = 0;
		for (Exam e : exams) {
			sum += e.getVote();
		}
		return sum/exams.size();
	}

	public double getSubjectAvaregeVote(String subject) {
		double sum = 0;
		int iNumVotes = 0;
		for (Exam e : exams) {
			if (e.getSubject().equals(subject)) {
				sum+=e.getVote();
				iNumVotes++;
			}
		}
		if (iNumVotes==0) {
			return -1;
		}
		return sum/iNumVotes;
	}
	
	@Override
	public String toString() {
		return "Student [iClass=" + iClass + ", section=" + section + ", exams=" + exams
				+ "]";
	}
	
	
}
