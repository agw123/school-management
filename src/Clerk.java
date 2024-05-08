
public class Clerk extends Person {
	
	private String workingHrs;
	private String office;

	public Clerk(String name, String surname, String codiceFiscale) {
		super(name, surname, codiceFiscale);
	}

	public Clerk(String name, String surname, String codiceFiscale, String workingHrs, String office) {
		super(name, surname, codiceFiscale);
		this.workingHrs = workingHrs;
		this.office = office;
	}

	public String getWorkingHrs() {
		return workingHrs;
	}

	public void setWorkingHrs(String workingHrs) {
		this.workingHrs = workingHrs;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}
	
	

}
