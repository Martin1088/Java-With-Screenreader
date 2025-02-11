package Aufgaben;

public abstract class Nachricht {
  protected Integer likes;
  Person absender;

  public Nachricht() {
    super();
    this.likes = 0;
    this.absender = null;
  }

  public Nachricht(Person absender) {
    super();
    this.likes = 0;
    this.absender = absender;
  }

  public void hinzufuegenLikes() {
    likes++;
  }

  // siehe Unterkalssen Text und BildNachricht
  public abstract String getNachricht();
}
