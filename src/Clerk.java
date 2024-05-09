
public class Clerk extends Person {
	
	private String office;

	public Clerk(String name, String surname, String codiceFiscale) {
		super(name, surname, codiceFiscale);
	}

	public Clerk(String name, String surname, String codiceFiscale, String office) {
		super(name, surname, codiceFiscale);
		this.office = office;
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
