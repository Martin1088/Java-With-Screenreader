public class Wuefel {
private String  standartFarbe;
private int yPos;
  private int xPos;
  private  int breite;
  private int hoehe ;
  private  String farbe;
  private  int wert;
  private boolean gueltig;
  // Constructor

  public Wuefel() {
  }

  public Wuefel(int yPos, int xPos, int breite, int hoehe) {
    this.yPos = yPos;
    this.xPos = xPos;
    this.breite = breite;
    this.hoehe = hoehe;
  }

  public Wuefel(int yPos, int xPos, int breite, int hoehe, String farbe) {
    this.yPos = yPos;
    this.xPos = xPos;
    this.breite = breite;
    this.hoehe = hoehe;
    this.farbe = farbe;
  }

  public void setStandartFarbe(String Color) {
    this.standartFarbe = Color;
  }
  // get und set noch ergänzen


}
