import java.time.LocalDate;

public class Clerk extends Person {
	
	private String office;
	private String email;
	
	public Clerk(String name, String surname, LocalDate birthDate, String birthPlace,
			String gender, String office, String email) {
		super(name, surname, birthDate, birthPlace, gender);
		this.office = office;
		this.email = email;
	}


	public Clerk(String name, String surname, String codiceFiscale, LocalDate birthDate, String birthPlace,
			String gender, String office, String email) {
		super(name, surname, codiceFiscale, birthDate, birthPlace, gender);
		this.office = office;
		this.email = email;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	@Override
	public String toString() {
		return "Clerk [office=" + office + ", name=" + name + ", surname=" + surname + ", codiceFiscale="
				+ codiceFiscale + ", birthDate=" + birthDate + ", birthPlace=" + birthPlace + ", gender=" + gender
				+ "]";
	}
}
