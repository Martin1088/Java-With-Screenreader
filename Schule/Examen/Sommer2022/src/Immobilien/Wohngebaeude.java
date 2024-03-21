package Immobilien;

import java.util.Date;

abstract class Wohngebaeude {
    private Date baujahr;
    private Adresse adresse;

    public Wohngebaeude(Date baujahr, Adresse adresse) {
        this.baujahr = baujahr;
        this.adresse = adresse;
    }

    public String GetGebaudedaten() {
        return this.adresse.GetAdressdaten() + ", Baujahr: " + baujahr.toString();
    }

    public abstract double BerchneMietpreis();


}
