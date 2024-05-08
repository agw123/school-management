import java.time.LocalDate;

public class Exam {
	
	private LocalDate date;
	private String subject;
	private int vote;
	
	public Exam(LocalDate date, String subject, int vote) {
		super();
		this.date = date;
		this.subject = subject;
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
}
