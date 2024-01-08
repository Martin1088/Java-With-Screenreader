PKW Aufgabe (2):
class PKW{
privat Int kategorie;
	private String modell;
	private String farbe;
	private Int erzulassungsJahr;
	private Int kmStand;
	private ArrayList<Buchung> buchungen = new ArrayList<Buchung>();

//Konstruktor
public PKW(
	Int kategorie,
String modell,
	String farbe,
	Int erzulassungsJahr,
	Int kmStand
) {
	this.kategorie = kategorie;
this.modell = modell;
	this.farbe = farbe;
	this.erzulassungsJahr = erzulassungsJahr;
	this.kmStand = kmStand;
} 
// Funktion mieten
public bool mieten(
	  String ausleihDatum,
 	String uhrzeit,
  	String fahrer,
Int KmStand,
) {
Buchung buchung = new Buchungen(
	 String ausleihDatum,
 	String uhrzeit,
  	String fahrer,
) {
	for (Buchung b : buchen) {
	if (b.uhrzeit.equals(uhrzeit) || b.ausleihDatum.equals(ausleihDatum))  {
return false;
}
}
return true;
}

}
}
