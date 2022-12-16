public class Umkehren {

  public static void main(String[] args) {
    int[] quelle = new int[14];
    int[] ziel = new int[14];
    // Eins bis 14 in ziel schreiben
    for (int i = 0; i < quelle.length; i++) {
      quelle[i] = i + 1;
    }
    // quelle Rückwärts in Ziel eintragen
    System.out.println(quelle.length);
    System.out.println(ziel.length);
    int j = 0;
    for (int i = quelle.length -1; i >= 0; i--) {
      ziel[j] = quelle[i];
      j++;
    }
    // Ausgabe
    for (Integer i_ziel: ziel) {
      System.out.print(i_ziel + ", ");
    }
    System.out.println();
    for (Integer j_quelle: quelle) {
      System.out.print(j_quelle + ", ");
    }




  }
}
