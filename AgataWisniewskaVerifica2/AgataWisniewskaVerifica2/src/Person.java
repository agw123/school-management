import java.time.LocalDate;

import Utility.CodiceFiscaleCalculator;

public abstract class Person extends CodiceFiscaleCalculator {
	protected String name;
	protected String surname;
	protected String codiceFiscale;
	protected LocalDate birthDate;
	protected String birthPlace;
	protected String gender;
	// protected String address;
	// protected int phoneNumber;
	protected boolean active = true;

	public Person() {
	};

	public Person(String name, String surname, String codiceFiscale, LocalDate birthDate, String birthPlace,
			String gender) {
		this.name = name;
		this.surname = surname;
		this.codiceFiscale = codiceFiscale;
		this.birthDate = birthDate;
		this.birthPlace = birthPlace;
		this.gender = gender;
	}

	public Person(String name, String surname, LocalDate birthDate, String birthPlace, String gender) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.birthPlace = birthPlace;
		this.gender = gender;
		this.codiceFiscale = CodiceFiscaleCalculator.calcolaCF(name, surname, birthDate, birthPlace, gender);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
