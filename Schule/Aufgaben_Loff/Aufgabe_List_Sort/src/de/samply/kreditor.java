package de.samply;

public class kreditor {
    public String LiefNr;
    public String Firma;
    public String strasse;
    public String PLZ;
    public String Ort;
    public double Umsatz;

    public kreditor(String LiefNr, String Firma, String strasse, String PLZ, String Ort, double Umsatz) {
        this.LiefNr = LiefNr;
        this.Firma = Firma;
        this.strasse = strasse;
        this.PLZ = PLZ;
        this.Ort = Ort;
        this.Umsatz = Umsatz;
    }

}
