package Anlage;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvAnfrage extends Anfrage{
    public CsvAnfrage(String pfad) {
        Scanner scanner = new Scanner(new File(pfad));
        String line = scanner.nextLine();
        String[] felder = line.split(";");
        this.anfrageNr = Integer.parseInt(felder[0]);
        this.pvLeitung = Double.parseDouble(felder[1]);
        this.speicherKapazitaet = Double.parseDouble(felder[2]);
        this.dachFlaechen = new ArrayList<>();
        for (int i = 3; i < felder.length; i++) {
             String[] teil = felder[i].split(",");
             dachFlaechen.add(new Flaeche(teil[0], Double.parseDouble(teil[1]), Double.parseDouble(teil[2]));

        }
    }
}
