public class temperatur {
  public static void main(String[] args) {
    // Temperatur werte
    Integer[] temperaturwerte = {19, 20, 40, 15, 17, 12, 4};
    int max = 0;
    int sum = 0;

    for (int i = 0; i < temperaturwerte.length; i++) {
      sum += temperaturwerte[i];
      // Max wert
      if (temperaturwerte[i] > max) {
        max = temperaturwerte[i];
      }
      // Balken für das Diagramm als *
      System.out.print("Temperatur " + (i + 1) + ":\t");
      for (int x = 0; x < temperaturwerte[i]; x++ ) {
        System.out.print("*");
      }
      System.out.print("\t" + "(" + temperaturwerte[i] + ")");
      System.out.print("\n");
    }
    // Durchschnitt und max
    System.out.println("Der Maxwert ist: " + max);
    System.out.println("Die Durchschnittstemperatur: " + (sum / temperaturwerte.length));
  }
}
