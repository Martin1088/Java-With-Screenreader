package Pruefung_SO19;

public abstract class Nachricht {

	protected int likes;
	protected Person absender; //Assoziation gem. Klassendiagramm

	public Nachricht() {
		super();
		likes = 0;
		absender = null;
	}
	
	public Nachricht(Person absender) {
		super();
		likes = 0;
		this.absender = absender; 
	}

	
	
	public void hinzufuegenLike() {
		likes++;
	}

	//Abstrakte Methode,diese muss in den Unterklassen ausprogrammiert werden
	public abstract String getNachricht();
		
	
}
