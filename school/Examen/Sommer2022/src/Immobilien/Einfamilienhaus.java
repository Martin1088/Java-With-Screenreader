package Immobilien;

import java.util.Date;

public class Einfamilienhaus extends Wohngebaeude{
    private Wohneinheit wohneinheit;

    public Einfamilienhaus(Date baujahr, Adresse adresse, Wohneinheit wohneinheit) {
        super(baujahr, adresse);
        this.wohneinheit = wohneinheit;
    }

    @Override
    public double BerchneMietpreis() {
        return wohneinheit.MietpreisWohneinheit();
    }
}
