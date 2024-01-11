package Autovermietung;

import java.util.ArrayList;
import java.util.List;

public class Pkw {
  private Int kategorie;
  private String modell;
  private String farbe;
  private Int erzulassungsJahr;
  private Int kmStand;
  public List<Buchung> buchungen = new List<Buchung>();

  // Konstruktor
  public Pkw(Int kategorie, String modell, String farbe, Int erzulassungsJahr,
      Int kmStand) {
    super();
    this.kategorie = kategorie;
    this.modell = modell;
    this.farbe = farbe;
    this.erzulassungsJahr = erzulassungsJahr;
    this.kmStand = kmStand;
  }

  // Funktion mieten
  public bool mieten(String ausleihDatum, String uhrzeit, String fahrer,
      Int KmStand) {
    Buchung buchung = new Buchung(ausleihDatum, uhrzeit, fahrer);
    buchungen.add(buchung);
    for (Buchung b : buchungen) {
      if (b.getUhrzeit().equals(uhrzeit) ||
          b.getAusleihDatum().equals(ausleihDatum)) {
        return false;
      }
    }
    this.kmStand = kmStand;
    return true;
  }
}
