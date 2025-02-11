package Aufgaben;

import Aufgaben.*;

public class Textnachricht extends Nachricht {
  protected String nachricht;

  public Textnachricht() {
    super();
    this.nachricht = "-----";
  }

  public Textnachricht(String nachricht, Person absender) {
    super(absender);
    this.nachricht = nachricht;
  }

  @Override
  public String getNachricht() {
    return absender.getNachname() + ", " + nachricht + ", " + likes;
  }
}
