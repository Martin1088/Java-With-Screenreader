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
    String subtest = "";
    for (Integer i_ziel: ziel) {
      subtest = subtest + i_ziel+ ", ";
    }
    System.out.print(subtest.substring(0, (subtest.length() -2)));
    System.out.println();
    String reverse_sub = "";
    for (Integer j_quelle: quelle) {
      reverse_sub = reverse_sub + j_quelle + ", ";
    }
    System.out.print(reverse_sub.substring(0, (reverse_sub.length() -2)));




  }
}
