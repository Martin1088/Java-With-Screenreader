package de.samply;

public class Flugzeug implements Fahrzeug {
  protected int anzahlSitze;
  protected String kennzeichen;

  @Override
  public void setAnzahlSitze(int AnzahlSitze) {
    this.anzahlSitze = anzahlSitze;
  }

  @Override
  public int getAnzahlSitze() {
    return anzahlSitze;
  }

  @Override
  public void setKennzeichen(String kennzeichen) {
    this.kennzeichen = kennzeichen;
  }

  @Override
  public String getKennzeichen() {
    return kennzeichen;
  }
}
