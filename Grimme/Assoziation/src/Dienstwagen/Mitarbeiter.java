package Dienstwagen;

public class Mitarbeiter {
  private String name;
  private Auto seinAuto;
  public void hatAuto(Auto auto) {
  seinAuto = auto;
}
  public Mitarbeiter(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
