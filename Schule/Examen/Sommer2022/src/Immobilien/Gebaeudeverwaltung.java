package Immobilien;

import java.util.List;

public class Gebaeudeverwaltung {
    private String name;
    private List<Wohngebaeude> wohngebaeudeList;

    public Gebaeudeverwaltung(String name) {
        this.name = name;
    }

    public void AddGebaeude(Wohngebaeude gebaeude) {
        wohngebaeudeList.add(gebaeude);
    }
    public void AusgabeMietGHebaeudedaten() {
        for (Wohngebaeude wohngebaeude: wohngebaeudeList) {
            System.out.println(
                    wohngebaeude.GetGebaudedaten()
            );
        }
    }

    public double BerechneGesamteMiete() {
        double total = 0;
        for (Wohngebaeude wohngebaeude: wohngebaeudeList) {
            total = total + wohngebaeude.BerchneMietpreis();
        }
        return total;
    }
}
