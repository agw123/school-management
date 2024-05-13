import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Student extends Person {

	private String address;
	
	

	public Student() {}

	public Student(String name, String surname, String codiceFiscale, LocalDate birthDate, String birthPlace,
			String gender, String address) {
		super(name, surname, codiceFiscale, birthDate, birthPlace, gender);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + ", name=" + name + ", surname=" + surname + ", codiceFiscale="
				+ codiceFiscale + ", birthDate=" + birthDate + ", birthPlace=" + birthPlace + ", gender=" + gender
				+ ", active=" + active + "]";
	}

}