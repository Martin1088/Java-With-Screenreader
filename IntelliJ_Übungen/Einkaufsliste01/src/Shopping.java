public class Shopping {
    String artikel;
    double nettobetrag;
    int mwst; // in Prozent
    int anzahl;
    // Konstruktor
    public Shopping(String artikel, double nettobetrag, int mwst, int anzahl) {
        this.artikel = artikel;
        this.nettobetrag = nettobetrag;
        this.mwst = mwst;
        this.anzahl = anzahl;
    }
    // getter Methode für den Artikel und den Nettobetrag, Merhwersteuer, Anzahl
    public String getArtikel() {
        return this.artikel;
    }
    public double getNettobetrag() {
        return this.nettobetrag;
    }
    public int getMwst() {
        return this.mwst;
    }

    public int getAnzahl() {
        return this.anzahl;
    }
}
