package JavaHelper;

public class Mitarbeiter {
private String name;
private Raum zutrittRaum;

  public Mitarbeiter(String name) {
    this.name = name;
  }
  public void hatZutrittZu(Raum raum) {
    zutrittRaum = raum;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
