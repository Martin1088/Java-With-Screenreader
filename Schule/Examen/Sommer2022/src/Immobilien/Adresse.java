package Immobilien;
public class Adresse {
    private String plz;
    private  String ort;
    private  String strasse;

    public Adresse(String plz, String ort, String strasse) {
        this.plz = plz;
        this.ort = ort;
        this.strasse = strasse;
    }

    public static String GetAdressdaten() {
        String result = this.ort + " " + this.plz + " " + this.strasse;
        return result;
    }
}
