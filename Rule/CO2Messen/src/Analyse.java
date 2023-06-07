import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Analyse {

  public static ArrayList<Integer> generateValues() {
    //Testdaten
    ArrayList<Integer> testvalue = new ArrayList<>();
    Random random = new Random();
    int randvalue;
    int min = 300;
    int max = 2000;
    // textdatei zur übersicht
    try {
      FileWriter myWriter = new FileWriter("values.txt");
      for (int i = 0; i < 100; i++ ) {
        randvalue = random.nextInt(max + min) + min;
        testvalue.add(randvalue);
        myWriter.write(randvalue);
        myWriter.write(" \n");
      }
      myWriter.close();
    } catch (IOException e) {
      System.out.println("Error: ");
      e.printStackTrace();
    }
    return testvalue;
  }
  public static void main(String[] args) {
    ArrayList<Integer> testvalue = new ArrayList<>();
    testvalue = generateValues();
    // Analyse
    int anzahl = 0;
    int higest = 0;
    //  tool
    int gut = 0;
    int befriedigend = 0;
    int schlecht = 0;
    int sum = 0;
    for (Integer test: testvalue) {
      // Anzahl der Werte
      anzahl++;
      // höchster Wert
      if (higest > test) {
        higest = test;
      }
      // Anzahl der schlechten und befriedigen , gut
      if (test < 600) {
        gut++;
      } else if (test >= 600 && test < 1000) {
        befriedigend++;
      } else if (test >= 1000) {
        schlecht++;
      }
      // Summe
      sum = sum + test;
    }
    // Ausgabe der Werte
    System.out.println("Anzahl der Messwerte: " + anzahl);
    // Duchschnitt
    System.out.println("CO2-Durchschnitt:  " + (sum/anzahl));
    // Werte in %
    System.out.println("gute CO2-Werte: " + ((anzahl/100)*gut) +" %" );
    System.out.println("befr. CO2-Werte: " + ((anzahl/100) * befriedigend) + " %");
    System.out.println("schlechte CO2-Werte:  " + ((anzahl/100) * schlecht) + " %");


  }

}
