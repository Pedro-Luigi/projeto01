package Classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	private static final SimpleDateFormat sdf= new SimpleDateFormat ("dd/MM/yyyy");

	String name;
	String email;
	Date birthDate;
	
	public Client() {
	}

	public Client(String nome, String email, Date birthDate) {
		this.name = nome;
		this.email = email;
		this.birthDate = birthDate;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return name+ "(" + sdf.format(birthDate) + ") -" + email;
	}
	
	
	
}
