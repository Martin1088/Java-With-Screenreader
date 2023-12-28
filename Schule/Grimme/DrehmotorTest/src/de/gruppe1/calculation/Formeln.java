package de.gruppe1.calculation;

import de.gruppe1.objects.SewMotor;

/**
 * Klasse für die Formelberechnung
 * 
 * @author koma1114
 *
 */
public class Formeln {

	private double leistungsaufnahme = 0;
	private double leistungsabgabe = 0;
	private double verlustleistung = 0;
	private double wirkungsgrad = 0; // "0"-Checks einbauen

	// Leistungsaufnahme
	public double berechneLeistungsaufnahme(double spannung, double strom) {
		// Pzu = U * I
		leistungsaufnahme = spannung * strom;
		return leistungsaufnahme;
	}

	// Leistungsabgabe
	public double berechneLeistungsabgabe(double drehmoment, double drehzahl) {
		// Pab = M*n / 9550
		leistungsabgabe = drehmoment * drehzahl / 9550;
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

}
