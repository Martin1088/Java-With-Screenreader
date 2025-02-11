package WerkzeugMitarbeiter;

import java.util.ArrayList;

public class Mitarbeiter {
  private String name;
  private ArrayList<Werkzeuge> seinWerkzeug = new ArrayList<Werkzeuge>();

  public Mitarbeiter(String name, ArrayList<Werkzeuge> seinWerkzeug) {
    this.name = name;
    this.seinWerkzeug = seinWerkzeug;
  }

  public Mitarbeiter(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public ArrayList<Werkzeuge> getSeinWerkzeug() {
    return seinWerkzeug;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSeinWerkzeug(ArrayList<Werkzeuge> seinWerkzeug) {
    this.seinWerkzeug = seinWerkzeug;
  }
}
