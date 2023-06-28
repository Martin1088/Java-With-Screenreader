package de.gruppe1.objects;

/**
 * Motorobjekt
 * 
 * @author koma1114
 *
 */
public class SewMotor {

	// Abkürzung n
	private double drehzahl;
	// Abkürzung M
	private double drehmoment;
	// Abkürzung U
	private double spannung;
	// Abkürzung I
	private double strom;
	// Abkürzung cos
	private double cos;
	// Abkürzung i
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
//	 Ist notwendig für die Kennlinie (Graphen) wird aber für diese Aufgabe nicht benötigt
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
