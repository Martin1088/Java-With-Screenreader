package MitarbeiterNotebook2;

public class Tasche {
  private double groesse;
  private  Notebook seinNotbook;
  public void hatNotebook(Notebook notebook) {
    if (seinNotbook != null) {
      seinNotbook = notebook;
    }
  }

  public Tasche(double groesse) {
    this.groesse = groesse;
  }

  public double getGroesse() {
    return groesse;
  }

  public void setGroesse(double groesse) {
    this.groesse = groesse;
  }

}
