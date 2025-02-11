package Group;

class Pkw extends Fahrzeug {
  private String farbe;

  public Pkw(Int kategorie, String modell, Int erzulassungsJahr, Int kmStand,
      String farbe) {
    super(kategorie, modell, erzulassungsJahr, kmStand);
    this.farbe = farbe;
  }

  @Override
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
