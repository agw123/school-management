import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;

public class Teacher extends Person {
	
	private String email;
	
	public Teacher(String name, String surname, LocalDate birthDate, String birthPlace,
			String gender, String email) {
		super(name, surname, birthDate, birthPlace, gender);
		this.email = email;
	}

	public Teacher(String name, String surname, String codiceFiscale, LocalDate birthDate, String birthPlace,
			String gender, String email) {
		super(name, surname, codiceFiscale, birthDate, birthPlace, gender);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Teacher [email=" + email + ", name=" + name + ", surname=" + surname + ", codiceFiscale="
				+ codiceFiscale + ", birthDate=" + birthDate + ", birthPlace=" + birthPlace + ", gender=" + gender
				+ ", active=" + active + "]";
	}

	
}
