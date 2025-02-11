package Verwaltung;

public class Erzeiherin extends Person {
    public int anzahlBerufsjahre;
    public void setAnzahlBerufsjahre(int anzahlBerufsjahre) {
        this.anzahlBerufsjahre = anzahlBerufsjahre;
    }
    public int getAnzahlBerufsjahre() {
        return anzahlBerufsjahre;
    }

    @Override
    public boolean istGut(double noteVorschultest) {
        if (noteVorschultest > 2.5 ) {
            return  true;
        } else  {
            return  false;
        }
    }
}
