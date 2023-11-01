package Aufgaben;

public class Person {
  private String nachname;
  private String vorname;

  public Person() {
    super();
    this.nachname = "-----";
    this.vorname = "-----";
  }

  public Person(String nachname, String vorname) {
    super();
    this.nachname = nachname;
    this.vorname = vorname;
  }

  public String getNachname() {
    return this.nachname;
  }

  public String getVorname() {
    return this.vorname;
  }
}
