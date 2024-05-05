package Verwaltung;

public abstract class Person {
    String nachname;

    public String getNachname() {
        return nachname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public abstract boolean istGut() {}
}
