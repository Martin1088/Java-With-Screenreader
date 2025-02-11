package WerkzeugMitarbeiter;

public class Werkzeuge {
  private String Bezeichnung;

  public Werkzeuge(String bezeichnung) {
    Bezeichnung = bezeichnung;
  }

  public String getBezeichnung() {
    return Bezeichnung;
  }

  public void setBezeichnung(String bezeichnung) {
    Bezeichnung = bezeichnung;
  }
}
