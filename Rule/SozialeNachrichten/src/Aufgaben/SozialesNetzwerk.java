package Aufgaben;

import java.util.ArrayList;

import Aufgaben.*;

/**
 * SozialesNetzwerk
 */
public class SozialesNetzwerk {
  private ArrayList<Person> mitgliederliste = new ArrayList<Person>();
  private ArrayList<Nachricht> nachrichtliste = new ArrayList<Nachricht>();

  public void hinzufuegenNachricht(Nachricht nachricht) {
    nachrichtliste.add(nachricht);
  }

  public void hinzufuegenPerson(Person person) {
    mitgliederliste.add(person);
  }

  public String getAllNachrichten() {
    String result = "";
    for (Nachricht n : nachrichtliste) {
      result += n.getNachricht() + "\n";
    }
    return result;
  }

}
