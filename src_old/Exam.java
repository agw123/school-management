import java.time.LocalDate;

public class Exam {
	
	private LocalDate date;
	private String subject;
	private Student student;
	private Teacher teacher;
	private int vote;	
	
	public Exam(LocalDate date, String subject, Student student, Teacher teacher, int vote) {
		super();
		this.date = date;
		this.subject = subject;
		this.student = student;
		this.teacher = teacher;
		this.vote = vote;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getVote() {
		return vote;
	}
	public void setVote(int vote) {
		this.vote = vote;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
}
