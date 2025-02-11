package de.gruppe1.calculation;

/**
 * Klasse f�r die Formelberechnung
 * 
 * @author koma1114
 *
 */
public class Formeln {

	private double leistungsaufnahme = 0;
	private double leistungsabgabe = 0;
	private double verlustleistung = 0;
	private double wirkungsgrad = 0;
	private double uebersetzungGetriebe = 0;

	// Leistungsaufnahme in WATT berechnen
	public double berechneLeistungsaufnahme(double spannung, double strom) {
		// Pzu = U * I
		leistungsaufnahme = Math.sqrt(3) * spannung * strom * 0.66 / 1000;
		return leistungsaufnahme;
	}

	// Leistungsabgabe
	public double berechneLeistungsabgabe(double drehmoment, double drehzahl, double uebersetzungGetriebe) {
		// Pab = M*n / 9550
		leistungsabgabe = drehmoment * drehzahl / (uebersetzungGetriebe * 9550);
		return leistungsabgabe;
	}

	// Verlustleistung
	public double berechneVerlustleistung() {
		// Pzu - Pab
		verlustleistung = leistungsaufnahme - leistungsabgabe;
		return verlustleistung;
	}

	// Wirkungsgrad in Prozent
	public double berechneWirkungsgradInProzent() {
		// Pab/Pzu
		wirkungsgrad = leistungsabgabe / leistungsaufnahme * 100;
		return wirkungsgrad;
	}

	// Berechne Simulations Eingabe
	public String berechneStromNeu(double drehmoment, double spannung, double cos) {

		double drehzahl = ((drehmoment / -0.0455) + (68.9275 / 0.0455));
		double leistungAb = (drehzahl * drehmoment) / (9550 * 3.37);
		double leistungszugabeNeu = leistungAb / (wirkungsgrad / 100);
		double strom = (leistungszugabeNeu / (spannung * cos * Math.sqrt(3))) * 1000;

		return String.valueOf(strom);
	}

	public String berechneDrehzahlNeu(double drehmoment, double spannung, double cos) {

		double drehzahl = ((drehmoment / -0.0455) + (68.9275 / 0.0455));

		return String.valueOf(drehzahl);
	}

	/**************************************************************
	 * Getter & Setter
	 **************************************************************/

	public double getLeistungsaufnahme() {
		return leistungsaufnahme;
	}

	public void setLeistungsaufnahme(double leistungsaufnahme) {
		this.leistungsaufnahme = leistungsaufnahme;
	}

	public double getLeistungsabgabe() {
		return leistungsabgabe;
	}

	public void setLeistungsabgabe(double leistungsabgabe) {
		this.leistungsabgabe = leistungsabgabe;
	}

	public double getVerlustleistung() {
		return verlustleistung;
	}

	public void setVerlustleistung(double verlustleistung) {
		this.verlustleistung = verlustleistung;
	}

	public double getWirkungsgrad() {
		return wirkungsgrad;
	}

	public void setWirkungsgrad(double wirkungsgrad) {
		this.wirkungsgrad = wirkungsgrad;
	}

	public double getUebersetzungGetriebe() {
		return uebersetzungGetriebe;
	}

	public void setUebersetzungGetriebe(double uebersetzungGetriebe) {
		this.uebersetzungGetriebe = uebersetzungGetriebe;
	}

}
