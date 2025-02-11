package Immobilien;

import java.util.Date;
import java.util.List;

public class Mehrfamilienhaus extends Wohngebaeude{
    private int anzahlEtagen;
    private int anzahlWohneinheiten;
    private List<Wohneinheit> wohneinheitList;

    public Mehrfamilienhaus(Date baujahr, Adresse adresse, int anzahlEtagen) {
        super(baujahr, adresse);
        this.anzahlEtagen = anzahlEtagen;
    }

    public int getAnzahlWohneinheiten() {
        return anzahlWohneinheiten;
    }

    public int getAnzahlEtagen() {
        return anzahlEtagen;
    }
    public void AddWohneinheiten(int etage, Wohneinheit wohneinheit) {
        if (etage > 1 && etage < anzahlEtagen) {
            wohneinheitList.add(wohneinheit);
        }
    }

    @Override
    public double BerchneMietpreis() {
        double total = 0;
        for (Wohneinheit wohneinheit: wohneinheitList) {
            total = total + wohneinheit.MietpreisWohneinheit();
        }
        return total;
    }
}
