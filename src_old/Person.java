import java.time.LocalDate;

public abstract class Person extends CodiceFiscaleCalculator{
	protected String name;
	protected String surname;
	protected String codiceFiscale;
	protected LocalDate birthDate;
	protected String birthPlace;
	protected String gender;
	protected String address;
	protected int phoneNumber;
	
	
	public Person(String name, String surname, String codiceFiscale) {
		super();
		this.name = name;
		this.surname = surname;
		this.codiceFiscale = codiceFiscale;
	}
	
	public Person(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
		this.codiceFiscale = CodiceFiscaleCalculator.calcolaCF(name, surname, birthDate, birthPlace, gender);
	}
	
	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public Person() {}
}
