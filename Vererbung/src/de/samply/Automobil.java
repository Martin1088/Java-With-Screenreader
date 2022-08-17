package de.samply;

public abstract class Automobil implements Fahrzeug {
  protected int anzahlSitze;
  protected String kennzeichen;
  protected int anzahlRaeder;

  public int getAnzahlRaeder() {
    return anzahlRaeder;
  }
  public void setAnzahlRaeder(int anzahlRaeder) {
    this.anzahlRaeder = anzahlRaeder;
  }

  
}
