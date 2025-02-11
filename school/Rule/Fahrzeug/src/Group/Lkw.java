package Group;

class Lkw extends Fahrzeug {
  private Integer maxZuladung;

  public Lkw(Int kategorie, String modell, Int erzulassungsJahr, Int kmStand,
      Integer maxZuladung) {
    super(kategorie, modell, erzulassungsJahr, kmStand);
    this.maxZuladung = maxZuladung;
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
  };
}
