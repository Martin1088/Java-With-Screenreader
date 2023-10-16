package Pruefung_SO19;

public class Textnachricht extends Nachricht {

	private String nachricht;
	
	public Textnachricht() {
		super();
	}
	
	@Override
	public String getNachricht() {
		return absender.getNachname() + ", " + nachricht + ", " + likes;
	}

	public Textnachricht(String nachricht, Person absender) {
		super(absender);
		nachricht = nachricht;
	}
	public Textnachricht(String nachricht) {
		super();
		nachricht = "------";
	}

	
	
	
}
