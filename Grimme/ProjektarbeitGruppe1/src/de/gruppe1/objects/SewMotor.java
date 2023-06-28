package de.gruppe1.objects;

/**
 * Motorobjekt
 * 
 * @author koma1114
 *
 */
public class SewMotor {

	// Abk�rzung n
	private double drehzahl;
	// Abk�rzung M
	private double drehmoment;
	// Abk�rzung U
	private double spannung;
	// Abk�rzung I
	private double strom;
	// Abk�rzung cos
	private double cos;
	// Abk�rzung i
	private double uebersetzungDesGetriebes;

	/**
	 * Standardkonstruktor
	 */
	public SewMotor() {

	}

	/**
	 * Konstruktor mit allen Feldern
	 */
	public SewMotor(double drehzahl, double drehmoment, double spannung, double strom, double cos,
			double uebersetzungDesGetriebes) {
		super();
		this.drehzahl = drehzahl;
		this.drehmoment = drehmoment;
		this.spannung = spannung;
		this.strom = strom;
		this.cos = cos;
		this.uebersetzungDesGetriebes = uebersetzungDesGetriebes;
	}

	/**
	 * Konstruktor mit Steigung und Verschiebung
	 */
//	public SewMotor(double m, double b) {
//	 Ist notwendig f�r die Kennlinie (Graphen) wird aber f�r diese Aufgabe nicht ben�tigt
//	}

	// Getters & Setters
	public double getDrehzahl() {
		return drehzahl;
	}

	public void setDrehzahl(double drehzahl) {
		this.drehzahl = drehzahl;
	}

	public double getSpannung() {
		return spannung;
	}

	public void setSpannung(double spannung) {
		this.spannung = spannung;
	}

	public double getStrom() {
		return strom;
	}

	public void setStrom(double strom) {
		this.strom = strom;
	}

	public double getCos() {
		return cos;
	}

	public void setCos(double cos) {
		this.cos = cos;
	}

	public double getUebersetzungDesGetriebes() {
		return uebersetzungDesGetriebes;
	}

	public void setUebersetzungDesGetriebes(double uebersetzungDesGetriebes) {
		this.uebersetzungDesGetriebes = uebersetzungDesGetriebes;
	}

	public double getDrehmoment() {
		return drehmoment;
	}

	public void setDrehmoment(double drehmoment) {
		this.drehmoment = drehmoment;
	}

}
