public class Tage {

  public static void main(String[] args) {
    int[] tage = new int[365];
    for (int i = 0; i < 365; i++ ) {
      tage[i] = i + 1;
    }
    // Ausgabe der Tage
    for (Integer t: tage) {
      System.out.println(t + " Tage haben " + (t * 24) + " Stunden ");
    }
  }

}
