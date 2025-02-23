package model.benutzer.aussensicht;

public class BenutzerBean {
	
	private String vorname;
	private String nachname;
	private String username;
	private String password;
	private String passwordWiederholung;
	private String datum;
	private String benutzerTyp;
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordWiederholung() {
		return passwordWiederholung;
	}
	public void setPasswordWiederholung(String passwordWiederholung) {
		this.passwordWiederholung = passwordWiederholung;
	}
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public String getBenutzerTyp() {
		return benutzerTyp;
	}
	public void setBenutzerTyp(String benutzerTyp) {
		this.benutzerTyp = benutzerTyp;
	}
	
	
	
}
