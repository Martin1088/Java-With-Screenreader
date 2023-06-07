public class Mitarbeiter {
  private int personalNr;
  private String name;
  private String vorname;
  private double gehalt;
  private static int anzahlMitarbeiter = 0;
  // Constructor

  public Mitarbeiter(int personalNr, String name) {
    this.personalNr = personalNr;
    this.name = name;
    this.anzahlMitarbeiter = anzahlMitarbeiter++;
  }

  public Mitarbeiter(int personalNr, String name, String vorname, double gehalt) {
    this.personalNr = personalNr;
    this.name = name;
    this.vorname = vorname;
    this.anzahlMitarbeiter = anzahlMitarbeiter++;
    if (this.gehalt > 9000 ) {
      this.gehalt=9000;
    } else if (this.gehalt < 1000) {
      this.gehalt=1000;
    }else {
      this.gehalt = gehalt;
    }

  }

  public static int getAnzahlMitarbeiter() {
    return anzahlMitarbeiter;
  }

  public int getPersonalNr() {
    return personalNr;
  }

  public String getName() {
    return name;
  }

  public String getVorname() {
    return vorname;
  }

  public void setVorname(String vorname) {
    this.vorname = vorname;
  }

  public double getGehalt() {
    // test
    return gehalt;
  }

  public void setGehalt(double g) {
    if (this.gehalt > 9000 ) {
      this.gehalt=9000;
    } else if (this.gehalt < 1000) {
      this.gehalt=1000;
    }else {
      this.gehalt = g;
    }
  }
  // funktion Gehalt mit bedingungen
  public void  erhoeheGehalt(double prozent) {
    double result;
    if (prozent > 10) {
      prozent = 10;
    } else  if (prozent < -2) {
      prozent= -2;
    }
    result = getGehalt()+  ((getGehalt() / 100) * prozent);
    setGehalt(result);
    System.out.println("Gealt wurde erhöt:  " + result);
  }
  //drucken der Eintrage
  public void druckinfo() {
    //
    System.out.println("PersonalNr: " + getPersonalNr());
    System.out.println("Name: " + getName());
    System.out.println("Vorname: " + getVorname());
    System.out.println("Gehalt: " + getGehalt());
  }
  // Daten prüfung auf Null
  public boolean datenVollstaendig() {
    boolean result = false;
    result = ((getPersonalNr() != 0) ||(getName() != null) || (getVorname() != null) || (getGehalt() != 0));
    //result = ();
    return result;
  }
}
