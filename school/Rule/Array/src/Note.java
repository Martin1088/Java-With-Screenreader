public class Note {
  public static void main(String[] args) {
    double[] notenstatistik = {1.2, 2.3, 4.1, 2, 3.3, 3.6, 5.6, 2.3, 3.1, 2.2, 1.8};
    // Index 0 ist n1 Anzahl von note 1 also immer plus 1
    int[] n_mal = {0, 0, 0, 0, 0, 0};
    double beste = 6;
    double sum =0;
    double durchschnitt = 0;
    for (int i = 0;i < notenstatistik.length; i++) {
      if (notenstatistik[i] <= 1.5) {n_mal[0]++;}
      else if (notenstatistik[i] <= 2.5) {n_mal[1]++;}
      else if (notenstatistik[i] <= 3.5) {n_mal[2]++;}
      else if (notenstatistik[i] <= 4.5) {n_mal[3]++;}
      else if (notenstatistik[i] <= 5.5) {n_mal[4]++;}
      else {n_mal[5]++;}
      if (beste > notenstatistik[i]) {
        beste = notenstatistik[i];
      }
      sum += notenstatistik[i];
    }
    // Notenstatistik
    for (int x = 0; x < n_mal.length; x++) {
      System.out.println("Die Note " + (x +1) + " : " + n_mal[x] + " (" + ((100 / notenstatistik.length) * n_mal[x]) + "%) ");
    }
    // durchnitt der Noten errechnen
    durchschnitt = sum / notenstatistik.length;
    System.out.println("Beste Note: " + beste);
    System.out.println("Notendurchschnitt: " + (Math.round(durchschnitt)));
  }

}
