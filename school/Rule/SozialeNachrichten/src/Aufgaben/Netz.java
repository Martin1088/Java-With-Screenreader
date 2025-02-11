package Aufgaben;

import Aufgaben.*;

/**
 * Netz
 */
public class Netz {
  public static void main(String[] args) {
    SozialesNetzwerk hss = new SozialesNetzwerk();
    Person p1 = new Person("Horst", "Schlemmer");
    Person p2 = new Person("Horst", "Schmitt");
    Nachricht n1 = new Textnachricht("Hallo", p1);
    Nachricht n2 = new Textnachricht("Danke", p2);
    hss.hinzufuegenNachricht(n1);
    hss.hinzufuegenNachricht(n2);

    n2.hinzufuegenLikes();
    n2.hinzufuegenLikes();
    System.out.println(hss.getAllNachrichten());

  }

}
