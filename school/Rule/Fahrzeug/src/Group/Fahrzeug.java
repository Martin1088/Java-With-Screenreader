package Group;

import java.util.ArrayList;
import java.util.List;

abstract class Fahrzeug {
  protected Int kategorie;
  protected String modell;
  protected Int erzulassungsJahr;
  protected Int kmStand;
  public List<Buchung> buchungen = new List<Buchung>();

  // Konstruktor
  public Fahrzeug(Int kategorie, String modell, Int erzulassungsJahr,
      Int kmStand) {
    this.kategorie = kategorie;
    this.modell = modell;
    this.erzulassungsJahr = erzulassungsJahr;
    this.kmStand = kmStand;
    this.buchungen = new ArrayList<>();
  }

  // Funktion mieten
  public abstract bool mieten(String ausleihDatum, String uhrzeit,
      String fahrer, Int KmStand);

  public void addBuchung(Buchung buchung) {
    buchungen.add(buchung);
  }
}
