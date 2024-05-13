import java.time.LocalDateTime;
import java.util.HashMap;

public class Teacher extends Person {
	
	private HashMap<LocalDateTime, String> teachingCalendar;
	private String email;
	
	public Teacher(String name, String surname, String codiceFiscale, HashMap<LocalDateTime, String> teachingCalendar,
			String email) {
		super(name, surname, codiceFiscale);
		this.teachingCalendar = teachingCalendar;
		this.email = email;
	}
}
