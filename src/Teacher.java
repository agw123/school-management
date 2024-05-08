import java.time.LocalDateTime;
import java.util.HashMap;

public class Teacher extends Person {
	
	private HashMap<LocalDateTime, String> teachingCalendar;

	public Teacher() {
		super();
	}

	public Teacher(String name, String surname, String codiceFiscale) {
		super(name, surname, codiceFiscale);
	}

	public Teacher(String name, String surname, String codiceFiscale, HashMap<LocalDateTime, String> teachingCalendar) {
		super(name, surname, codiceFiscale);
		this.teachingCalendar = new HashMap<>();
		this.teachingCalendar = teachingCalendar;
	}

	public HashMap<LocalDateTime, String> getTeachingCalendar() {
		return teachingCalendar;
	}

	public void setTeachingCalendar(HashMap<LocalDateTime, String> teachingCalendar) {
		this.teachingCalendar = teachingCalendar;
	}
	
	

}
