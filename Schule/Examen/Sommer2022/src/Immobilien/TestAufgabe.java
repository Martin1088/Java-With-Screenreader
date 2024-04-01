package Immobilien;

import java.text.SimpleDateFormat;

public class TestAufgabe {
    public static void main(String[] args) {
        String baujahr1 = "01.01.1995";
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd.MM.yyyy");
        Adresse adresse1 = new Adresse(
                "7j0178",
                "Stuttgart",
                "Sindelfingerstr. 87"
        );
        Wohneinheit wohneinheit1 = new Wohneinheit(3, 9.50, 80 );
        Wohneinheit wohneinheit2 = new Wohneinheit(4, 10.50 , 120);
        Mehrfamilienhaus mehrfamilienhaus1 = new Mehrfamilienhaus(
                dateFormat1.parse(baujahr1),
                adresse1
        );
        for (int i = 0; i < 4; i++) {
            mehrfamilienhaus1.AddWohneinheiten(i, wohneinheit1);
            mehrfamilienhaus1.AddWohneinheiten(i, wohneinheit2);
        }

        // Einfamilienhaus
        String baujahr2 = "01.01.2024";
        Adresse adresse2 = new Adresse(
                "71106",
                "Leaonberg",
                "Stutgartterstr. 87"
        );
        Wohneinheit wohneinheit3 = new Wohneinheit(5, 11.50, 140);
        Einfamilienhaus einfamilienhaus1 = new Einfamilienhaus(
                dateFormat1.parse(baujahr2),
                adresse2,
                wohneinheit3
        );

        // Gebüudeverwaltung
        Gebaeudeverwaltung gebaeudeverwaltung1 = new Gebaeudeverwaltung("RentYourHome");
        gebaeudeverwaltung1.AddGebaeude(mehrfamilienhaus1);
        gebaeudeverwaltung1.AddGebaeude(einfamilienhaus1);
        System.out.println("Gebaeudeverwaltung RentYourHome: ");
        gebaeudeverwaltung1.AusgabeMietGHebaeudedaten();
        System.out.println("Miete: " + gebaeudeverwaltung1.BerechneGesamteMiete());
        



    }
}
