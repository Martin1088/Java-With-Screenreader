import java.util.Arrays;

public class Kaffeemaschine {
    public static void main (String[] args) {
      int[] messwerte = {248, 249, 251, 247, 250, 252, 246, 248, 249, 250};
      int[] messsung = new int[messwerte.length];
      for (int i = 0; i < messwerte.length; i++) {
        messsung[i] = i + 1;
        System.out.println(messsung[i]);
      }


      double values = 0;
      System.out.println("Messung \t Messwerte \t Abweichung");
      for (int i = 0; i < messwerte.length; i++) {
        System.out.println((i +1) + " \t " + messwerte[i] + "ml \t" +(250 - messwerte[i]) + " ml");
        values += messwerte[i];
      }
      System.out.println("Gesamter Wasser Verbrauch: " + values + " ml");
      System.out.println("Durchschnitt:  " + (values / messwerte.length) + " ml");
      // umkehren der Reihenfolge
      System.out.println("Messung \t Messwerte ");
    for (int i = messwerte.length -1; i >= 0; i--) {
        System.out.println((i + 1) + " \t " + messwerte[i] + " ml ");
      }
    // Sotieren der Werte
      System.out.println("Sortiertewerte: ");
      Arrays.sort(messwerte);
    for (Integer f: messwerte) {
      System.out.println(f);
    }
    // Sortieren mit bubblesort
    int temp_Messwerte;
    int temp_Messung;
    for (int i = 0; i < messwerte.length; i++) {
      for (int j = 1; j < (messwerte.length - i ); j++) {
        if (messwerte[j -1] >  messwerte[j]) {
          // swap elements
          temp_Messwerte = messwerte[j -1];
          messwerte[j -1] =messwerte[j];
          messwerte[j] = temp_Messwerte;
          // Messungen mit Nummer mit nehmen
          temp_Messung = messsung[j -1];
          messsung[j -1] = messsung[j];
          messsung[j] = temp_Messung;
        }
      }
    }
    // Ausgabe der Sortierten Liste
      System.out.println("Sortierte Liste:  ");
    for (int i = 0;i < messwerte.length; i++ ) {
      System.out.print(messsung[i] + " \t ");
      System.out.println(messwerte[i] + " ml");
    }


    }
}
