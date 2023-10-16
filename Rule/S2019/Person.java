package Pruefung_SO19;

public class Person {

	private String nachname;
	private String vorname;
	

	public Person(String nachname, String vorname) {
		super(); 
		this.nachname = nachname;
		this.vorname = vorname;
	}
	
	public Person() {
		super();
		vorname = "------";
		nachname = "------";
	}

	public String getNachname() {
		return nachname;
	}
	
	public String getVorname() {
		return vorname;
	}
	
	
}



